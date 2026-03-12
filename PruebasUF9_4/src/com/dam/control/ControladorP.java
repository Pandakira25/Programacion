package com.dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.dam.main.VentanaPruebas;

public class ControladorP implements ActionListener {
	
	private VentanaPruebas vp;
	
	public ControladorP(VentanaPruebas vp) {
		this.vp = vp;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		//tomar los datos introducidos en la ventana y mostrarlos en el text área
		String datos = vp.obtenerDatos();
		vp.mostrarDatos(datos);
	}

}
