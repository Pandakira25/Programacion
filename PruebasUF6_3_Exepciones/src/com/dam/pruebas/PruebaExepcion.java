package com.dam.pruebas;

public class PruebaExepcion {

	public static void main(String[] args) {
		int i= 0;
		String vectorS[] = {
		"Holamundo1",
		"Holamundo2",
		"Holamundo3" };
		while (i< 4) {
		System.out.println(vectorS[i]);
		i++;
		}
		//da el error: Index out of bounds por que estoy pidiendo valores en una posicion de un array que no existe
	}

}
