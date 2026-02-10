package com.dam.pojos;

import java.util.ArrayList;

public class Empresa {
	 private String nombre;
	private ArrayList<Empleado> listaEmpleados;
	
	public Empresa() {}
	 
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
			if(empleado instanceof EmpleadoProduccion) {
				//aca debería comprobar si el turno del empleado era nocturno 
				sum+=((EmpleadoProduccion) empleado).getPlusNoct();
			}
		}
		return sum;
	}
	
	public String toString() {
		String cadena = nombre;
		for(Empleado empleado : listaEmpleados) {
			cadena+="\n"+empleado.toString();
		}
		return cadena;
	}
}
