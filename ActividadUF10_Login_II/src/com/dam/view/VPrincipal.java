package com.dam.view;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class VPrincipal extends JFrame {
	
	public static final int WIDTH = 600;
	public static final int HEIGHT = 400;
	
	public static int insetsR;
	public static int insetsL;
	public static int insetsT;
	public static int insetsB;
	public static int menuH;
	
	public VPrincipal() {
		configWindow();
		
		createComp();
	}

	private void configWindow() {
		setTitle("Bienvenida");
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		setSize(WIDTH,HEIGHT);
		
		insetsR = this.getInsets().right;
		insetsL = this.getInsets().left;
		insetsT = this.getInsets().top;
		insetsB = this.getInsets().bottom;
		
		centerWindow();
		
		createMenu();
	}
	
	
	private void createMenu() {
		getContentPane().setLayout(null);
	}

	private void centerWindow() {
		Dimension pantalla = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		Dimension ventana = new Dimension(WIDTH, HEIGHT);
		setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);
	}

	private void createComp() {
		getContentPane().setLayout(null);
		
		JLabel lblUser = new JLabel("Bienvenido yei");
		lblUser.setBounds(175, 180, 250, 20);
		getContentPane().add(lblUser);
		
	}
	
	
	public void showWindow() {
		setVisible(true);
	}
}
