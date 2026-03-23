package com.dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.dam.model.ListaCompra;
import com.dam.view.ViewCompra;

public class CtrlCompra implements ActionListener{
	
	ViewCompra vc = new ViewCompra();
	ListaCompra lc = new ListaCompra();
	
	public CtrlCompra (ViewCompra vc) {
		this.vc=vc;
	}
	
	public void actionPerformed(ActionEvent e) {
		String btn = e.getActionCommand();
		//System.out.println(btn);
		
		//This can be a switch right?
		if(btn.equals("ADD")) {
			if(vc.getProduct() != null) {
				lc.addProduct(vc.getProduct());
			}
		}else if(btn.equals("DELETE")) {
			//System.out.println(vc.getListIndex());
			if(vc.getListIndex() >= 0) {
				lc.dellProduct(vc.getListIndex());
			}else {
				vc.showMsg("Nada seleccionado");
			}
		//Profe: También me tomé la libertad creativa de agregarle un tercer boton para limpiar toda la lista
		}else if(btn.equals("CLEAR")) {
			if(lc.getLstCompra().size() != 0) {
				lc.clear();
			}else {
				vc.showMsg("Lista vacía");
			}
		}
		vc.showD(lc.getLstCompra());
	}

}
