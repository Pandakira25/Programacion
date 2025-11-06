package com.dam.ej1;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		String cadena = "Hola que tal";
		
		//tiene que decir cuantas vocales hay en la cadena
		
		int cV = 0;
		
		for(int c = 0; c<cadena.length(); c++) {
			switch (cadena.charAt(c)) {
			case'a','i','u','e','o': {
				cV++;
				break;
			}
			}
		}
		
		System.out.println(cV);
	}
}
