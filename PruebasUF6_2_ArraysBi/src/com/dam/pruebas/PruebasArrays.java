package com.dam.pruebas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PruebasArrays {

	public static void main(String[] args) {
		Random rd = new Random();
		
		//ordenar arrays y como copiarlos
		
		//Existe una clase Arrays en el paquete java.util
		
		int array [] = new int [10];
		
		fillM(array, rd);
		
		System.out.println(Arrays.toString(array)); //mostrar un array usando el metodo de la clase array de java.util
		
		Arrays.sort(array); //ordenar un array
		
		//el collections hay que usarlo con un array de integers no se puede usar con un
		//Integer arrayIn [] = new Integer[array.length];
		//Arrays.sort(arrayIn, Collections.reverseOrder());

		
		System.out.println("Array dsp de ordenarlo\n" + Arrays.toString(array));
		
		//int array2 [] = array;
		int array2 [] = Arrays.copyOf(array, array.length); 
		
		System.out.println("\narray2: " + Arrays.toString(array2));
		
		array2[4]=100;
		
		System.out.println("\narray2: " + Arrays.toString(array));
		
	}
	
	private static void fillM(int[] matriz, Random rd) {
		for(int i = 0; i < matriz.length; i++) {
			matriz[i] = rd.nextInt(0,10);
		}
	}

}
