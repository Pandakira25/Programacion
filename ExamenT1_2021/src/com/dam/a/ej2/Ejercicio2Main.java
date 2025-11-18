package com.dam.a.ej2;

import java.util.Scanner;

/*
 * Crea un paquete com.dam.ej2.main y dentro crea una clase ejecutable, Encuestador, en la que:
- Se le pida al usuario cuántas encuestas se van a realizar
-  Para cada encuesta se realizarán, una a una, las tres preguntas y el usuario introducirá las respuestas.
- Y cuando se haya acabado de introducir encuestas el programa deberá informar de cuántos de los encuestados han pasado el COVID-19, y
cuántos han padecido tres o más síntomas o la gravedad haya sido mayor que 3.
- Mostrar la encuesta del encuestado más mayor y que haya pasado la enfermedad con menor gravedad.
 */

public class Ejercicio2Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese la cantidad de encuestas a realizar: ");
		int nE = Integer.parseInt(sc.nextLine());
		
		Encuesta encuestas[] = new Encuesta [nE]; 
		
		realizarEncuestas(sc, encuestas);
		
		sc.close();
		
		System.out.println(resultadosEncuesta(encuestas));
		
		eMayMenGravedad(encuestas);

	}

	private static void eMayMenGravedad(Encuesta[] encuestas) {
		//voy recorriendo el array de encuestas y si la edad es mayor que la anterior y la gravedad menor que el siguiente asigno esa posicion como la mayor
		Encuesta valida = null;
		Encuesta actual;
		
		boolean eMayor;
		boolean rMenor;
		
		for(int i = 0; i <encuestas.length; i++) {
			actual = encuestas[i];
			if(encuestas[i].getHaPasadoCovid().equals(Encuesta.getHaPasadoCovidResp()[0])) {
				if(valida == null) {
					valida = actual;
				}else {
					eMayor = actual.getEdad() > valida.getEdad(); 
					rMenor = actual.getNivelGravedad() < valida.getNivelGravedad(); 
					if(eMayor && rMenor) { 
						valida = actual; 
					}
				}
			}
		}
		System.out.println("La encuesta del encuestado mas grande con menor riesgo es: \n" + valida.toString());
	}

	private static String resultadosEncuesta(Encuesta encuestas []) {
		// Dentro de un for por cada pocisión compruebo con un get si tuvo o no covid y lo agrego a un contador luego si tuvo covid compruebo que haya tenido tres o mas síntomas o que haya sido de gravedad 
		//mayor a 3
		int contPC = 0;
		int contPC3S = 0;
		
		for(int i = 0; i < encuestas.length; i++) {
			if(encuestas[i].getHaPasadoCovid().equals(Encuesta.getHaPasadoCovidResp()[0])) {
				contPC++;
				if((encuestas[i].calcularNumSintomas() >= 3) || encuestas[i].getNivelGravedad() >= 3) {
					contPC3S++;
				}
			}
		}
		
		String resultadosE = "La cantidad de personas con covid fue: " + contPC + "\nLa cantidad de personas que tuvieron más de tres síntomas o nivel de gravedad mayor a 3 fueron: " + contPC3S;
		return resultadosE;
	}

	private static void realizarEncuestas(Scanner sc, Encuesta encuestas[]) {
		//pedir los datos en un for por cada posicion del array en un for
		int edad = 0;
		String covid = "";
		String sintomas = "";
		int gravedad = 0;
		
		for(int i = 0; i < encuestas.length; i++) {
			
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
