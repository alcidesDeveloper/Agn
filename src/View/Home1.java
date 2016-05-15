/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Control.Controler;

/**
 *
 * @author ALCIDES
 */
public class Home1 extends javax.swing.JFrame {

   private Componentes_Cliente cliente = new Componentes_Cliente();
   private Componentes_Agendamento agenda = new Componentes_Agendamento();
    

    public Home1() {
        initComponents();
        frame.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        frame = new javax.swing.JInternalFrame();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALCIDES\\Downloads\\cadastrarAgendamento.png")); // NOI18N
        jButton2.setText("Agendamento");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        frame.setVisible(true);

        javax.swing.GroupLayout frameLayout = new javax.swing.GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(frameLayout);
        frameLayout.setHorizontalGroup(
            frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );
        frameLayout.setVerticalGroup(
            frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(frame))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap(258, Short.MAX_VALUE))
            .addComponent(frame)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:       
        frame.setVisible(true);
        criaAgenda();
        adequaLayout(1);
        jButton2.setEnabled(false);
        
        try {
            adicionaFunc();
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // adiciona os funcionarios na combox
    public void adicionaFunc() throws SQLException{
    Controler ctl = new Controler();
    ArrayList<Object> elementos = ctl.retornaFuncionarios();
        for (int i = 0; i < elementos.size(); i++) {
            
            setCmbxFunc(elementos.get(i));
        }
    }

    //metodo que retorna o Nome do cliente
    public String getTxtNome() {
        return cliente.getTxtNome().getText();
    }

    //metodo que retorna a Data de Nascimento do cliente
    public String getTxtNasc() {
        return cliente.getTxtNasc().getText();
    }

    //metodo que retorna o telefone do cliente
    public String getTxtTel() {
        return cliente.getTxtFTel().getText();
    }

    //metodo que retorna o numero de celular do cliente
    public String getTxtCel() {
        return cliente.getTxtFCel().getText();
    }

    //metodo que retorna o dia escolhido para o agendamento.
    public String getTxtDia() {
        return agenda.getTxtFDia().getText();
    }

    //metodo que retorna o horario de inicio do agendamento.
    public String getTxtHorarioIncio() {
        return agenda.getTxtFHorarioInicio().getText();
    }

    //metodo que retorna o horario de fim do agendamento
    public String getTxtHorarioFim() {
        return agenda.getTxtFHorarioFim().getText();
    }

    // retorna o funcionario escolhido para o serviço
    public String getCmbxFunc() {
        return agenda.getCmbxFunc().getSelectedItem().toString();
    }

    // retorna o serviço escolhido
    public String getCmbxServico() {
        return agenda.getCmbxServico().getSelectedItem().toString();
    }

    //adicionar horario disponivel de incio
    public void setHorarioInicio(String horario) {
        agenda.getTxtFHorarioInicio().setText(horario);
    }

    // adiciona horario disponivel de fim
    public void setHorarioFim(String horario) {
        agenda.getTxtFHorarioFim().setText(horario);
    }

    //adiciona itens

    public void setCmbxFunc(Object vlr) {
        agenda.getCmbxFunc().addItem(vlr);
    }

    //adiciona itens.
    public void setCmbxServico(String vlr) {
        agenda.getCmbxServico().addItem(vlr);
    }

    public void CriaTelaCliente() {

        cliente.SetPropriedadesLblTitulo("Cliente", 128, 10, 80, 23);
        frame.add(cliente.getLblTitulo());

        cliente.SetPropriedadesLblNome("Nome", 6, 82, 34, 16);
        frame.add(cliente.getLblNome());

        cliente.SetPropriedadesLblNasc("Data Nasc", 6, 128, 78, 16);
        frame.add(cliente.getLblNasc());

        cliente.SetPropriedadesLblTel("Tel", 6, 174, 48, 16);
        frame.add(cliente.getLblTel());

        cliente.SetPropriedadesLblCel("Cel", 6, 220, 48, 16);
        frame.add(cliente.getLblCel());

        cliente.SetPropriedadesTxtNome(84, 76, 231, 28);
        frame.add(cliente.getTxtNome());

        cliente.SetPropriedadesTxtNasc(84, 122, 105, 28);
        frame.add(cliente.getTxtNasc());

        cliente.SetPropriedadesTxtFTel(84, 168, 97, 28);
        frame.add(cliente.getTxtFTel());

        cliente.SetPropriedadesTxtFCel(84, 214, 97, 28);
        frame.add(cliente.getTxtFCel());

        cliente.SetPropriedadesBtnProximo("Ok", 225, 272, 90, 33);
        frame.add(cliente.getBtnProximo());

        //cria um evento click
        cliente.getBtnProximo().addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                adequaLayout(2);
                frame.setVisible(false);
                jButton2.setEnabled(true);
                deletaTelaCliente();                
            }
        });

    }

    public void criaAgenda() {

        agenda.setPropriedadesLblDia("Dia", 48, 57, 19, 16);
        frame.add(agenda.getLblDia());

        agenda.setPropriedadesLblHorarioInicio("Horario Incio", 46, 103, 73, 16);
        frame.add(agenda.getLblHorarioInicio());

        agenda.setPropriedadesLblHorarioFim("Horario Fim", 46, 145, 65, 16);
        frame.add(agenda.getLblHorarioFim());

        agenda.setPropriedadesLblFunc("Funcionario", 335, 57, 65, 16);
        frame.add(agenda.getLblFunc());

        agenda.setPropriedadesLblServico("Serviço", 335, 103, 40, 16);
        frame.add(agenda.getLblServico());

        agenda.setPropriedadesTxtFDia(131, 51, 92, 28);
        frame.add(agenda.getTxtFDia());

        agenda.setPropriedadesTxtFHorarioInicio(131, 97, 92, 28);
        frame.add(agenda.getTxtFHorarioInicio());

        agenda.setPropriedadesTxtFHorarioFim(129, 139, 92, 28);
        frame.add(agenda.getTxtFHorarioFim());

        agenda.setPropriedadesCmbxFunc(406, 52, 120, 26);
        frame.add(agenda.getCmbxFunc());

        agenda.setPropriedadesCmbxServico(406, 98, 120, 26);
        frame.add(agenda.getCmbxServico());

        DefaultTableModel mod = new DefaultTableModel();
        agenda.setPropriedadesTableResultado(0, 180, 615, 80, mod);
        mod.addColumn("ID");
        frame.add(agenda.getTableResultado());

        agenda.setPropriedadesBtnAgendar("Agendar", 468, 336, 74, 28);
        frame.add(agenda.getBtnAgendar());
        agenda.getBtnAgendar().addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                adequaLayout(0);
                CriaTelaCliente();
                deletaTelaAgendamento();
                
            }
        });

        agenda.setPropriedadesBtnPesquisa("Pesquisar", 544, 67, 85, 28);
        frame.add(agenda.getBtnPesquisa());

        agenda.setPropriedadesBtnRelatorio("Gerar Relatorio", 548, 336, 112, 28);
        frame.add(agenda.getBtnRelatorio());
    }

    public void deletaTelaCliente() {

        cliente.getLblTitulo().hide();
        cliente.getLblNome().hide();
        cliente.getLblNasc().hide();
        cliente.getLblTel().hide();
        cliente.getLblCel().hide();
        cliente.getTxtNome().hide();
        cliente.getTxtNasc().hide();
        cliente.getTxtFTel().hide();
        cliente.getTxtFCel().hide();
        cliente.getBtnProximo().hide();

    }

    public void deletaTelaAgendamento() {
        agenda.getLblDia().hide();
        agenda.getLblHorarioInicio().hide();
        agenda.getLblHorarioFim().hide();
        agenda.getLblFunc().hide();
        agenda.getLblServico().hide();
        agenda.getTxtFDia().hide();
        agenda.getTxtFHorarioInicio().hide();
        agenda.getTxtFHorarioFim().hide();
        agenda.getCmbxFunc().hide();
        agenda.getCmbxServico().hide();
        agenda.getTableResultado().hide();
        agenda.getBtnPesquisa().hide();
        agenda.getBtnAgendar().hide();
        agenda.getBtnRelatorio().hide();;
    }

    public void adequaLayout(int cond) {
        //layout para tela de cliente
        if (cond == 0) {
            this.setSize(558, 425);
            frame.setSize(333, 387);
            return;
        } // layout tela Agendamento
        else if (cond == 1) {
            frame.setSize(679, 410);
            this.setSize(897, 448);
        } else if (cond == 2) {
            this.setSize(544, 378);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame frame;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
