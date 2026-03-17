package com.dam.model;

import java.util.Objects;

public class Producto {
	private String nombre;
	private int cantidad;
	private String unidades;
	
	public Producto() {
		
	}
	
	public Producto(String nombre, int cantidad, String unidades) {
		this.nombre=nombre;
		this.cantidad=cantidad;
		this.unidades=unidades;
	}
	
	public String toString() {
		return nombre + " - " + cantidad + " " + unidades;
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
