package com.dam.pojos;

public class NoticiaEconomia extends Noticia {

	private String sector;
	
	public NoticiaEconomia(String titulo, String fecha,String sector) {
		super(titulo, fecha);
		this.sector=sector;
	}
	
	public String toString() {
		return 	"Noticia Económica:\n" + super.toString() + ", Sector: " + sector;
	}
}
