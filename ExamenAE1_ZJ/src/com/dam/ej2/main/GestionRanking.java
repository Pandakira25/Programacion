package com.dam.ej2.main;

import java.util.Scanner;

import com.dam.ej2.pojo.Lenguaje;

public class GestionRanking {
	
	static final int ANIO_ACTUAL = 2025; //don´t forget to name the constants in capital letters
	static final int TAM_ARRAY = 5;


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Lenguaje lenguajes[] = new Lenguaje[TAM_ARRAY];
		
		rellLeng(sc,lenguajes);
		
		sc.close();
		
		mostrarD(lenguajes);
		
		lM30PMasMen(lenguajes);
		
		TresMasUsoPT(lenguajes);
	}

	/*
	 * •	Mostrar el lenguaje de los 3 primeros que lleva más tiempo en uso y qué porcentaje suman entre los 3 primeros. 
	 * (No suponer que están ordenados en el array)
	 */
	private static void TresMasUsoPT(Lenguaje [] lenguajes) {
		Lenguaje lMasA = null;
		Lenguaje p1 = null;
		Lenguaje p2 = null;
		Lenguaje p3 = null;
		for(int i = 0; i < lenguajes.length; i++) {
			if(lenguajes[i].getPosicionRank() == 1) {
				p1 = lenguajes[i];
			}else if(lenguajes[i].getPosicionRank() == 2) {
				p2 = lenguajes[i];
			}else if(lenguajes[i].getPosicionRank() == 3) {
				p3 = lenguajes[i];
			}
		}
		
		if(p1.aniosEnUso(ANIO_ACTUAL) > p2.aniosEnUso(ANIO_ACTUAL) && p1.aniosEnUso(ANIO_ACTUAL) > p3.aniosEnUso(ANIO_ACTUAL) ) {
			lMasA = p1;
		}else if(p2.aniosEnUso(ANIO_ACTUAL) > p3.aniosEnUso(ANIO_ACTUAL)) {
			lMasA = p2;
		}else {
			lMasA = p3;
		}
		
		double s3P = p1.getPorUso() + p2.getPorUso() + p3.getPorUso();
		
		System.out.println("\n\nEl lenguaje que lleva más años entre los 3 primeros es:" + lMasA + "\n\nY la suma de los porcentajes de uso de los tres primeros es: " + s3P);
	}


	private static void lM30PMasMen(Lenguaje [] lenguajes) {
		int cMas30 = 0;
		int cMasPor = 0;
		int cMenPor = 0;
		
		for(int i = 0; i < lenguajes.length; i++) {
			if(lenguajes[i].aniosEnUso(ANIO_ACTUAL) > 30) {
				cMas30++;
			}
			
			if(lenguajes[i].getDifPorUsoAA() > 0) {
				cMasPor++;
			}else if(lenguajes[i].getDifPorUsoAA()<0) {
				cMenPor++;
			}
		}
		
		System.out.println("\nDe " + lenguajes.length + " lenguajes, " + cMas30 + " llevan en uso más de 30 años, " + cMasPor +" han ganado porcentaje y " + cMenPor + " han perdido porcentaje.");
		
	}


	private static void mostrarD(Lenguaje[] lenguajes) {
		
		for(int i = 0; i < lenguajes.length; i++) {
			System.out.println(lenguajes[i].toString() + "\n\nPorcentaje de uso hace un año: " + lenguajes[i].porAnioAnterior() + "\nAños que lleva en uso: " + lenguajes[i].aniosEnUso(ANIO_ACTUAL));
		}
		
	}


	private static void rellLeng(Scanner sc, Lenguaje[] lenguajes) {
		String nombre = null;
		String nomCreador = null;
		int anioPublicacion = 0;
		int posRank = 0;
		double porUso = 0;
		double difPorUso = 0;
		
		for(int i = 0; i < lenguajes.length; i++) {
			System.out.println("Introduce el nombre del " + (i+1) +"º lenguaje: ");
			nombre = sc.nextLine();
			System.out.println("Introduce el nombre de su creador: ");
			nomCreador = sc.nextLine();
			System.out.println("Introduce el año en que se publicó: ");
			anioPublicacion = Integer.parseInt(sc.nextLine());
			System.out.println("Introduce su posición en el ranking: ");
			posRank = Integer.parseInt(sc.nextLine());
			System.out.println("Introduce el porcentaje de uso: ");
			porUso = Double.parseDouble(sc.nextLine());
			System.out.println("Introduce la diferencia con el año anterior:");
			difPorUso = Double.parseDouble(sc.nextLine());
			
			lenguajes [i] = new Lenguaje (nombre,nomCreador,anioPublicacion,posRank,porUso,difPorUso);
		}
		
	}

}
