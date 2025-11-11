package com.dam.pruebas;

public class PruebaArray1 {

	public static void main(String[] args) {
		
		//Creamos un array de enteros
		int[] enteros = {1,2,3,4,5,6};
		
		//un array es un conjunto de variables
		//enteros es un array de 6 variables primitivas de tipo int
		//para acceder a cada una de las variables:
		
		System.out.println("cantidad de varianles del array enteros: " + enteros.length);
		
		System.out.println(enteros[0]);//1
		System.out.println(enteros[3]);//4
		//System.out.println(enteros[6]);//error
		
		int[] edades = new int [17];
		
		System.out.println("Antes de rellenar el array");
		for (int i = 0; i < edades.length;i ++) {
			System.out.println("Edad del alumno " + (i+1) + ": " + edades[i]);
		}
		
		edades[0] = 20;
		edades[1] = 21;
		edades[2] = 24;
		edades[3] = 25;
		edades[4] = 18;
		
		int e = 18;
		
		for (int i = 0; i < edades.length; i++) {
			edades[i]= e++;
		}
		
		int sumaEdades=0;
		
		System.out.println("Despues de rellenar el array");
		for (int i = 0; i < edades.length;i ++) {
			System.out.println("Edad del alumno " + (i+1) + ": " + edades[i]);
			sumaEdades += edades[i];
		}
		
		int media = sumaEdades / edades.length;
		System.out.println("Media de edad: " + media);
		
		
		
	}

}
