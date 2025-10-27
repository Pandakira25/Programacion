package com.dam.pruebas;

public class PruebasOperadoresUni {

	public static void main(String[] args) {
		
		int cont = 0;
		
		cont = cont + 1;
		
		int a = cont + 1; // a valdrá 3 y contador sigue valiendo 2
		System.out.println("a: " + a);
		
		a = cont++;//a valdrá 3 y contador pasa a valer 3
		
		
		cont++; //Es lo mismo que contador = contador + 1
		
		System.out.println("contador " + cont);
		
		cont--; // es lo mismo que contador = contador - 1
		
		System.out.println("contador: " + cont);
		

	}

}
