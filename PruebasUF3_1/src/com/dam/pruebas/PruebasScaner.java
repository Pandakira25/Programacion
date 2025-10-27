package com.dam.pruebas;

import java.util.Scanner;

//clase para aprender a comunicarnos con el usuario


public class PruebasScaner {

	public static void main(String[] args) {
		
		/*creamos una variable de referencia (PQ su tipo no es primitivo) de tipo Scanner; clase del paquete java.util de la libreria de 
		 * Java que me permite comunicarme con el usuario a travéz de una entrada
		 */
		
		Scanner teclado = new Scanner(System.in); //System.in entrada estandar ; definimos una comunicación con el teclado
		
		System.out.println("Introduce tu nombre");
		String nombre = teclado.nextLine();//teclado.nextLine sirve para que lea lo que introduce el usuario y lo almacena en la vairable
		
		System.out.println("Hola "+nombre);
		
		System.out.println("Por favor, introduce un número entero");
		int numero = teclado.nextInt();
		teclado.nextLine();//siempre hay que ponerlo luego de 
		
		System.out.println("El triple del número introducido es " + (numero * 3));
		
		System.out.println("Si al numero le sumamos 10 es " + (numero + 10));
		
		System.out.println("Introduce dos núero decimal");
		double decimal1 = teclado.nextDouble();
		double decimal2 = teclado.nextDouble();
		teclado.nextLine();
		
		System.out.println("Has introducido " + decimal1 + "y " + decimal2);
		
		teclado.close();
		
		
		

	}

}
