package com.dam.ej2.main;

import com.dam.ej2.pojo.Clase2;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Clase2 obj1= new Clase2(5,4);
		System.out.print(obj1.modificar(4)+" ");
		
		//obj: p1 = 5, p2 = 4
		//al invocar a modificar obj1 sufre cambios
		//p1 = 9; p2 = 8
		//por consola: 
		// 8 9 
		
		Clase2 obj2= new Clase2(5,4);
		System.out.print(obj2.modificar(5)+" ");
		
		//obj2: p1 = 5, p2 = 4
		//al invocar modificar sufre cambios
		// p1 = 10, p2 = 9
		//por consola: 9 10
		
		obj2 = obj1;
		System.out.println(obj2.modificar(5)+" ");
		//obj2: p1: 9, p2: 8
		//al invocar modificar sufre cambios
		//p1: 14, p2: 13
		//por consola: 13 14

	}

}
