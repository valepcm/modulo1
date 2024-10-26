package com.anahuac.mayab.modulo1;
import java.util.Scanner;

public class CicloCalificaciones {

	public static void main(String[] args) {
		// Calcular el promedio de calificaicones
		
		double sumaCalificaciones, calificacion, promedio, contador;
		
		sumaCalificaciones = 0;
		calificacion = 0;
		promedio = 0;
		contador = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una calificacion entre 0 y 10. \nIngrese -1 para salir.");
		calificacion = sc.nextDouble();		
				
		while (calificacion != -1) {
			
			if (calificacion >= 0 && calificacion<= 10) {
			sumaCalificaciones = sumaCalificaciones + calificacion;
			contador ++;
			System.out.println("Ingrese la siguiente calificacion.");
			calificacion = sc.nextDouble();
			}
			else {
				System.out.println("La calificaion no es valida. \nIngrese una calificacion entre 0 y 10 ");
				calificacion = sc.nextDouble();
			}
			
		}
		
		//En caso de que el usuario ingrese directamente -1, salta el cálculo del promedio
		if (contador == 0) {
			System.out.println("No hay promedio ya que no ingresó calificaciones");
		}
		else {
			promedio = sumaCalificaciones / contador;
			System.out.println("El promedio es: " + promedio +"\n");
		}
		
	}

}
