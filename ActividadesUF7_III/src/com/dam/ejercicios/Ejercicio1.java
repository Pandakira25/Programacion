package com.dam.ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Ejercicio1 {
	
	static final int CANT_P = 10;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> palabras = new HashMap<String, Integer>();
		
		reqFillHM(palabras, sc);
		
		showSHM(palabras);
	}

	private static void showSHM(HashMap<String, Integer> palabras) {
		ArrayList<Entry<String, Integer>> list = new ArrayList<Entry<String,Integer>>(palabras.entrySet());
		list.sort(Entry.comparingByKey());
		System.out.println("\n** Listado de palabras ordenadas alfabéticamente **");
		for(Entry<String,Integer> rec : list) {
			System.out.println("\n" + rec.getKey() + " con " + rec.getValue() + " letras");
		}
	}

	private static void reqFillHM(HashMap<String, Integer> palabras, Scanner sc) {
		String key;
		
		for(int i = 0; i < CANT_P; i++) {
			System.out.println("Ingrese la palabra " + (i+1));
			key = sc.nextLine();
			if(palabras.containsKey(key.toUpperCase())){
				System.out.println("La palabra introducida ya existe");
			}else {
				palabras.put(key.toUpperCase(), key.length());
			}
		}
	}
}
