package com.dam.pruebas;

import java.util.HashSet;

public class PruebasHashSetLibros {

	public static void main(String[] args) {
		
		HashSet<Libro> conjLibro = new HashSet<Libro>();
		
		Libro libro1 = new Libro("titulo uno","autor uno", 540);
		conjLibro.add(libro1);
		Libro libro2 = new Libro("titulo dos", "autor uno", 590);
		conjLibro.add(libro2);
		Libro libro3 = new Libro("titulo dos", "autor uno", 590);
		conjLibro.add(libro3);
		
		mostrarConjunto(conjLibro);
	}

	private static void mostrarConjunto(HashSet<Libro> conjLibro) {
		for (Libro libro : conjLibro) {
			System.out.println(libro);
		}
	}

}
