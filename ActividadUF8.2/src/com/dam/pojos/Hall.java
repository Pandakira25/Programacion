package com.dam.pojos;

public class Hall extends Estancia {
	private boolean puertaBlind;

	public boolean isPuertaBlind() {
		return puertaBlind;
	}

	public Hall(boolean puertaBlind,double metrosCuad,int numPuertas,int numVentanas ) {
		super("HALL",metrosCuad,numPuertas,numVentanas);
		this.puertaBlind = puertaBlind;
	}

	@Override
	public String toString() {
		return "Hall [puertaBlind=" + puertaBlind + "]";
	}
	
	
}
