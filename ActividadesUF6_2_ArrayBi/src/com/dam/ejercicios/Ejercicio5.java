package com.dam.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

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
		
		mostrarMatriz(matriz);
		
		mostrarVertices(matriz, f , c);

	}
	
	private static void mostrarMatriz(int matriz [][]) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "  ");
			}
			System.out.println();
		}
		
	}

	private static void mostrarVertices(int[][] matriz, int f, int c) {
		System.out.println("\nLos vértices de la matriz son: \n");
		System.out.print(matriz[0][0] + "  "); 
		System.out.println(matriz[0][c-1] + "  ");
		System.out.print(matriz[f-1][0] + "  ");
		System.out.println(matriz[f-1][c-1] + "  ");
		
	}



	private static void fillM(int[][] matriz, Random rd) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rd.nextInt(0,10);
			}
		}
		
	}
}
