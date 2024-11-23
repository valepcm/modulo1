package com.anahuac.mayab.modulo2.clase1;
import javax.swing.*;
import java.awt.*;

public class GridBagLayout extends JFrame {
	
	public GridBagLayout() {
		setTitle ("Ejemplo de Grid Bag Layout");
		setSize (400,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//Configurar GridBagLayout
		setLayout (new GridLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		//Agregar componentes con restricciones
		gbc.gridx = 0; gbc.gridy = 0;
		add(new JLabel("Nombre:"), gbc);
		
		gbc.gridx = 1; gbc.gridy = 0;
		add(new JTextField(15), gbc);
		
		gbc.gridx = 0; gbc.gridy = 1;
		add(new JLabel("Edad:"), gbc);
		
		gbc.gridx = 1; gbc.gridy = 1;
		add(new JTextField(15), gbc);
		gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.CENTER;
		
		add(new JButton("Enviar"), gbc);
		
	
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(GridBagLayout::new);
	}

}
