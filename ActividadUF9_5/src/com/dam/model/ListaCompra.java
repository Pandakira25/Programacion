package com.dam.model;

import java.util.ArrayList;

public class ListaCompra {
	private ArrayList<Producto> lstCompra;
	
	public ListaCompra() {
		lstCompra = new ArrayList<Producto>();
	}
	
	public ArrayList<Producto> getLstCompra() {
		return lstCompra;
	}

	public void addProduct(Producto p) {
		lstCompra.add(p);
	}
	
	public void dellProduct(int index) {
		lstCompra.remove(index);
	}
	
	public void clear() {
		lstCompra.removeAll(lstCompra);
	}
}
