package com.dam.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.dam.control.CtrlEncuesta;

public class VEncuesta extends JFrame implements IVEncuesta{

	private static final int ANCHO = 200;
	private static final int ALTO = 500;

	@Override
	public void configurarVentana() {
		setTitle("Encuesta Covid");
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		configSize();
	}
	
	private void configSize() {
		// TODO Auto-generated method stub
		setSize(ANCHO, ALTO);
		
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();

		Dimension ventana = new Dimension(ANCHO, ALTO);

		setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);
	}

	@Override
	public void crearComponentes() {
		// TODO Auto-generated method stub
		getContentPane().setLayout(null);
	}
	
	@Override
	public void hacerVisible() {
		// TODO Auto-generated method stub
		setVisible(true);
	}

	@Override
	public void setControlador(CtrlEncuesta ce) {
		// TODO Auto-generated method stub
		
	}
}
