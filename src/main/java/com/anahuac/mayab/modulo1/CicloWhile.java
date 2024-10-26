package com.anahuac.mayab.modulo1;

public class CicloWhile {

	public static void main(String[] args) {
		// Sumar los primeros n numeros enteros
		int n = 5;
		int suma = 0;
		int contador = 0;
		while (contador <= n) {
			suma = suma + contador;
			contador = contador + 1;
			
		}
		System.out.println("La suma es " + suma);

	}

}
