package com.dam.view;

import java.awt.Dimension;
import java.awt.Toolkit;

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

public class VEncuesta extends JFrame implements IVEncuesta{
	
	private static final int ANCHO = 600;
	private static final int ALTO = 600;
	private JList<Encuesta> lstEncuesta;
	private DefaultListModel<Encuesta> dlmEncuesta;
	private JSpinner spnE;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
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
		
		/*spnE = new JSpinner();
		spnE.setModel(new Spinner);*/
		
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
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		buttonGroup.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setBounds(42, 183, 97, 23);
		getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		buttonGroup.add(chckbxNewCheckBox_1);
		chckbxNewCheckBox_1.setBounds(148, 183, 97, 23);
		getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		buttonGroup.add(chckbxNewCheckBox_2);
		chckbxNewCheckBox_2.setBounds(272, 183, 97, 23);
		getContentPane().add(chckbxNewCheckBox_2);
		
		
	}
	
	@Override
	public void hacerVisible() {
		// TODO Auto-generated method stub
		setVisible(true);
	}

	@Override
	public void setControlador(CtrlEncuesta ce) {
		// TODO Auto-generated method stub
		
	}

	public Encuesta getEncuesta() {
		// TODO Auto-generated method stub
		return null;
	}

	public void showE() {
		// TODO Auto-generated method stub
		
	}

	public void clearE() {
		// TODO Auto-generated method stub
		
	}
}
