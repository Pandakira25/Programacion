package com.dam.ej9;

public class Persona {

	private int sexo;
	private int laburo;
	private int sueldo;//Genero el aleatorio en la ejecutable
	
	//Constructores
	public Persona() {}
	
	public Persona (int sexo, int laburo, int sueldo) {
		this.sexo = sexo;
		this.laburo = laburo;
		this.sueldo = sueldo;
	}
	
	
	
	//Geters
	public int getSexo() {
		return sexo;
	}


	public int getLaburo() {
		return laburo;
	}

	public int getSueldo() {
		return sueldo;
	}
	
}
