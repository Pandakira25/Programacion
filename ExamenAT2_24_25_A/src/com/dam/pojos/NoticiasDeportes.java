package com.dam.pojos;

public class NoticiasDeportes extends Noticia {

	private String sector;
	
	public NoticiasDeportes(String titulo, String fecha, String sector) {
		super(titulo, fecha);
		this.sector=sector;
	}
	
	public String toString() {
		return "Noticia Deportiva:\n" + super.toString() + ", Sector: " + sector;
	}
}
