package com.dam.ej1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class B {
	
	static final int AFO = 50;

	public static void main(String[] args) {
		HashMap<String,Integer> tablaReservas = new HashMap<String,Integer>();
		Scanner sc = new Scanner (System.in);
		
		int i = 0;
		String no;
		int com;
		int temp;
		int mesas = 0;
		while(i < AFO) {
			System.out.println("Introduce tu nombre");
			no = sc.nextLine();
			
			if(tablaReservas.containsKey(no)) {
				System.out.println("Ya existe una reserva a este nombre, indica otro nombre");
			}else {
				System.out.println("Ingrese el número de comensales");
				com = Integer.parseInt(sc.nextLine());
				temp = i;
				temp+=com;
				if(temp>AFO) {
					System.out.println("no hay mesa para " + com + " comensales queda para " + (AFO - i));
				}else {
					tablaReservas.put(no, com);
					i += com;
					System.out.println("reserva realizada");
					
					if(com>2) {
						mesas++;
					}
				}
			}
		}
		sc.close();
		
		System.out.println("\nAforo completado");
		
		ArrayList<Entry<String,Integer>> tRS = new ArrayList<Entry<String,Integer>>(tablaReservas.entrySet());
		tRS.sort(Entry.comparingByValue());
		for(Entry<String,Integer> c : tRS ) {
			System.out.println(c.getKey() + " - " + c.getValue() + " comensales");
		}
		System.out.println("\nHay " + mesas + " con mas de 2 comensales");
		
	}

}
