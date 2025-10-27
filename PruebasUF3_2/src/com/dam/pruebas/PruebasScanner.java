package com.dam.pruebas;

import java.util.Scanner;

public class PruebasScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //establezco el canal de comunicación con el teclado
		
		System.out.println("Introduce un número entero");
		int entero1= sc.nextInt();
		int entero2= sc.nextInt();
		int entero3= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduce otro número entero"); //suponemos que el usuario ha introducido 33
		//Obtener el valor en dos pasos
		String cadena = sc.nextLine();//cadena = "33"
		int entero4 = Integer.parseInt(cadena); //entero4 = 33
		
		//obtener el valor en 1 paso
		//int entero4 = Integer.parseInt(sc.nextLine());
		
		//int suma = cadena + 10 // da error por que no puedo asignar una cadena de caracteres a in int
		int suma = entero4 + 10;
		
		System.out.println("La suma de " + entero4 + "más" + 10 + "es" + suma); // va a dar 43
		System.out.println("La suma de entero4 más 10 es " + suma);//en la cadena de caracteres no pone el valor de entero 4 pero si hace la suma
		System.out.println("La suma de entero4 mas 10 es:"+ (entero4 + 10));//lo mismo que la anterior solo que la suma se hace en el propio println
		System.out.println("La suma de entero4 mas 10 es" + entero4 + 10); // va a concatenar 33 con 10 lo que haría que muestre 3310
		
		System.out.println("Los núemros introducidos son: " + entero1 + "," + entero2 + "," + entero3 + "y" + cadena );
		//iguales pero en uno uso cadena y en otro entero4
		System.out.println("Los núemros introducidos son: " + entero1 + "," + entero2 + "," + entero3 + "y" + entero4 );
		
		System.out.println("Introduce un número decimal");
		double decimal = Double.parseDouble(sc.nextLine());
		
		System.out.println("Decimal introducido" + decimal);
		
		sc.close();
	}

}
