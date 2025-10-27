package com.dam.pruebas;

import java.util.Scanner;

public class PruebasIF {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número ");
		int n = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		int r = n % 2;
		
		if (r == 0) {
			
			System.out.println("el número es par");
			
		} else {
			
			System.out.println("el número es impar");
			
		}
		
		if (n>0) {
			
			System.out.println("El numero es positivo");
			
		} else if (n<0) {
			
			System.out.println("El número es negativo");
		} else {
			System.out.println("El número es cero");
		}
		
	}

}
