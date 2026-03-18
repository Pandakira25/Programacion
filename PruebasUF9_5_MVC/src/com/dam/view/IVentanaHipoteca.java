package com.dam.view;

import com.dam.control.ControladorHipoteca;

public interface IVentanaHipoteca {

	public void hacerVisible();
	public void setControlador(ControladorHipoteca ch);
	public void crearComponentes();
	public void configurarVentana();
}
