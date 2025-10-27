package com.dam.ejrepeticion;

import java.util.Random;
import java.util.Scanner;

public class EjDoWhile1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("Introduce un entero positivo");
		int n = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		int nal; //Número aleatorio 
		
		do {
			nal = rd.nextInt(1,n); 
			System.out.println(nal);
			
		}while(nal % 2 != 0);
		
		System.out.println(nal);
		

	}

}
