package com.dam.pruebas;

import java.util.TreeMap;
//poner atención en el import del entry --> es el de java.util.map
import java.util.Map.Entry;

public class PruebasMapas {

	public static void main(String[] args) {
		//Cómo declaramos un Map con orden según sus claves
		TreeMap<String,String> mapaColores = new TreeMap<String,String>();
		
		//Añadir elementos a un mapa
		mapaColores.put("uno", "Rojo");
		mapaColores.put("dos", "Azul");
		mapaColores.put("tres", "Amarillo");
		mapaColores.put("cuatro", "Verde");
		mapaColores.put("cinco", "Naranja");
		mapaColores.put("cinco", "morado");//si usamos una clave que ya está en el mapa, sustituirá el valor anterior
		
		//Recorrer un mapa
		//Opcion 1: recorremos la colección de las claves
		System.out.println("Registros del mapa I");
		for (String clave : mapaColores.keySet()) {
			//Accedemos al valor correspondiente a cada clave y lo mostramos por consola
			System.out.println(clave + " - " + mapaColores.get(clave));
		}
		
		//opcion 2: recorremos los registros
		System.out.println("\nRegistros del mapa II");
		for(Entry<String, String> registro : mapaColores.entrySet()) {
			System.out.println(registro.getKey() + " - " + registro.getValue());
		}
		
		//Opcion 3: recorremos los valores --> Inconveniente que solo tengo la información del valor
		System.out.println("\nRegistros de mapa III");
		for(String valor : mapaColores.values()) {
			System.out.println(valor);
		}
	}

}
