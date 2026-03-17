package com.dam.main;

import java.awt.EventQueue;

import com.dam.control.CtrlCompraAdd;
import com.dam.view.ViewCompra;

public class index {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				ViewCompra vc = new ViewCompra();
				CtrlCompraAdd cca = new CtrlCompraAdd(vc);
				
				vc.setControlador(cca);
				vc.hacerVisible();
			}
		});

	}

}
