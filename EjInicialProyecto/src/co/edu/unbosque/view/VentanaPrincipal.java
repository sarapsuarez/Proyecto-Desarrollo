package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{

	private PanelDatos panelDatos;
	private PanelResultados panelResultados;
	
	public VentanaPrincipal() {
		setTitle("Primer programa GUI");
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.blue);
		getContentPane().setLayout(null);
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		panelDatos = new PanelDatos();
		panelDatos.setBounds(20, 20, 545, 250);
		getContentPane().add(panelDatos);
		
		
		panelResultados = new PanelResultados();
		panelResultados.setBounds(20, 285, 545, 160);
		getContentPane().add(panelResultados);
		
	}

	public PanelDatos getPanelDatos() {
		return panelDatos;
	}

	public void setPanelDatos(PanelDatos panelDatos) {
		this.panelDatos = panelDatos;
	}

	public PanelResultados getPanelResultados() {
		return panelResultados;
	}

	public void setPanelResultados(PanelResultados panelResultados) {
		this.panelResultados = panelResultados;
	}
	
}
