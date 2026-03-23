package com.dam.control;

import java.awt.Color;
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
				if(ve.getEncuesta() != null) {
					le.addLstEncuesta(ve.getEncuesta());
					ve.clearE();
					ve.showMsg("Encuesta añadida correctamente", Color.GREEN);
				}else {
					ve.showMsg("No ha completado la encuesta", Color.RED);
				}
			}else if(btn.equals("LIMPIAR")){
				if(le.getLstEncuesta().size() != 0) {
					le.clear();
				}else {
					ve.showMsg("Lista vacía", Color.RED);
				}
			}else if(btn.equals("VERE")) {
				if(le.getLstEncuesta().size() != 0) {
					ve.showE(le.getLstEncuesta());
				}else {
					ve.showMsg("No hay encuestas", Color.RED);
				}
			}
		}
	}
	
}
