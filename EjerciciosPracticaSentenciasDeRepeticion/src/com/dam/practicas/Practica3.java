package com.dam.practicas;

import java.util.Scanner;

/*(while o for) Escribir un programa que imprima todos los números pares entre dos
números que se le pidan al usuario.*/

public class Practica3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("escriba 2 numeros");
		int n1 = Integer.parseInt(sc.nextLine());
		int n2 = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		if (n1 < n2) {
			
			int tmp = n1;
			n1 = n2;
			n2 = tmp;
		}//me aseguro de que n1 sea el mayor
		
		//Seleccionar el primer par dsp de min (corrección de la profe)
		int inicio = n2 + 1;
		if (inicio % 2 != 0) {
			inicio++;
		}
		
		System.out.println("Los nuemeros pares dentro del intervalo son: ");
		
		for(int i = inicio; i < n1; i = i + 2 ) {//mucho muy importante empezar por el menor y no incluir el mayor el el tope
			
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			
		}
		

	}

}
