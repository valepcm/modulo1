package com.anahuac.mayab.modulo1.sesion3;

public class Veterinaria {
	private String nombre;
	
	public Veterinaria(String nombre) { 
		super();
			this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String setNombre() {
		return nombre;
	}
	
	public Servicio crearServicio(String tipo, String nombre, String fecha) throws Exception{
		Servicio servicio = null;
		
		if (tipo == "baño" || tipo == "corte" ) {
			servicio = new ServicioEstetico(tipo, 250, fecha, "encargadoEstetica");
		}
		else if (tipo == "vacuna" || tipo == "consulta" ) {
			servicio = new ServicioMedico(tipo, 500, fecha, "veterinaria");
		}
		else {
			throw new Exception("No existe el servicio");
		}
		return servicio;
	}
}