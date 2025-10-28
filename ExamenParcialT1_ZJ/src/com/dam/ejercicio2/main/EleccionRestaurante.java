package com.dam.ejercicio2.main;

import java.util.Scanner;

import com.dam.ejercicio2.pojo.OpcionRestaurante;

public class EleccionRestaurante {
	
	public static OpcionRestaurante Restaurante(Scanner sc, int n) {
		System.out.println("Ingrese el nombre del restaurante" + n + ", su discancia en kilómetros y del 0 al 2 cuanto tráfico hay");
		String nombre = sc.nextLine();
		double distancia = Double.parseDouble(sc.nextLine());
		int trafico = Integer.parseInt(sc.nextLine());
		
		return new OpcionRestaurante(nombre, distancia, trafico);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		OpcionRestaurante r1 = Restaurante(sc, 1);
		OpcionRestaurante r2 = Restaurante(sc, 2);
		OpcionRestaurante r3 = Restaurante(sc, 3);
		
		sc.close();
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());
		
		String menorDistancia = null;
		
		if (r1.getDistancia()<r2.getDistancia() && r1.getDistancia() < r3.getDistancia()){
			menorDistancia = r1.getNombre();
		}else if(r2.getDistancia()< r3.getDistancia()) {
			menorDistancia = r2.getNombre();
		}else if(r1.getDistancia() == r2.getDistancia() && r1.getDistancia() == r3.getDistancia()) {
			menorDistancia = "tienen la misma distancia";
		}else {
			menorDistancia = r3.getNombre();
		}
		
		String menorTiempo=null;
		
		if (r1.calcularTiempo()<r2.calcularTiempo() && r1.calcularTiempo() < r3.calcularTiempo()){
			menorTiempo = r1.getNombre();
		}else if(r2.calcularTiempo()< r3.calcularTiempo()) {
			menorTiempo = r2.getNombre();
		}else if(r1.calcularTiempo() == r2.calcularTiempo() && r1.calcularTiempo() == r3.calcularTiempo() && r2.calcularTiempo() == r3.calcularTiempo()) {
			menorTiempo = "mismo tempo hasta todos";
		}else {
			menorTiempo = r3.getNombre();
		}
		
		System.out.println("El restaurante al que tardaríamos menos en llegar es:  " + menorTiempo + "; y el que está más cerca es: " + menorDistancia);
	}

}
