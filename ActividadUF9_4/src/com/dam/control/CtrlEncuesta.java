package com.dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.dam.model.LstEncuesta;
import com.dam.view.VEncuesta;

public class CtrlEncuesta implements ActionListener {
	
	LstEncuesta le = new LstEncuesta();
	VEncuesta ve = new VEncuesta();
	
	public CtrlEncuesta(VEncuesta ve) {
		this.ve=ve;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String btn = e.getActionCommand();
		if(e.getSource() instanceof JButton) {
			if(btn.equals("GUARDAR")) {
				le.addLstEncuesta(ve.getEncuesta());
				ve.clearE();
			}else if(btn.equals("LIMPIAR")){
				le.clear();
			}else if(btn.equals("VERE")) {
				ve.showE();
			}
		}
	}
	
}
