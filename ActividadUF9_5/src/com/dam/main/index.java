package com.dam.main;

import java.awt.EventQueue;

import com.dam.control.CtrlCompraAdd;
import com.dam.control.CtrlCompraDell;
import com.dam.view.ViewCompra;

public class index {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				ViewCompra vc = new ViewCompra();
				CtrlCompraAdd cca = new CtrlCompraAdd(vc);
				CtrlCompraDell ccd = new CtrlCompraDell(vc);
				
				vc.setControlador(cca,ccd);
				vc.hacerVisible();
			}
		});

	}

}
