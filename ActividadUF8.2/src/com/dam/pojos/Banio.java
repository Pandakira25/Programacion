package com.dam.pojos;

public class Banio extends Estancia {

	private boolean ducha;
	private boolean baniera;
	
	public String toString() {
		return super.toString() + ducha + baniera;
	}
	
	public Banio(boolean ducha, boolean baniera,String nombre,double metrosCuad,int numPuertas,int numVentanas ) {
		super(nombre, metrosCuad, numPuertas, numVentanas);
		this.ducha = ducha;
		this.baniera = baniera;
	}
}
