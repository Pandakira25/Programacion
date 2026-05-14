package com.dam.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

import com.dam.control.ControladorEmpresas;
import com.dam.model.datos.Textos;

public class VPEmpresas extends JFrame implements IVFrame {
	
	public static final int ANCHO = 600;
	public static final int ALTO = 500;
	
	public static int insetsR;
	public static int insetsL;
	public static int insetsT;
	public static int insetsB;
	public static int menuH;
	
	private JScrollPane scrpContenedor;
	private JMenuItem mntmRegistrar;
	private JMenuItem mntmConsultar;

	public VPEmpresas() {
		configurarVentana();
		
		crearComponentes();
	}
	
	@Override
	public void configurarVentana() {
		setTitle("E M P R E S A S - F F E");
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		setSize(ANCHO, ALTO);
		
		insetsR = this.getInsets().right;
		insetsL = this.getInsets().left;
		insetsT = this.getInsets().top;
		insetsB = this.getInsets().bottom;
		
		// centrar la ventana en la pantalla
		centrarVentana();
		
		crearMenu();

	}
	
	private void centrarVentana() {
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension ventana = new Dimension(ANCHO, ALTO);
		setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);
		
	}
	
	public void crearMenu() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menuH = menuBar.getPreferredSize().height;
		
		JMenu mnMantenimiento = new JMenu(Textos.MN_MANTENIMIENTO);
		menuBar.add(mnMantenimiento);
		
		mntmRegistrar = new JMenuItem(Textos.MNTM_REGISTRAR);
		mnMantenimiento.add(mntmRegistrar);
		
		mntmConsultar = new JMenuItem(Textos.MNTM_CONSULTAR);
		mnMantenimiento.add(mntmConsultar);

	}

	@Override
	public void crearComponentes() {
		scrpContenedor = new JScrollPane();
		getContentPane().add(scrpContenedor, BorderLayout.CENTER);

	}

	@Override
	public void setControlador(ControladorEmpresas ce) {
		mntmRegistrar.addActionListener(ce);
		mntmConsultar.addActionListener(ce);

	}

	@Override
	public void hacerVisible() {
		setVisible(true);

	}

	@Override
	public void cargarPanel(JPanel panel) {
		scrpContenedor.setViewportView(panel);

	}

	public JMenuItem getMntmRegistrar() {
		return mntmRegistrar;
	}

	public JMenuItem getMntmConsultar() {
		return mntmConsultar;
	}

}
