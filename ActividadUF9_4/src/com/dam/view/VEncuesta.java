package com.dam.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.SingleSelectionModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.WindowConstants;

import com.dam.control.CtrlEncuesta;
import com.dam.model.Encuesta;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class VEncuesta extends JFrame implements IVEncuesta{
	
	private static final int ANCHO = 600;
	private static final int ALTO = 600;
	private JList<Encuesta> lstEncuesta;
	private DefaultListModel<Encuesta> dlmEncuesta;
	private final ButtonGroup rbtnNivG = new ButtonGroup();
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JRadioButton rdbtnNewRadioButton_3;
	private JRadioButton rdbtnNewRadioButton_4;
	private JButton btnGuardar;
	private JButton btnVerEn;
	private JButton btnLimpiar;
	private JSpinner spnEdad;
	private JComboBox<String> cmbCovid;
	private JCheckBox chbSinRes;
	private JCheckBox chbPerOlf;
	private JCheckBox chbDolCab;
	private JCheckBox chbCanMal;
	private JCheckBox chbPerGus;
	private JCheckBox chbFiebre;
	private JCheckBox chbTos;
	private JCheckBox chbSinS;
	private JLabel lblMsg;
	
	public VEncuesta() {
		configurarVentana();
		crearComponentes();
	}
	
	@Override
	public void configurarVentana() {
		setTitle("Encuesta Covid");
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		configSize();
	}
	
	private void configSize() {
		setSize(ANCHO, ALTO);
		
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();

		Dimension ventana = new Dimension(ANCHO, ALTO);

		setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);
	}

	@Override
	public void crearComponentes() {
		// TODO Auto-generated method stub
		getContentPane().setLayout(null);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEdad.setBounds(10,10,40,20);
		getContentPane().add(lblEdad);
		
		JScrollPane scrlLst = new JScrollPane();
		scrlLst.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrlLst.setBounds(10,400,564,150);
		getContentPane().add(scrlLst);
		
		//lista
		lstEncuesta = new JList<Encuesta>();
		lstEncuesta.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		scrlLst.setViewportView(lstEncuesta);
		//defaultListModel
		dlmEncuesta = new DefaultListModel<Encuesta>();
		lstEncuesta.setModel(dlmEncuesta);
		
		chbSinRes = new JCheckBox("S\u00EDntomas respiratorios");
		chbSinRes.setBounds(10, 134, 160, 23);
		getContentPane().add(chbSinRes);
		
		chbPerOlf = new JCheckBox("P\u00E9rdida del olfato");
		chbPerOlf.setBounds(172, 134, 128, 23);
		getContentPane().add(chbPerOlf);
		
		chbDolCab = new JCheckBox("Dolor de cabeza");
		chbDolCab.setBounds(302, 134, 124, 23);
		getContentPane().add(chbDolCab);
		
		spnEdad = new JSpinner();
		spnEdad.setModel(new SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
		spnEdad.setBounds(60, 12, 52, 28);
		getContentPane().add(spnEdad);
		
		JLabel lblCovid = new JLabel("\u00BFHa pasado usted COVID-19?");
		lblCovid.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCovid.setBounds(10, 59, 191, 14);
		getContentPane().add(lblCovid);
		
		cmbCovid = new JComboBox<String>();
		cmbCovid.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cmbCovid.setModel(new DefaultComboBoxModel<String>(new String[] {"SI", "NO"}));
		cmbCovid.setBounds(211, 57, 40, 22);
		getContentPane().add(cmbCovid);
		
		JLabel lblSintomas = new JLabel("\u00BFQu\u00E9 s\u00EDntomas padeci\u00F3?");
		lblSintomas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSintomas.setBounds(10, 100, 161, 14);
		getContentPane().add(lblSintomas);
		
		chbPerGus = new JCheckBox("P\u00E9rdida del gusto");
		chbPerGus.setBounds(10, 171, 146, 23);
		getContentPane().add(chbPerGus);
		
		chbFiebre = new JCheckBox("Fiebre");
		chbFiebre.setBounds(172, 171, 63, 23);
		getContentPane().add(chbFiebre);
		
		chbTos = new JCheckBox("Tos seca");
		chbTos.setBounds(302, 171, 81, 23);
		getContentPane().add(chbTos);
		
		chbCanMal = new JCheckBox("Cansancio/Malestar");
		chbCanMal.setBounds(428, 134, 146, 23);
		getContentPane().add(chbCanMal);
		
		chbSinS = new JCheckBox("Sin s\u00EDntomas");
		chbSinS.setBounds(428, 171, 109, 23);
		getContentPane().add(chbSinS);
		
		JLabel lblNivG = new JLabel("Nivel de gravedad");
		lblNivG.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNivG.setBounds(10, 218, 124, 20);
		getContentPane().add(lblNivG);
		
		rdbtnNewRadioButton = new JRadioButton("1-Ninguna");
		rbtnNivG.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton.setBounds(10, 255, 81, 23);
		getContentPane().add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("2-Leve");
		rbtnNivG.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_1.setBounds(93, 255, 63, 23);
		getContentPane().add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_2 = new JRadioButton("3-Media");
		rbtnNivG.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_2.setBounds(158, 256, 72, 23);
		getContentPane().add(rdbtnNewRadioButton_2);
		
		rdbtnNewRadioButton_3 = new JRadioButton("4-Alta");
		rbtnNivG.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_3.setBounds(232, 256, 63, 23);
		getContentPane().add(rdbtnNewRadioButton_3);
		
		rdbtnNewRadioButton_4 = new JRadioButton("5-Hospitalizaci\u00F3n");
		rbtnNivG.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setBounds(296, 256, 130, 23);
		getContentPane().add(rdbtnNewRadioButton_4);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnGuardar.setBounds(247, 286, 89, 23);
		getContentPane().add(btnGuardar);
		
		btnVerEn = new JButton("Ver Encuestas Realizadas");
		btnVerEn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVerEn.setBounds(10, 366, 191, 23);
		getContentPane().add(btnVerEn);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLimpiar.setBounds(211, 366, 84, 23);
		getContentPane().add(btnLimpiar);
		
		lblMsg = new JLabel("");
		lblMsg.setBounds(157, 326, 269, 14);
		getContentPane().add(lblMsg);
		
		
	}
	
	@Override
	public void hacerVisible() {
		// TODO Auto-generated method stub
		setVisible(true);
	}

	@Override
	public void setControlador(CtrlEncuesta ce) {
		chbSinS.addActionListener(ce);
		chbCanMal.addActionListener(ce);
		chbDolCab.addActionListener(ce);
		chbFiebre.addActionListener(ce);
		chbPerGus.addActionListener(ce);
		chbPerOlf.addActionListener(ce);
		chbSinRes.addActionListener(ce);
		chbTos.addActionListener(ce);
		btnGuardar.addActionListener(ce);
		btnGuardar.setActionCommand("GUARDAR");
		btnLimpiar.addActionListener(ce);
		btnLimpiar.setActionCommand("LIMPIAR");
		btnVerEn.addActionListener(ce);
		btnVerEn.setActionCommand("VERE");
	}

	public Encuesta getEncuesta() {
		// TODO 
		int edad = (int)spnEdad.getValue();
		String covid = (String) cmbCovid.getSelectedItem();
		String sintomas[] = new String[8];
		for(int i = 0; i < sintomas.length; i++) {
			if(chbCanMal.isSelected()) {
				
			}
		}
		return null;
	}

	public void showE(ArrayList<Encuesta> aE) {
		dlmEncuesta.clear();
		dlmEncuesta.addAll(aE);
	}

	public void clearE() {
		dlmEncuesta.clear();
	}
	
	public void showMsg(String msg, Color c) {
		lblMsg.setText(msg);
		lblMsg.setForeground(c);
		Timer t = new Timer();
		t.schedule(new TimerTask() {
			public void run(){
				lblMsg.setText("");
			}
		}, 3000);
	}
}
