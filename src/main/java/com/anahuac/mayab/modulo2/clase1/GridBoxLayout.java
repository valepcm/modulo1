/**
 * 
 */
package com.anahuac.mayab.modulo2.clase1;
import javax.swing.*;
import java.awt.*;
/**
 * 
 */
public class GridBoxLayout extends JFrame {
	public GridBoxLayout() {
		setTitle ("Ejemplo de Grid Bag Layout");
		setSize (400,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLocationRelativeTo(null);
		
		//Configurar BoxLayout eje de las y;
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		panel.add(new JLabel("Etiqueta 1"));
		panel.add(Box.createRigidArea(new Dimension(0,10))); //Espacio entre componentes
		
		panel.add(new JLabel("Etiqueta 2"));
		panel.add(Box.createVerticalGlue()); //Espacio entre componentes
		
		panel.add(new JButton("Boton"));
		
		add(panel);
		
		setVisible(true);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(GridBoxLayout::new);
	}

}
