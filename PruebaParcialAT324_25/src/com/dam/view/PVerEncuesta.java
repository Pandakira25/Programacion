package com.dam.view;

import java.awt.Font;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.dam.control.CtrlESeries;
import com.dam.model.EncuestaSerie;

public class PVerEncuesta extends JPanel implements IVPanels{
	
	private JList<EncuestaSerie> lstEncuestas;
	private DefaultListModel<EncuestaSerie> lstModel;
	private JButton btnVer;
	private JLabel lblMsg;
	
	private static final int WIDTH = Ppal.WIDTH - Ppal.insetsL - Ppal.insetsR;
	private static final int HEIGHT = Ppal.HEIGHT - Ppal.insetsT - Ppal.insetsB - Ppal.menuH;
	
	public PVerEncuesta() {
		setSize(WIDTH,HEIGHT);
		
		createComp();
	}

	@Override
	public void createComp() {
		setLayout(null);
		
		lblMsg = new JLabel("No hay encuestas");
		lblMsg.setBounds(165, 275, 269, 14);
		add(lblMsg);
		
		JLabel lblLista = new JLabel("Listado de Encuestas");
		lblLista.setBounds(25, 20, 160, 20);
		lblLista.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblLista);
		
		JScrollPane scrpLista = new JScrollPane();
		scrpLista.setBounds(45, 55, 480, 200);
		add(scrpLista);
		
		lstEncuestas = new JList<EncuestaSerie>();
		scrpLista.setViewportView(lstEncuestas);
		lstModel = new DefaultListModel<EncuestaSerie>();
		lstEncuestas.setModel(lstModel);
		
		btnVer = new JButton("Ver Resultados");
		btnVer.setBounds(225, 275, 150, 22);
		add(btnVer);
		
	}
	
	public void setCtrl(CtrlESeries c) {
		btnVer.addActionListener(c);
		btnVer.setActionCommand("VER");
	}
	
	public void showE(ArrayList<EncuestaSerie> es) {
		lstModel.clear();
		lstModel.addAll(es);
	}
	
	public void showLblMsg() {
		lblMsg.setVisible(true);
	}
	
	public void hideLblMsg() {
		lblMsg.setVisible(false);
	}
	
	public void showBtnVer() {
		btnVer.setVisible(true);
	}
	
	public void hideBtnVer() {
		btnVer.setVisible(false);
	}
	
}
