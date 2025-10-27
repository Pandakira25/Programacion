package com.dam.ejrepeticion;


public class EjFor2 {//La profe quiere que definamos los numeros constantes como constantes
	
	static final int L_I = 20;//Límite inferior
	static final int L_S = 81;//Límite Superior
	static final int A = 5;//aumento de la i

	public static void main(String[] args) {

		for (int i = L_I; i < L_S ; i = i +A) { //No vi lo de que era de 5 en 5
			
			System.out.println(i);
			
		}
		

	}

}
