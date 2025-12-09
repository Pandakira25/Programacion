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
		
		System.out.println("Indique la cantidad de filas: ");
		int f = Integer.parseInt(sc.nextLine());
		System.out.println("Indique la cantidad de columnas:");
		int c = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		int matriz [][] = new int [c][f]; 
		
		fillM(matriz, rd);
		
		System.out.println("Matriz normal: ");
		mostrarMatriz(matriz);
		
		System.out.println("\nMatriz traspuesta: ");
		showTraspuesta(matriz);
	}
	
	private static void mostrarMatriz(int matriz [][]) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "  ");
			}
			System.out.println();
		}
		
	}
	
	private static void showTraspuesta(int matriz [][]) {
		int mT [][] = new int [matriz[0].length][matriz.length];
		
		for(int i = 0; i < mT.length; i ++) {
			for(int j = 0; j < mT[0].length; j++) {
				mT[i][j]=matriz[j][i];
			}
		}
		
		for(int i = 0; i < mT.length; i++) {
			for(int j = 0; j < mT[i].length; j++) {
				System.out.print(mT[i][j] + "  ");
			}
			System.out.println();
		}
		
	}
	
	private static int rd5(Random rd) {
		int rand = rd.nextInt(10,101);
		while(rand % 5 != 0) {
			rand = rd.nextInt(10,101);
		}
		return rand;
	}

	private static void fillM(int[][] matriz, Random rd) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rd5(rd); 
			}
		}	
	}
}
