package com.dam.ej3;

import java.util.Scanner;

/*
 * 3. Implemente un programa que indique si una palabra es un palíndromo. Una palabra es palíndromo si se lee igual de izquierda a derecha que de derecha a izquierda.

 */

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese una palabra toda en minúsculas y sin espacios: ");
		StringBuffer palabra = new StringBuffer(sc.nextLine());
		
		StringBuffer pI = new StringBuffer(palabra).reverse();
		
		if(palabra.toString().equals(pI.toString())) {
			System.out.println("La palabra es un palíndromo");
		}else {
			System.out.println("La palabra no es un palíndromo");
		}
		
		sc.close();

	}

}
