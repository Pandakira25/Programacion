package com.dam.pruebas;

import java.util.Scanner;

public class PruebasSwich {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce un número del 1 al 5");
		int n = Integer.parseInt(sc.nextLine());
		
		if (n == 1) {
			
			System.out.println("*");
		} else if (n == 2) {
			System.out.println("**");
		} else if (n == 3) {
			System.out.println("***");
		} else if (n == 4) {
			System.out.println("****");
		} else {
			System.out.println("*****");
		}
		
		// como estoy comparando valores exactos y una variable de tipo int puedo usar el swich
		System.out.println("Separacion del if y el switch");
		
		switch (n){
		case 1:
			System.out.println("*");
			break;
		case 2:
			System.out.println("**");
			break;
		case 3:
			System.out.println("***");
			break;
		case 4:
			System.out.println("****");
			break;
		case 5:
			//System.out.println("*****");
			//break;
			//default: 
				System.out.println("*****");
				default:
					System.out.println("El numero introducido no es uno de los esperados");
		}
		
		
		sc.close();

	}

}
