package com.dam.pojos;

public class EmpleadoDistribucion extends Empleado {

	private String zona;
	
	public EmpleadoDistribucion(String nombre, String dni, double salario,String zona) {
		super(nombre, dni, salario);
		this.zona=zona;
	}
	
	public String toString() {
		return super.toString() + ", Zona: " + zona + "\n";
	}
}
