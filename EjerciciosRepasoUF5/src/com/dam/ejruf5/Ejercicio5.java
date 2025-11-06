package com.dam.ejruf5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba el número de filas");
		int n = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		//la cantidad de espacio entre el numero central y los extremos es de n-1 
		
		for (int i = 0; i <= n; i++) { //OK
			
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++) {//desde el uno hasta la fila en la que me encuentre
				System.out.print(j);
			}
			
			for(int j = i-1;j > 0;j--) {//
				System.out.print(j);
			}
			System.out.println();
			
		}

	}

}
