package com.dam.main;

import java.awt.EventQueue;

import com.dam.control.CtrlCompraAdd;
import com.dam.view.ViewCompra;

public class index {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				ViewCompra vc = new ViewCompra();
				CtrlCompraAdd cc = new CtrlCompraAdd(vc);
				
				vc.setControlador(cc);
				vc.hacerVisible();
			}
		});

	}

}
