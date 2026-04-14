package com.dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import com.dam.model.DatosPeliculas;
import com.dam.view.PConsultarPeliculas;
import com.dam.view.Ppal;

public class Ctrl implements ActionListener{
	
	private Ppal vp;
	private PConsultarPeliculas cp;
	
	private DatosPeliculas dp = new DatosPeliculas();
	
	public Ctrl(Ppal vp, PConsultarPeliculas cp) {
		this.vp=vp;
		this.cp=cp;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String btn = e.getActionCommand();
		
		if(e.getSource() instanceof JMenuItem) {
			if(e.getSource().equals(vp.getOp1())) {
				vp.runPanel(cp);
			}else if(e.getSource().equals(vp.getOp2())) {
				int respuesta = JOptionPane.showConfirmDialog(cp, 
						"Va a cerrar la aplicación ¿Desea continuar?", 
						"Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				
				if (respuesta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		}else if(e.getSource() instanceof JButton) {
			BtnsBehavior(btn);
		}
	}

	private void BtnsBehavior(String btn) {
		if(btn.equals(PConsultarPeliculas.AC_BTN_VER)) {
			cp.showRank(dp);
		}else if(btn.equals(PConsultarPeliculas.AC_BTN_ANALISIS)) {
			JOptionPane.showMessageDialog(cp, dp.realizarAnalisis(), "Información", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
