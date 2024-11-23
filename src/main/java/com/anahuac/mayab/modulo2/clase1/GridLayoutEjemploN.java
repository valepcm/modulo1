package com.anahuac.mayab.modulo2.clase1;
import javax.swing.*;
import java.awt.*;

public class GridLayoutEjemploN extends JFrame{
	
	public GridLayoutEjemploN (){
		setTitle("GridLayout Ejemplo 3x3");
		setSize(400,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//Configurar el Layout
		setLayout(new GridLayout(3,3,10,10));
		
		//Aniadir componentes
		add(new JLabel("Nombre"));
		add(new JTextField("Ingrese nombre"));
		add(new JButton("Aceptar"));
		add(new JLabel("Apellido"));
		add(new JTextField("Ingrese apellido"));
		add(new JButton("Cancelar"));
		add(new JLabel("Ciudad"));
		add(new JTextField("Ingrese ciudad"));
		add(new JButton("Borrar"));
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(GridLayoutEjemploN::new);

	}
}
