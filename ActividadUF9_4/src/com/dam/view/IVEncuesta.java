package com.dam.view;

import com.dam.control.CtrlEncuesta;

public interface IVEncuesta {
	public void configurarVentana();
	public void crearComponentes();
	public void hacerVisible();
	public void setControlador(CtrlEncuesta ce);
}
