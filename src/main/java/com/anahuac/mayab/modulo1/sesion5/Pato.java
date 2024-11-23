package com.anahuac.mayab.modulo1.sesion5;

abstract public class Pato {
	private String Nombre;
	private String Color;
	
	public Pato(String nombre, String color) {
		super();
		Nombre = nombre;
		Color = color;
		
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}
	
	abstract public void comer ();
	
	public void volar () {
		System.out.println("Soy un pato y puedo volar");
	}
	
	abstract public void quack();
	
	
}
