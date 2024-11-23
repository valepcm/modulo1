package com.anahuac.mayab.modulo2.clase1;
import javax.swing.*;
import java.awt.*;

public class GridLayoutEjemplo extends JFrame{
	
	public GridLayoutEjemplo (){
		setTitle("GridLayout Ejemplo");
		setSize(400,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		//Configurar el Layout
		setLayout(new GridLayout(3,2,10,10));
		
		//Aniadir componentes
		add(new JButton("1"));
		add(new JButton("2"));
		add(new JButton("3"));
		add(new JButton("4"));
		add(new JButton("5"));
		add(new JButton("6"));
		add(new JButton("7"));
		add(new JButton("8"));
		add(new JButton("9"));
		add(new JButton("10"));
		add(new JButton("11"));
		add(new JButton("12"));
		add(new JButton("13"));
		add(new JButton("14"));
		add(new JButton("15"));
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(GridLayoutEjemplo::new);

	}

}
