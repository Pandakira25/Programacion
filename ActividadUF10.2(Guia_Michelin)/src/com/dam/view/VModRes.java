package com.dam.view;

import javax.swing.JPanel;

import com.dam.ctrl.Ctrl;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;

public class VModRes extends JPanel implements IPanels{
	public static final String NAME = "VModRes";
	
	private static final int WIDTH = VPrincipal.WIDTH - VPrincipal.insetsL - VPrincipal.insetsR;
	private static final int HEIGHT = VPrincipal.HEIGHT - VPrincipal.insetsT - VPrincipal.insetsB - VPrincipal.menuH;
	
	public static final String BTN_SAVE_D = "Guardar Datos";
	public static final String BTN_CANCEL = "Cancelar";
	public static final String BTN_SEARCH = "Buscar";
	private JTextField txfNombre;
	private JTextField txtCiudad;
	private JComboBox cmbRegion;
	private JButton btnSearch;
	private JTextField txtDire;
	private JComboBox cmbCocina;
	private JTextField txtTel;
	private JTextField txtWeb;
	private JSpinner spnDist;
	private JTextField txtPMin;
	private JTextField textField;
	private JButton btnSave;
	private JButton btnCan;
	
	public VModRes() {
		setSize(WIDTH,HEIGHT);
		setName(NAME);
		
		createComp();
	}
	
	@Override
	public void createComp() {
		setLayout(null);
		JLabel lblTitulo = new JLabel("Modificar restaurante");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitulo.setBounds(10, 11, 176, 30);
		add(lblTitulo);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre.setBounds(10, 52, 54, 14);
		add(lblNombre);
		
		txfNombre = new JTextField();
		txfNombre.setBounds(63, 52, 123, 20);
		add(txfNombre);
		txfNombre.setColumns(10);
		
		btnSearch = new JButton(BTN_SEARCH);
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSearch.setBounds(206, 49, 67, 23);
		add(btnSearch);
		
		JLabel lblRegion = new JLabel("Regi\u00F3n:");
		lblRegion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRegion.setBounds(10, 90, 54, 14);
		add(lblRegion);
		
		cmbRegion = new JComboBox();
		cmbRegion.setBounds(63, 87, 123, 22);
		add(cmbRegion);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCiudad.setBounds(206, 91, 46, 14);
		add(lblCiudad);
		
		txtCiudad = new JTextField();
		txtCiudad.setBounds(257, 88, 123, 20);
		add(txtCiudad);
		txtCiudad.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
		lblDireccion.setBounds(10, 123, 54, 14);
		add(lblDireccion);
		
		txtDire = new JTextField();
		txtDire.setBounds(63, 120, 317, 20);
		add(txtDire);
		txtDire.setColumns(10);
		
		JLabel lblWeb = new JLabel("Web:");
		lblWeb.setBounds(10, 153, 46, 14);
		add(lblWeb);
		
		JLabel lblCocina = new JLabel("Cocina:");
		lblCocina.setBounds(398, 91, 46, 14);
		add(lblCocina);
		
		cmbCocina = new JComboBox();
		cmbCocina.setBounds(454, 87, 123, 22);
		add(cmbCocina);
		
		JLabel lblTel = new JLabel("Tel\u00E9fono:");
		lblTel.setBounds(390, 123, 54, 14);
		add(lblTel);
		
		txtTel = new JTextField();
		txtTel.setBounds(454, 120, 123, 20);
		add(txtTel);
		txtTel.setColumns(10);
		
		txtWeb = new JTextField();
		txtWeb.setBounds(63, 150, 317, 20);
		add(txtWeb);
		txtWeb.setColumns(10);
		
		JLabel lblDist = new JLabel("Distinci\u00F3n:");
		lblDist.setBounds(390, 153, 54, 14);
		add(lblDist);
		
		spnDist = new JSpinner();
		spnDist.setBounds(454, 150, 30, 20);
		add(spnDist);
		
		JLabel lblPrec = new JLabel("Precio");
		lblPrec.setBounds(10, 178, 36, 14);
		add(lblPrec);
		
		JLabel lblPMin = new JLabel("Min:");
		lblPMin.setBounds(63, 178, 30, 14);
		add(lblPMin);
		
		txtPMin = new JTextField();
		txtPMin.setBounds(87, 175, 54, 20);
		add(txtPMin);
		txtPMin.setColumns(10);
		
		JLabel lblPMax = new JLabel("M\u00E1x:");
		lblPMax.setBounds(151, 181, 30, 14);
		add(lblPMax);
		
		textField = new JTextField();
		textField.setBounds(191, 175, 54, 20);
		add(textField);
		textField.setColumns(10);
		
		btnSave = new JButton("Guardar Datos");
		btnSave.setBounds(10, 206, 109, 23);
		add(btnSave);
		
		btnCan = new JButton("Cancelar");
		btnCan.setBounds(129, 206, 89, 23);
		add(btnCan);
	}

	@Override
	public void setCtrl(Ctrl c) {
		// TODO Auto-generated method stub
		
	}
}
