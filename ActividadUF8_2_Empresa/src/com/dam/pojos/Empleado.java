package com.dam.pojos;

public class Empleado {
	protected String nombre;
	protected String dni;
	protected double salario;
	
	
	public Empleado(String nombre, String dni, double salario) {
		this.nombre = nombre;
		this.dni = dni;
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public String toString() {
		return "Nombre: " + nombre + ", DNI: " + dni + ", Salario: "  + salario;
	}
}
