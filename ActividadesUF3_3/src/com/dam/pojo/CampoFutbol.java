package com.dam.pojo;

public class CampoFutbol {
	
	private String nombre;
	private double largo;
	private double ancho;
	private int capacidad;
	
	public CampoFutbol () {}
	
	public CampoFutbol (double largo, double ancho, int capacidad) {
		this.largo = largo;
		this.ancho = ancho;
		this.capacidad = capacidad;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getLargo() {
		return largo;
	}
	public void setLargo(double largo) {
		this.largo = largo;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	
	
	public String toString() {
		String datos = "el largo es: " + largo + ", el ancho es: " + ancho + "la capacidad de expectadores es: " + capacidad;
		return datos;
	}
	
	
	
	public double perimetro() {
		double perimetro = largo + largo + ancho + ancho;
		return perimetro;
	}
	
	
	public double area() {
		double area = largo * ancho;
		return area;
	}

}
