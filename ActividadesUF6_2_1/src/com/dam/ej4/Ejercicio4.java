package com.dam.ej4;

import java.util.Scanner;

/*
 * Programa Java que lea 10 números enteros por teclado y los guarde en
un array. Calcula y muestra la media de los números que estén en las
posiciones pares del array.
Considera la primera posición del array (posición 0) como par.
 * */

public class Ejercicio4 {
	
	static final int CANT_TERM = 10;

	public static void main(String[] args) {
		
		int num [] = new int[CANT_TERM];
		
		guardarArrays(num);
		
		calcMedia(num);
		

	}


	
	private static void guardarArrays(int num []) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < num.length; i++) {
			System.out.println("Ingrese el numero " + (i+1));
			num[i]= Integer.parseInt(sc.nextLine());
		}
		sc.close();
	}
	
	private static void calcMedia(int num []) {
		double sNum = 0;//Suma de todos los números
		int cNumPar = 0;
		
		for(int i = 0; i < num.length; i++) {
			if(i % 2 == 0 ) {
				sNum += num[i];
				cNumPar++;
			}
		}
		
		double media = sNum / cNumPar;
		System.out.println("La media de los números introducidos es: " + media);
	}
	
}


