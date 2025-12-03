package com.dam.ejercicios;

import java.util.Random;
import java.util.Scanner;

/*
 * 7. Crea una matriz nxn (pide n por teclado), rellénala con valores aleatorios pares y, calcula y muestra la suma de la diagonal inversa.

La diagonal inversa está formada por los valores en las posiciones [0][n-1], [1][n-2], ..., [n-1][0] 
 */

public class Ejercicio7 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique la cantidad de filas y columnas");
		int n = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		int matriz [][] = new int [n][n];
		
		fillM(matriz,rd);

	}
	
	private static void sumaDI(int matriz [][]) {
		
	}
	
	private static void fillM(int[][] matriz, Random rd) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rd.nextInt(0,10);
			}
		}
		
	}

}
