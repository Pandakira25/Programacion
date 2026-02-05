package com.dam.pojos;

public class Estancia {
	
	public static final String[] TIPOS_ESTANCIA = {"HALL","COCINA","SALON","HABITACION","BAÒO"};
	
	protected String nombre;
	public Estancia(String nombre, double metrosCuad, int numPuertas, int numVentanas) {
		this.nombre = nombre;
		this.metrosCuad = metrosCuad;
		this.numPuertas = numPuertas;
		this.numVentanas = numVentanas;
	}

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
