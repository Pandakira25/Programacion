package com.dam.pruebas;

//Para hacer una clase comparable le tenemos que agregar el implements con el compareTo

public class AlumnoOrd implements Comparable<AlumnoOrd>{

	private String nombre;
	private int edad;
	
	public AlumnoOrd(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	};
	
	public String toString() {
		return "Alumno " + nombre + " de " + edad + " años";
	}

	@Override
	//Método dictado o obligade de implementar por ser comparable 
	public int compareTo(AlumnoOrd o) {
		int resultadoComp = nombre.compareTo(o.nombre);
		//va a retornar un número mayor, menor o igual a cero dependiendo de si es igual o distinto
		
		//si son iguales los ordenará también por edad
		if(resultadoComp == 0) {
			resultadoComp = edad - o.edad;
		}
		return 0;
	}

}
