package com.dam.practicas;

import java.util.Scanner;

/*(while o for) Desarrollar un programa que muestre los primos menores que un
número introducido por teclado.*/

public class Practica6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int n = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		for (int i = n ; i >= 2; i-- ) {//para que se calcule desde n hasta 2
			
			boolean primo = true;//Tengo que recetear la variable dentro del bucle
			
			for(int x=2; x <= Math.sqrt(i); x++) { //comprueba numeros desde 2 hasta la raiz de i
				
				if(i%x==0) { //comprueba si son divisibles por otros números que no sean i
					primo=false;
					break;//para que deje de comprobar si entra en el if
				}
			}
			
			if(primo) {//si no entro en el if anterior va a seguir siendo true por ende va a entrar en este if
				System.out.println(i);
			}
		}
			
	}

}

