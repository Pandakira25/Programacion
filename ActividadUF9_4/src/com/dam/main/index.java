package com.dam.main;

import java.awt.EventQueue;

import com.dam.view.VEncuesta;

public class index {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				VEncuesta ve = new VEncuesta();
			}
			
		});
	}

}
