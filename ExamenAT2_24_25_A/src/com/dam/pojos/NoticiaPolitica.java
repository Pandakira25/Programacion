package com.dam.pojos;

public class NoticiaPolitica extends Noticia {

	private String partido;
	
	public NoticiaPolitica(String titulo, String fecha,String partido) {
		super(titulo, fecha);
		this.partido=partido;
	}
	
	public String obtenerInicialesPartido() {
		String iniciales []= partido.split(" ");
		for(int i = 0; i < iniciales.length; i++) {
			iniciales[i] = String.valueOf(iniciales[i].toUpperCase().charAt(0)) ;
		}
		
		return String.join("", iniciales);
	}
	
	public String toString() {
		return "Noticia Política:\n" + super.toString() + ", Partido: " + partido + "(" + obtenerInicialesPartido() + ")";
	}
}
