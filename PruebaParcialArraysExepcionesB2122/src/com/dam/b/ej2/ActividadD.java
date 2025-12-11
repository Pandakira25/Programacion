package com.dam.b.ej2;

public class ActividadD {

	private String disciplina;
	private double distancia;
	private double tiempo;
	private String fecha;
	
	//Builders
	public ActividadD() {}
	
	public ActividadD(String disciplina, double distancia, double tiempo, String fecha) {
		this.disciplina = disciplina;
		this.distancia = distancia;
		this.tiempo = tiempo;
		this.fecha = fecha;
	}
	
	//toString
	public String toString() {
		return "Actividad: " + disciplina + "\nDistancia: " + distancia + "m, Tiempo: " + tiempo + "\nFecha: " + fecha;
	}
	
	//getters 
	public double getDistancia() {
		return distancia;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
}
