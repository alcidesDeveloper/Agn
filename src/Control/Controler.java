/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Connect;
import View.Home1;
import java.sql.SQLException;
import java.util.ArrayList;

//import java.sql.Date;

/**
 *
 * @author ALCIDES
 */
public class Controler {
   private Connect con = new Connect();

   //retorna os funcionarios
     public ArrayList<Object> retornaFuncionarios() throws SQLException { 
         
        return con.BuscaFuncionario();
    }
           
}
