package com.dam.ejcondicionales;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escribe la base");
		double b = Double.parseDouble(sc.nextLine());
		
		System.out.println("Escriba el exponente");
		double e = Double.parseDouble(sc.nextLine());
		sc.close();
		
		if (e > 0) {
			
			System.out.println("El resultado de " + b + "elevado a " + e + "es: " + (Math.pow(b,e)));
		}else if (e < 0) {
			
			System.out.println("El resultado de " + b + "elevado a " + e + "es: " + (1 / Math.pow(b,Math.abs(e))));//El math.abs para que me de bien
		}else if (e == 0) {
			System.out.println("El resultado de " + e + " elevado a cero es uno");
		}
		
		
		

	}

}
