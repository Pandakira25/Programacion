package com.dam.ejercicios;

import java.util.Random;
import java.util.Scanner;

/*
 * Realiza un programa en el que se cree una matriz nxm, solicita n y m por
teclado, se rellene con enteros aleatorios entre 10 y 100 que sean pares, y
que calcule la suma de aquellos valores que sean múltiplos de 3.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique la cantidad de filas");
		int f = Integer.parseInt(sc.nextLine());
		System.out.println("Indique el numero de columnas: ");
		int c = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		int matriz [][] = new int [f][c];
		
		fillM(matriz,rd);
		
		sumM3(matriz);
		
		mostrarMatriz(matriz);

	}
	private static void mostrarMatriz(int matriz [][]) {
		System.out.println("\n");
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "  ");
			}
			System.out.println();
		}
		
	}
	
	private static void sumM3(int matriz [][]) {
		int sumM3 = 0;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++)
				if(matriz[i][j] % 3 == 0) {
					sumM3 += matriz[i][j];
				}
		}
		
		System.out.println("La suma de los elementos de la matriz multiplos de tres es: " + sumM3);
	}
	
	private static void fillM(int[][] matriz, Random rd) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rd.nextInt(10/2,101/2) * 2; 
			}
		}	
	}

}
