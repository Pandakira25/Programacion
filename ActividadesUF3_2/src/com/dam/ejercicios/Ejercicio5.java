package com.dam.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el nombre del producto");
		String N = sc.next();
		
		System.out.println("Introduce el precio inicial del producto");
		double Pi = Double.parseDouble(sc.nextLine()); //Es preferible utilizar parse para evitar errores 
		
		System.out.println("Introduce el porcentaje de descuento");
		int D = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		double PD = (Pi * D)/100;
		
		System.out.println("El precio con descuento de "+ N + " es " + PD);
		

	}

}
