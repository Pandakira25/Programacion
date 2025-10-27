package com.dam.main;

import com.dam.pojos.Libro;

public class UsoLibro {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro();
		
		
		libro1.setTitulo("El Quijote");
		libro1.setAutor("Miguel de Cervantes");
		libro1.setNumPag(567);
		libro1.setTapaDura(true);
		
		/*
		System.out.println("Titulo: " + libro1.getTitulo());
		System.out.println("Autor: " + libro1.getAutor());
		System.out.println("NumPag: " + libro1.getNumPag());
		System.out.println("Tapa dura?? " + (libro1.isTapaDura()? "si" : "no"));
		*/
		
		//System.out.println(libro1); //necesito definir el metodo toString en el pojo
		
		Libro libro2 = new Libro("viaje a la alcarria", "Camilo jose cela",371, false);
		
		System.out.println(libro2);
		
		

	}

}
