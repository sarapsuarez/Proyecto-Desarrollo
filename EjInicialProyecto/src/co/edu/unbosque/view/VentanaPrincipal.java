package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{

	private PanelDatos panelDatos;
	private PanelResultados panelResultados;
	private PanelMatriz panelMatriz;
	
	public VentanaPrincipal() {
		
		  setTitle("Mi primer juego");
		  setSize(1000, 600);
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  getContentPane().setBackground(new Color(223, 223, 240)); 
		  getContentPane().setLayout(new BorderLayout(10,10));
		  
		  inicializarComponentes();
		  
		  setResizable(true);
		  setLocationRelativeTo(null);	  
		  setVisible(true);
		  
	}
	
	public void inicializarComponentes() {
		
		panelDatos = new PanelDatos();	
		getContentPane().add(panelDatos, BorderLayout.NORTH);
		
		panelMatriz = new PanelMatriz();
		getContentPane().add(panelMatriz, BorderLayout.CENTER);
		
		panelResultados = new PanelResultados();
		getContentPane().add(panelResultados, BorderLayout.SOUTH);
		
		
		
	}
	
	

	public PanelMatriz getPanelMatriz() {
		return panelMatriz;
	}

	public void setPanelMatriz(PanelMatriz panelMatriz) {
		this.panelMatriz = panelMatriz;
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
