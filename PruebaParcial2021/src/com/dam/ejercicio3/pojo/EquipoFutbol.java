package com.dam.ejercicio3.pojo;

public class EquipoFutbol {
	
	private String nombre;
	private String ciudad;
	private int numPartGanados;
	private int numPartPerdidos;
	private int numPartEmpatados;
	
	public EquipoFutbol() {}
	
	public EquipoFutbol (String nombre, String ciudad, int numPartGanados, int numPartPerdidos,int numPartEmpatados) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.numPartGanados = numPartGanados;
		this.numPartPerdidos = numPartPerdidos;
		this.numPartEmpatados = numPartEmpatados;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int calcularPuntos(){
		
		int puntos = numPartEmpatados * 1 + numPartGanados * 3 + numPartPerdidos * 0 ;
		
		return puntos;
	}
	
	public String toString () {
		String cadena = "<" + nombre + ">" + " - <" + ciudad + ">" + "\n Número de partidos ganados: <" + numPartGanados + "> \n "
				+ "Número de partidos empatados: <" + numPartEmpatados + "> \n Número de partidos perdidos: <" + numPartPerdidos + ">" ;
		return cadena;
	}

}
