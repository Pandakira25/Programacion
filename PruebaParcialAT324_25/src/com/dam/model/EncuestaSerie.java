package com.dam.model;

import java.util.ArrayList;

public class EncuestaSerie {
	
	public static final String posiblesSeries[]= {"GOT","Vikings","Breaking Bad","Stranger Things","The Handmaid's tale","Squid games","Dragon Ball","7 Vidas"};
	public static final String opFrecuencia [] = {"Ninguna","1 o 2 v/s","3 o 4 v/s","5 o 6 v/s","Todos los dias"};
	public static final String ageRange [] = {"Entre 5 y 17","Entre 18 y 30","Entre 31 y 40","Entre 41 y 65","Más de 65"};
	
	private String edad;
	private String frecuencia;
	private ArrayList<String>seriesVistas;
	
	public EncuestaSerie() {}
	
	public EncuestaSerie(String edad,String frecuencia,ArrayList<String>seriesVistas) {
		this.edad = edad;
		this.frecuencia = frecuencia;
		this.seriesVistas = new ArrayList<String>(seriesVistas);
	}
	
	public String getEdad() {
		return edad;
	}

	public String getFrecuencia() {
		return frecuencia;
	}

	public ArrayList<String> getSeriesVistas() {
		return seriesVistas;
	}

	public String toString() {
		return edad + " - " + frecuencia + " - " + seriesVistas;
	}
}
