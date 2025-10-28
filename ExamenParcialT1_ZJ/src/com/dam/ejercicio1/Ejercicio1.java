package com.dam.ejercicio1;

import java.util.Scanner;

/*
 * Crea una clase, Ejercicio1, que solicite un número entero positivo por teclado, y que muestre por consola, separados por espacios,
 *  los 10 números naturales (enteros y positivos) mayores que el número dado que sean múltiplos de 5 e impares
 */

public class Ejercicio1 {
	
	static final int CANT_TERMS = 10;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número positivo:");
		int n = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		int c = 0;
		int num = n + 1 ;
		
		while (c<CANT_TERMS) {
			if (num % 5 == 0 && num % 2 != 0) {
				System.out.print(num + " ");
				c++;
			}
			num++;
		}
	}
}
