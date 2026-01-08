package com.dam.pruebas;

public class Alumno {

	private String nombre;
	private int edad;
	
	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	};
	
	public String toString() {
		return "Alumno " + nombre + " de " + edad + " años";
	}

}
