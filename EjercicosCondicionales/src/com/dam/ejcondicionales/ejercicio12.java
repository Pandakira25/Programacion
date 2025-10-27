package com.dam.ejcondicionales;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escriba el numero del mes");
		int m = Integer.parseInt(sc.nextLine());
				
		sc.close();
		
			switch (m) {
			case 1:
				System.out.println("El mes de enero tiene 31 dias");
				break;
			case 3:
				System.out.println("El mes de marzo tiene 31 dias");
				break;
			case 5:
				System.out.println("El mes de mayo tiene 31 dias");
				break;
			case 7: 
				System.out.println("El mes de julio tiene 31 dias");
				break;
			case 8:
				System.out.println("El mes de agosto tiene 31 dias");
				break;
			case 10:
				System.out.println("El mes de octubre tiene 31 dias");
				break;
			case 12:
				System.out.println("El mes de diciembre tiene 31 dias");
				break;
			case 4:
				System.out.println("El mes de abril tiene 30 dias");
				break;
			case 6:
				System.out.println("El mes de junio tiene 30 dias");
				break;
			case 9:
				System.out.println("El mes de septiembre tiene 30 dias");
				break;
			case 11:
				System.out.println("El mes de noviembre tiene 30 dias");
				break;
			case 2:
				System.out.println("El mes de febrero tiene 28 dias si el año es normal, y si es bisiesto tiene 29");
				default:
					System.out.println("El mes es incorrecto");
			}
		
		
	}
}
