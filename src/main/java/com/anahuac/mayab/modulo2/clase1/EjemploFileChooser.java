package com.anahuac.mayab.modulo2.clase1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EjemploFileChooser extends JFrame {

    public EjemploFileChooser() {
        setTitle("Ejemplo con FileChooser");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Botón para abrir el JFileChooser
        JButton openButton = new JButton("Seleccione su archivo");
        openButton.addActionListener(new ActionListener() {
        	
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear un JFileChooser
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Seleccione su archivo");

                // Abrir el cuadro de diálogo
                int result = fileChooser.showOpenDialog(EjemploFileChooser.this);

                // Procesar la acción del usuario
                if (result == JFileChooser.APPROVE_OPTION) {
                    String selectedFilePath = fileChooser.getSelectedFile().getAbsolutePath();
                    JOptionPane.showConfirmDialog(
                        EjemploFileChooser.this,
                        "Archivo seleccionado: " + selectedFilePath
                    );
                } else if (result == JFileChooser.CANCEL_OPTION) {
                    JOptionPane.showMessageDialog(
                        EjemploFileChooser.this,
                        "Selección Cancelada"
                    );
                }
            }
        });

        // Añadir el botón al JFrame
        add(openButton);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EjemploFileChooser::new);
    }
}