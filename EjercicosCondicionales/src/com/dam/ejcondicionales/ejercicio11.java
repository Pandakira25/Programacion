package com.dam.ejcondicionales;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escriba el número del dia de la semana");
		int d = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		if (0<d && d<=7) {
			switch (d) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miércoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sábado");
				break;
			case 7:
				System.out.println("Domíngo");
				break;
			}
		}else {
			System.out.println("No válido");
		}
		

	}

}
