package com.dam.pruebas;

import java.util.Scanner;

/*
 * El operador ternario es un operador de asignación de valor a una variable
 * La condición es lo que esta dentro del parentesis con signo de interrogación
 * a la variable se le asigna el valor que se encuentra antes de los : so la condición es true
 * y se le asigna el valor que se encuentra despues de los : si la condición es false
 * el resultado de la condición siempre tiene que ser booleano true o false
 * Las expresiones a los dos lados de los dos puntos tienen que tener un valor del mismo tipo que la variable a la que se asignan.
 */

public class PruebasOperadorTernario {

	public static void main(String[] args) {
		
		int a = 7;
		int b = 15;
		
		int mayor = (a>b)? a:b;
		
		//es lo mismo que:
		//if (a>b) {
		//	mayor=a;
		//}
		//else {
		//	mayor =b;
		//}
		
		System.out.println("mayor valor: " + mayor);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		int x = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduce otro número: ");
		int y = sc.nextInt();
		sc.nextLine();
		
		sc.close();
		
		int menor = (x > y)? y : x; // si x > y es true --> El menor es Y : si x > y False --> el menor es x
		
		System.out.println("menor valor: " + menor);

	}

}
