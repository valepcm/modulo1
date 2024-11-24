package com.anahuac.mayab.modulo1.sesion3;

public class TestVeterinaria {

	public static void main(String[] args) {
		//Mascota 1
		Perro perro = new Perro("Única", "Firulais", "Vale");
		CartillaPerro cartilla = new CartillaPerro (perro,"123");
		
		Veterinaria vet = new Veterinaria ("Mi veterinaria");
		vet.agregarPaciente(cartilla);
		
		try {
			Servicio servicio = vet.crearServicio("baño", perro.getNombre(), "16-Nov-2024" );
			servicio.realizar(perro.getNombre());
			Servicio servicio2 = vet.crearServicio("vacuna", perro.getNombre(), "16-Nov-2024" );
			servicio2.setCartillaPerro(cartilla);
			servicio2.realizar(perro.getNombre());
			cartilla.imprimirCartilla();
		
			} catch (Exception e ) {
				System.out.println("Ese servicio no lo ofrecemos :( ");
				e.printStackTrace();
			}
		
		//Mascota 2
		Perro perro2 = new Perro("Schnauzer", "Bruna", "Alfredo");
        CartillaPerro cartilla2 = new CartillaPerro(perro2, "456");
        vet.agregarPaciente(cartilla2);

        try {
            Servicio servicio3 = vet.crearServicio("consulta", perro2.getNombre(), "23-Nov-2024");
            servicio3.setCartillaPerro(cartilla2);
            servicio3.realizar(perro2.getNombre());
            cartilla2.imprimirCartilla();

        } catch (Exception e) {
            System.out.println("Ese servicio no lo ofrecemos :( ");
            e.printStackTrace();
        }
		
		//Imprimir expediente
		vet.imprimirExpedientes();
		
		
		
	}

} 
