package com.dam.ej5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese una cadena de caracteres");
		String cadena = sc.nextLine();
		
		sc.close();
		
		String cadSE = cadena.replace(" ", "");
		
		System.out.println("La cadena sin espacios es: " + cadSE);
		
	}

}
