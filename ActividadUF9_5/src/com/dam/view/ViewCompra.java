package com.dam.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.dam.control.CtrlCompra;
import com.dam.model.Producto;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ViewCompra extends JFrame {
	private static final int ANCHO = 1000;
	private static final int ALTO = 500;
	private JTextField txtName;
	private JSpinner spnCant;
	private JComboBox<String> cmbUnity;
	private JButton btnAdd;
	private JButton btnDell;
	private JList <Producto>listCompra;
	private JLabel lblErrors;
	private DefaultListModel<Producto> dlmCompra;
	private JButton btnClearList;
	
	public ViewCompra () {
		configurarVentana();
		crearComponentes();
	}

	public void configurarVentana() {
		setTitle("Lista Compra");
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		configSize();
	}

	private void configSize() {
		setSize(ANCHO, ALTO);
		
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();

		Dimension ventana = new Dimension(ANCHO, ALTO);

		setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);
	}
	
	public void crearComponentes() {
		getContentPane().setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(22, 96, 96, 20);
		getContentPane().add(txtName);
		txtName.setColumns(10);
		
		JLabel lblName = new JLabel("Nombre");
		lblName.setBounds(20, 71, 48, 14);
		getContentPane().add(lblName);
		
		spnCant = new JSpinner();
		spnCant.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spnCant.setModel(new SpinnerNumberModel(1, 1, 500, 1));
		spnCant.setBounds(150, 96, 48, 31);
		getContentPane().add(spnCant);
		
		JLabel lblCant = new JLabel("Cantidad");
		lblCant.setBounds(150, 71, 48, 14);
		getContentPane().add(lblCant);
		
		cmbUnity = new JComboBox<String>();
		cmbUnity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmbUnity.setModel(new DefaultComboBoxModel<String>(new String[] {"Kg", "g", "L", "Ud"}));
		cmbUnity.setBounds(229, 95, 67, 32);
		getContentPane().add(cmbUnity);
		
		JLabel lblUni = new JLabel("Unidad");
		lblUni.setBounds(229, 71, 48, 14);
		getContentPane().add(lblUni);
		
		btnAdd = new JButton("Añadir");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAdd.setBounds(22, 155, 88, 22);
		getContentPane().add(btnAdd);
		
		JLabel lblMsgAdd = new JLabel("Introduce los siguientes datos para añadir un producto a la lista de la compra");
		lblMsgAdd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMsgAdd.setBounds(22, 26, 499, 14);
		getContentPane().add(lblMsgAdd);
		
		JScrollPane scrpLista = new JScrollPane();
		scrpLista.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrpLista.setBounds(552, 55, 254, 269);
		getContentPane().add(scrpLista);
		
		listCompra = new JList<Producto>();
		listCompra.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrpLista.setViewportView(listCompra);
		
		dlmCompra = new DefaultListModel<Producto>();
		listCompra.setModel(dlmCompra);

		JLabel lblMsgDell = new JLabel("Seleccione un producto en la lista para eliminarlo");
		lblMsgDell.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMsgDell.setBounds(552, 362, 276, 14);
		getContentPane().add(lblMsgDell);
		
		JLabel lblListC = new JLabel("Lista de la compra");
		lblListC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblListC.setBounds(552, 26, 128, 14);
		getContentPane().add(lblListC);
		
		btnDell = new JButton("Eliminar");
		btnDell.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDell.setBounds(552, 399, 88, 22);
		getContentPane().add(btnDell);
		
		lblErrors = new JLabel("");
		lblErrors.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblErrors.setVerticalAlignment(SwingConstants.TOP);
		lblErrors.setBounds(32, 378, 471, 43);
		getContentPane().add(lblErrors);
		
		btnClearList = new JButton("Limpiar");
		btnClearList.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnClearList.setBounds(665, 399, 88, 22);
		getContentPane().add(btnClearList);
		
	}
	
	public int getListIndex() {
		return listCompra.getSelectedIndex();
	}
	
	public void hacerVisible() {
		setVisible(true);
	}

	public void setControlador(CtrlCompra cc) {
		//TODO
		btnAdd.setActionCommand("ADD");
		btnDell.setActionCommand("DELETE");
		btnClearList.setActionCommand("CLEAR");
		btnAdd.addActionListener(cc);
		btnDell.addActionListener(cc);
		btnClearList.addActionListener(cc);
	}

	public Producto getProduct() {
		String name = validName();
		//I`m not realy sure about this
		if(name == null) {
			return null;
		}
		int amount = (int) spnCant.getValue();
		String unity = (String) cmbUnity.getSelectedItem();
		
		return new Producto(name,amount,unity);
	}

	private String validName() {
		if(txtName.getText().isEmpty()) {
			showMsg("El nombre no puede estar vacío");
			return null;
		}
		return txtName.getText();
	}
	
	public void showMsg(String msg){
		lblErrors.setText(msg);
		lblErrors.setForeground(Color.red);
		//Profe: Me he tomado la libertad cretiva de buscar como hacer un timer y ponerlo
		Timer t = new Timer();
		t.schedule(new TimerTask() {
			public void run() {
				lblErrors.setText(null);
			}
		},3000);
	}

	public void showD(ArrayList<Producto> lc) {
		dlmCompra.clear();
		dlmCompra.addAll(lc);
	}
}
