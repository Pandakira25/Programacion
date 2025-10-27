package com.dam.practicas;

import java.util.Scanner;

/*(do-while) Escribe un programa que pida el límite inferior y superior de un
intervalo. Si el límite superior es menor que el inferior lo tiene que volver a pedir.
A continuación se van introduciendo números hasta que introduzcamos el 0.
Cuando termine el programa dará las siguientes informaciones:
• La suma de los números que están dentro del intervalo (intervalo abierto).
• Cuantos números están fuera del intervalo.
• E informe si se ha introducido algún número igual a los límites del intervalo.*/

public class Practica4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe el limite inferior");
		int i = Integer.parseInt(sc.nextLine());
		
		System.out.println("Escribe el limite superior");
		int s = Integer.parseInt(sc.nextLine());
		
		while (i > s) {
			
			System.out.println("Vuelve a introducir los limites, el inferior debe ser el menor");
			i = Integer.parseInt(sc.nextLine());
			s = Integer.parseInt(sc.nextLine());
		}
		
		int c;
		int sumN = 0;
		int cont = 0;
		int numI = 0;
		
		do {
			System.out.println("ingrese numeros (para salir 0)");
			c = Integer.parseInt(sc.nextLine());
			if (c!=0) {
				if (i<c & c<s ) {
					sumN += c; 
				}else if (i == c || c == s){
					numI++;
				}else {
					cont++;
				}
			}
			
		}while(c != 0);
		
		System.out.println("La suma de los numeros dentro del intervalo es: " + sumN + " Y la cantidad de números fuera del intervalo son: " + cont + " ademas la cantidad de numeros iguales a los limites son: " + numI);
		
		sc.close();

	}

}
