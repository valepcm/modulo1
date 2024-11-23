package com.anahuac.mayab.modulo1.sesion5;
import java.util.ArrayList;


public class TestPatos {

	public static void main(String[] args) {
		
		Pato pato1 = new PatoMallard("Mallard", "Negro");
		Pato pato2 = new PatoHule("Hule", "Amarillo");
		Pato pato3 = new PatoSenuelo("senuelo", "gris");
		
		ArrayList<Pato> listaPatos = new ArrayList<Pato>();
		
		listaPatos.add(pato1);
		listaPatos.add(pato2);
		listaPatos.add(pato3);
		
		// --SIMULADOR DE PATOS -- 
		for(Pato p: listaPatos) {
			p.volar();
			p.quack();
		}
		
	}

}
