package com.dam.model;

import java.util.ArrayList;

public class ListaCompra {
	private ArrayList<Producto> lstCompra;
	
	public ListaCompra() {
		lstCompra = new ArrayList<Producto>();
	}
	
	public void addProduct(Producto p) {
		lstCompra.add(p);
	}
	
	public void dellProduct(int index) {
		lstCompra.remove(index);
	}
}
