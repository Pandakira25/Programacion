package com.dam.pruebas.repeticion;

import java.util.Random;
import java.util.Scanner;

public class PruebasDoWhile {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int numSecreto = rd.nextInt(1,11);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("** Intenta adivinar el número secreto **");
		
		int num;
		
		do {
			System.out.println("Introduce un número del 1 al 10");
			num = Integer.parseInt(sc.nextLine());//no debo declarar variables dentro de un bucle
			
			if (num!=numSecreto) {
				System.out.println("mal");
			}else {
				System.out.println("bien");
			}
		}while (num != numSecreto);
		sc.close();
	}

}
