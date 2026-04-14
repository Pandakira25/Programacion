package com.dam.view;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.dam.control.Ctrl;
import com.dam.model.DatosPeliculas;
import com.dam.model.Pelicula;

public class PConsultarPeliculas extends JPanel implements IVPanels{
	
	private static final int WIDTH = Ppal.WIDTH - Ppal.insetsL - Ppal.insetsR;
	private static final int HEIGHT = Ppal.HEIGHT - Ppal.insetsT - Ppal.insetsB - Ppal.menuH;
	
	public static final String AC_BTN_VER = "Visualizar Ranking";
	public static final String AC_BTN_ANALISIS = "Realizar Análisis";
	
	private JButton btnVer;
	private JScrollPane scrpPeliculas;
	private JTextArea taPeliculas;
	private JButton btnAnalisis;
	
	public PConsultarPeliculas() {
		setSize(WIDTH,HEIGHT);
		
		createComp();
	}
	
	public void createComp() {
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("Consultar Ranking");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitulo.setBounds(44, 33, 225, 22);
		add(lblTitulo);
		
		btnVer = new JButton(AC_BTN_VER);
		btnVer.setBounds(56, 79, 150, 22);
		add(btnVer);
		
		scrpPeliculas = new JScrollPane();
		scrpPeliculas.setBounds(56, 132, 620, 320);
		add(scrpPeliculas);
		
		taPeliculas = new JTextArea();
		taPeliculas.setEditable(false);
		scrpPeliculas.setViewportView(taPeliculas);
		
		btnAnalisis = new JButton(AC_BTN_ANALISIS);
		btnAnalisis.setBounds(56, 480, 150, 22);
		add(btnAnalisis);

	}
	
	public void setCtrl(Ctrl c) {
		btnVer.addActionListener(c);
		btnVer.setActionCommand(AC_BTN_VER);
		
		btnAnalisis.addActionListener(c);
		btnAnalisis.setActionCommand(AC_BTN_ANALISIS);
	}
	
	public void hideRank() {
		scrpPeliculas.setVisible(false);
		btnAnalisis.setVisible(false);
	}
	
	public void showRank(DatosPeliculas dp) {
		scrpPeliculas.setVisible(true);
		btnAnalisis.setVisible(true);
		taPeliculas.setText("** RANKING PELICULAS **\n\n" + showInfoMovies(dp.getLstP()));
	}

	private String showInfoMovies(ArrayList<Pelicula> dp) {
		String info = "";
		
		for(int i = 0; i<dp.size();i++) {
			info +="# "+ (i + 1) + " "+ dp.get(i) + "\n\n";
		}
		return info;
	}
}
