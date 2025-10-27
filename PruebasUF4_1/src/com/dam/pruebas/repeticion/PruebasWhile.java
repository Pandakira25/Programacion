package com.dam.pruebas.repeticion;

public class PruebasWhile {

	public static void main(String[] args) {
		
		int x = 0;
		 while ( x < 10) {
			 System.out.println(x + "-");
			 x++;
			 
		 }
		 
		 System.out.println();
		 
		 while (x<10) {
			 System.out.println("no se ejecuta esta linea");
		 }
		 
		 while (x>0) {
			 System.out.println("bucle infinito");
		 }
	}

}
