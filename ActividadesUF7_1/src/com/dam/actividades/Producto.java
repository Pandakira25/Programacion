package com.dam.actividades;

import java.util.Objects;

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
	
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	
}
