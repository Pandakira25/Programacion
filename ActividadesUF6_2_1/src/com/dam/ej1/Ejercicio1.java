package com.dam.ej1;

import java.util.Scanner;

public class Ejercicio1 {

	static final int TAMANIO_ARRAY = 10;
	
	public static void main(String[] args) {
		
		//Inicializar array
		int[] arrayNumeros = new int[TAMANIO_ARRAY];
		
		//Rellenar array
		rellenarArray(arrayNumeros);
		
		//Mostrar array
		mostrarArray(arrayNumeros);
		
	}

	private static void mostrarArray(int[] arrayNumeros) {
		
		for (int i = 0; i < arrayNumeros.length; i++) {
			System.out.print(i + ": " + arrayNumeros[i]);
			if(i!= arrayNumeros.length - 1) {
				System.out.print(", ");
			}
		}
		
	}

	private static void rellenarArray(int[] arrayNumeros) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arrayNumeros.length; i++) {
			System.out.println("Introduce el valor " + (i+1));
			arrayNumeros[i]= Integer.parseInt(sc.nextLine());
		}
		sc.close();
	}

}
