package com.dam.ej5;

import java.util.Scanner;

/*
 * Programa Java para leer la altura de N personas y calcular la altura
media. Calcular cuántas personas tienen una altura superior a la media
y cuántas tienen una altura inferior a la media. El valor de N se pide
por teclado y debe ser entero positivo.
 */

public class Ejercicio5 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		
		double aPersonas [] = new double [pedirCantPersonas()];
		
		pedirAlturas(aPersonas);
		
		sc.close();
		
		calcMedia(aPersonas);
		
		System.out.println(mediaMasMenos(aPersonas));
		
		
	}
	
	private static int pedirCantPersonas() {
		
		System.out.println("Ingrese la cantidad de personas");
		int n = Integer.parseInt(sc.nextLine());
		
		return n;
	}
	
	
	private static void pedirAlturas(double aPersonas[]) {
		
		for(int i=0;i<aPersonas.length;i++) {
			System.out.println("Ingrese la altura de la persona " + (i+1));
			aPersonas[i]=Double.parseDouble(sc.nextLine());
		}
		
	}
	
	private static double calcMedia(double aPersonas[]) {
		double sP = 0;//Suma de las alturas de las personas
		
		for (int i = 0; i < aPersonas.length; i++) {
			sP += aPersonas[i];
		}
		
		double media = sP / aPersonas.length;
		
		return media;
	}
	
	private static String mediaMasMenos(double aPersonas[]){
		int cMay = 0;//Contador mayores
		int cMen = 0;//Contador menores
		
		for(int i = 0; i<aPersonas.length; i++) {
			if(aPersonas[i] < calcMedia(aPersonas)) {
				cMen ++; 
			}else if(aPersonas[i]>calcMedia(aPersonas)) {
				cMay ++;
			}
		}
		
		String string = "La cantidad de personas cuaya altura es mayor que la media es de: " + cMay + "; y los que miden menos que la media son: " + cMen;
		
		return string;
	}

}
