package com.dam.ej2;

import java.util.Scanner;

public class Ejercicio2 {
	
	static final int TERMS = 10;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num [] = new int [TERMS];

		int cPos = 0;
		int cNeg = 0;
		int cCer = 0;

		for (int i = 0; i < num.length; i++){
		    System.out.println("Ingrese el número " + (i+1));
		    num[i] = Integer.parseInt(sc.nextLine());

		    if(num[i] > 0){
		        cPos++;
		    }else if(num[i] < 0){
		        cNeg++;
		    }else {
		       cCer++;
		    }
		}

		sc.close();

		System.out.println("La cantidad de números positivos es: " + cPos + ", la cantidad de negativos es: " + cNeg + " y los iguales a cero son: "  + cCer);
		
	}

}


//Corrección


//Inicializar el array
//inicializarArray()
//int [] arrayNumeros = new int[TAMAÑP_ARRAY]

//rellenar el array con valores facilitados por teclado
//rellenarArray()

//analizar cuantos son positivos; cuantos negativos y cuantos ceros
//analizarArray()

//private stativ void analizarArray(int[] arrayNumeros){
//int conPos = 0;
//int conNeg = 0;
//int conCeros = 0;

//for (int i = 0; i < numeros.length; i++) {
//if (numeros[i] > 0) {
//  positivos++;
//} else if (numeros[i] < 0) {
//  negativos++;
//} else {
//  ceros++;
//}
//}

//Syso de los datos
//}

//private static void rellenarArray(int[] arrayNumeros){
//Scanner sc = new Scanner(System.in);
//for (int i = 0; i < numeros.length; i++) {//refactorizar
//System.out.print("NÃºmero " + (i + 1) + ": ");
//numeros[i] = Integer.parseInt(sc.nextLine());
//}
//
//}