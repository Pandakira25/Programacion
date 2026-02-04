package com.dam.pruebas;

public class AnimalVertebrado {
	
	private String subgrupo;
	private String nombre;
	
	public AnimalVertebrado(String subgrupo, String nombre) {
		this.nombre=nombre;
		this.subgrupo=subgrupo;
	}
	
	public void movilidad() {
		System.out.println("Se mueve");
	}
	
	public void alimentacion() {
		
	}
	
	public void infromacion() {
		
	}
	
	public String toString() {
		return "";
	}
}
