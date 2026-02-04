package com.dam.ej1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio1 {
	
	static final int LOW_B = 40;

	public static void main(String[] args) {
		HashMap<String,Integer> tablaFlota = new HashMap<String,Integer>();
		
		reqDatC(tablaFlota);
		
		showCars(tablaFlota);
	}

	private static void showCars(HashMap<String, Integer> tablaFlota) {
		TreeMap<String,Integer> tFS = new TreeMap<String,Integer>(tablaFlota);
		int cNO = 0;
		
		System.out.println("\n\n** Vehículos disponibles **");
		for(Entry <String,Integer> entry : tFS.entrySet()) {
			if(entry.getValue() <= LOW_B) {
				cNO++;
			}else {
				System.out.println(entry.getKey() + " - " + entry.getValue() + "%");
			}
		}
		System.out.println("Hay " + cNO + " coches que tienen un porcentaje de batería menor o igual a " + LOW_B + " por lo que no son aptos para el uso");
		
	}

	private static void reqDatC(HashMap<String, Integer> tablaFlota) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el número de vehículos que se van a introducir");
		int nC = Integer.parseInt(sc.nextLine());
		
		String plate;
		int lB;
		
		int i = 0;
		while(i != nC) {
			System.out.println("\nIndica la matrícula coche " + (i+1));
			plate = sc.nextLine();
			System.out.println("Indica el porcentaje de batería coche " + (i+1));
			lB = Integer.parseInt(sc.nextLine());
			
			if(tablaFlota.containsKey(plate)) {
				if(lB <= LOW_B) {
					tablaFlota.put(plate, lB);
					System.out.println("¡Este vehículo ya está registrado, se actualiza el porcentaje de batería!");
					System.out.println("¡¡El vehículo con matrícula " + plate + " debe ser recargado!!");
				}else {
					System.out.println("¡Este vehículo ya está registrado, se actualiza el porcentaje de batería!");
					tablaFlota.put(plate, lB);
				}
			}else {
				if(lB<=LOW_B) {
					tablaFlota.put(plate, lB);
					System.out.println("¡¡El vehículo con matrícula " + plate + " debe ser recargado!!");
				}else {
					tablaFlota.put(plate, lB);
					i++;
				}
			}
		}
		
		sc.close();
	}

}
