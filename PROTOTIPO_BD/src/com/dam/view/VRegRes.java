package com.dam.view;

import javax.swing.JPanel;

import com.dam.ctrl.Ctrl;
import com.dam.model.Restaurante;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;

public class VRegRes extends JPanel implements IPanels {
	public static final String NAME = "VRegRes";

	private static final int WIDTH = VPrincipal.WIDTH - VPrincipal.insetsL - VPrincipal.insetsR;
	private static final int HEIGHT = VPrincipal.HEIGHT - VPrincipal.insetsT - VPrincipal.insetsB - VPrincipal.menuH;

	public static final String BTN_SAVE_D = "Guardar Datos";
	public static final String BTN_WIPE_D = "Limpiar Datos";
	private JTextField txtNom;
	private JTextField txtDirec;
	private JTextField txtTel;
	private JTextField txtCiu;
	private JTextField txtMin;
	private JTextField txtMax;
	private JTextField txtWeb;
	private JComboBox<String> cmbReg;
	private JSpinner spnDist;
	private JComboBox<String> cmbCocina;
	private JButton btnSv;
	private JButton btnClr;

	public VRegRes() {
		setSize(WIDTH, HEIGHT);
		setName(NAME);

		createComp();
	}

	@Override
	public void createComp() {
		setLayout(null);

		JLabel lblReg = new JLabel("Registrar Restaurante");
		lblReg.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblReg.setBounds(10, 11, 160, 20);
		add(lblReg);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNombre.setBounds(10, 52, 60, 14);
		add(lblNombre);

		JLabel lblRegion = new JLabel("Regi\u00F3n:");
		lblRegion.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRegion.setBounds(10, 90, 60, 14);
		add(lblRegion);

		JLabel lblDire = new JLabel("Direcci\u00F3n:");
		lblDire.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDire.setBounds(10, 128, 70, 14);
		add(lblDire);

		JLabel lblDisti = new JLabel("Distinci\u00F3n:");
		lblDisti.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDisti.setBounds(10, 166, 70, 14);
		add(lblDisti);

		JLabel lblTel = new JLabel("Tel\u00E9fono:");
		lblTel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTel.setBounds(10, 207, 60, 14);
		add(lblTel);

		txtNom = new JTextField();
		txtNom.setBounds(69, 50, 101, 20);
		add(txtNom);
		txtNom.setColumns(10);

		cmbReg = new JComboBox(Restaurante.REGIONES);
		cmbReg.setBounds(69, 87, 101, 22);
		add(cmbReg);

		txtDirec = new JTextField();
		txtDirec.setBounds(79, 126, 160, 20);
		add(txtDirec);
		txtDirec.setColumns(10);

		spnDist = new JSpinner();
		spnDist.setModel(new SpinnerNumberModel(Restaurante.DISTINCIONES[0], Restaurante.DISTINCIONES[0],
				Restaurante.DISTINCIONES[2], 1));
		spnDist.setBounds(90, 166, 30, 20);
		JSpinner.DefaultEditor edit = (JSpinner.DefaultEditor) spnDist.getEditor();
		edit.getTextField().setEditable(false);
		add(spnDist);

		txtTel = new JTextField();
		txtTel.setBounds(80, 205, 109, 20);
		add(txtTel);
		txtTel.setColumns(10);

		JLabel lblCoci = new JLabel("Cocina:");
		lblCoci.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCoci.setBounds(262, 53, 46, 14);
		add(lblCoci);

		cmbCocina = new JComboBox(Restaurante.COCINAS);
		cmbCocina.setBounds(318, 49, 109, 22);
		add(cmbCocina);

		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCiudad.setBounds(262, 91, 46, 14);
		add(lblCiudad);

		txtCiu = new JTextField();
		txtCiu.setBounds(318, 88, 123, 20);
		add(txtCiu);
		txtCiu.setColumns(10);

		JLabel lblPrMin = new JLabel("Precio m\u00EDnimo:");
		lblPrMin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrMin.setBounds(262, 129, 95, 14);
		add(lblPrMin);

		txtMin = new JTextField();
		txtMin.setBounds(368, 126, 73, 20);
		add(txtMin);
		txtMin.setColumns(10);

		JLabel lblPrMax = new JLabel("m\u00E1ximo");
		lblPrMax.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrMax.setBounds(451, 129, 52, 14);
		add(lblPrMax);

		txtMax = new JTextField();
		txtMax.setBounds(504, 126, 73, 20);
		add(txtMax);
		txtMax.setColumns(10);

		JLabel lblWeb = new JLabel("Web:");
		lblWeb.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWeb.setBounds(262, 167, 36, 14);
		add(lblWeb);

		txtWeb = new JTextField();
		txtWeb.setBounds(300, 164, 277, 20);
		add(txtWeb);
		txtWeb.setColumns(10);

		btnSv = new JButton(BTN_SAVE_D);
		btnSv.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSv.setBounds(10, 266, 129, 23);
		add(btnSv);

		btnClr = new JButton(BTN_WIPE_D);
		btnClr.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClr.setBounds(162, 267, 123, 23);
		add(btnClr);
	}

	@Override
	public void setCtrl(Ctrl c) {
		btnSv.addActionListener(c);
		btnSv.setActionCommand(BTN_SAVE_D);

		btnClr.addActionListener(c);
		btnClr.setActionCommand(BTN_WIPE_D);
	}

	public Restaurante getRest() {
		int distincion = (int) spnDist.getValue();
		String nombre = txtNom.getText(), region = (String) cmbReg.getSelectedItem(), ciudad = txtCiu.getText(),
				direccion = txtDirec.getText(), cocina = (String) cmbCocina.getSelectedItem(),
				telefono = txtTel.getText(), web = txtWeb.getText();
		String precioMinS = txtMin.getText(), precioMaxS = txtMax.getText();
		double precioMin = 0, precioMax = 0;

		if (nombre.isEmpty()) {
			showErr("Debe introducir el nombre del restaurante");
			return null;
		} else if (ciudad.isEmpty()) {
			showErr("Debe introducir una ciudad");
			return null;
		}else if(!precioMinS.isEmpty()) {
			try {
				precioMin = Double.parseDouble(txtMin.getText());
				precioMax = Double.parseDouble(txtMax.getText());
				if(!precioMaxS.isEmpty()) {
					if (precioMin > precioMax) {
						showErr("El precio min no puede ser mayor qeu el máximo");
						return null;
					}
				}
			} catch (NumberFormatException e) {
				showErr("El precio min y máximo deben ser numéricos");
				return null;
			}
		}

		return new Restaurante(distincion, nombre, region, ciudad, direccion, cocina, telefono, web, precioMin,
				precioMax);
	}

	public void clearD() {
		txtNom.setText("");
		txtCiu.setText("");
		txtDirec.setText("");
		txtMax.setText("");
		txtMin.setText("");
		txtTel.setText("");
		txtWeb.setText("");

		cmbCocina.setSelectedIndex(0);
		cmbReg.setSelectedIndex(0);

		spnDist.setValue(Restaurante.DISTINCIONES[0]);
	}

	public void showErr(String msg) {
		JOptionPane.showMessageDialog(this, msg, "Error de datos", JOptionPane.ERROR_MESSAGE);
	}
}
