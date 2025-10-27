package com.dam.pojo;

public class HelipuertoPojo {
	
	static private double PI = 3.1416;
	
	private String nombre;
	private double radio;
	
	public HelipuertoPojo() {}
	
	public HelipuertoPojo(String nombre, double radio) {
		this.nombre = nombre;
		this.radio = radio;
	}
	
	//Método de acceso set del atributo nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Método de acceso get del atributo nombre
	public String getNombre(){
		return nombre;
	}
	

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}
	
	public double areaH() {
		double area = PI * radio * radio;
		return area;
	}
	

}
