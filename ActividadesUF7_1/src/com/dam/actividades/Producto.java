package com.dam.actividades;

public class Producto {
	
	private String nombre;
	private float cantidad;
	
	public Producto(String nombre, float cantidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	
	public String toString() {
		return "Producto: " + nombre + ", cantidad: " + cantidad;
	}
}
