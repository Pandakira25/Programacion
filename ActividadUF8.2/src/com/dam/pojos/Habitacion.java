package com.dam.pojos;

public class Habitacion extends Estancia {

	private int numPuertasArm;
	private boolean accesoBanio;
	
	public Habitacion(int numPuertasArm, boolean accesoBanio,String nombre,double metrosCuad,int numPuertas,int numVentanas ) {
		super(nombre, metrosCuad, numPuertas, numVentanas);
		this.numPuertasArm = numPuertasArm;
		this.accesoBanio = accesoBanio;
	}
	
	public String toString() {
		return super.toString() + numPuertasArm + accesoBanio;
	}
}
