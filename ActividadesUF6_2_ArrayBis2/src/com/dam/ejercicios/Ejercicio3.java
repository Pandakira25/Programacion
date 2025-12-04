package com.dam.ejercicios;

import java.util.Scanner;

/*
 * Realiza un programa en el que se cree una matriz 9x10, se rellene con las
tablas de multiplicar del 1 al 9, es decir, en la primera fila la tabla del 1, en
la segunda la tabla del 2, y así sucesivamente. Que le pida al usuario un
número del 1 al 9 y muestre la fila con la tabla correspondiente. Por
ejemplo, si el usuario introduce el 5 se le deberá mostrar por consola 5 10
15 20 25 ...50.
 */

public class Ejercicio3 {
	
	static final int T_F = 9;
	static final int T_C = 10;
	
	public static void main(String[] args) {
		int matriz [][] = new int [T_F][T_C];
		
		fillMT(matriz);
		
		showA(matriz);
	}

	private static void showA(int matriz [][]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que tabla desea saber? ");
		int t = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < matriz[0].length; i++) {
			System.out.print(matriz[t-1][i] +" ");
		}
	}
	
	private static void fillMT(int matriz [][]) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (i + 1) * (j+1);
			}
		}
	}

}
