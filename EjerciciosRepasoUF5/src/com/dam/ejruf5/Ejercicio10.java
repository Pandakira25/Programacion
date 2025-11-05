package com.dam.ejruf5;

import java.util.Scanner;

/*
 * 10. Crea un programa que solicite 10 valores enteros e indique cuantos de ellos son mayores que el anterior y cuantos menores que el anterior.

Ejemplo:
Si se introdujeran los siguientes números: 3, 5, 8, 2, 6, 1, 4, 7, 9, 2
Se debería mostrar: 6 números son mayores que el anterior y 3
menores que el anterior
 */

public class Ejercicio10 {
	
	final static int CANT_VALORES = 10;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cMa = 0;//Contador mayores que el número anterior
		int cMe = 0;//Contador menores que el numero anterior
		int n = 0;//número a identificar
		int f = 0;//número anterior
		
		
		for(int i = CANT_VALORES; i > 0; i--) {
			System.out.println("Introduzca un número");
			n = Integer.parseInt(sc.nextLine());
			
			if (i<= (CANT_VALORES-1)) {
				
				if(n<f) {
					cMe++;
				}else if (n>f) {
					cMa++;
				}
			}
			f=n;
		}

		sc.close();
		
		System.out.println(cMa + " números son mayores que el anterior y " + cMe + " menores que el anterior" );

	}

}
