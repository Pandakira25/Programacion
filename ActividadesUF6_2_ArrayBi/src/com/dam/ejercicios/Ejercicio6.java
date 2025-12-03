package com.dam.ejercicios;

import java.util.Random;

public class Ejercicio6 {
	
	static final int T_F = 3;
	static final int T_C = 3;

	public static void main(String[] args) {
		Random rd = new Random();
		int matriz [][] = new int [T_F][T_C];
		
		fillM(matriz,rd);
		
		mostrarMatriz(matriz);
		
		sumaF(matriz);
		sumaC(matriz);
		

	}
	
	private static void sumaF(int matriz [][]) {
		int sumaF = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				sumaF += matriz[i][j];
			}
			System.out.println("La suma de la fila " + (i+1) + " es: " + sumaF);
			sumaF = 0;
		}
	}
	
	private static void sumaC(int matriz [][]) {
		int sumaC = 0;
		
		for(int i = 0; i < T_C; i++) {
			for(int j = 0; j < matriz.length; j++) {
				sumaC += matriz[j][i];
				System.out.println("\n"+matriz[j][i]);
			}
			System.out.println("La suma de la columna " + (i+1) +" es: " + sumaC);
			sumaC = 0;
		}
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
