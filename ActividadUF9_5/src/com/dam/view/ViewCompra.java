package com.dam.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.dam.control.CtrlCompraAdd;
import com.dam.model.Producto;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JList;

public class ViewCompra extends JFrame implements IVCompra {
	private static final int ANCHO = 1000;
	private static final int ALTO = 800;
	private JTextField textField;
	private JTextField textField_1;
	private JSpinner spnCant;
	private JComboBox comboBox;
	private JButton btnAdd;
	private JButton btnDell;
	private JList listCompra;
	
	public ViewCompra () {
		configurarVentana();
		crearComponentes();
	}

	public void configurarVentana() {
		setTitle("Pruebas con componentes swing");
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		setSize(ANCHO, ALTO);
		
		// centrar la ventana en la pantalla
		// Se obtienen las dimensiones en pixels de la pantalla.
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		// Se obtienen las dimensiones en pixels de la ventana.
		Dimension ventana = new Dimension(ANCHO, ALTO);
		// Una cuenta para situar la ventana en el centro de la pantalla.
		setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(58, 107, 96, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Nombre");
		lblName.setBounds(56, 82, 48, 14);
		getContentPane().add(lblName);
		
		spnCant = new JSpinner();
		spnCant.setModel(new SpinnerNumberModel(1, 1, 500, 1));
		spnCant.setBounds(186, 107, 48, 20);
		getContentPane().add(spnCant);
		
		JLabel lblCant = new JLabel("Cantidad");
		lblCant.setBounds(186, 82, 48, 14);
		getContentPane().add(lblCant);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Kg", "g", "L", "Ud"}));
		comboBox.setBounds(265, 106, 67, 22);
		getContentPane().add(comboBox);
		
		JLabel lblUni = new JLabel("Unidad");
		lblUni.setBounds(265, 82, 48, 14);
		getContentPane().add(lblUni);
		
		btnAdd = new JButton("Añadir");
		btnAdd.setBounds(58, 166, 88, 22);
		getContentPane().add(btnAdd);
		
		JLabel lblMsgAdd = new JLabel("Introduce los siguientes datos para añadir un producto a la lista de la compra");
		lblMsgAdd.setBounds(58, 37, 393, 14);
		getContentPane().add(lblMsgAdd);
		
		listCompra = new JList();
		listCompra.setBounds(552, 55, 254, 269);
		getContentPane().add(listCompra);
		
		textField_1 = new JTextField();
		textField_1.setBounds(58, 375, 96, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNombreD = new JLabel("Nombre");
		lblNombreD.setBounds(56, 350, 48, 14);
		getContentPane().add(lblNombreD);
		
		JLabel lblMsgDell = new JLabel("Ingrese el nombre del producto a eliminar");
		lblMsgDell.setBounds(56, 325, 217, 14);
		getContentPane().add(lblMsgDell);
		
		JLabel lblListC = new JLabel("Lista de la compra");
		lblListC.setBounds(552, 26, 110, 14);
		getContentPane().add(lblListC);
		
		btnDell = new JButton("Eliminar");
		btnDell.setBounds(58, 410, 88, 22);
		getContentPane().add(btnDell);
	}
	
	public void crearComponentes() {
		
		
	}
	
	
	public void hacerVisible() {
		setVisible(true);
	}

	
	public void setControlador(CtrlCompraAdd cc) {
		
	}

	public Producto getProduct() {
		// TODO Auto-generated method stub
		Producto p = null;
		//get del nombre(txtfield), cantidad(JSpinner) y unidad(JComboBox) -> pasarselo a variables para pasarselas al constructor del p
		return p;
	}

	public void showD() {
		// TODO Show the data in the JList
		
	}
}
