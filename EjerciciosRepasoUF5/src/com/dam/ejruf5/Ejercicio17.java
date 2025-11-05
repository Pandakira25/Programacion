package com.dam.ejruf5;

import java.util.Scanner;

/*
 * 17. Crea un programa para el control del empaquetado de 200 manzanas.
Las manzanas se empaquetan en bandejas de 5 manzanas. El programa
deberá solicitar el peso de cada manzana e irlo sumando de manera que
cuando llegue a 5 indique el precio del paquete teniendo en cuenta que el kg
está a 1,85€
 */

public class Ejercicio17 {
	
	final static double PRECIO_KILO = 1.85;
	final static int CANT_MANZ_BANDEJA = 5;
	final static int CANT_MANZ = 200;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double pM = 0;//peso de cada manzana individualmente
		double pTB = 0;//peso total de cada bandeja
		int cM = 0;//contador de manzanas por bandeja
		int cP = 0;//contador de paquetes
		
		for (int i = 1; i < CANT_MANZ; i++) {
			System.out.println("Ingrese el peso de la manzana " + i + " en kg");
			pM = Double.parseDouble(sc.nextLine());
			
			pTB += pM;
			cM++;
			
			if(cM == CANT_MANZ_BANDEJA) {
				cP++;
				System.out.println("El precio del paquete " + cP + " es de: " + (pTB * PRECIO_KILO));
				cM=0;
				pTB=0;
			}
			
		}
		
		sc.close();

	}

}
