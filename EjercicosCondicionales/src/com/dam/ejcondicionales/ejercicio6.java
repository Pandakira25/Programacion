package com.dam.ejcondicionales;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escribe dos números:");
		double n1 = Double.parseDouble(sc.nextLine());
		double n2 = Double.parseDouble(sc.nextLine());
		sc.close();
		
		if (n2 == 0) {
		
			System.out.println("La división no es posible, el dividendo es cero.");
		
		}else {
			System.out.println("El resultado de dividir " + n1 + " entre " + n2 + " es: " + (n1/n2) );
		}
		
		

	}

}
