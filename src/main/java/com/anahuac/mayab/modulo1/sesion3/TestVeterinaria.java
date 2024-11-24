package com.anahuac.mayab.modulo1.sesion3;

public class TestVeterinaria {

	public static void main(String[] args) {
		
		Perro perro = new Perro("Única", "Firulais", "Vale");
		CartillaPerro cartilla = new CartillaPerro (perro,"123");
		
		Veterinaria vet = new Veterinaria ("Mi veterinaria");
		try {
			Servicio servicio = vet.crearServicio("baño", perro.getNombre(), "16-Nov-2024" );
			} catch (Execption e ) {
		
		
	}

}
