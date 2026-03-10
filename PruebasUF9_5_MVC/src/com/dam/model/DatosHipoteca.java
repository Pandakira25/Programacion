package com.dam.model;

public class DatosHipoteca {
	private double cantidadHipoteca;
	private int duracion;
	private double intereses;
	
	public DatosHipoteca(double cantidadHipoteca, int duracion, double intereses) {
		this.cantidadHipoteca = cantidadHipoteca;
		this.duracion = duracion;
		this.intereses = intereses;
	}
	
	public double calcularCuota() {
		//TODO: Calcular cuota mensual;
		int meses = duracion*12;
		double interesesA = intereses/12/100;
		double potencia = Math.pow(interesesA + 1, meses);
		
		double cuota = cantidadHipoteca * (interesesA * potencia) / (potencia -1);
		
		return Math.round(cuota * 100) / 100;
	}
}
