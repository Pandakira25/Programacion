package com.dam.pruebas;

import java.util.HashMap;
//poner atención en el import del entry --> es el de java.util.map
import java.util.Map.Entry;

public class PruebasMapasTM {

	public static void main(String[] args) {
		//Declaracion de un map
		HashMap<Integer,String> mapaColores = new HashMap<Integer,String>();
		
		//Añadir elementos a un mapa
		mapaColores.put(1, "Rojo");
		mapaColores.put(2, "Azul");
		mapaColores.put(3, "Amarillo");
		mapaColores.put(4, "Verde");
		mapaColores.put(5, "Naranja");
		mapaColores.put(5, "morado");//si usamos una clave que ya está en el mapa, sustituirá el valor anterior
		
		//Recorrer un mapa
		//Opcion 1: recorremos la colección de las claves
		System.out.println("Registros del mapa I");
		for (Integer clave : mapaColores.keySet()) {
			//Accedemos al valor correspondiente a cada clave y lo mostramos por consola
			System.out.println(clave + " - " + mapaColores.get(clave));
		}
		
		//opcion 2: recorremos los registros
		System.out.println("\nRegistros del mapa II");
		for(Entry<Integer, String> registro : mapaColores.entrySet()) {
			System.out.println(registro.getKey() + " - " + registro.getValue());
		}
		
		//Opcion 3: recorremos los valores --> Inconveniente que solo tengo la información del valor
		System.out.println("\nRegistros de mapa III");
		for(String valor : mapaColores.values()) {
			System.out.println(valor);
		}
	}

}
