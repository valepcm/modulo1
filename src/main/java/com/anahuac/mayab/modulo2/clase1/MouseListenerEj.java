package com.anahuac.mayab.modulo2.clase1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerEj extends JFrame {
	public MouseListenerEj () {
		setTitle ("Ejercicio de Mouse Listener");
		setSize (400,350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//Crear Panel
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		
		//Agregar mouse Listener
		panel.addMouseListener(new MouseListener() {
			
			
			public void mouseClicked (MouseEvent e) {
				//No se requiere accion para este evento
			}
			
			
			public void mousePressed(MouseEvent e) {
				//No se requiere accion para este evento
			}
			
			
			public void mouseReleased (MouseEvent e) {
				//No se requiere accion para este evento
			}
			
			
			public void mouseEntered (MouseEvent e) {
				//Cambiar el color al pasar el mouse por arriba
				panel.setBackground(Color.CYAN);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				//Cambiar el color al pasar el mouse por arriba
				panel.setBackground(Color.GREEN);
				
			}
		});
		
		//Agregar panel
		add(panel);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(MouseListenerEj::new);

	}

}
