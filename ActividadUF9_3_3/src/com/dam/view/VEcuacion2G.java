package com.dam.view;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.dam.control.Ecuacion2GListener;
import com.dam.model.Ecuacion2G;

import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JButton;

public class VEcuacion2G extends JFrame {
	private JTextField txTA;
	private JTextField txTB;
	private JTextField txTC;
	private JButton btnRes;
	private JLabel lblSol2;
	private JLabel lblSol1;
	public VEcuacion2G() {
		
		
		configurarVentana();
	}

	private void configurarVentana() {
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		setSize(500, 500);
		
		crearComponenter();
		
		setTitle("Actividad 3");
	}

	private void crearComponenter() {
		getContentPane().setLayout(null);
		
		JLabel msjIntro = new JLabel("Introduce los t\u00E9rminos de la ecuaci\u00F3n de segundo grado");
		msjIntro.setBounds(55, 68, 274, 14);
		getContentPane().add(msjIntro);
		
		txTA = new JTextField();
		txTA.setBounds(51, 93, 32, 20);
		getContentPane().add(txTA);
		txTA.setColumns(10);
		
		JLabel lblX2 = new JLabel("x^2");
		lblX2.setBounds(93, 96, 46, 14);
		getContentPane().add(lblX2);
		
		txTB = new JTextField();
		txTB.setBounds(51, 120, 33, 20);
		getContentPane().add(txTB);
		txTB.setColumns(10);
		
		JLabel lblX = new JLabel("x+");
		lblX.setBounds(93, 121, 46, 14);
		getContentPane().add(lblX);
		
		txTC = new JTextField();
		txTC.setColumns(10);
		txTC.setBounds(51, 151, 33, 20);
		getContentPane().add(txTC);
		
		JLabel lblC = new JLabel("C");
		lblC.setBounds(93, 154, 46, 14);
		getContentPane().add(lblC);
		
		lblSol1 = new JLabel("Resultado");
		lblSol1.setBounds(51, 241, 400, 20);
		getContentPane().add(lblSol1);
		
		btnRes = new JButton("Resolver");
		btnRes.setBounds(50, 193, 89, 23);
		getContentPane().add(btnRes);
		
		lblSol2 = new JLabel("Resultado");
		lblSol2.setBounds(51, 278, 400, 20);
		getContentPane().add(lblSol2);
		
		
	}
	
	public Ecuacion2G obtenerDatos() {
		Ecuacion2G e2g = null;
		
		//Recoger los valores y validarlos
		
		String sA,sB,sC;
		
		sA = txTA.getText();
		sB = txTB.getText();
		sC = txTC.getText();
		
		try {
			int a = Integer.parseInt(sA);
			int b = Integer.parseInt(sB);
			int c = Integer.parseInt(sC);
			
			e2g = new Ecuacion2G(a,b,c);
		}catch(NumberFormatException e) {
			mostrarError("Error: Los valores deben ser enteros");
		}
		
		return e2g;
	}
	
	private void mostrarError(String error) {
		lblSol1.setText(error);
	}

	public void setListener(Ecuacion2GListener l) {
		btnRes.addActionListener(l);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}

	public void mostrarSoluciones(Double[] soluciones) {
		if(soluciones[0] != null && soluciones [1] != null) {
			mostrarMensaje(lblSol1, "Solución 1: "+ soluciones[0]);
			mostrarMensaje(lblSol2, "Solucion 2: " + soluciones[1]);
		}else {
			mostrarMensaje(lblSol1,"La ecuacion no tiene solucion");
			mostrarMensaje(lblSol2,"");
		}
	}

	private void mostrarMensaje(JLabel lbl, String mensaje) {
		lbl.setText(mensaje);
		lbl.setForeground(Color.MAGENTA);
	}
}
