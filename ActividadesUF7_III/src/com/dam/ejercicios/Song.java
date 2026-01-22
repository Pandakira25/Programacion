package com.dam.ejercicios;

import java.util.Objects;

public class Song {
	
	private String nombre;
	private String artista;
	private int duracion;
	
	public Song() {}
	
	public Song(String nombre, String artista, int duracion) {
		this.nombre = nombre;
		this.artista = artista;
		this.duracion = duracion;
	}
	
	public Song(String nombre,String artista) {
		this.nombre=nombre;
		this.artista=artista;
	}
	
	public String toString() {
		return nombre + " de " + artista;
	}
	
	public int getDuracion() {
		return duracion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(artista, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(artista, other.artista) && Objects.equals(nombre, other.nombre);
	}
}
