package com.dam.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import com.dam.control.CtrlESeries;
import com.dam.model.EncuestaSerie;

public class PaddEncuesta extends JPanel implements IVPanels{
	
	private static final int WIDTH = Ppal.WIDTH - Ppal.insetsL - Ppal.insetsR;
	private static final int HEIGHT = Ppal.HEIGHT - Ppal.insetsT - Ppal.insetsB - Ppal.menuH;
	
	private JRadioButton rdbtn517;
	private JRadioButton rdbtn1830;
	private JRadioButton rdbtn3140;
	private JRadioButton rdbtn4165;
	private JRadioButton rdbtn65;
	private JComboBox<String> cmbFrecuencia;
	private JCheckBox chckJdT;
	private JCheckBox chckV;
	private JCheckBox chckBB;
	private JCheckBox chckST;
	private JCheckBox chckECdlC;
	private JCheckBox chckDB;
	private JCheckBox chck7V;
	private JButton btnAddEncuesta;
	private ButtonGroup btngEdad = new ButtonGroup();
	private JCheckBox chckEJDC;
	
	
	public PaddEncuesta() {
		setSize(WIDTH,HEIGHT);
		
		createComp();
	}
	
	@Override
	public void createComp() {
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("Realizar encuesta");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitulo.setBounds(25, 20, 150, 25);
		add(lblTitulo);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(45, 55, 70, 14);
		add(lblEdad);
		
		rdbtn517 = new JRadioButton(EncuestaSerie.ageRange[0]);
		btngEdad.add(rdbtn517);
		rdbtn517.setBounds(125, 53, 100, 20);
		rdbtn517.setActionCommand(EncuestaSerie.ageRange[0]);
		add(rdbtn517);
		
		rdbtn1830 = new JRadioButton(EncuestaSerie.ageRange[1]);
		btngEdad.add(rdbtn1830);
		rdbtn1830.setBounds(235, 53, 100, 20);
		rdbtn1830.setActionCommand(EncuestaSerie.ageRange[1]);
		add(rdbtn1830);
		
		rdbtn3140 = new JRadioButton(EncuestaSerie.ageRange[2]);
		btngEdad.add(rdbtn3140);
		rdbtn3140.setBounds(345, 53, 100, 20);
		rdbtn3140.setActionCommand(EncuestaSerie.ageRange[2]);
		add(rdbtn3140);
		
		rdbtn4165 = new JRadioButton(EncuestaSerie.ageRange[3]);
		btngEdad.add(rdbtn4165);
		rdbtn4165.setBounds(125, 80, 100, 20);
		rdbtn4165.setActionCommand(EncuestaSerie.ageRange[3]);
		add(rdbtn4165);
		
		rdbtn65 = new JRadioButton(EncuestaSerie.ageRange[4]);
		btngEdad.add(rdbtn65);
		rdbtn65.setBounds(235, 80, 100, 20);
		rdbtn65.setActionCommand(EncuestaSerie.ageRange[4]);
		add(rdbtn65);
		
		JLabel lblFrecuencia = new JLabel("Frecuencia:");
		lblFrecuencia.setBounds(45, 115, 80, 14);
		add(lblFrecuencia);
		
		cmbFrecuencia = new JComboBox<String>();
		DefaultComboBoxModel<String> cmbModel = new DefaultComboBoxModel<String>(EncuestaSerie.opFrecuencia);
		cmbFrecuencia.setModel(cmbModel);
		cmbFrecuencia.setBounds(150, 113, 175, 20);
		add(cmbFrecuencia);
		
		JLabel lblSeries = new JLabel("Series:");
		lblSeries.setBounds(45, 150, 80, 14);
		add(lblSeries);
		chckJdT = new JCheckBox(EncuestaSerie.posiblesSeries[0]);
		chckJdT.setBounds(125, 148, 150, 22);
		add(chckJdT);
		
		chckV = new JCheckBox(EncuestaSerie.posiblesSeries[1]);
		chckV.setBounds(305, 148, 150, 22);
		add(chckV);
		
		chckBB = new JCheckBox(EncuestaSerie.posiblesSeries[2]);
		chckBB.setBounds(125, 175, 150, 22);
		add(chckBB);
		
		chckST = new JCheckBox(EncuestaSerie.posiblesSeries[3]);
		chckST.setBounds(305, 175, 150, 22);
		add(chckST);
		
		chckECdlC = new JCheckBox(EncuestaSerie.posiblesSeries[4]);
		chckECdlC.setBounds(125, 202, 175, 22);
		add(chckECdlC);
		
		chckEJDC = new JCheckBox(EncuestaSerie.posiblesSeries[5]);
		chckEJDC.setBounds(305, 202, 150, 22);
		add(chckEJDC);
		
		chckDB = new JCheckBox(EncuestaSerie.posiblesSeries[6]);
		chckDB.setBounds(125, 229, 150, 22);
		add(chckDB);
		
		chck7V = new JCheckBox(EncuestaSerie.posiblesSeries[7]);
		chck7V.setBounds(305, 229, 150, 22);
		add(chck7V);
		
		btnAddEncuesta = new JButton("Agregar encuesta");
		btnAddEncuesta.setBounds(225, 275, 150, 22);
		add(btnAddEncuesta);
	}
	
	public void setCtrl(CtrlESeries c) {
		btnAddEncuesta.addActionListener(c);
		btnAddEncuesta.setActionCommand("ANIADIR");
	}
	
	public EncuestaSerie getEncuesta() {
		String edad = btngEdad.getSelection().getActionCommand();
		String frecuencia = (String)cmbFrecuencia.getSelectedItem();
		ArrayList<String>seriesVistas = new ArrayList<String>();
		
		if(chckJdT.isSelected()) {
			seriesVistas.add(EncuestaSerie.posiblesSeries[0]);
		}
		if(chckV.isSelected()) {
			seriesVistas.add(EncuestaSerie.posiblesSeries[1]);
		}
		if(chckBB.isSelected()) {
			seriesVistas.add(EncuestaSerie.posiblesSeries[2]);
		}
		if(chckST.isSelected()) {
			seriesVistas.add(EncuestaSerie.posiblesSeries[3]);
		}
		if(chckECdlC.isSelected()) {
			seriesVistas.add(EncuestaSerie.posiblesSeries[4]);
		}
		if(chckDB.isSelected()) {
			seriesVistas.add(EncuestaSerie.posiblesSeries[5]);
		}
		if(chck7V.isSelected()) {
			seriesVistas.add(EncuestaSerie.posiblesSeries[5]);
		}
		
		return new EncuestaSerie(edad,frecuencia,seriesVistas);
	}
	
	public void clearE() {
		btngEdad.clearSelection();
		cmbFrecuencia.setSelectedIndex(0);
		chckJdT.setSelected(false);
		chckV.setSelected(false);
		chckBB.setSelected(false);
		chckST.setSelected(false);
		chckECdlC.setSelected(false);
		chckEJDC.setSelected(false);
		chckDB.setSelected(false);
		chck7V.setSelected(false);
	}
	
}
