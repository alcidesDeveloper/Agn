/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JButton;
/**
 *
 * @author ALCIDES
 */
public class Componentes_Cliente {

    private JLabel lblTitulo;
    private JLabel lblNome;
    private JLabel lblNasc;
    private JLabel lblTel;
    private JLabel lblCel;
    private JTextField txtNome;
    private JTextField txtNasc;
    private JFormattedTextField txtFTel;
    private JFormattedTextField txtFCel;
    private JButton btnProximo;

    public void SetPropriedadesLblTitulo(String nome, int x, int y, int width, int heigh) {
        lblTitulo = new JLabel();
        lblTitulo.setText(nome);
        lblTitulo.setLocation(x, y);
        lblTitulo.setSize(width, heigh);
    }

    public JLabel getLblTitulo() {
        return lblTitulo;

    }

    public void SetPropriedadesLblNome(String nome, int x, int y, int width, int heigh) {
        lblNome = new JLabel();
        lblNome.setText(nome);
        lblNome.setLocation(x, y);
        lblNome.setSize(width, heigh);
    }

    public JLabel getLblNome() {
        return lblNome;

    }

    public void SetPropriedadesLblNasc(String nome, int x, int y, int width, int heigh) {
        lblNasc = new JLabel();
        lblNasc.setText(nome);
        lblNasc.setLocation(x, y);
        lblNasc.setSize(width, heigh);
    }

    public JLabel getLblNasc() {
        return lblNasc;

    }

    public void SetPropriedadesLblTel(String nome, int x, int y, int width, int heigh) {
        lblTel = new JLabel();
        lblTel.setText(nome);
        lblTel.setLocation(x, y);
        lblTel.setSize(width, heigh);
    }

    public JLabel getLblTel() {
        return lblTel;

    }

    public void SetPropriedadesLblCel(String nome, int x, int y, int width, int heigh) {
        lblCel = new JLabel();
        lblCel.setText(nome);
        lblCel.setLocation(x, y);
        lblCel.setSize(width, heigh);
    }

    public JLabel getLblCel() {
        return lblCel;

    }

    public void SetPropriedadesTxtNome(int x, int y, int width, int heigh) {
        txtNome = new JTextField();
        txtNome.setLocation(x, y);
        txtNome.setSize(width, heigh);
    }

    public JTextField getTxtNome() {
        return txtNome;
    }
    
        public void SetPropriedadesTxtNasc(int x, int y, int width, int heigh) {
        txtNasc = new JTextField();
        txtNasc.setLocation(x, y);
        txtNasc.setSize(width, heigh);
    }

    public JTextField getTxtNasc() {
        return txtNasc;
    }
    
    public void SetPropriedadesTxtFTel(int x, int y, int width, int heigh) {
        txtFTel = new JFormattedTextField();
        txtFTel.setLocation(x, y);
        txtFTel.setSize(width, heigh);
    }

    public JFormattedTextField getTxtFTel() {
        return txtFTel;
    }
      public void SetPropriedadesTxtFCel(int x, int y, int width, int heigh) {
        txtFCel = new JFormattedTextField();
        txtFCel.setLocation(x, y);
        txtFCel.setSize(width, heigh);
    }

    public JFormattedTextField getTxtFCel() {
        return txtFCel;
    }
    
     public void SetPropriedadesBtnProximo(String nome, int x, int y, int width, int heigh) {
        btnProximo = new JButton();
        btnProximo.setText(nome);
        btnProximo.setLocation(x, y);
        btnProximo.setSize(width, heigh);
    }

    public JButton getBtnProximo() {
        return btnProximo;
    }
    
}
