package com.dam.main;

import java.awt.EventQueue;

import com.dam.graf.Ppal4;



public class Inicio {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				// TODO Crear los objetos que van a formar parte de la aplicación con interfaz
				// gráfica
				Ppal4 vp = new Ppal4();

				vp.hacerVisible();
			}
		});
	}

}
