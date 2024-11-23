package com.anahuac.mayab.modulo2.clase1;
import javax.swing.*;
import java.awt.*;

public class MiVentana extends JFrame{
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JButton boton5;
	
	public MiVentana() {
		
		setTitle("Ejemplo Ventana");
		setSize(300,280);
		setLocationRelativeTo(null);		//Centrar ventana en la pantalla
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	
		boton1 = new JButton("Norte");
		this.getContentPane().add(boton1, BorderLayout.NORTH);
		
		boton2 = new JButton("Sur");
		this.getContentPane().add(boton2, BorderLayout.SOUTH);
		
		boton3 = new JButton("Este");
		this.getContentPane().add(boton3, BorderLayout.EAST);
		
		boton4 = new JButton("Oeste");
		this.getContentPane().add(boton4, BorderLayout.WEST);
		
		boton5 = new JButton("Centro");
		this.getContentPane().add(boton5, BorderLayout.CENTER);
		
		
	}
	
	public static void main(String[]args) {
		MiVentana miVentana = new MiVentana();
		//miVentana.setBounds(10,10,200,200);
		//miVentana.pack();
		miVentana.setVisible(true);
	}

}
