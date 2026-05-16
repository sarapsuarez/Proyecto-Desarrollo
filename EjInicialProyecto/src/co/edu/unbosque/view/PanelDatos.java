package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel{

	private JLabel lblTitulo;
	private JLabel lblNumero;
	private JTextField txtNumero;
	private JButton btnValidar;
	
	public PanelDatos() {
		setLayout(null);
		setBackground(Color.orange);
		setBorder(new TitledBorder("Modulo de datos"));
		
		inicializarComponentes();
		
		setVisible(true);		
	}
	
	public void inicializarComponentes() {
		lblTitulo = new JLabel("MI PRIMER PROGRAMA QUE DETERMINAR PAR O IMPAR");
		lblTitulo.setBounds(100, 20, 500, 20);
		add(lblTitulo);
		
		lblNumero = new JLabel("Ingrese numero:");
		lblNumero.setBounds(50, 100, 150, 20);
		add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(220, 100, 200, 20);
		add(txtNumero);
		
		btnValidar = new JButton("Validar");
		btnValidar.setBounds(240, 150, 80, 20);
		btnValidar.setBackground(Color.CYAN);
		add(btnValidar);
	}

	public JLabel getLblTitulo() {
		return lblTitulo;
	}

	public void setLblTitulo(JLabel lblTitulo) {
		this.lblTitulo = lblTitulo;
	}

	public JLabel getLblNumero() {
		return lblNumero;
	}

	public void setLblNumero(JLabel lblNumero) {
		this.lblNumero = lblNumero;
	}

	public JTextField getTxtNumero() {
		return txtNumero;
	}

	public void setTxtNumero(JTextField txtNumero) {
		this.txtNumero = txtNumero;
	}

	public JButton getBtnValidar() {
		return btnValidar;
	}

	public void setBtnValidar(JButton btnValidar) {
		this.btnValidar = btnValidar;
	}
	
}
