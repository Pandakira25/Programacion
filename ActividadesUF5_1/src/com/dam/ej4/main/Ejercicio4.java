package com.dam.ej4.main;

import com.dam.ej4.pojo.Clase4;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Clase4 obj1 = new Clase4(7);
		//obj1: prop = 7
		
		Clase4 obj2 = new Clase4(9);
		//obj2: prop = 9
		
		obj2 = obj1;
		//obj2: prop = 9 como es static al crear el objeto 2 se elimina lo que guardo el objeto 1 por ende el valor del objeto 1 pasa a ser 9 ya que en la 
		//memoria al ser static el espacio es el mismo para ambos objetos y se sobreescribe ese valor en memoria al crear el objeto 2 y por eso el valor de 
		//objeto 1 pasa a ser 9.
		
		System.out.print(obj1.getProp()+" ");
		//por consola: 9
		System.out.print(obj2.getProp()+" "); }
		//por consola: 9

	}


