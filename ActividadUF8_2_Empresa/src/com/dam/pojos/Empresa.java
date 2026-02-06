package com.dam.pojos;

import java.util.ArrayList;

public class Empresa {
	 private String nombre;
	private ArrayList<Empleado> listaEmpleados;
	 
	public Empresa(String nombre) {
			this.nombre = nombre;
			listaEmpleados = new ArrayList<Empleado>();
	}
	 
	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}
	
	public void addEmpleado(Empleado empleado) {
		listaEmpleados.add(empleado);
	}
	
	public double calcularTotalSalarios() {
		double sum = 0;
		for(Empleado empleado : listaEmpleados) {
			sum+=empleado.getSalario();
		}
		return sum;
	}
	
	public String toString() {
		return nombre + " " + listaEmpleados.toString();
	}
}
