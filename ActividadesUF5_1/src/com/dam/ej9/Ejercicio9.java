package com.dam.ej9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número para saber si es omirp o no");
		int n = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		//calcular el inverso
		int numInv = calcularInverso(n);
		
		//comprobar si n es primo o no 
		boolean esPrimoN = comprobarPrimo(n);
		
		//comprobar si numInv es primo o no
		boolean esPrimoNumInv = comprobarPrimo(n);
		
		
		if (esPrimoN && esPrimoNumInv) {
			
			System.out.println("El número " + n + " es omirp" );
		}

	}

	private static boolean comprobarPrimo(int n) {
		
		boolean esPrimo=true;
		
		for(int i=2; i<Math.sqrt(n) && esPrimo; i++) {
			if(n%i==0) {
				esPrimo=false;
			}
		}
		return esPrimo;
	}

	private static int calcularInverso(int n) {
		
		int c = n;
		int r = 0;
		int numInv = 0;
		
		while (c>0) {
			c = c / 10;
			r = c % 10;
			
			numInv = numInv * 10 + r;
		}
		
		return numInv;
	}

}
