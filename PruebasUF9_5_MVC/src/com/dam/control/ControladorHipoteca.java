package com.dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.dam.model.DatosHipoteca;
import com.dam.view.VentanaHipoteca;

public class ControladorHipoteca implements ActionListener {

	//TODO: Definir atributos que representen al modelo y a la interfaz gráfica
	private VentanaHipoteca vh; //View
	private DatosHipoteca dh; //Model
	
	
	public ControladorHipoteca(VentanaHipoteca vh) {
		this.vh = vh;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO: Implementar la actividad de la aplicación
		//1.Controlador pide a la ventana los datos de la hipoteca
		dh = vh.getDatosHipoteca();
		//2.Comprobar que los datos sean correctos
		if(dh != null) {
			Double cuotaM = dh.calcularCuota();
			vh.mostrarCuota(cuotaM);
		}
	}

}
