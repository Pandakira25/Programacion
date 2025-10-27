package com.dam.ejrepeticion;

import java.util.Scanner;

public class EjWhile3 {

	public static void main(String[] args) {

		Scanner  sc = new Scanner(System.in);
		
		System.out.println("introduce el número de números a ingresar");
		int n = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		int num;
		
		int p=0; //Positivos contador
		int ne=0; //Negativos contador
		int c=0;//Ceros contador
		
		while (n>0) {
			
			System.out.println("num?");
			num = Integer.parseInt(sc.nextLine());
			
			if (num > 0) {
				p++;
			}else if (num < 0) {
				n++;
			}else {
				c++;
			}
			
			n = n-1;
		}
		
		System.out.println("p:" + p + " neg: " + ne + " c: " + c);

	}

}
