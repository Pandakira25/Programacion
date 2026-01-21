package com.dam.pruebas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class OrdenarColecciones {

	public static void main(String[] args) {
		
		
	}
	
	//Comparable: tenemos que especificar solo como comparar objetos  (Para objetos comparables, si una clase no lo es se la puede hacer comparable o crear un comparator especificando el tipo y en base a que ordenar)
	
	//Comparator: especificamos el tipo de objeto a comparar y en base a qué comparar
	
	
	// ORDENAR UN MAPA POR LOS VALORES
	private static void mostrarOrdenadoXValor1(HashMap<String, Integer> mapa) {
	// creamos un ArrayList de Entries:
	ArrayList<Entry<String, Integer>> lista = new ArrayList<Entry<String, Integer>>(mapa.entrySet());
	// invocamos al método sort de una lista que recibe como parámetro un comparador
	lista.sort(Entry.comparingByValue()); // comparador que compara los valores
	mostrarLista(lista);
	}
	
	private static void mostrarOrdenadoXValor2(HashMap<String, Integer> mapa) {
	// creamos un ArrayList de Entries:
	ArrayList<Entry<String, Integer>> lista = new ArrayList<Entry<String, Integer>>(mapa.entrySet());
	// invocamos al método sort de Collections que recibe como parámetros una lista y un comparador
	Collections.sort(lista, new Comparator<Entry<String, Integer>>() {
	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
	return o1.getValue().compareTo(o2.getValue());
	}});
	mostrarLista(lista);
	}
	// Esto nos vale si el tipo de los valores es algo "Comparable"
	// ORDENAR UN MAPA DESCENDENTEMENTE
	private static void mostrarOrdenadoDesc1(HashMap<String, Integer> mapa) {
	// creamos un ArrayList de Entries:
	ArrayList<Entry<String, Integer>> lista = new ArrayList<Entry<String, Integer>>(mapa.entrySet());
	lista.sort(Entry.comparingByKey());
	Collections.reverse(lista);
	mostrarLista(lista);
	}
	private static void mostrarOrdenadoDesc2(HashMap<String, Integer> mapa) {
	// creamos un ArrayList de Entries:
	ArrayList<Entry<String, Integer>> lista = new ArrayList<Entry<String, Integer>>(mapa.entrySet());
	Collections.sort(lista, Collections.reverseOrder(new Comparator<Entry<String, Integer>>() {
	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
	return o1.getKey().compareTo(o2.getKey());
	}
	}));
	mostrarLista(lista);
	}
	private static void mostrarOrdenadoDesc3(HashMap<String, Integer> mapa) {
	// creamos un ArrayList de Entries:
	ArrayList<Entry<String, Integer>> lista = new ArrayList<Entry<String, Integer>>(mapa.entrySet());
	Collections.sort(lista, new Comparator<Entry<String, Integer>>() {
	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
	return o2.getKey().compareTo(o1.getKey());
	}
	});
	mostrarLista(lista);
	}
	private static void mostrarOrdenadoXValorDesc(HashMap<String, Integer> mapa) {
	// creamos un ArrayList de Entries:
	ArrayList<Entry<String, Integer>> lista = new ArrayList<Entry<String, Integer>>(mapa.entrySet());
	// invocamos al método sort de Collections que recibe como parámetros una lista y un comparador
	Collections.sort(lista, new Comparator<Entry<String, Integer>>() {
	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
	return o2.getValue().compareTo(o1.getValue());
	}});
	mostrarLista(lista);
	}
	// Ordenar una lista de objetos ordenables (Por ejemplo Integer o String) descendentemente:
	ArrayList<Integer> lista = new ArrayList<Integer>();
	lista.sort(null); // no es necesario especificar un comparador Collections.reverse(lista);
	// Opción 3
	Comparator<Integer> comparador = Collections.reverseOrder();
	lista.sort(comparador);
	
	private static void ordenarListaObjOrd() {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.sort(null); // no es necesario especificar un comparador
		Collections.reverse(lista);
		
		
		// Opción 3
		Comparator<Integer> comparador = Collections.reverseOrder();
		lista.sort(comparador);
	}
 

}
