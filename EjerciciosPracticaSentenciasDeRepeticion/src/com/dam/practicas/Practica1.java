package com.dam.practicas;

import java.util.Scanner;

/*(for) Crea una aplicación que pida un número y calcule su factorial (El factorial de
un número es el producto de todos los enteros entre 1 y el propio número y se
representa por el número seguido de un signo de exclamación. Por ejemplo 5! =
1x2x3x4x5=120)*/

public class Practica1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escriba el número");
		int n = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		
		long factorial = 1;//long por si el numero es muy grande
		
		for (int f = 1; f <= n; f++) {
			
			factorial *= f;
			//System.out.println(factorial);
			
		}
		
		System.out.println("El factorial de " + n + " es: " + factorial);

	}

}
