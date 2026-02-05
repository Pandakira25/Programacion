package com.dam.pojos;

public class EmpleadoProduccion extends Empleado {
	private String turno;
	private double plusNoct;
	
	public EmpleadoProduccion(String nombre, String dni, double salario,String turno, double plusNoct ) {
		super(nombre, dni, salario);
		this.turno=turno;
		this.plusNoct=plusNoct;
	}
	
	public double getPlusNoct() {
		return plusNoct;
	}
	
	public String toString() {
		return super.toString() + " " + turno + " " + plusNoct;
	}
	
}
