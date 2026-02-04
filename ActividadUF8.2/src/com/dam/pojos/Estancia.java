package com.dam.pojos;

public class Estancia {
	
	protected String nombre;
	protected double metrosCuad;
	protected int numPuertas;
	protected int numVentanas;
	
	public double getMetrodCuad() {
		return metrosCuad;
	}
	
	public String toString() {
		return nombre + metrosCuad + numPuertas + numVentanas;
	}
	
}
