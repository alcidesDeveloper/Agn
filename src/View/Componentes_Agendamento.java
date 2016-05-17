/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ALCIDES
 */
public class Componentes_Agendamento {

    private JLabel lblDia;
    private JLabel lblHorarioInicio;
    private JLabel lblHorarioFim;
    private JLabel lblFunc;
    private JLabel lblServico;
    private JFormattedTextField txtFDia;
    private JFormattedTextField txtFHorarioInicio;
    private JFormattedTextField txtFHorarioFim;
    private JComboBox cmbxFunc;
    private JComboBox cmbxServico;
    private JTable tableResultado;
    private JButton btnPesquisa;
    private JButton btnAgendar;
    private JButton btnRelatorio;

    /**
     * @return the lblDia
     */
    public JLabel getLblDia() {
        return lblDia;
    }

    /**
     * @param lblDia the lblDia to set
     */
    public void setPropriedadesLblDia(String nome, int x, int y, int width, int heigh) {
        lblDia = new JLabel();
        lblDia.setText(nome);
        lblDia.setLocation(x, y);
        lblDia.setSize(width, heigh);
    }

    /**
     * @return the lblHorarioInicio
     */
    public JLabel getLblHorarioInicio() {
        return lblHorarioInicio;
    }

    /**
     * @param lblHorarioInicio the lblHorarioInicio to set
     */
    public void setPropriedadesLblHorarioInicio(String nome, int x, int y, int width, int heigh) {
        lblHorarioInicio = new JLabel();
        lblHorarioInicio.setText(nome);
        lblHorarioInicio.setLocation(x, y);
        lblHorarioInicio.setSize(width, heigh);
    }

    /**
     * @return the lblHorarioFim
     */
    public JLabel getLblHorarioFim() {
        return lblHorarioFim;
    }

    /**
     * @param lblHorarioFim the lblHorarioFim to set
     */
    public void setPropriedadesLblHorarioFim(String nome, int x, int y, int width, int heigh) {
        lblHorarioFim = new JLabel();
        lblHorarioFim.setText(nome);
        lblHorarioFim.setLocation(x, y);
        lblHorarioFim.setSize(width, heigh);
    }

    /**
     * @return the lblFunc
     */
    public JLabel getLblFunc() {
        return lblFunc;
    }

    /**
     * @param lblFunc the lblFunc to set
     */
    public void setPropriedadesLblFunc(String nome, int x, int y, int width, int heigh) {
        lblFunc = new JLabel();
        lblFunc.setText(nome);
        lblFunc.setLocation(x, y);
        lblFunc.setSize(width, heigh);
    }

    /**
     * @return the lblServico
     */
    public JLabel getLblServico() {
        return lblServico;
    }

    /**
     * @param lblServico the lblServico to set
     */
    public void setPropriedadesLblServico(String nome, int x, int y, int width, int heigh) {
        lblServico = new JLabel();
        lblServico.setText(nome);
        lblServico.setLocation(x, y);
        lblServico.setSize(width, heigh);
    }

    /**
     * @return the txtFDia
     */
    public JFormattedTextField getTxtFDia() {
        return txtFDia;
    }

    /**
     * @param txtFDia the txtFDia to set
     */
    public void setPropriedadesTxtFDia(int x, int y, int width, int heigh) {
        txtFDia = new JFormattedTextField();
        txtFDia.setLocation(x, y);
        txtFDia.setSize(width, heigh);
    }

    /**
     * @return the txtFHorarioInicio
     */
    public JFormattedTextField getTxtFHorarioInicio() {
        return txtFHorarioInicio;
    }

    /**
     * @param txtFHorarioInicio the txtFHorarioInicio to set
     */
    public void setPropriedadesTxtFHorarioInicio(int x, int y, int width, int heigh) {
        txtFHorarioInicio = new JFormattedTextField();
        txtFHorarioInicio.setLocation(x, y);
        txtFHorarioInicio.setSize(width, heigh);
    }

    /**
     * @return the txtFHorarioFim
     */
    public JFormattedTextField getTxtFHorarioFim() {
        return txtFHorarioFim;
    }

    /**
     * @param txtFHorarioFim the txtFHorarioFim to set
     */
    public void setPropriedadesTxtFHorarioFim(int x, int y, int width, int heigh) {
        txtFHorarioFim = new JFormattedTextField();
        txtFHorarioFim.setLocation(x, y);
        txtFHorarioFim.setSize(width, heigh);
    }

    /**
     * @return the cmbxFunc
     */
    public JComboBox getCmbxFunc() {
        return cmbxFunc;
    }

    /**
     * @param cmbxFunc the cmbxFunc to set
     */
    public void setPropriedadesCmbxFunc(int x, int y, int width, int heigh) {
        cmbxFunc = new JComboBox();
        cmbxFunc.setLocation(x, y);
        cmbxFunc.setSize(width, heigh);
    }

    /**
     * @return the cmbxServico
     */
    public JComboBox getCmbxServico() {
        return cmbxServico;
    }

    /**
     * @param combxServico the cmbxServico to set
     */
    public void setPropriedadesCmbxServico(int x, int y, int width, int heigh) {
        cmbxServico = new JComboBox();
        cmbxServico.setLocation(x, y);
        cmbxServico.setSize(width, heigh);
    }

    /**
     * @return the tableResultado
     */
    public JTable getTableResultado() {
        return tableResultado;
    }

    /**
     * @param tableResultado the tableResultado to set
     */
    public void setPropriedadesTableResultado(int x, int y, int width, int heigh) {
        tableResultado = new JTable();
        tableResultado.setLocation(x, y);
        tableResultado.setSize(width, heigh);
    }

    /**
     * @return the btnPesquisa
     */
    public JButton getBtnPesquisa() {
        return btnPesquisa;
    }

    /**
     * @param btnPesquisa the btnPesquisa to set
     */
    public void setPropriedadesBtnPesquisa(String nome, int x, int y, int width, int heigh) {
        btnPesquisa = new JButton();
        btnPesquisa.setText(nome);
        btnPesquisa.setLocation(x, y);
        btnPesquisa.setSize(width, heigh);
    }

    /**
     * @return the btnAgendar
     */
    public JButton getBtnAgendar() {
        return btnAgendar;
    }

    /**
     * @param btnAgendar the btnAgendar to set
     */
    public void setPropriedadesBtnAgendar(String nome, int x, int y, int width, int heigh) {
        btnAgendar = new JButton();
        btnAgendar.setText(nome);
        btnAgendar.setLocation(x, y);
        btnAgendar.setSize(width, heigh);
    }

    /**
     * @return the btnRelatorio
     */
    public JButton getBtnRelatorio() {
        return btnRelatorio;
    }

    /**
     * @param btnRelatorio the btnRelatorio to set
     */
    public void setPropriedadesBtnRelatorio(String nome, int x, int y, int width, int heigh) {
        btnRelatorio = new JButton();
        btnRelatorio.setText(nome);
        btnRelatorio.setLocation(x, y);
        btnRelatorio.setSize(width, heigh);
    }
}
