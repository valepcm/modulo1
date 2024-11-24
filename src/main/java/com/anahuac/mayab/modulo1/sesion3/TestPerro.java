package com.anahuac.mayab.modulo1.sesion3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.random.*;

public class TestPerro {

	public static void main(String[] args) {
		Perro perro1 = new Perro();
		Perro perro2 = new Perro("Desconocida", "Pequenio", 10.50, "Firulais", "Pepe", 2);
		
		System.out.println("El perro 1 se llama " + perro1.getNombre());
		System.out.println("El perro 2 se llama " + perro2.getNombre());
		
		//Ya sabemos el nombre del perro1
		perro1.setNombre("Solovino");
		System.out.println("El perro 1 se llama " + perro1.getNombre());
		
		System.out.println("El perro2 ladra! :o");
		perro2.ladrar();
		
		//Arreglo de perros
		Perro[] misPerros = new Perro[10];
		String [] nombres = {"Pepper", "Taco", "Tamal", "Torta", "Bruno", "Doris", "Satuno", "Kraken", "Pan", "Mimi"};
		String [] duenios = {"Tomas", "Luis", "Carlos", "Jose", "Andres", "Ricardo", "Rodrigo", "Tania", "Andrea", "Carla"};
		
		for (int i = 0; i < 10; i++) {
			misPerros[i] =new Perro();
			misPerros[i].setNombre(nombres[i]);
		}
		for (int i = 0; i < 10; i++) {
			misPerros[i].ladrar();
		}
		
		Random generadorRandom = new Random();
		for (int i = 0; i < 10; i++) {
			int aleatorio = generadorRandom.nextInt(10);
			misPerros[i].setNombreDuenio(duenios[aleatorio]);
			misPerros[i].ladrar();
		}
		
		System.out.println("----- Ahora usando un arraylist ------- \n");
		//Ahora vamos a usar un arrayList
		ArrayList<Perro> listaPerros = new ArrayList<Perro>();
		
		int i = 0;
		for(i = 0; i < 10; i++) {
			Perro perroTemporal = new Perro();
			perroTemporal.setNombre(nombres[i]);
			int numeroAleatorio = generadorRandom.nextInt(nombres.length);
			perroTemporal.setNombreDuenio(duenios[numeroAleatorio]);
			
			//Ya que estan seteados los valores, ahora guardo en la lista
			listaPerros.add(perroTemporal);
		}
		
		for(i = 0; i < 10; i++) {
			listaPerros.get(i).ladrar();
		}
		
		//Búsqueda de un perro
		for(i= 0; i< listaPerros.size(); i++) {
			String nombre = listaPerros.get(i).getNombre();
			if (nombre == "perro6") {
				listaPerros.get(i).setNombre("Keka");
				break;
			}
		}
		
		System.out.println("----- Después de cambio de nombre ----- \n");
		
		for( i = 0; i < 10; i++) {
			listaPerros.get(i).ladrar();
		}
		
		System.out.println("----- For Each ----- \n");
		for(Perro perro : listaPerros) {
			perro.ladrar();
		}
		
		System.out.println("----- Con Hash Map ----- \n");
		HashMap<Integer, Perro> mapPerros = new HashMap<>();
		
		for( i = 0; i < 10; i++) {
			Perro perroTemporal = new Perro();
			perroTemporal.setNombre(nombres[i]);
			int numeroAleatorio = generadorRandom.nextInt(nombres.length);
			perroTemporal.setNombreDuenio(duenios[numeroAleatorio]);
			
			//Una vez setteados, guardar en el mapa
			mapPerros.put(i,perroTemporal);
			perroTemporal.ladrar();
		}
		System.out.println("----- Hash Map con keyset ----- \n");
	
		for(Integer ii : mapPerros.keySet()) {
			mapPerros.get(ii).ladrar();
		}
		System.out.println("----- Hash Map con entryset ----- \n");
		for(Entry<Integer, Perro> entry : mapPerros.entrySet()) {
			entry.getValue().ladrar();
		}
		
		System.out.println("----- Hash Map con values ----- \n");
		
		for(Perro p : mapPerros.values()) {
			p.ladrar();
		}
	}
		
		
}

