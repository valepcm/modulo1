package com.anahuac.mayab.modulo2.clase1;
import javax.swing.*;
import java.awt.*;

public class BotonesVariantes extends JFrame{
	public BotonesVariantes() {
		setTitle("Botones Variables");
		setSize(400,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//Configurar Panel
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		
		panel1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		//Boton standard
		JButton botonEstandar = new JButton("Boton estandar");
		botonEstandar.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		//Boton Icono
		JButton botonIcono = new JButton("Boton icono");
		botonIcono.setIcon(new ImageIcon("/Users/valep/OneDrive/Imágenes/descarga.jpeg"));
		botonIcono.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		JButton botonDisable = new JButton("Boton Deshabilitado");
		botonDisable.setEnabled(false);
		botonDisable.setAlignmentX(Component.CENTER_ALIGNMENT);

		
		JToggleButton botonToggle = new JToggleButton("Boton dos estados");
		botonToggle.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		JButton botonBorders = new JButton("Boton Bordes Personalizados");
		botonBorders.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
		botonBorders.setBackground(Color.cyan);
		botonBorders.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		//Agregar botonesd al panel 
		panel1.add(botonEstandar);
		panel1.add(Box.createRigidArea(new Dimension (0,10)));
		panel1.add(botonIcono);
		panel1.add(Box.createRigidArea(new Dimension (0,15)));
		panel1.add(botonDisable);
		panel1.add(Box.createRigidArea(new Dimension (0,20)));
		panel1.add(botonToggle);
		panel1.add(Box.createRigidArea(new Dimension (0,25)));
		panel1.add(botonBorders);
		panel1.add(Box.createRigidArea(new Dimension (0,30)));
		
		add(panel1);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(BotonesVariantes::new);
	}
	

}
