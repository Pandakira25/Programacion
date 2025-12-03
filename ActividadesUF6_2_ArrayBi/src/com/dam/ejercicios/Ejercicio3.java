package com.dam.ejercicios;

import java.util.Random;

public class Ejercicio3 {

	static final int T_F = 3;
	static final int T_C = 4;
	
	public static void main(String[] args) {
		
		Random rd = new Random();
		int matriz [][] = new int [T_F][T_C];
		
		fillM(matriz,rd);
		
		mostrarMatriz(matriz);
		
		encontrarMator(matriz);
	}

	private static void encontrarMator(int[][] matriz) {
		int mayor = Integer.MIN_VALUE;
		int filaMayor = 0;
		int columnaMayor = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(mayor < matriz[i][j]) {
					mayor = matriz[i][j];
					filaMayor = i + 1;
					columnaMayor = j + 1;
				}
			} 
		}
		
		System.out.println("El elemento mayor es: " + mayor + " ubicado en la fila: " + filaMayor + " columna: " + columnaMayor);
		
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
