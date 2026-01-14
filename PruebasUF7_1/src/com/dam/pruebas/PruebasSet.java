package com.dam.pruebas;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
//import java.util.Iterator;

//Pruebas con objetos de tipo HashSet y TreeSet
//Característica de los set es que no admiten objetos duplicados
public class PruebasSet {

	public static void main(String[] args) {
		gestionConjuntoEntero();
		
		gestionConjuntoCadenas();
	}

	private static void gestionConjuntoCadenas() {

		HashSet<String> conjCadenas = new HashSet<String>();
		
		conjCadenas.add("rojo");
		conjCadenas.add("naranja");
		conjCadenas.add("amarillo");
		conjCadenas.add("verde");
		conjCadenas.add("azul");
		conjCadenas.add("morado");
		conjCadenas.add("rojo");
		
		mostrarConjuntoCadenas(conjCadenas);
		//Se muestra sin ningún orden 
		
		//Creamos un TreeSet con el contenido del HashSet
		//el TreeSet otorga orden a los elementos, orden alfabético
		
		TreeSet<String> conjOrdCadenas = new TreeSet<String>(conjCadenas);
		
		//Otra opcion para rellenar el TreeSet con los elementos del HashSet es
		TreeSet<String> conjOrdCadenas2 = new TreeSet<String>();
		conjOrdCadenas2.addAll(conjCadenas);
		
		mostrarConjuntoCadenas(conjOrdCadenas);
	}

	//Para que un método pueda recibir cualquier tipo de conjunto usar set y no el conjunto específico
	private static void mostrarConjuntoCadenas(Set<String> conjCadenas) {

		System.out.println("\nMostrar el conjunto de cadenas");
		
		for (String cadena : conjCadenas) {
			System.out.println(cadena + " ");
		}
		
	}

	private static void gestionConjuntoEntero() {
		//crear un conjunto de enteros
		HashSet<Integer> conjEnteros = new HashSet<Integer>();
		
		for(int i = 0; i < 12; i += 2) {
			conjEnteros.add(i);
		}
		
		System.out.println("Tamaño del conjunto: " + conjEnteros.size());
		
		mostrarConjunto(conjEnteros);
	}

	private static void mostrarConjunto(HashSet<Integer> conjEnteros) {
		//Los conjuntos no se pueden recorrer como un array
		
		System.out.println("\nElementos del conjunto (set)");
		
		for (Integer entero : conjEnteros) {
			System.out.print(entero + " ");
		}
		/*Utilizando un iterator 
		for(Iterator iterator = conjEnteros.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
		}*/
		
		System.out.println();
		
		
	}

}
