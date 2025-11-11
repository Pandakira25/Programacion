package com.dam.ej2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese una cadena de caracteres y el caracter a analizar");
		String cadena = sc.nextLine();
		String caracter = sc.nextLine();
		
		sc.close();
		
		String cadMin = cadena.toLowerCase();
		char carMin = caracter.toLowerCase().charAt(0);
		
		int cC = 0;//Contador caracter
		
		for(int i = 0; i < cadMin.length();i++) {
			if(cadMin.charAt(i) == carMin) {
				cC++;
			}
		}
		
		System.out.println("La cadena tiene " + cC + " " + caracter.toUpperCase() + "s");

	}

}
