package com.dam.actividades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Ej2_UF7_I_HM {

	public static void main(String[] args) {
		
		HashMap<Integer,String> titulares = new HashMap<Integer,String>();
		
		fillTM(titulares);
		
		salidaCampo(titulares);
		
		Scanner sc = new Scanner(System.in);
		int opt;
		do {
			System.out.println("\n¿Qué desea hacer?: \n1 - Ingresar falta a un jugador\n2 - Final del partido");
			opt = Integer.parseInt(sc.nextLine());
			
			if(opt == 1 || opt == 2) {
				switch(opt) {
				case 1:
					faltaJ(titulares, sc);
					break;
				case 2:
					endP(titulares);
				}
			}else {
				System.out.println("Ingrese una opción válida");
			}
		}while(opt != 2);
	}

	private static void endP(HashMap<Integer, String> titulares) {
		titulares.clear();
		if(titulares.isEmpty()) {
			System.out.println("Final del partido");
		}
	}

	private static void faltaJ(HashMap<Integer, String> titulares, Scanner sc) {
		boolean valid = true;
		
		do {
			System.out.println("\nIntroduzca el número del jugador que cometió la falta");
			int ply = Integer.parseInt(sc.nextLine());
			
			if(titulares.containsKey(ply)) {
				System.out.println("Jugador " + titulares.get(ply) + " Eliminado");
				titulares.remove(ply);
				valid = true;
			}else {
				System.out.println("El número ingresado no corresponde con el de un jugador, ingrese uno válido");
				valid = false;
			}
		}while(!valid);
	}
	
	//Recorrer un mapa ordenado en el for each sería, para Entry de los tipos int y string que los nombro dentro del for each records, del arryList ordenado que hice antes
	private static void salidaCampo(HashMap<Integer, String> titulares) {
		ArrayList<Entry<Integer,String>> list = new ArrayList<Entry<Integer,String>>(titulares.entrySet());
		list.sort(Entry.comparingByKey());
		for(Entry<Integer,String> records : list) {
			System.out.println("Con el número " + records.getKey() + " ... " + records.getValue());
		}
	}

	private static void fillTM(HashMap<Integer, String> titulares) {
		titulares.put(1, "Casillas");
		titulares.put(3,"Pique");
		titulares.put(5, "Puyol");
		titulares.put(6, "Iniesta");
		titulares.put(7, "Villa");
		titulares.put(8, "Xavi Hernandez");
		titulares.put(11, "Capdevilla");
		titulares.put(14, "Xabi Alonso");
		titulares.put(15, "Ramos");
		titulares.put(16, "Busquets");
		titulares.put(18, "Pedrito");
	}

}
