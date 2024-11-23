package com.anahuac.mayab.modulo1.sesion3;

public class TestCartilla {

	public static void main(String[] args) {
		
		Perro miPerro = new Perro ("Única", "Firulais", 5, "Val");
		
		CartillaPerro cartilla = new CartillaPerro();
		cartilla.setDatosPerro(miPerro);
		cartilla.actualizar("Rabia", "5-mar-2024");
		cartilla.actualizar("Desparacitacion", "25-ene-2024");
		cartilla.actualizar("Moquillo", "12-jul-2024");
		
		
		cartilla.imprimirCartilla();
	}

}
