package com.dam.control;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import com.dam.model.Encuesta;
import com.dam.model.LstEncuesta;
import com.dam.view.VEncuesta;

public class CtrlEncuesta implements ActionListener {
	
	LstEncuesta le = new LstEncuesta();
	VEncuesta ve;
	
	public CtrlEncuesta(VEncuesta ve) {
		this.ve=ve;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String btn = e.getActionCommand();
		if(e.getSource() instanceof JButton) {
			buttonsActions(btn);
		}else if(e.getSource() instanceof JCheckBox) {
			chbBehavior(btn,e);
		}else if (e.getSource() instanceof JComboBox) {
			cmbBehavior();
		}
	}


	private void cmbBehavior() {
		if(ve.getCovid().equalsIgnoreCase(Encuesta.HA_PASADO_COVID_RESP[0])) {
			ve.unenabledFields();
		}else {
			ve.enabledFields();
		}
	}


	private void chbBehavior(String btn, ActionEvent e) {
		if(btn.equals("0")) {
			ve.unCheckSymtoms();
		}else {
			ve.unCkeckSinS();
		}
	}


	private void buttonsActions(String btn) {
		if(btn.equals("GUARDAR")) {
			if(ve.getEncuesta() != null) {
				le.addLstEncuesta(ve.getEncuesta());
				ve.clearE();
				ve.showMsg("Encuesta añadida correctamente", new Color(8,153,0));
			}else {
				ve.showMsg("No ha completado la encuesta", Color.RED);
			}
		}else if(btn.equals("LIMPIAR")){
			if(le.getLstEncuesta().size() != 0) {
				le.clear();
				ve.clearScrlP();
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
