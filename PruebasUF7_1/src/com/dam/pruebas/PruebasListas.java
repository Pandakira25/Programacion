package com.dam.pruebas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PruebasListas {

	public static void main(String[] args) {
		gestionListaEnteros();
		
		gestionListaCadenas();
		
		gestionListaObjetos();
		
	}

	private static void gestionListaObjetos() {
		//Lista de Alumnos
		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		//crear un objeto de tipo alumno
		Alumno alumno1 = new Alumno("Sara",15);
		
		//Añadir el alumno a la lista
		listaAlumnos.add(alumno1);
	}

	private static void gestionListaCadenas() {
		//Lista de cadena de caractéres
		ArrayList<String> listaCadenas = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		listaCadenas.add("rojo");
		listaCadenas.add("azul");
		listaCadenas.add("amarillo");
		
		//Solicitar 3 colores más al usuario
		String color;
		for(int i = 0 ; i<3; i ++) {
			System.out.println("Introduce un color");
			color = sc.nextLine();
			
			listaCadenas.add(color);
		}
		
		System.out.println("\nElementos de La lista");
		for (String cadena : listaCadenas) {
			System.out.println(cadena);
		}
		
		listaCadenas.add(0,"blanco");
		
	}

	private static void gestionListaEnteros() {
		ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
		
		//Añadimos elementos a la lista
		
		for(int i = 1; i<12;i+=2) {
			listaEnteros.add(i);
		}
		
		//0,1,2,3,4,5
		//1,3,5,7,9,11
		
		System.out.println("Tamaño de la lista: " + listaEnteros.size());
		
		//Ejemplo de cómo recorrer una collección a través de su iterador
		/*for (Iterator iterator = listaEnteros.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			
		}*/
		
		
		mostrarLista(listaEnteros);
		
		
		System.out.println("\nElementos con su posición");
		for(int i = 0; i < listaEnteros.size(); i++) {
			System.out.println("En la posición " + i + " está el valor " + listaEnteros.get(i));
		}
		
		//modificar el valor de una posición en este caso la 2 y la tres
		listaEnteros.set(2,4);
		
		mostrarLista(listaEnteros);
		
		listaEnteros.add(3,5);
		
		mostrarLista(listaEnteros);
		
		System.out.println("\nTamaño de la lista: " + listaEnteros.size());
	}

	private static void mostrarLista(ArrayList<Integer> listaEnteros) {
		System.out.println("Elementos de la lista");
		//Recorremos la lista con un foreach
		for (Integer entero : listaEnteros) {
			System.out.println(entero + " ");
		}
	}

}
