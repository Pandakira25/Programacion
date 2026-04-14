package com.dam.model;

import java.util.ArrayList;

public class Pelicula {
	
	public static final String GENEROS[] = {"Ciencia ficción","Superhéroes","Drama romántico","Animación","Acción","Comedia","Fantasía"};
	
	private String nombre;
	private String director;
	private String genero;
	private int aPublicacion;
	private double recaudacion;
	
	public Pelicula() {}
	
	public Pelicula(String nombre, String director, String genero, int aPublicacion, double recaudacion) {
		this.nombre = nombre;
		this.director = director;
		this.genero = genero;
		this.aPublicacion = aPublicacion;
		this.recaudacion = recaudacion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getGenero() {
		return genero;
	}

	public int getaPublicacion() {
		return aPublicacion;
	}

	public double getRecaudacion() {
		return recaudacion;
	}

	public String toString() {
		return "#Titulo: " + nombre + ", Dirección: " + director + ", Género: " + genero + ", Año de estreno: " + aPublicacion
				+ "\nRecaudación aproximada: " + recaudacion + " M USD(millones de dólares americanos)";
	}
}
