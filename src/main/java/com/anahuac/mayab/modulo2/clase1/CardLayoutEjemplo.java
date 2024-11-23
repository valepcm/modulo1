package com.anahuac.mayab.modulo2.clase1;
import javax.swing.*;
import java.awt.*;

public class CardLayoutEjemplo extends JFrame{
	
	public CardLayoutEjemplo () {
		setTitle("Ejemplo de CardLayout");
		setSize(400,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//Configurar CardLayout
		CardLayout cardLayout = new CardLayout();
		JPanel cardPanel = new JPanel(cardLayout);
		
		//Añadir tarjetas
		cardPanel.add(new JLabel("Tarjeta 1", SwingConstants.CENTER),"Tarjeta 1");
		cardPanel.add(new JLabel("Tarjeta 2", SwingConstants.CENTER), "Tarjeta 2");
		cardPanel.add(new JLabel("Tarjeta 3", SwingConstants.CENTER), "Tarjeta 3");
		cardPanel.add(new JLabel("Tarjeta 4", SwingConstants.CENTER), "Tarjeta 4");
		
		
		//Botones para navegar
		JPanel buttonPanel = new JPanel ();
		
			//Boton previo
		JButton previousButton = new JButton("Previo");
		previousButton.addActionListener(e -> cardLayout.previous(cardPanel));
		buttonPanel.add(previousButton);
		
			//Boton Siguiente
		JButton nextButton = new JButton("Siguiente");
		nextButton.addActionListener(e -> cardLayout.next(cardPanel));
		buttonPanel.add(nextButton);
		
			//Boton a tarjeta1
		JButton tarjeta1 = new JButton("Tarjeta 1");
		tarjeta1.addActionListener(e -> cardLayout.show(cardPanel,"Tarjeta 1"));
		buttonPanel.add(tarjeta1);
		
		//Agregar botones al frame
		add(cardPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(CardLayoutEjemplo::new);

	}
}
