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
		// recoger los datos introducidos en la ventana 
		String datos = vp.obtenerDatos();
		// y mostrarlos en el textArea
		vp.mostrarDatosIntroducidos(datos);

	}

}
