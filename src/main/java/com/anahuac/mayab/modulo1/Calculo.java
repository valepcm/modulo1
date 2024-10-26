package com.anahuac.mayab.modulo1;

public class Calculo {

	public static void main(String[] args) {
		//Calcular el mayor de 2 numeros
		
		float num1, num2;
		num1 = 10;
		num2 = 20;
		
		if (num1 == num2) {
			System.out.println("Los dos numeros son iguales \n");
		}
		else if (num1 > num2) {
			System.out.println(num1 + " es mayor que " + num2 + "\n");
		}
		else {
			System.out.println(num2 + " es mayor que " + num1 + "\n");
		}

	}

}
