package com.dam.pojos;

public class cochePojo {
	
	//atributos o variables globales. Por principio de diseño SIEMPRE privadas
	private String matricula;
	private int velocidad;
	
	
	//métodos
	
	//metodo de acceso get para obtener el valor de un atributo
	public String getMatricula() {
		return matricula;
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	
	//metodos de acceso set para asignar valor a un atributo
	public void setMatricula(String valor) {
		matricula = valor;
	}
	
	public void setVelocidad(int valor) {
		velocidad = valor;
	}
	
	
	//metodos de calculo
	public void acelera(int i) {
		velocidad += i;
	}
	
	public void frena(int i) {
		velocidad -= i;
	}
}
