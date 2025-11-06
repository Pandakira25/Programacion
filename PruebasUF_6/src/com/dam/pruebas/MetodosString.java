package com.dam.pruebas;

public class MetodosString {

	public static void main(String[] args) {
		
		String cadena = "Hola mundo";
		
		int cantCar = cadena.length();
		System.out.println("La cadena \""+ cadena + "\" tiene " + cantCar + " caracteres");
		
		String cadenaVacia = "   ";
		if (cadenaVacia.isEmpty()) {
			System.out.println("cadena vacía");
		}else {
			System.out.println("cadena no vacía");
		}
		
		if(cadenaVacia.isBlank()) {
			System.out.println("Cadena en blanco");
		}else {
			System.out.println("Cadena no en blanco");
		}
		
		double numDecimal = 121563.4;
		
		String sNumDec = String.valueOf(numDecimal);
		
		String sNumEntero= sNumDec.substring(0, sNumDec.indexOf("."));
		
		System.out.println(sNumEntero);
	}

}
