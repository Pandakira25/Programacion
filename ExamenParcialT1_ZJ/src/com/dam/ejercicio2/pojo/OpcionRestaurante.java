package com.dam.ejercicio2.pojo;

public class OpcionRestaurante {
	//atributos
	private String nombre;
	private double distancia;
	private int trafico;
	//constantes
	static final int VEL_TPOCO = 80;
	static final int VEL_TNORMAL = 50;
	static final int VEL_TMUCHO = 30;
	
	static final int V_TP = 0;
	static final int V_TN = 1;
	static final int V_TM = 2;
	
	//constructores
	public OpcionRestaurante() {}

	public OpcionRestaurante(String nombre, double distancia, int trafico) {
		this.nombre = nombre;
		this.distancia = distancia;
		this.trafico = trafico;
	}
	
	//métodos
	public String getNombre() {
		return nombre;
	}
	
	public double getDistancia() {
		return distancia;
	}
	
	public double calcularTiempo() {
		double tiempo = 0;
		if(trafico == V_TP) {
			tiempo = distancia / VEL_TPOCO;
		}else if(trafico == V_TN) {
			tiempo = distancia / VEL_TNORMAL;
		}else if(trafico == V_TM) {
			tiempo = distancia / VEL_TMUCHO;
		}
		
		return tiempo;
	}
	
	public String toString() {
		String cadena = null;
		if(trafico == V_TP) {
			cadena = nombre + " a distancia " + distancia + "Km tiene poco tráfico; el tiempo estimado de llegada es: " + calcularTiempo() + "Hs";
		}else if(trafico == V_TN) {
			cadena = nombre + " a distancia " + distancia + "Km tiene un tráfico normal; el tiempo estimado de llegada es: " + calcularTiempo() + "Hs"; 
		}else if(trafico == V_TM) {
			cadena = nombre + " a distancia " + distancia + "Km tiene mucho tráfico; el tiempo estimado de llegada es: " + calcularTiempo() + "Hs" ;
		}
		return cadena;
	}
	
	
}
