package com.dam.ejcondicionales;

import java.util.Scanner;

public class ejercicio9 {
	
	static final int P100 = 65;
	static final int P50 = 70;
	static final int P30 = 95;
	static final int PBUS = 4000;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese la cantidad de alumnos");
		int a = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		int pgo;
		
		if (a >= 100) {
			pgo = a * P100;
			System.out.println("El pago a la compañía es: " + pgo + " y el pago por alumno es: " + P100);
		}else if (a>=50) {
			pgo = a * P50;
			System.out.println("El pago a la compañía es: " + pgo + " y el pago por alumno es: " + P50);
		}else if (a>=30) {
			pgo = a * P30;
			System.out.println("El pago a la compañía es: " + pgo + " y el pago por alumno es: " + P30);
		}else {
			pgo = PBUS / a;
			System.out.println("El pago a la compañía es: " + PBUS + " y el pago por alumno es: " + pgo);
		}
		
	}

}
