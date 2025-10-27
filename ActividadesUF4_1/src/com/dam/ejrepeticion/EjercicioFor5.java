package com.dam.ejrepeticion;

public class EjercicioFor5 {
	
	static final int L_S = 50;

	public static void main(String[] args) {
	
		int sp = 0;
		int sinp = 0;
		
		for (int p = 0; p<=L_S; p = p+2) {
			
			sp = sp + p;
			System.out.println(sp);
		} System.out.println(sp);
		
		System.out.println("separacion par impar");
		
		for (int inp = 1; inp<=L_S; inp = inp+2) {
			
			sinp = sinp + inp;
			System.out.println(sinp);
		}System.out.println(sinp);
		

	}

}
