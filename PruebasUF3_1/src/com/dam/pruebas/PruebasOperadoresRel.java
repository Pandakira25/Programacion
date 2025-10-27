package com.dam.pruebas;

public class PruebasOperadoresRel {

	public static void main(String[] args) {
		
		//Declarando e inicializando dos variables locales primitivas de nombre a y b
		int a = 5;
		int b = 7;
		
		//Declarar una variable local primitiva de tipo boolean, de nombre resultado, para almacenar el resultado de comparaciones.
		boolean resultado;
		
		resultado= a<b; //tomará el valor true
		System.out.println("a<b?" + resultado);
		
		resultado= a>=b; // tomará el valor false
		System.out.println("a>=B?" + resultado);
		
		resultado= a == b; // false
		System.out.println("a == b?" + resultado);

	}

}
