package com.dam.b.ej2;

import java.util.Scanner;

public class Ejercicio2 {
	
	static final String P [] = {"España","Francia","Alemania","Italia","Portugal","Grecia","Irlanda","Ucrania","Hungría","Bulgaria"};
	static final String C [] = {"Madrid","París","Berlín","Roma","Lisboa","Atenas","Dublín","Kiev","Budapest","Sofía"};

	public static void main(String[] args) {

		String pC[][] = new String[10][2];
		
		fillPC(pC);
		
		Scanner sc = new Scanner(System.in);
		
		itPc(pC,sc);
		
		sc.close();

	}
	
	private static void itPc(String[][] pC, Scanner sc) {
		System.out.println("Ingrese el nombre del país");
		String p = sc.nextLine();
		
		boolean found = true;
		
		for(int i = 0; i < pC.length && found; i++) {
			for(int j = 0; j < pC[i].length && found; j++) {
				if(j % 2 == 0) {
					if(p.equalsIgnoreCase(pC[i][j])) {
						System.out.println(pC[i][j + 1]);
						found = false;
					}
				}
			}
		}
		
		if(found) {
			System.out.println("El país no se encuentra en el array");
		}
	}

	public static void fillPC(String pC[][]) {

		for (int i = 0; i < pC.length; i++) {
			for (int j = 0; j < pC[i].length; j++) {
				if(j % 2 == 0) {
					pC[i][j] = P[i];
				}else {
					pC[i][j] = C[i];
				}
			}
		}
	}

}
