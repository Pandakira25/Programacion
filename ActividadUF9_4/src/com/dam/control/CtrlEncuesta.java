package com.dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
	}
	
}
