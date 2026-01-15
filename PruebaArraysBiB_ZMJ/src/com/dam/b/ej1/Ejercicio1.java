package com.dam.b.ej1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
	
	static final int MIN_RD = 10;
	static final int MAX_RD = 50;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese n");
		int n = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		int m [][] = new int [n+3][n];
		
		fillM(m,MIN_RD,MAX_RD);
		
		showM(m);
		
		sumR(m);
		
	}
	
	private static void sumR(int[][] m) {
		int sRP = 0;
		int sRI = 0;
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length;j++) {
				if(i % 2 == 0) {
					sRP += m[i][j];
				}else {
					sRI += m[i][j];
				}
			}
		}	
		
		System.out.println("La suma de las filas pares es: " + sRP);
		System.out.println("La suma de las filas impares es: " + sRI);
	}

	public static void showM (int [][] m) {
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length;j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	public static void fillM (int m [][], int min, int max) {
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				if(j % 2 == 0) {
					m[i][j] = rd3(min,max);
				}else {
					m [i][j] = rd4(min,max);
				}
			}
		}
	}

	private static int rd3(int min, int max) {
		Random rd = new Random();
		int nal3;
		do {
			nal3 = rd.nextInt(min,max);
		}while(nal3 % 3 != 0);
		
		return nal3;
	}

	private static int rd4(int min, int max) {
		Random rd = new Random();
		int nal4;
		do {
			nal4 = rd.nextInt(min,max);
		}while(nal4 % 4 != 0);
		
		return nal4;
		
	}

}
