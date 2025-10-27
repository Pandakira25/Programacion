/*Realiza un progrma que solicite el radio de un círculo y calcule si área sabiendo que necesitamos el valor PI = 3.14
 * 
 */

package com.dam.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	static final double PI = 3.14;
	
	public static void main(String[] args) {
		
		double r;
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el radio del círculo");
		r = Double.parseDouble(sc.nextLine());
		
		//double a = PI * (r * r) ; 
		
		double a = PI * Math.pow(r, 2); //metodo de java.lang para poder hacer potencias
		
		System.out.println("El área del círculo de radio " + r + " es " + a);
		
		sc.close();

	}

}
