package com.dam.view;

import javax.swing.JPanel;

import com.dam.ctrl.Ctrl;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class VModRes extends JPanel implements IPanels{
	public static final String NAME = "VModRes";
	
	private static final int WIDTH = VPrincipal.WIDTH - VPrincipal.insetsL - VPrincipal.insetsR;
	private static final int HEIGHT = VPrincipal.HEIGHT - VPrincipal.insetsT - VPrincipal.insetsB - VPrincipal.menuH;
	
	public static final String BTN_SAVE_D = "Guardar Datos";
	public static final String BTN_CANCEL = "Cancelar";
	public static final String BTN_SEARCH = "Buscar";
	private JTextField txfNombre;
	
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
		
		JButton btnSearch = new JButton(BTN_SEARCH);
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSearch.setBounds(206, 49, 67, 23);
		add(btnSearch);
		
		JLabel lblRegion = new JLabel("Regi\u00F3n:");
		lblRegion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRegion.setBounds(10, 90, 54, 14);
		add(lblRegion);
		
		JComboBox cmbRegion = new JComboBox();
		cmbRegion.setBounds(63, 87, 123, 22);
		add(cmbRegion);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCiudad.setBounds(206, 91, 46, 14);
		add(lblCiudad);
	}

	@Override
	public void setCtrl(Ctrl c) {
		// TODO Auto-generated method stub
		
	}
}
