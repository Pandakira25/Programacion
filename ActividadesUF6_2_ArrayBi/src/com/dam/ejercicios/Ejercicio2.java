package com.dam.ejercicios;

import java.util.Random;

public class Ejercicio2 {
	
	static final int NUM_FILAS = 4;
	static final int NUM_COLUMNAS = 4;
	
	public static void main(String[] args) {
		
		int matriz[][] = new int [NUM_FILAS][NUM_COLUMNAS];
		Random rd = new Random();
		
		fillArrayR(matriz, rd);
		
		//fillArrayS(matriz);
		
		mostrarMatriz(matriz);
		
		comprobarSimetria(matriz);
		
	}
	
	private static void mostrarMatriz(int matriz [][]) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "  ");
			}
			System.out.println();
		}
		
	}

	private static void comprobarSimetria(int[][] matriz) {
		boolean esSimetrica = true;
		
		for(int i = 0; i < (matriz.length - 1); i++) {
			for(int j = i+1; j < matriz[i].length; j ++) {
				if(matriz[i][j] != matriz[j][i]) {
					esSimetrica = false;
					i = matriz.length - 1;
					j = matriz[i].length;
				}
			}
		}
		
		if(esSimetrica) {
			System.out.println("Es Simétrica");
		}else {
			System.out.println("No Es Simétrica");
		}
	}

	private static void fillArrayS(int[][] matriz) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = 5;
			}
		}
	}

	private static void fillArrayR(int[][] matriz, Random rd) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rd.nextInt(0,10);
			}
		}
	}

	
}
