package com.dam.pojos;

public class Salon extends Estancia {
	private int numPuntosRed;
	private boolean tieneTerraza;
	private double m2Terr;
	
	public boolean isTieneTerraza() {
		return tieneTerraza;
	}
	
	public double getM2Terr() {
		return m2Terr;
	}
	
	public String toString() {
		return super.toString() + numPuertas + tieneTerraza + m2Terr;
	}
	
}
