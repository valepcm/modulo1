package com.anahuac.mayab.modulo1.sesion3;

public class ServicioEstetico extends Servicio{

	public ServicioEstetico(String tipo, double costo, String fecha, String encargado) {
		super(tipo, costo, fecha, encargado);
		// TODO Auto-generated constructor stub
	}
	
	public void baniar() {
		System.out.println("Bañando...");
	}
	
	public void cepillar() {
		System.out.println("Cepillando...");

		
	}
	
	public void cortarUnias() {
		System.out.println("Cortando uñas...");

	}

	@Override
	public void realizar(String nombre) {
		System.out.println("Atendiendo a: " + nombre + "\n");

		baniar();
		cepillar();
		cortarUnias();
	}
}
