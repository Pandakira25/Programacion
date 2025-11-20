package com.dam.ej2;

import java.util.Scanner;

import com.dam.a.ej2.Encuesta;

public class EstacionMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese la cantidad de estaciones a introducir: ");
		int nE = Integer.parseInt(sc.nextLine());
		
		Estacion estaciones[] = new Estacion[nE];
		
		pedirDaE(sc,estaciones);
		
		shwDaEsA(estaciones);
		
		estMenKmEq(estaciones);
		
		
	}

	private static void estMenKmEq(Estacion[] estaciones) {
		// TODO Auto-generated method stub
		
	}

	private static void shwDaEsA(Estacion[] estaciones) {
		// TODO Auto-generated method stub
		
	}

	private static void pedirDaE(Scanner sc, Estacion[] estaciones) {
		String nombre = "";
		String provincia = "";
		String estado = "";
		String Remontes = "";
		String Pistas = "";
		String KmEsquiables = "";
		
		for(int i = 0; i < estaciones.length; i++) {
			
			System.out.print("Ingrese la edad del encuestado " + (i+1) +": ");
			edad = Integer.parseInt(sc.nextLine());
			
			System.out.print("Ingrese \"Si\" si tuvo covid, ingrese \"No\" si no tuvo: ");
			covid = sc.nextLine(); 
			
			if(covid.equals(Encuesta.getHaPasadoCovidResp()[0])) {//igualo el string ingresado a la constante en el pojo encuesta
				System.out.print("Ingrese los sintomas separados por comas: ");
				sintomas = sc.nextLine();
				
				System.out.print("Ingrese el nivel de gravedad del 1 al 5, siendo 5 la mayor: ");
				gravedad = Integer.parseInt(sc.nextLine());
			}
			
			encuestas[i] = new Encuesta(edad, covid, sintomas, gravedad);
		}
		
	}

}
