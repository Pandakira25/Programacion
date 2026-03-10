package com.dam.main;

import java.awt.EventQueue;

import com.dam.control.ControladorHipoteca;
import com.dam.view.VentanaHipoteca;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				VentanaHipoteca vh = new VentanaHipoteca();
				ControladorHipoteca ch = new ControladorHipoteca(vh);
				vh.setControlador(ch);
				vh.hacerVisible();
				
			}
		});
	}

}
