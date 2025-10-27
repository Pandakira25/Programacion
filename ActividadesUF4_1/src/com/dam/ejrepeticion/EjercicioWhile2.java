package com.dam.ejrepeticion;

import java.util.Scanner;

public class EjercicioWhile2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("cant n");
		int n = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		int c = 1;
	
		
		while (c <= n) {
			
			System.out.println("número" + c);
			n = Integer.parseInt(sc.nextLine());
			
			if (n%2 == 0) {
				System.out.println("par");
			}else {
				System.out.println("impar");
			}
			n++;
		}

	}

}
