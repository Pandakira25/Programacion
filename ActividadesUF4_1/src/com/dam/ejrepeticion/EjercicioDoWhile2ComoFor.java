package com.dam.ejrepeticion;

public class EjercicioDoWhile2ComoFor {
	static final int L_I = 50;//Límite inferior
	static final int L_S = 100;//Límite Superior
	static final int D = 2;//Decremento de la i

	public static void main(String[] args) {
		
		 for (int i = L_S ; i >= L_I; i = i - D) {
			
			 System.out.println(i);
			 
		 }
		
	}

}
