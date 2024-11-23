package com.anahuac.mayab.modulo1.sesion5;
import java.io.FileWriter;
import java.io.PrintWriter;

public class TestArchivo {
	
	public static void main (String[] args) {
		
		String nombreArchivo = "prueba.txt";
		try (FileWriter archivo = new FileWriter("nombreArchivo"))
        {
            PrintWriter pw = new PrintWriter(archivo);
            pw.print("Hola, bienvenido al diplomado de programacion \n");
            pw.print("\t en Java");
            pw.print("\n Esta es otra linea");

        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}

}
