package com.dam.view;

import com.dam.control.ControladorHipoteca;

public interface IVentanaHipoteca {

	public void hacerVisible();
	//TODO:Crear controlador e indicarlo como parámetro
	public void setControlador(ControladorHipoteca ch);
	public void crearComponentes();
	public void configurarVentana();
}
