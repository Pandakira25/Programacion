package com.dam.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

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
		
		sFilas(matriz, f);
		
		System.out.println();
		mostrarMatriz(matriz);
		
	}
	
	public static void sFilas(int matriz [][], int f) {
		int temp [] = new int [f];
		temp = matriz[0];
		matriz[0]=matriz[1];
		matriz[1]=temp;
		
	}
	
	private static void mostrarMatriz(int matriz [][]) {
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
