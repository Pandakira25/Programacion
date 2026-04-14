package com.dam.main;

import java.awt.EventQueue;

import com.dam.control.Ctrl;
import com.dam.view.PConsultarPeliculas;
import com.dam.view.Ppal;

public class Index {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				Ppal vp = new Ppal();
				PConsultarPeliculas cp = new PConsultarPeliculas();
				
				Ctrl c = new Ctrl(vp,cp);
				
				vp.setCtrl(c);
				cp.setCtrl(c);
				
				cp.hideRank();
				vp.showWindow();
				
			}
		});
	}

}
