package com.dam.main;

import java.awt.EventQueue;

import com.dam.control.ControladorP;
import com.dam.model.ListadoAlumnos;

public class Inicio {

	public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VentanaPruebas vp = new VentanaPruebas();
				
				ListadoAlumnos laModel = new ListadoAlumnos();
				ControladorP control = new ControladorP(vp);
				
				//Pasarle la lista de alumnos a la vista
				//Lo que tenga el toString de la clase pojo es lo que va a visualisar
				vp.cargarCmbAlumnos(laModel.getListaAlumnos());
				vp.cargarLstAlumnos(laModel.getListaAlumnos());
				
				vp.setControlador(control);
				
				vp.hacerVisible();
				
			}
		});

	}

}
