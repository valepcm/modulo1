package com.anahuac.mayab.modulo1;

public class Condicional {
	
	public static void main(String[] args) {
		int edad = 18;
		boolean ine = false;
		
		if (edad >= 18) {
			System.out.print("Eres mayor de edad. \n");
			if (ine == true) {
				System.out.println("Ya puedes votar. \n");
			}
			else {
				System.out.println("Acude a tu modulo. \n");
			}
		}
		else {
			System.out.print("No eres mayor de edad. \n");
		}
		
	}

}
