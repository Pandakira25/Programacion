package com.dam.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique la cantidad de filas y columnas");
		int n = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		int matriz [][] = new int [n][n];
		
		fillM(matriz,rd);
		mostrarMatriz(matriz);
		
		interC(matriz);
		
		mostrarMatriz(matriz);

	}
	
	private static void interC(int matriz [][]) {
		int temp = 0;
		for(int i = 0; i < matriz.length; i++) {
			temp = matriz[i][0];
			matriz[i][0] = matriz[i][1];
			matriz[i][1] = temp;
		}
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
	
	private static void fillM(int[][] matriz, Random rd) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rd.nextInt(0,10); 
			}
		}
		
	}
}
