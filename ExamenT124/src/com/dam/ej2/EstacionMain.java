package com.dam.ej2;

import java.util.Scanner;

public class EstacionMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Indica la cantidad de estaciones que se van a introducir: ");
		int nE = Integer.parseInt(sc.nextLine());
		
		Estacion estaciones[] = new Estacion[nE];
		
		pedirDaE(sc,estaciones);
		
		System.out.println("*** PISTAS INTRODUCIDAS ***");
		
		shwDaEsAYKmE(estaciones);
	}

	private static void shwDaEsAYKmE(Estacion[] estaciones) {
		for(int i = 0; i<estaciones.length;i++) {
			System.out.println(estaciones[i].toString() + "\nPorcentaje de Km esquiables: " + estaciones[i].pEsq()+"%");
		}
		
	}

	private static void pedirDaE(Scanner sc, Estacion[] estaciones) {
		String nombre = "";
		String provincia = "";
		String estado = "";
		String remontes = "";
		String pistas = "";
		String kmEsquiables = "";
		
		for(int i = 0; i < estaciones.length; i++) {
			
			System.out.print("Introduce el nombre de la estación " + (i+1) +": ");
			nombre = sc.nextLine();
			
			System.out.print("Introduce la provincia en la que se encuentra: ");
			provincia = sc.nextLine(); 
			
			System.out.print("Estado(ABIERTA/CERRADA): ");
			estado = sc.nextLine();
			
			if(estado.equalsIgnoreCase(Estacion.ESTADO_S[0])) {
				System.out.print("Remontes: ");
				remontes = sc.nextLine();
				
				System.out.print("Pistas: ");
				pistas = sc.nextLine();
				
				System.out.print("Kilómetros esquiables:");
				kmEsquiables = sc.nextLine();
			}
			
			estaciones[i] = new Estacion(nombre,provincia,estado,remontes,pistas,kmEsquiables);
		}
		
	}

}
