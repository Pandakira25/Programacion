package com.dam.pruebas;

public class PruebasArraysBi {

	public static void main(String[] args) {
		//Para declarar un array bidimensional regular lo hacemos de esta manera:   REGULAR = Mismo número de celdas en los array interiores
		
		int [][] arrayBi = new int [3][4];//3 filas 4 columnas
		//El array exterior tiene tres celdas
		//cada array interior tiene cuatro celdas
		
		//Declarar un array bidimencional Irregular = Los array interiores no tienen el mismo número de celdas
		int [][] arrayBi2 = new int [3][];
		
		for (int i = 0; i < arrayBi2.length; i++) {//Recorrer el array exterior
			arrayBi2 [i]= new int [i+1];//Definir cada array interior
		}
		
		int aratBi3 [][] = {{1,3,5,7,9},{2,4,6,8},{10}};
		
		String pepe [][] = new String [4][4];
		
		pepe [0][0] = "P";
		pepe [1][1] = "E"; 
		pepe [2][2] = "P";
		pepe [3][3] = "E";
		
		for(int i = 0; i < pepe.length; i++) {
			for(int j = 0; j < pepe[i].length; j++) {
				if(pepe[i][j] == null) {
					pepe[i][j] = "-";
				}
				System.out.print(pepe[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
