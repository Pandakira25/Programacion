package com.dam.ejercicios;

public class Ejercicio1 {
	
	static final int NUM_FILAS = 4;
	static final int NUM_COLUMNAS = 4;
	private static int [][] matriz;

	public static void main(String[] args) {
		crearMatriz();
		
		rellenarMatriz();
		
		mostrarMatriz();
	}

	private static void mostrarMatriz() {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "  ");
			}
			System.out.println();
		}
		
	}

	private static void rellenarMatriz() {
		for(int i = 0; i<matriz.length;i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz [i][j] = i * 2 + j * (-1); 
			}
		}
		
	}

	private static void crearMatriz() {
		matriz = new int[NUM_FILAS][NUM_COLUMNAS];
	}

}
