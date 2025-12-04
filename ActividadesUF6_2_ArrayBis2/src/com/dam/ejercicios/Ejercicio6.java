package com.dam.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique la cantidad de filas y columnas");
		int n = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		int matriz [][] = new int [n][n];
		
		fillM(matriz,rd);
		
		mostrarMatriz(matriz);
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
				if(i>j) {
					matriz[i][j]=0;
				}else {
					matriz[i][j] = rd.nextInt(0,10); 
				}
			}
		}
		
	}

}
