package com.dam.pojos;

public class Noticia {
	
	public static final String ESTADOS []= {"BORRADOR","PUBLICADA","ARCHIVADA"};
	
	protected String titulo;
	protected String fecha;
	protected String estado;
	
	public Noticia(String titulo, String fecha) {
		this.titulo = titulo;
		this.fecha = fecha;
		estado=ESTADOS[0];
	}
	
	public boolean cambiarEstado() {
		boolean valid = false;
		if(estado.equalsIgnoreCase(ESTADOS[0])) {
			estado=ESTADOS[1];
			valid = true;
		}else if(estado.equalsIgnoreCase(ESTADOS[1])) {
			estado=ESTADOS[2];
			valid = true;
		}else{
			valid=false;
		}
		return valid;
	}
	
	public String toString() {
		return "Título: " + titulo + ", Fecha: " + fecha + ", Estado: " + estado;
	}
}
