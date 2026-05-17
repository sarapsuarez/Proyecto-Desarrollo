package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel{
	

	private JLabel lblTitulo;
	private JLabel lblTextoInicio;
	private JLabel lblFilas;
	private JLabel lblColumnas;
	private JTextField txtNumeroF;
	private JTextField txtNumeroC;
	private JButton btnIniciar;
	
	
	public PanelDatos() {
		
    	setLayout(new GridLayout(4,2,5,5));
		//setLayout (new BorderLayout());
    	setBackground(new Color(18, 18, 89));
    	TitledBorder titulo = new TitledBorder("Inicio");
    	titulo.setTitleColor(Color.WHITE);
	 	setBorder(titulo);
	 	
    	inicializarComponentes();
    	setVisible(true);
    	
    			
	}
	
	public void inicializarComponentes() {
		lblTitulo = new JLabel("THE CYBER-INFILTRATOR GAME ");	
		lblTitulo.setForeground(Color.WHITE);
	
		add(lblTitulo);
		
		lblTextoInicio = new JLabel("Bienvenido a C1B3R 1NF1LTR4T0R");
		lblTextoInicio.setForeground(Color.WHITE);
		add (lblTextoInicio);
		
		lblFilas = new JLabel("Ingrese el numero de filas para el tablero:");
		lblFilas.setForeground(Color.WHITE);
		add (lblFilas);
		
		txtNumeroF = new JTextField();
		add (txtNumeroF);
		
		lblColumnas = new JLabel("Ingrese el numero de columnas para el tablero:");
		lblColumnas.setForeground(Color.WHITE);
		add (lblColumnas);
		
		txtNumeroF = new JTextField();
		add (txtNumeroF);
		
		btnIniciar = new JButton("Iniciar");
		btnIniciar .setBackground(Color.white);
		//btnIniciar.setBounds(220, 100, 30, 20);
		add(btnIniciar );
	}

	public JLabel getLblTitulo() {
		return lblTitulo;
	}

	public void setLblTitulo(JLabel lblTitulo) {
		this.lblTitulo = lblTitulo;
	}

	public JLabel getLblTextoInicio() {
		return lblTextoInicio;
	}

	public void setLblTextoInicio(JLabel lblTextoInicio) {
		this.lblTextoInicio = lblTextoInicio;
	}

	public JLabel getLblFilas() {
		return lblFilas;
	}

	public void setLblFilas(JLabel lblFilas) {
		this.lblFilas = lblFilas;
	}

	public JLabel getLblColumnas() {
		return lblColumnas;
	}

	public void setLblColumnas(JLabel lblColumnas) {
		this.lblColumnas = lblColumnas;
	}

	public JTextField getTxtNumeroF() {
		return txtNumeroF;
	}

	public void setTxtNumeroF(JTextField txtNumeroF) {
		this.txtNumeroF = txtNumeroF;
	}

	public JTextField getTxtNumeroC() {
		return txtNumeroC;
	}

	public void setTxtNumeroC(JTextField txtNumeroC) {
		this.txtNumeroC = txtNumeroC;
	}

	public JButton getBtnIniciar() {
		return btnIniciar;
	}

	public void setBtnIniciar(JButton btnIniciar) {
		this.btnIniciar = btnIniciar;
	}
}