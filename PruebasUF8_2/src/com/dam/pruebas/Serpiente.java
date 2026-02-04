package com.dam.pruebas;

public class Serpiente extends AnimalVertebrado{

	private double longitud;
	private boolean esVenenosa;
	
	public Serpiente(String subgrupo, String nombre,double longitud, boolean esVenenosa) {
		//Constructor de la clase padre
		super(subgrupo, nombre);
		this.longitud=longitud;
		this.esVenenosa=esVenenosa;
	}
	
	public void cambiarPiel() {
		System.out.println("Muda la piel por crecimiento o por desgaste");
	}
	
	public String toString() {
		return super.toString() + longitud + esVenenosa;
	}
}
