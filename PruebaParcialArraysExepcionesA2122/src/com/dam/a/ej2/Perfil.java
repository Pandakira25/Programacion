package com.dam.a.ej2;

public class Perfil {

	private String nombre;
	private String puestoActual;
	private String ciudad;
	private int numContactos;
	
	//Builder
	public Perfil(){}
	
	public Perfil(String nombre, String puestoActual, String ciudad, int numContactos) {
		this.nombre = nombre;
		this.puestoActual = puestoActual;
		this.ciudad = ciudad;
		this.numContactos = numContactos;
	}
	
	//geters
	public String getCiudad() {
		return ciudad;
	}
	
	public int getNumContactos() {
		return numContactos;
	}
	
	//toString
	public String toString() {
		return "Nombre: " + nombre + "\nPuesto actual: " + puestoActual + "\nCiudad: " + ciudad + "\n" + numContactos + " Contactos";
	}
	
}
