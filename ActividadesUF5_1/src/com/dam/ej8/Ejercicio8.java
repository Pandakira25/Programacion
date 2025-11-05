package com.dam.ej8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese su dia, mes y año de nacimiento con el siguiente formato: dd/mm/aaaa");
		int dia = Integer.parseInt(sc.nextLine());
		int mes = Integer.parseInt(sc.nextLine());
		int año = Integer.parseInt(sc.nextLine());
		
		int sumaF = dia + mes + año;
		
		// sumaF / 10 
		
		int luckyN = 0;
		
		int divisor = 1000;
		
		int n = 0;
		
		int r = 0;
		
		while (divisor >= 10) {
			
			divisor = 1000;
			r = sumaF % divisor; //997 r1
			luckyN = luckyN + sumaF / divisor; // 0 + 1 n1  OK
			
			divisor = 100;
			luckyN = luckyN + r / divisor; //1 + 9 = 10  r1/100 = n2  OK
			
			r = r % divisor; //997 r1 & 100 = 97  OK
			//System.out.println(r);
			
			divisor = 10;
			luckyN = luckyN + r / divisor; // 10 + 9 = 19 
			
			r = r % divisor; //97 % 10 = 7
			
			luckyN = luckyN + r;
			
			luckyN = (luckyN / divisor) + (luckyN % divisor);
			
			System.out.println(luckyN);
			divisor = 0;
			
		}
		
		sc.close();

	}

}
