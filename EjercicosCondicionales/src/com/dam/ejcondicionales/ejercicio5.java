package com.dam.ejcondicionales;

import java.util.Scanner;

public class ejercicio5 {

	static final int MAXC = 30;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escribe las tres calificaciones parciales");
		double n1 = Double.parseDouble(sc.nextLine());
		double n2 = Double.parseDouble(sc.nextLine());
		double n3 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Escribe la calificación del examen final");
		double cf = Double.parseDouble(sc.nextLine());
		
		System.out.println("Escribe la calificación del trabajo final");
		double tf = Double.parseDouble(sc.nextLine());
		
		sc.close();
		
		double nt = ((n1 + n2 + n3)/3) + cf + tf;
		
		
		System.out.println("La calificación final es: " + ((nt*10)/30));
		
		
		
		
	}

}
