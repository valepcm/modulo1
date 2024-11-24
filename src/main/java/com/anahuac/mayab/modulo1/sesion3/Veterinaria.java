package com.anahuac.mayab.modulo1.sesion3;

import java.io.IOException;
import java.util.ArrayList;

public class Veterinaria {
	private String nombre;
	private ArrayList<CartillaPerro> listaPacientes = new ArrayList<>();
	
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
		else if (tipo.startsWith("vacuna") || tipo == "consulta" ) {
			servicio = new ServicioMedico(tipo, 500, fecha, "veterinaria");
		}
		else {
			throw new Exception("No existe el servicio");
		}
		return servicio;
	}
	public void agregarPaciente(CartillaPerro cartilla) {
	listaPacientes.add(cartilla);
	}
	
	public void imprimirExpedientes() {
		for (CartillaPerro c: listaPacientes) {
			try {
				c.imprimirExpediente();
			} catch (IOException e) {
				System.out.println("No pude crear el expediente");
				e.printStackTrace();
			}
		}
		
	}
	
}