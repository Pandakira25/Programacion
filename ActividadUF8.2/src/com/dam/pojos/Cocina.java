package com.dam.pojos;

public class Cocina extends Estancia {
	boolean tieneTendedero;
	double m2Tend;
	
	public Cocina(boolean tieneTendedero, double m2Tend, String nombre,double metrosCuad,int numPuertas,int numVentanas ) {
		super("COCINA",metrosCuad,numPuertas,numVentanas);
		this.tieneTendedero = tieneTendedero;
		this.m2Tend = m2Tend;
	}
	
	
	public boolean isTieneTendedero() {
		return tieneTendedero;
	};
	
	public double getM2Tend() {
		return m2Tend;
	}
	
	@Override
	public String toString() {
		return "Cocina [tieneTendedero=" + tieneTendedero + ", m2Tend=" + m2Tend + "]" + super.toString();
	}
}
