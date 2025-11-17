package com.dam.ej7;

/*
 * 7. Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios primos entre los números deseados (también solicitados por teclado), 
 * por último, nos indicará cual es el mayor de todos. Haz un método para comprobar si un número es primo. Haz todos lo métodos que necesites.
 */

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
	
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	public static void main(String[] args) {
		
		//antes de inicializar el array tendría que guardar los datos del pedirDatos en el main?
		int datos[] = PedirDatos();
		int lenght = datos[0];
		int minRd = datos[1];
		int maxRd = datos[2];
		
		//Inicializo el array n con el valor de tamaño guardado
		int n [] = new int[lenght];
		
		//Rellenar el array con numeros aleatorios primos entre el rango ingresado del random
		//un método que compruebe si es primo o no un número
		//un método que si el número es primo lo agreuge al array.  Este llama al de arriba.
		RellenarArray(n, minRd, maxRd);
		
		//Indicar cuál es mayor
		System.out.println("El mayor número del array es: " + MayorN(n));

	}
	
	private static int[] PedirDatos() {
		System.out.print("Ingrese el tamaño del array: ");
		int lenght = Integer.parseInt(sc.nextLine());
		System.out.println("Ingrese el mínimo y el máximo del rango de números random: ");
		int minRd = Integer.parseInt(sc.nextLine()); 
		int maxRd = Integer.parseInt(sc.nextLine());
		
		int c = 0;
		
		if (minRd > maxRd) {
			c = minRd;
			minRd = maxRd;
			maxRd = c;
		}
		
		return new int[] {lenght, minRd, maxRd}; //me gusta esta idea pero me jode que no le pueda poner un nombre al array o al menos no se como ponérselo
	}
	
	private static boolean PrimoYN(int n) {
		boolean primoYN = true;
		if(n == 0 || n == 1) {
			primoYN = false;
		}else {
			for(int i = 2; i <= Math.sqrt(n); i++) {
				if(n % i == 0) {
					primoYN = false;
					i = (int) Math.sqrt(n);
				}
			}
		}
		
		return primoYN;
	}
	
	private static void RellenarArray(int n[], int minRd, int maxRd) {
		int nRd = 0;
		
		for(int i = 0; i < n.length; i++) {
			do {
				nRd = rd.nextInt(minRd, maxRd);
			}while(!PrimoYN(nRd));
			n[i] = nRd;
		}
	}

	private static int MayorN(int n[]) {
		int mayN = n[0];
		
		for(int i = 0; i < n.length; i++) {
			if(n[i]>mayN) {
				mayN=n[i];
			}
		}
		
		return mayN;
	}
	
	private static void MostrarArray(int n[]) {
		for(int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}

}



//Como accedo a variables de otro metodo dentro de un metodo: declarar las variables como globales o ingresarlas como parámetros desde el main
//como accedo a un método desde otro método
