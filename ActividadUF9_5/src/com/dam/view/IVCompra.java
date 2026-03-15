package com.dam.view;

import com.dam.control.CtrlCompraAdd;

public interface IVCompra {
	public void configurarVentana();
	public void crearComponentes();
	public void hacerVisible();
	//TODO:Crear controlador e indicarlo como parámetro
	public void setControlador(CtrlCompraAdd cc);
	
	
}
