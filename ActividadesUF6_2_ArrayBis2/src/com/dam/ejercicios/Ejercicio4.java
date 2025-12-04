package com.dam.ejercicios;

import java.util.Random;
import java.util.Scanner;

/*
 * Realiza un programa en el que se cree una matriz nxm, solicita n y m por
teclado, se rellene con enteros aleatorios entre 10 y 100 que sean múltiplos
de 5, muestra la matriz por consola y calcula y muestra su traspuesta. La
matriz traspuesta se obtiene cambiando las filas por las columnas, es decir,
la fila 1 pasa a ser la columna 1, la fila 2, la columna 2, y así sucesivamente.
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique la cantidad de filas y columnas");
		int n = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		int matriz [][] = new int [n][n];
		
		
	}
	
	private static void rd5(Random rd) {
		int rand = 0;
		while(rand % 5 != 0) {
			rand = rd.nextInt(10,101);
		}
	}

	private static void fillM(int[][] matriz, Random rd) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = null; 
			}
		}	
	}
}
