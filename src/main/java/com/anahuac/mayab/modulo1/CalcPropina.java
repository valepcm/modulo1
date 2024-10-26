package com.anahuac.mayab.modulo1;

public class CalcPropina {

	public static void main(String[] args) {
		double propina, cuenta, calcProp;
		
		propina = 10.00;
		cuenta = 1200.00;
		
		calcProp = cuenta * .10;
		if (calcProp > propina) {
			propina = calcProp;
		}
		
		System.out.println("La cuenta es de $" + cuenta + " y la prpoina es de $" + propina);

	}

}
