package com.dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import com.dam.model.LstEncuestasS;
import com.dam.view.PVerEncuesta;
import com.dam.view.PaddEncuesta;
import com.dam.view.Ppal;

public class CtrlESeries implements ActionListener{
	
	private Ppal vp;
	private PaddEncuesta ae;
	private PVerEncuesta ve;
	
	private LstEncuestasS lstE= new LstEncuestasS();
	
	public CtrlESeries(Ppal vp, PaddEncuesta ae, PVerEncuesta ve) {
		this.vp=vp;
		this.ae=ae;
		this.ve=ve;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String btn = e.getActionCommand();
		
		ve.showE(lstE.getLstESeries());
		
		if(lstE.getLstESeries().size() == 0) {
			ve.showLblMsg();
			ve.hideBtnVer();
		}else {
			ve.showBtnVer();
			ve.hideLblMsg();
		}
		
		if(e.getSource() instanceof JMenuItem) {
			if(e.getSource().equals(vp.getMnRe())) {
				vp.runPanel(ae);
			}else if(e.getSource().equals(vp.getMnVe())) {
				vp.runPanel(ve);
			}
		}else if(e.getSource() instanceof JButton) {
			BtnsBehavior(btn);
		}
	}

	private void BtnsBehavior(String btn) {
		if(btn.equals("ANIADIR")) {
			lstE.addLstESeries(ae.getEncuesta());
			ae.clearE();
		}else if(btn.equals("VER")) {
			JOptionPane.showMessageDialog(ve, lstE.perREdad() + "\n" + lstE.frecMasUsada() + "\n" + lstE.serieMasVista(),"Resultados",JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
