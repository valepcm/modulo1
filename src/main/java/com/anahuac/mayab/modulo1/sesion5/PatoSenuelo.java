package com.anahuac.mayab.modulo1.sesion5;

public class PatoSenuelo extends Pato{

	public PatoSenuelo(String nombre, String color) {
		super(nombre, color);
	}
	public void comer () {
		System.out.println("Soy un pato senuelo y no puedo comer");
	}
	public void volar () {
		System.out.println("Soy un pato senuelo y salgo volando");
	}
	public void quack() {
		System.out.println("Soy un pato senuelo y soy mudo");
	}

}
