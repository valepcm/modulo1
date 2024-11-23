package com.anahuac.mayab.modulo2.clase1;
import javax.swing.*;
import java.awt.*;

public class GridLayoutMatriz extends JFrame{
	
	public GridLayoutMatriz (){
		setTitle("GridLayout Ejemplo");
		setSize(400,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		//Configurar el Layout
		setLayout(new GridLayout(3,2,10,10));
		
		//Aniadir componentes
        for (int i = 1; i <= 15; i++) {
        	add(new JButton(String.valueOf(i)));
        }
		setVisible(true);
		
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(GridLayoutMatriz::new);

	}

}
