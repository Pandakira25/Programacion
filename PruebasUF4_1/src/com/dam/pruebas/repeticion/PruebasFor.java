package com.dam.pruebas.repeticion;

import java.util.Scanner;

public class PruebasFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica el numero de que veces que diga hola");
		int n = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		for (int i=0;i<=n;i++) {
			System.out.println("hola");
		}
		

	}

}
