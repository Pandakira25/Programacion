package com.dam.main;

import java.awt.EventQueue;

import com.dam.control.CtrlCompra;
import com.dam.view.ViewCompra;

public class index {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				ViewCompra vc = new ViewCompra();
				CtrlCompra cca = new CtrlCompra(vc);
				
				vc.setControlador(cca);
				vc.hacerVisible();
			}
		});

	}

}
