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
		setLayout(new BorderLayout(10, 10));
		setBackground(Color.magenta);
		setBorder(new TitledBorder("Modulo de resultados"));
		
		inicializarComponentes();
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		matrix = new JComponent[5][5];
		
		for (int i = 0; i <5; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = new JButton();
			}
		}
		
		add(matrix, BorderLayout.CENTER);
	}

	

}
