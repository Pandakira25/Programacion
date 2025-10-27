package com.dam.pruebas;

public class PruebasSentencias {

	// variable global declarada al nivel de la clase
	static int resta;

	public static void main(String[] args) {
		// Definición de sentencias
		// declarar e inicializar una variable de tipo entero
		// es local poeque está declarada dentro de un método
		int entero = 1;

		// declarar una variable de tipo cadena de caracteres
		String nombre;

		// inicializacion de la variable nombre

		nombre = "jaime";

		System.out.println("hola" + nombre + ", ¿que tal?");

		// declarar e inicializar una variable de tipo entero asignandole como valor una
		// operacion
		int suma = entero + 5;

		System.out.println("valor de suma es " + suma);

	}

}
