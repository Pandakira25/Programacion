package com.dam.model;

import java.util.ArrayList;

public class ListadoAlumnos {
	public ArrayList<Alumno> listaAlumnos;
	
	public ListadoAlumnos() {
		listaAlumnos = new ArrayList<Alumno>();
		rellenarLista();
	}

	private void rellenarLista() {
		listaAlumnos.add(new Alumno("Jorge","García Pérez", "12345678z",20));
		listaAlumnos.add(new Alumno("Fernando","García Pérez", "12345678p",21));
		listaAlumnos.add(new Alumno("Sara","García Pérez", "12345678b",19));
		listaAlumnos.add(new Alumno("Ana","García Pérez", "12345678r",20));
		listaAlumnos.add(new Alumno("Juan","García Pérez", "42345678z",20));
		listaAlumnos.add(new Alumno("Pedro","García Pérez", "52345678p",21));
		listaAlumnos.add(new Alumno("Alicia","García Pérez", "62345678b",19));
		listaAlumnos.add(new Alumno("Carmen","García Pérez", "72345678r",20));
	}
	
	public ArrayList<Alumno> getListaAlumnos(){
		return listaAlumnos;
	}
}
