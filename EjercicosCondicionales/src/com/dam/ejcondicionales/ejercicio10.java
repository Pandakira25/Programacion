package com.dam.ejcondicionales;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese el resultado del dado");
		int nd = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		if (0 < nd && nd <= 6) {
			
			switch (nd) {
			case 1:
				System.out.println("El lado contrario es seis.");
				break;
			case 2:
				System.out.println("El lado contrario es cinco.");
				break;
			case 3:
				System.out.println("El lado contrario es cuatro.");
				break;
			case 4:
				System.out.println("El lado contrario es tres.");
				break;
			case 5:
				System.out.println("El lado contrario es dos.");
				break;
			case 6:
				System.out.println("El lado contrario es uno.");
				break;
			}
			
		}else {
			System.out.println("Error: Número incorrecto.");
		}

	}

}
