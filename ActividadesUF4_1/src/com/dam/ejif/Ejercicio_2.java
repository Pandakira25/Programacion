package com.dam.ejif;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe 5 números enteros separados por un espacio");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		
		sc.close();
		
		if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5 ) {
			System.out.println("El mayor es: "+ n1);
		} else if (n2 > n3 && n2 > n4 && n2 > n5) {
			System.out.println("El mayor es: "+ n2);
		} else if (n3 > n4 && n3 > n5) {
			System.out.println("El mayor es: "+ n3);
		} else if (n4>n5) {
			System.out.println("El mayor es: "+ n4);
		}else {
			System.out.println("El mayor es: "+ n5);
		}
		
		
		

	}

}
