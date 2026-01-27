package com.dam.actividades;

import java.util.HashMap;

public class ExAT2_24_25 {

	public static void main(String[] args) {
		HashMap<String,String> paisesCapitales = new HashMap<String,String>();
		HashMap<String,Integer> paisesIntentos = new HashMap<String,Integer>();
		
		fillHM(paisesCapitales,paisesIntentos);
		
		
	}

	private static void fillHM(HashMap<String, String> paisesCapitales, HashMap<String, Integer> paisesIntentos) {
		String pC [][] = {
		{"Alemania","Berlín"},
		{"Austria","Viena"},
		{"Bélgica","Bruselas"},
		{"Dinamarca","Copenhague"},
		{"Eslovenia","Liubliana"},
		{"España","Madrid"},
		{"Finlandia","Helsinki"},
		{"Francia","París"}
		};
		
		for(int i = 0; i < pC.length; i++) {
			paisesCapitales.put(pC[i][0], pC[i][1]);
		}
		
		
	}

}
