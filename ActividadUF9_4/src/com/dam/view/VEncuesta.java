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
	private JRadioButton rdbtnNinguna;
	private JRadioButton rdbtnLeve;
	private JRadioButton rdbtnMedia;
	private JRadioButton rdbtnAlta;
	private JRadioButton rdbtnHospitalizacion;
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
		getContentPane().setLayout(null);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEdad.setBounds(10,10,40,20);
		getContentPane().add(lblEdad);
		
		JScrollPane scrlLst = new JScrollPane();
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
		
		JLabel lblCovid = new JLabel("¿Ha pasado usted COVID-19?");
		lblCovid.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCovid.setBounds(10, 59, 191, 14);
		getContentPane().add(lblCovid);
		
		cmbCovid = new JComboBox<String>();
		cmbCovid.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cmbCovid.setModel(new DefaultComboBoxModel<String>(new String[] {"No", "SI"}));
		cmbCovid.setBounds(211, 57, 52, 22);
		getContentPane().add(cmbCovid);
		
		JLabel lblSintomas = new JLabel("¿Que sintomas padecio?");
		lblSintomas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSintomas.setBounds(10, 100, 161, 14);
		getContentPane().add(lblSintomas);
		
		chbPerGus = new JCheckBox("Perdida del gusto");
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
		
		chbSinS = new JCheckBox("Sin sintomas");
		chbSinS.setBounds(428, 171, 109, 23);
		getContentPane().add(chbSinS);
		
		JLabel lblNivG = new JLabel("Nivel de gravedad");
		lblNivG.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNivG.setBounds(10, 218, 124, 20);
		getContentPane().add(lblNivG);
		
		rdbtnNinguna = new JRadioButton("1-Ninguna");
		rbtnNivG.add(rdbtnNinguna);
		rdbtnNinguna.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNinguna.setBounds(10, 255, 81, 23);
		getContentPane().add(rdbtnNinguna);
		rdbtnNinguna.setActionCommand("1");
		
		rdbtnLeve = new JRadioButton("2-Leve");
		rbtnNivG.add(rdbtnLeve);
		rdbtnLeve.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnLeve.setBounds(93, 255, 63, 23);
		getContentPane().add(rdbtnLeve);
		rdbtnLeve.setActionCommand("2");
		
		rdbtnMedia = new JRadioButton("3-Media");
		rbtnNivG.add(rdbtnMedia);
		rdbtnMedia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnMedia.setBounds(158, 256, 72, 23);
		getContentPane().add(rdbtnMedia);
		rdbtnMedia.setActionCommand("3");
		
		rdbtnAlta = new JRadioButton("4-Alta");
		rbtnNivG.add(rdbtnAlta);
		rdbtnAlta.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnAlta.setBounds(232, 256, 63, 23);
		getContentPane().add(rdbtnAlta);
		rdbtnAlta.setActionCommand("4");
		
		rdbtnHospitalizacion = new JRadioButton("5-Hospitalizacion");
		rbtnNivG.add(rdbtnHospitalizacion);
		rdbtnHospitalizacion.setBounds(296, 256, 130, 23);
		getContentPane().add(rdbtnHospitalizacion);
		rdbtnHospitalizacion.setActionCommand("5");
		
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
		
		unenabledFields();
	}
	
	@Override
	public void hacerVisible() {
		setVisible(true);
	}

	@Override
	public void setControlador(CtrlEncuesta ce) {
		cmbCovid.addActionListener(ce);
		
		chbSinS.addActionListener(ce);
		chbSinS.setActionCommand("0");
		
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
		int edad = (int)spnEdad.getValue();
		String covid = (String) cmbCovid.getSelectedItem();
		String sintomas[] = new String[8];
		//Get the button selected and parse it to int
		int nGravedad;
		
		if(covid.equalsIgnoreCase(Encuesta.HA_PASADO_COVID_RESP[0])) {
			return new Encuesta(edad, covid);
		}else{
			if(rbtnNivG.getSelection() == null || (!chbCanMal.isSelected() && !chbDolCab.isSelected() && !chbFiebre.isSelected() && !chbPerGus.isSelected() && !chbPerOlf.isSelected() && !chbSinRes.isSelected()
					&& !chbSinS.isSelected() && !chbTos.isSelected())) {
				return null;
			}else {
				nGravedad = Integer.parseInt(rbtnNivG.getSelection().getActionCommand());
				fillSymtoms(sintomas);
				return new Encuesta(edad,covid,sintomas,nGravedad);
			}
		}
	}

	private void fillSymtoms(String[] sintomas) {
		if(chbSinS.isSelected()) {
			sintomas[0] = Encuesta.POSIBLES_SINTOMAS[0];
		}else {
			if(chbCanMal.isSelected()) {
				sintomas[4] = Encuesta.POSIBLES_SINTOMAS[4];
			}
			if(chbDolCab.isSelected()) {
				sintomas[3] = Encuesta.POSIBLES_SINTOMAS[3];
			}
			if(chbFiebre.isSelected()) {
				sintomas[6] = Encuesta.POSIBLES_SINTOMAS[6];
			}
			if(chbPerGus.isSelected()) {
				sintomas[5] = Encuesta.POSIBLES_SINTOMAS[5];
			}
			if(chbPerOlf.isSelected()) {
				sintomas[2] = Encuesta.POSIBLES_SINTOMAS[2];
			}
			if(chbSinRes.isSelected()) {
				sintomas[1] = Encuesta.POSIBLES_SINTOMAS[1];
			}
			if(chbTos.isSelected()) {
				sintomas[7] = Encuesta.POSIBLES_SINTOMAS[7];
			}
		}
	}
	
	public void unCheckSymtoms() {
		chbCanMal.setSelected(false);
		chbDolCab.setSelected(false);
		chbFiebre.setSelected(false);
		chbPerGus.setSelected(false);
		chbPerOlf.setSelected(false);
		chbSinRes.setSelected(false);
		chbTos.setSelected(false);
	}
	
	public void unCkeckSinS() {
		chbSinS.setSelected(false);
	}

	public void showE(ArrayList<Encuesta> aE) {
		dlmEncuesta.clear();
		dlmEncuesta.addAll(aE);
	}

	public void clearE() {
		unCheckSymtoms();
		unCkeckSinS();
		spnEdad.setValue(1);
		cmbCovid.setSelectedIndex(0);
		rbtnNivG.clearSelection();
	}
	
	public void clearScrlP() {
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
	
	public void unenabledFields() {
		chbSinRes.setEnabled(false);
	    chbPerOlf.setEnabled(false);
	    chbDolCab.setEnabled(false);
	    chbCanMal.setEnabled(false);
	    chbPerGus.setEnabled(false);
	    chbFiebre.setEnabled(false);
	    chbTos.setEnabled(false);
	    chbSinS.setEnabled(false);
	    
	    rdbtnAlta.setEnabled(false);
	    rdbtnHospitalizacion.setEnabled(false);
	    rdbtnLeve.setEnabled(false);
	    rdbtnMedia.setEnabled(false);
	    rdbtnNinguna.setEnabled(false);
	}
	
	public void enabledFields() {
		chbSinRes.setEnabled(true);
	    chbPerOlf.setEnabled(true);
	    chbDolCab.setEnabled(true);
	    chbCanMal.setEnabled(true);
	    chbPerGus.setEnabled(true);
	    chbFiebre.setEnabled(true);
	    chbTos.setEnabled(true);
	    chbSinS.setEnabled(true);
	    
	    rdbtnAlta.setEnabled(true);
	    rdbtnHospitalizacion.setEnabled(true);
	    rdbtnLeve.setEnabled(true);
	    rdbtnMedia.setEnabled(true);
	    rdbtnNinguna.setEnabled(true);
	}
	
	public String getCovid() {
		return (String)cmbCovid.getSelectedItem();
	}
}
