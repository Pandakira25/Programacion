package com.dam.main;

import java.awt.EventQueue;

import com.dam.control.CtrlESeries;
import com.dam.view.PVerEncuesta;
import com.dam.view.PaddEncuesta;
import com.dam.view.Ppal;

public class Index {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				Ppal vp = new Ppal();
				PaddEncuesta ae = new PaddEncuesta();
				PVerEncuesta ve = new PVerEncuesta();
				
				CtrlESeries c = new CtrlESeries(vp,ae,ve);
				
				vp.setCtrl(c);
				ae.setCtrl(c);
				ve.setCtrl(c);
				
				vp.showWindow();
			}
		});
	}

}
