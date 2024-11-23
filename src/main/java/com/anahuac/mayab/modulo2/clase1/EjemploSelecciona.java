
package com.anahuac.mayab.modulo2.clase1;
import javax.swing.*;
import java.awt.*;

public class EjemploSelecciona extends JFrame{
	public EjemploSelecciona() {
		setTitle ("Ejemplo Selecciona");
		setSize (400,350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//Configurar panel principal
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		//Seleccion unica
		JLabel etiquetaRadio = new JLabel("Seleccina genero");
		JRadioButton radio1 = new JRadioButton("Masculino");
		JRadioButton radio2 = new JRadioButton("Femenino");
		JRadioButton radio3 = new JRadioButton("Otro");
		
		ButtonGroup grupoGenero = new ButtonGroup();
		grupoGenero.add(radio1);
		grupoGenero.add(radio2);
		grupoGenero.add(radio3);
		
		
		//seleccion multiple
		JLabel etiquetaCheckbox = new JLabel("Seleccione sus intereses");
		JCheckBox check1 = new JCheckBox("Lectura");
		JCheckBox check2 = new JCheckBox("Peliculas");
		JCheckBox check3 = new JCheckBox("Musica");
		JCheckBox check4 = new JCheckBox("Deportes");
		
		//JCombo box, lista desplegable
		JLabel etiquetaComboBox = new JLabel("Seleccione Pais");
		String[] paises = {"Mexico", "Argentina", "Brazil", "EEUU", "Canada"};
		JComboBox<String> paisesComboBox =new JComboBox<String> (paises);
	
		//Agregar componentes al panel
		
		panel.add(etiquetaRadio);
		panel.add(radio1);
		panel.add(radio2);
		panel.add(radio3);
		
		panel.add(Box.createRigidArea(new Dimension(0, 10)));
		panel.add(etiquetaCheckbox);
		panel.add(check1);
		panel.add(check2);
		panel.add(check3);
		panel.add(check3);
		
		panel.add(Box.createRigidArea(new Dimension(0,10)));
		panel.add(etiquetaComboBox);
		panel.add(paisesComboBox);
		
		
		add(panel);
		setVisible(true);
		
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(EjemploSelecciona::new);

	}

}
