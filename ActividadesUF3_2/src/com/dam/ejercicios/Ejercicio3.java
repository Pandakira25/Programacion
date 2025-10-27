package com.dam.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero");
		int n = Integer.parseInt(sc.nextLine());
		
		
		
		int r = n % 2;
		/*
		 * String mensaje = (r == 0)? "El número es par" : "El número es impar";
		 * System.out.println(mensaje);
		 */
		//ambas opciones son lo mismo
		System.out.println((r == 0)? "El número es par" : "El número es impar");
		
		sc.close();

	}

}
