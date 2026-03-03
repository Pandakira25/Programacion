package com.dam.model;

public class Ecuacion2G {
	
	private int A; //Término cuadrado
	private int B; //Término x
	private int C; //Término independiente
	
	
	public Ecuacion2G(int A, int B, int C) {
		this.A = A;
		this.B = B;
		this.C = C;
	}
	
	//Retornamos un array pq una equacion de segundo grado puede tener dos posibles soluciones
	public Double[] resolverEquacion() {
		//x[0] = (-b + math.sqrt(b*b - 4*a*c) ) / 2*a
		//x[1] = (-b - math.sqrt(b*b - 4*a*c) ) / 2*a
		Double[] x = new Double[2];
		
		if(A != 0 && (B*B - 4 * A*C) >= 0) {
			x[0] = (-B + Math.sqrt(B*B - 4*A*C) ) / 2*A;
			x[0] = (-B - Math.sqrt(B*B - 4*A*C) ) / 2*A;
		}
		
		return x;
	}
}
