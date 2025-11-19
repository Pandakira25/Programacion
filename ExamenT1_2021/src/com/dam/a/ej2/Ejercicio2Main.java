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
		
		//System.out.println(encuestas[0].getNivelGravedad());
		
		System.out.println("\n"+resultadosEncuesta(encuestas) + "\n");
		
		eMayMenGravedad(encuestas);

	}

	private static void eMayMenGravedad(Encuesta[] encuestas) {
		//creo dos encuesta para almacenar las que me sirvan y las inicializo en null, en el recorrido del array si las variables son null les asigno el valor del array actual, si no compruebo que el array que guardaron
		//cumpla con la condicion que quiero
		Encuesta mayEdad = null;
		Encuesta menGravedad = null;
		
		for(int i = 0; i <encuestas.length; i++) {
			if(encuestas[i].getHaPasadoCovid().equals(Encuesta.getHaPasadoCovidResp()[0])) {
				if((mayEdad == null) && (menGravedad == null)) {
					mayEdad = encuestas[i];
					menGravedad = encuestas[i];
				}else {
					
					if(mayEdad.getEdad() < encuestas[i].getEdad()) {
						mayEdad = encuestas[i];
					}
					
					if(menGravedad.getNivelGravedad() > encuestas[i].getNivelGravedad()) {
						menGravedad = encuestas[i];
					}
				}
			}
		}
		System.out.println("La la encuesta de la mayor persona en pasar el covid es: \n" + mayEdad.toString());
		System.out.println("\nLa encuesta de la persona con menor gravedad pasada es: \n" + menGravedad.toString());
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
