package co.edu.unbosque.view;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelMatriz extends JPanel {
	
	private JButton[][] btnCeldas;

	public PanelMatriz() {
		setLayout(new GridLayout(5, 5)); 
	 	setBackground(new Color(18, 18, 89));
	 	
	 	TitledBorder titulo = new TitledBorder("Tablero");
	 	titulo.setTitleColor(Color.WHITE);
	 	setBorder(titulo);
		    	
		inicializarComponentes();
    	setVisible(true);
		    	
		    	
  }	
	
	
	
	public void inicializarComponentes() {
		btnCeldas = new JButton[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

              btnCeldas[i][j] = new JButton();
              btnCeldas[i][j].setBackground(Color.WHITE);
              btnCeldas[i][j].setFocusable(false);

                add(btnCeldas[i][j]);
            }
        }
	}



	public JButton[][] getBtnCeldas() {
		return btnCeldas;
	}



	public void setBtnCeldas(JButton[][] btnCeldas) {
		this.btnCeldas = btnCeldas;
	}
	
	
}