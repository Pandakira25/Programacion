package com.dam.view;

import javax.swing.JPanel;

import com.dam.ctrl.Ctrl;

public class VRegRes extends JPanel implements IPanels{
	
	private static final int WIDTH = VPrincipal.WIDTH - VPrincipal.insetsL - VPrincipal.insetsR;
	private static final int HEIGHT = VPrincipal.HEIGHT - VPrincipal.insetsT - VPrincipal.insetsB - VPrincipal.menuH;
	
	public static final String BTN_SAVE_D = "Guardar Datos";
	public static final String BTN_WIPE_D = "Limpiar Datos";
	
	public VRegRes () {
		setSize(WIDTH,HEIGHT);
	}
	
	@Override
	public void createComp() {
		setLayout(null);
	}

	@Override
	public void setCtrl(Ctrl c) {
		// TODO Auto-generated method stub
		
	}

}
