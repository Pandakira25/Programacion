package com.dam.pruebas;

import java.util.Objects;

public class Libro {
	
	private String titulo;
	private String autor;
	private int numPag;
	
	public Libro() {
		
	}
	
	public Libro(String titulo, String autor, int numPag) {
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
	}

	@Override
	public int hashCode() {
		//System.out.println("Se invoca al hashCode");
		return Objects.hash(autor, numPag, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		//System.out.println("Se invoca el equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && numPag == other.numPag && Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "titulo=" + titulo + ", autor=" + autor + ", numPag=" + numPag ;
	}
	
	
}
