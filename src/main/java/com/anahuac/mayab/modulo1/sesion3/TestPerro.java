package com.anahuac.mayab.modulo1.sesion3;

public class TestPerro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro perro1 = new Perro();
		Perro perro2 = new Perro("Desconocida", "Pequenio", 10.50, "Firulais", "Pepe", 2);
		
		System.out.println("El perro 1 se llama " + perro1.getNombre());
		System.out.println("El perro 2 se llama " + perro2.getNombre());
		
		//Ya sabemos el nombre del perro1
		perro1.setNombre("Solovino");
		System.out.println("El perro 1 se llama " + perro1.getNombre());
		
		System.out.println("El perro2 ladra! :o");
		perro2.ladrar();
		
	}

}
