package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel{

	private JComponent matrix[][];
	
	
	public PanelResultados() {
		setLayout(new BorderLayout(5, 10));
		setBackground(new Color(18, 18, 89));
		TitledBorder titulo = new TitledBorder("Movimientos");
		titulo.setTitleColor(Color.WHITE);
	 	setBorder(titulo);
	 	
		inicializarComponentes();
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
	}
		
}