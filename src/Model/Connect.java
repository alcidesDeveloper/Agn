/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;

/**
 *
 * @author AFNogueira
 * @version 1.0.0 Classe de conexão ao SQLLite
 */
public class Connect {

    private Connection conn;
    // private Statement st;
    private PreparedStatement st;

    public Connection ConnectDB() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ALCIDES\\Documents\\bnc\\bancoTeste.db");
            System.out.println("Conectou");
            return conn;

        } catch (Exception e) {
            throw new IllegalAccessError("Erro");
        }
    }

    public void InsercaoPessoa(String Nome, Date Dta_Nasc, String Tel, String Cel, Date Dta_Cadastro) throws SQLException {
        AbriConexao("INSERT INTO PESSOA(ID_PESSOA,NOME,DATA_NASC,TELEFONE,CELULAR,DATA_CADASTRO) VALUES(?,?,?,?,?,?)");
        st.setInt(1, 7);
        st.setString(2, Nome);
        st.setDate(3, Dta_Nasc);
        st.setString(4, Tel);
        st.setString(5, Cel);
        st.setDate(6, Dta_Cadastro);

        int sw = st.executeUpdate();
        if (sw > 0) {
            System.out.println("Sucesso!");
        }
        FechaConnexao();
    }

    public void InsercaoUnidade(String Nome, String Logradouro, String Cep) throws SQLException {
        AbriConexao("INSERT INTO UNIDADE(ID_UNIDADE,NOME_UNIDADE,LOGRADOURO,CEP) VALUES(?,?,?,?)");
        st.setInt(1, 2);
        st.setString(2, Nome);
        st.setString(3, Logradouro);
        st.setString(4, Cep);

        int sw = st.executeUpdate();
        if (sw > 0) {
            System.out.println("Sucesso!");
        }
        FechaConnexao();
    }

    public ArrayList<Object> BuscaFuncionario() throws SQLException {
        AbriConexao("SELECT P.NOME, F.ID_FUNCIONARIO FROM PESSOA P LEFT JOIN FUNCIONARIO F ON P.ID_PESSOA = F.ID_FUNCIONARIO LEFT JOIN AGENDAMENTO A ON F.ID_FUNCIONARIO = A.ID_FUNCIONARIO WHERE A.ID_FUNCIONARIO IS NOT NULL");

        ResultSet result = st.executeQuery();

        ArrayList<Object> elementos = new ArrayList<>();

        while (result.next()) {
            elementos.add(result.getString("Nome"));
        }
        FechaConnexao();

        return elementos;
    }

    public void AbriConexao(String comando) throws SQLException {
        st = ConnectDB().prepareStatement(comando);
    }

    public void FechaConnexao() throws SQLException {
        conn.close();
    }
}
