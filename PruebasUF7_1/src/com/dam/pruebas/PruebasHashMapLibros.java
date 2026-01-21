package com.dam.pruebas;

import java.util.HashMap;
import java.util.Map.Entry;

//Esta clase sirve para controlar cuántos ejemplares hay en una biblioteca 
public class PruebasHashMapLibros {
	
	static HashMap<Libro,Integer> mapaLibros;
	
	public static void main(String[] args) {
		mapaLibros = new HashMap<Libro, Integer>();
		
		Libro libro1 = new Libro("Titulo 1", "A 1", 567);
		aniadirLibro(libro1, 3);
		
		Libro libro2 = new Libro("Titulo 2", "A 2", 463);
		aniadirLibro(libro2, 3);
		
		Libro libro3 = new Libro("Titulo 1", "A 1", 567);
		aniadirLibro(libro3, 1);
		
		mostrarLibro();
	}

	private static void mostrarLibro() {
		System.out.println("Libros de la biblioteca");
		for(Entry<Libro, Integer> registro : mapaLibros.entrySet()) {
			System.out.println("Del libro " + registro.getKey() + " hay " + registro.getValue() + " ejemplares");
		}
	}

	private static void aniadirLibro(Libro libro, int nEjemplares) {
		//preguntamos si el libro está en el mapa
		if(mapaLibros.containsKey(libro)) {
			//cambiar el valor aumentándolo en el número de ejemplares
			mapaLibros.replace(libro, mapaLibros.get(libro) + nEjemplares);
		}else {
			//Lo añadimos
			mapaLibros.put(libro, nEjemplares);
		}
	}

}
