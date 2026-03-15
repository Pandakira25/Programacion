package com.dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.dam.model.ListaCompra;
import com.dam.view.ViewCompra;

public class CtrlCompraAdd implements ActionListener{
	
	ViewCompra vc = new ViewCompra();
	
	public CtrlCompraAdd (ViewCompra vc) {
		this.vc=vc;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ListaCompra lc = new ListaCompra();
		//add the product that returns the view to the list
		lc.addProduct(vc.getProduct());
		//TODO Show the data in the JList
		vc.showD();
	}

}
