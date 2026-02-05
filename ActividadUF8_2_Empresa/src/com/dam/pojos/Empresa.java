package com.dam.pojos;

import java.util.ArrayList;

public class Empresa {
	 private String nombre;
	private ArrayList<Empleado> listaEmpleados;
	 
	public Empresa(String nombre, ArrayList<Empleado> listaEmpleados) {
			this.nombre = nombre;
			this.listaEmpleados = listaEmpleados;
	}
	 
	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}
	
	public void addEmpleado(Empleado empleado) {
		listaEmpleados.add(empleado);
	}
	
	public void calcularTotalSalarios() {
		double sum = 0;
		for(Empleado empleado : listaEmpleados) {
			sum+=empleado.getSalario();
		}
	}
	
	public String toString() {
		return nombre + " " + listaEmpleados.toString();
	}
}
