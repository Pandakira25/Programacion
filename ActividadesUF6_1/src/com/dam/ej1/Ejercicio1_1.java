package com.dam.ej1;

import java.util.Scanner;

public class Ejercicio1_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese una cadena de caracteres");
		String cadena = sc.nextLine();
		
		sc.close();
		
		String cMayus=cadena.toUpperCase();
		
		int contMay = 0;
		int contMin = 0;
		
		for(int i = 0; i<cadena.length();i++) {
			if(cadena.charAt(i) != ' ') {
				if(cadena.charAt(i) == cMayus.charAt(i)) {
					contMay++;
				}else {
					contMin++;
				}
			}
		}
		
		
		System.out.println("La cadena tiene " + contMay + " mayúsculas y " + contMin + " minúsculas");
	}

}
