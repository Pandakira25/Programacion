package com.dam.main;

import com.dam.pojos.cochePojo;

public class EjecucionCoche {

	public static void main(String[] args) {
		
		cochePojo objCoche = new cochePojo();
		
		objCoche.acelera(50);
		
		objCoche.setVelocidad(0);
		objCoche.setMatricula("JLS1234");
		
		System.out.println("el coche de matricula " + objCoche.getMatricula() 
		+ "tiene una velocidad de " + objCoche.getVelocidad() + "Km/h");
		
		objCoche.acelera(50);
		
		System.out.println("el coche de matricula " + objCoche.getMatricula() 
		+ "tiene una velocidad de " + objCoche.getVelocidad() + "Km/h");
		
		objCoche.frena(10);
		
		System.out.println("el coche de matricula " + objCoche.getMatricula() 
		+ "tiene una velocidad de " + objCoche.getVelocidad() + "Km/h");
		

	}

}
