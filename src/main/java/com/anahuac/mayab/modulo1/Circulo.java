package com.anahuac.mayab.modulo1;
import java.math.*;

public class Circulo {
	
	public double calcArea(double radio) {
		
		double area = Math.pow(radio, 2) * Math.PI;
		return area;
	}
	
	public static void main(String[] args) {
		
		double radio, area, diametro, circunferencia;
	
		radio = 12.7;
		area = Math.pow(radio, 2) * Math.PI;
		diametro = radio *2;
		circunferencia = Math.PI * diametro;
	
		
		System.out.print("El área es: " + area + "\n");
		System.out.print("El diámetro es: " + diametro + "\n");
		System.out.print("La circunferencia es: " + circunferencia + "\n");
			
	}
	

}
