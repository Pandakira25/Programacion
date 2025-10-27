package com.dam.practicas;

import java.util.Scanner;

/*(while o for) Escribe un programa que, dados dos números, uno real (base) y un
entero positivo (exponente), saque por pantalla el resultado de la i. No se
puede utilizar la función Math.pow.*/

public class Practica5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la base, puede ser real");
		double b = Double.parseDouble(sc.nextLine());//importante no olvidarme de usar el envoltorio correcto
		
		System.out.println("Introduce el exponente, debe ser entero positivo");
		int e = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		double r = 1;//resultado
		
		for (double i = 1; i <= e ; i ++ ) {
			r *= b;//el orden de los factores si afecta el producto
		}
		
		System.out.println("La potencia de " + b + " elevado a "+ e + " es: " + r);
	}

}
