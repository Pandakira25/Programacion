package com.dam.ejruf5;

import java.util.Scanner;

public class Ejercicio2 {
	
	static final int CANT_VAL = 10;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c = CANT_VAL;
		int cNeg = 0;
		int cPos = 0;
		int cM15 = 0;
		int sumP = 0;
		int n = 0;
		
		while (c>0) {
			System.out.println("Ingrese un número");
			n = Integer.parseInt(sc.nextLine());
			
			if(n<0) {
				cNeg++;
			}else {
				cPos++;
			}
			
			if (n%15 == 0) {
				cM15++;
			}
			
			if (n % 2 == 0) {
				sumP = sumP + n;
			}
			
			c--;
		}
		
		System.out.println("cant neg: " + cNeg + " cant pos: " + cPos + " cant multiplos de 15: " + cM15 + " valor acumulado de los numeros ingresados pares: " + sumP);

	}

}
