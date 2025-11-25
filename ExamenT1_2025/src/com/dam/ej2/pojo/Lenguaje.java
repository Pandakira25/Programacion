package com.dam.ej2.pojo;

public class Lenguaje {

	private String nombre;
	private String nomCreador;
	private int anioPublicacion;
	private int posicionRank;
	private double porUso;
	private double difPorUsoAA;
	
	//Constructores
	public Lenguaje() {}
	
	public Lenguaje(String nombre, String nomCreador, int añoPublicacion, int posicionRank, double porUso, double porUsoAA) {

		this.nombre = nombre;
		this.nomCreador = nomCreador;
		this.anioPublicacion = añoPublicacion;
		this.posicionRank = posicionRank;
		this.porUso = porUso;
		this.difPorUsoAA = porUsoAA;
	}
	
	//Getters
	public double getPorUso() {
		return porUso;
	}
	
	public double getDifPorUsoAA() {
		return difPorUsoAA;
	}
	
	public int getPosicionRank() {
		return posicionRank;
	}
	
	
	//Métodos
	public String apellido() {
		String nombreApellido[] = nomCreador.split(" ");
		
		String apellido = nombreApellido[1];
		String apellido2 = null;
		
		StringBuilder apellidoC = new StringBuilder();
		apellidoC.append(apellido);
		
		if (nombreApellido.length > 2) {
			apellido2 = nombreApellido[2];
			apellidoC.append(" "+ apellido2);
		}
		
		return apellidoC.toString();
	}

	public String nombre() {
		String nombreApellido[] = nomCreador.split(" ");
		
		String nombre = nombreApellido[0];
		
		return nombre;
	}
	
	public double porAnioAnterior() {
		double porAnioAnterior = porUso - difPorUsoAA;
		
		return porAnioAnterior;
	}
	
	public int aniosEnUso(int anioActual) {
		int aniosEnUso = anioActual - anioPublicacion;
		return aniosEnUso;
	}

	
	//ToString
	public String toString() {
		return "\n" + posicionRank + "-" + nombre + "(" + anioPublicacion + ")\nCreador: " + apellido() + "\nPorcentaje de Uso: " 
				+ porUso + "\nDiferencia con el año anterior: " + difPorUsoAA;
		
	}
	
	
}
