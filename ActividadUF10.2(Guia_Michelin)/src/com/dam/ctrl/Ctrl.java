package com.dam.ctrl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import com.dam.view.VConsRes;
import com.dam.view.VModRes;
import com.dam.view.VPrincipal;
import com.dam.view.VRegRes;

public class Ctrl implements ActionListener{
	
	private VPrincipal vp;
	private VRegRes vr;
	private VModRes vm;
	private VConsRes vc;
	
	private static final String MN_SALIR = VPrincipal.MN_SALIR;
	private static final String MN_MOD_RES = VPrincipal.MN_MOD_RES;
	private static final String MN_REG_RES = VPrincipal.MN_REG_RES;
	private static final String MN_CON_RES = VPrincipal.MN_CON_RES;
	
	public Ctrl(VPrincipal vp, VRegRes vr, VModRes vm, VConsRes vc) {
		this.vp=vp;
		this.vr=vr;
		this.vm=vm;
		this.vc=vc;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String ac = e.getActionCommand();

		if(e.getSource() instanceof JMenuItem){
			
			switch(ac) {
			case MN_SALIR:
				System.out.println(ac);
				int respuesta = JOptionPane.showConfirmDialog(vp, 
						"Va a cerrar la aplicación ¿Desea continuar?", 
						"Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				
				if (respuesta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
				break;
			case MN_CON_RES:
				break;
			case MN_REG_RES:
				break;
			case MN_MOD_RES:
				break;
			}
		}
	}

}
