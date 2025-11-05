package com.dam.ej2.pojo;

public class Clase2 {

	private int p1;
	private int p2;
	
	public Clase2(int i, int j) {
	p1=i;
	p2=j;
	}
	public int modificar(int i) {
	p1=p1+i;
	p2=p2+i;
	System.out.print(p2+" ");
	return p1;
	}
}
