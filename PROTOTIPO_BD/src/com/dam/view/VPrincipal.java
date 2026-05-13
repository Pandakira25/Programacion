package com.dam.view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

import com.dam.ctrl.Ctrl;

import javax.swing.JMenuBar;
import javax.swing.SwingConstants;

public class VPrincipal extends JFrame {
	public static final String MN_SALIR = "Salir";
	public static final String MN_MOD_RES = "Modificacion de Restaurante";
	public static final String MN_REG_RES = "Registro de Restaurante";
	public static final String MN_CON_RES = "Consulta de Restaurante";
	
	public static final int WIDTH = 600;
	public static final int HEIGHT = 500;
	
	public static int insetsR;
	public static int insetsL;
	public static int insetsT;
	public static int insetsB;
	public static int menuH;
	private JMenuItem mniSalir;
	private JMenuItem mniConsRes;
	private JMenuItem mniRegRes;
	private JScrollPane scrlCont;
	private JMenuItem mniModRes;
	
	public VPrincipal() {
		configWindow();
		
		createComp();
	}

	private void configWindow() {
		setTitle("* * G U I A  M I C H E L I N * *");
		
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
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMantRes = new JMenu("Mantenimiento Restarantes");
		menuBar.add(mnMantRes);
		
		mniConsRes = new JMenuItem(MN_CON_RES);
		mniConsRes.setHorizontalAlignment(SwingConstants.LEFT);
		mnMantRes.add(mniConsRes);
		
		mniRegRes = new JMenuItem(MN_REG_RES);
		mniRegRes.setHorizontalAlignment(SwingConstants.LEFT);
		mnMantRes.add(mniRegRes);
		
		mniModRes = new JMenuItem(MN_MOD_RES);
		mnMantRes.add(mniModRes);
		
		mniSalir = new JMenuItem(MN_SALIR);
		mniSalir.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mniSalir);
		
	}

	private void centerWindow() {
		Dimension pantalla = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		Dimension ventana = new Dimension(WIDTH, HEIGHT);
		setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);
	}

	private void createComp() {
		scrlCont = new JScrollPane();
		getContentPane().add(scrlCont, BorderLayout.CENTER);
		
	}
	
	public void setCtrl(Ctrl c) {
		mniConsRes.setActionCommand(MN_CON_RES);
		mniConsRes.addActionListener(c);
		
		mniModRes.setActionCommand(MN_MOD_RES);
		mniModRes.addActionListener(c);
		
		mniRegRes.setActionCommand(MN_REG_RES);
		mniRegRes.addActionListener(c);
		
		mniSalir.setActionCommand(MN_SALIR);
		mniSalir.addActionListener(c);
	}
	
	public void runPanel(JPanel p) {
		scrlCont.setViewportView(p);
	}
	
	public void showWindow() {
		setVisible(true);
	}
}
