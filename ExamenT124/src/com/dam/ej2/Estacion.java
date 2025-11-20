package com.dam.ej2;

public class Estacion {
	
	public static final String ESTADO_S []= {"ABIERTA", "CERRADA"}; 

	private String nombre;
	private String provincia;
	private String estado;
	private String nRemontes;
	private String nPistas;
	private String nKmEsquiables;
	
	//Constructores
	
	public Estacion () {}
	
	public Estacion (String nombre,String provincia, String estado, String nRemontes, String nPistas, String nKmEsquiables) {
		 this.nombre = nombre;
		 this.provincia = provincia;
		 this.estado = estado;
		 this.nRemontes = nRemontes;
		 this.nPistas = nPistas;
		 this.nKmEsquiables = nKmEsquiables;
	}
	
	
	//Geters

	
	
	//toString
	public String toString() {
		StringBuilder txt = new StringBuilder();
		
		txt.append(nombre + "("+ provincia +")\nEstado (ABIERTA/CERRADA): " + estado);
		
		if(estado.equalsIgnoreCase(ESTADO_S[0])){
			txt.append("\nRemontes: " + nRemontes + ", Pistas: " + nPistas + ", Km esquiables: " + nKmEsquiables);
		}
		
		return txt.toString();
	}
	
	//Métodos
	
	public double pEsq () {
		String partes [] = nKmEsquiables.split("/");
		double p1 = Double.parseDouble(partes[0]);
		double p2 = Double.parseDouble(partes[1]);
		
		double porcentaje = (p1 * 100) / p2;
		
		return porcentaje;
	}
	
	public double kmA() {
		String partes[]=nKmEsquiables.split("/");
		double p1 = Double.parseDouble(partes[0]);
		return p1;
	}
	
}
