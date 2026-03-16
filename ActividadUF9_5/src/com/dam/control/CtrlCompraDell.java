package com.dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.dam.view.ViewCompra;

public class CtrlCompraDell implements ActionListener{
	
	ViewCompra vc = new ViewCompra();
	
	public CtrlCompraDell (ViewCompra vc) {
		this.vc=vc;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}
