package com.dam.ej6;

import java.util.Random;
import java.util.Scanner;

/*
 * Crea un array de números donde le indicamos por teclado el tamaño del
array,
 rellenaremos el array con números aleatorios entre 0 y 9,
  al final muestra por pantalla el valor de cada posición y la suma de todos
los valores.
 Haz un método para rellenar el array (que tenga como
parámetros los números entre los que tenga que generar), para
mostrar el contenido y la suma del array y un método privado para
generar número aleatorio (lo puedes usar para otros ejercicios).
 */

public class Ejercicio6 {
	
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();
	static final int MIN_AL = 0;
	static final int MAX_AL = 9;

	public static void main(String[] args) {
		
		
		
		int numeros [] = new int [tamanioArray()];
		
		rellenarArray(numeros, MIN_AL, (MAX_AL+1));
		
		mostrarValorPosicin(numeros);
		
		System.out.println(mostrarSuma(numeros));
		

	}

	private static int tamanioArray() {
		
		System.out.println("Indique el tamaño del array");
		int tA = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		return tA;
	}
	
	
	private static void rellenarArray(int numeros[], int limInf, int limSup) {
		for(int i = 0; i < numeros.length; i++) {
			int nAl = rd.nextInt(MIN_AL,MAX_AL);
			numeros[i] = nAl; 
		}
		
	}
	
	private static void mostrarValorPosicin(int numeros []) {
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("El número guardado en la posición " + i + " es: " + numeros[i]);
		}
	}
	
	private static String mostrarSuma(int numeros[]) {
		int sumT = 0;
		
		for(int i = 0; i < numeros.length; i++ ) {
			sumT += numeros[i];
		}
		
		String string = "La suma total de los numeros aleatorios entre " + MIN_AL + " y " + MAX_AL + " fue: " + sumT;
		
		return string;
	}

	

	

}
