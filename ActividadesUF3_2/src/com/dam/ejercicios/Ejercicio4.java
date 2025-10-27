package com.dam.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe el número de horas como un entero");
		int H = sc.nextInt();
		H = H * 3600;
		
		System.out.println("Escriba el núemro de minutos como un entero");
		int M = sc.nextInt();
		M = M * 60;
		
		System.out.println("Escriba el número de segundos como un entero");
		int S = sc.nextInt();
		sc.nextLine();
		
		int TS = H + M + S;
		
		System.out.println("El total de segundos es: " + TS);
		
		 
		
		sc.close();

	}

}
