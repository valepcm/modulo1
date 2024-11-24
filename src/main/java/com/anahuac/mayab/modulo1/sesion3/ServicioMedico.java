package com.anahuac.mayab.modulo1.sesion3;

public class ServicioMedico extends Servicio {

	public ServicioMedico(String tipo, double costo, String fecha, String encargado) {
		super(tipo, costo, fecha, encargado);
	}
	
	public void consultar(String nombre) {
		System.out.println("Realizando consulta paciente...\n" + nombre);
	}
	
	public void darReceta() {
		System.out.println("Crear receta con recomendaciones...");
	}
	
	@Override
	public void realizar(String nombre) {
		consultar(nombre);
		darReceta();
	}

}
