package com.dam.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import com.dam.control.ControladorEmpresas;
import com.dam.model.datos.Empresa;
import com.dam.model.datos.Textos;

public class PRegistrarEmpresa extends JPanel implements IPaneles {
	public static final String NAME = "PRegistrarEmpresa";
	
	private static final int ANCHO = VPEmpresas.ANCHO 
			- VPEmpresas.insetsL - VPEmpresas.insetsR;
	private static final int ALTO = VPEmpresas.ALTO 
			- VPEmpresas.insetsT - VPEmpresas.insetsB 
			- VPEmpresas.menuH;
	
	private JTextField txtCIF;
	private JTextField txtRazon;
	private JButton btnGuardar;
	private JButton btnCancelar;
	private JTextField txtDomicilio;
	private JTextField txtRepresentante;
	private JCheckBox chckFirmado;
	private JSpinner spnNumEmpleados;
	private JTextField txtCorreoR;
	private JTextField txtWeb;
	private JTextField txtTelefono;

	public PRegistrarEmpresa() {
		setSize(ANCHO, ALTO);
		setName(NAME);
		crearComponentes();
	}
	
	@Override
	public void crearComponentes() {
		setLayout(null);

		JLabel lblRegistrar = new JLabel(Textos.LBL_TIT_REGISTRO);
		lblRegistrar.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRegistrar.setBounds(20, 15, 271, 20);
		add(lblRegistrar);
		
		JLabel lblCIF = new JLabel(Textos.LBL_CIF);
		lblCIF.setBounds(30, 55, 60, 20);
		add(lblCIF);
		
		txtCIF = new JTextField();
		txtCIF.setBounds(120, 53, 150, 24);
		add(txtCIF);
		txtCIF.setColumns(10);
		
		JLabel lblRazon = new JLabel(Textos.LBL_RAZON);
		lblRazon.setBounds(30, 95, 100, 20);
		add(lblRazon);
		
		txtRazon = new JTextField();
		txtRazon.setBounds(150, 93, 270, 24);
		add(txtRazon);
		txtRazon.setColumns(10);
		
		JLabel lblDomincilio = new JLabel(Textos.LBL_DOMICILIO);
		lblDomincilio.setBounds(30, 135, 100, 20);
		add(lblDomincilio);
		
		txtDomicilio = new JTextField();
		txtDomicilio.setBounds(150, 133, 300, 24);
		add(txtDomicilio);
		txtDomicilio.setColumns(10);
		
		JLabel lblRepresentante = new JLabel(Textos.LBL_REPRESENTANTE);
		lblRepresentante.setBounds(30, 175, 150, 20);
		add(lblRepresentante);
		
		txtRepresentante = new JTextField();
		txtRepresentante.setBounds(200, 173, 270, 24);
		add(txtRepresentante);
		txtRepresentante.setColumns(10);
		
		JLabel lblCorreoR = new JLabel(Textos.LBL_CORREO_REPRE);
		lblCorreoR.setBounds(30, 215, 150, 20);
		add(lblCorreoR);
		
		txtCorreoR = new JTextField();
		txtCorreoR.setBounds(200, 213, 300, 24);
		add(txtCorreoR);
		txtCorreoR.setColumns(10);
		
		JLabel lblConvenio = new JLabel(Textos.LBL_CONVENIO);
		lblConvenio.setBounds(30, 255, 120, 20);
		add(lblConvenio);
		
		chckFirmado = new JCheckBox(Textos.CHCK_FIRMADO);
		chckFirmado.setBounds(120, 253, 90, 24);
		add(chckFirmado);
		
		JLabel lblWeb = new JLabel(Textos.LBL_WEB);
		lblWeb.setBounds(220, 255, 70, 20);
		add(lblWeb);
		
		txtWeb = new JTextField();
		txtWeb.setBounds(300, 253, 250, 24);
		add(txtWeb);
		txtWeb.setColumns(10);
		
		JLabel lblNumEmpleados = new JLabel(Textos.LBL_NUM_EMPLE);
		lblNumEmpleados.setBounds(30, 295, 150, 20);
		add(lblNumEmpleados);
		
		spnNumEmpleados = new JSpinner();
		spnNumEmpleados.setModel(new SpinnerNumberModel(0, 0, 10000, 10));
		spnNumEmpleados.setBounds(200, 293, 70, 24);
		add(spnNumEmpleados);
		
		JLabel lblTelefono = new JLabel(Textos.LBL_TELEFONO);
		lblTelefono.setBounds(300, 295, 100, 20);
		add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(400, 293, 120, 24);
		add(txtTelefono);
		txtTelefono.setColumns(10);
		
		btnGuardar = new JButton(Textos.BTN_GUARDAR);
		btnGuardar.setBounds(125, 340, 150, 24);
		add(btnGuardar);
		
		btnCancelar = new JButton(Textos.BTN_CANCELAR);
		btnCancelar.setBounds(300, 340, 150, 24);
		add(btnCancelar);
		
	}

	@Override
	public void setControlador(ControladorEmpresas control) {
		btnGuardar.addActionListener(control);
		btnCancelar.addActionListener(control);

	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}
	
	public void mostrarMensaje(String mensaje, String titulo, int tipo) {
		JOptionPane.showMessageDialog(this, mensaje, titulo, tipo);
		
	}

	public Empresa obtenerDatos() {
		Empresa empresa = null;
		// validar datos
		String cif = txtCIF.getText().trim();
		String rs = txtRazon.getText().trim();
		String dom = txtDomicilio.getText().trim();
		String repre = txtRepresentante.getText().trim();
		String emailR = txtCorreoR.getText().trim();;
		String tel = txtTelefono.getText().trim();
		String web = txtWeb.getText().trim();
		int numEmple = (int) spnNumEmpleados.getValue();
		
		// TODO: Validar datos:
		/*
		 * Que en el cif, la razón social, el domicilio, el representante legar, el email del representante 
		 * y el número de empleados se haya introducido algo, si no, mostrar el mensaje MSJ_ERROR_DATOS con título TIT_ERROR_DATOS
		 * Validar el cif invocando al método Empresa.validarCif(cif), si no es válido, mostrar el mensaje MSJ_ERROR_CIF con título TIT_ERROR_DATOS
		 * Validar el correo invocando al método Empresa.validarCorreo(correo), si no es válido, mostrar el mensaje MSJ_ERROR_CORREO con título TIT_ERROR_DATOS
		 * Si se ha introducido teléfono, validarlo invocando al método Empresa.validarTelefono(telef), si no es válido, mostrar el mensaje MSJ_ERROR_TELEF con título TIT_ERROR_DATOS
		 * Si se ha introducido web, validarla invocando al método Empresa.validarWeb(web), si no es válido, mostrar el mensaje MSJ_ERROR_WEB con título TIT_ERROR_DATOS
		 * 
		 * Si los datos son válidos inicializar la variable empresa con ellos.
		 */
		String convenio = "NO";
		if(chckFirmado.isSelected()) {
			convenio = "SI";
		}
		
		//System.out.println(Empresa.validarCif(cif) + " " + Empresa.validarCorreo(emailR)
		//		+ " " + Empresa.validarTelefono(tel) + " " + Empresa.validarWeb(web));
		if(Empresa.validarCif(cif) && Empresa.validarCorreo(emailR)
				&& Empresa.validarTelefono(tel) && Empresa.validarWeb(web)) {
			return new Empresa(cif,rs,dom,repre,emailR,convenio,numEmple,tel,web);
		}else {
			return null;
		}
	}
	
	public void limpiarDatos() {
		txtCIF.setText("");
		txtRazon.setText("");
		txtDomicilio.setText(""); 
		txtRepresentante.setText("");
		txtCorreoR.setText("");
		chckFirmado.setSelected(false);
		spnNumEmpleados.setValue(0); 
		txtTelefono.setText("");
		txtWeb.setText("");
	}

}
