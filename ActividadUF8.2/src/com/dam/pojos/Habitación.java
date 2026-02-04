package com.dam.pojos;

public class Habitación extends Estancia {
	private int numPuertas;
	private boolean accesoBanio;
	
	public String toString() {
		return super.toString() + numPuertas + accesoBanio;
	}
}
