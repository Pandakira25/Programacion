package com.dam.ejif;

import java.util.Scanner;

/*
 * solicitar la nota de un examen, teniendo que ser esta nota un valor entero y mostrar por consola la nota en formato de texto 
 * correspondiente usando un switch
 */
public class EjercicioSwitch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe la nota como un entero del 1 al 10: ");
		int nota = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		switch (nota) {
		case 1,2,3,4:
			System.out.println("Suspenso");
			break;
		case 5:
			System.out.println("suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7,8:
			System.out.println("Notable");
			break;
		case 9,10:
			System.out.println("Sobresaliente");
		}

	}

}
