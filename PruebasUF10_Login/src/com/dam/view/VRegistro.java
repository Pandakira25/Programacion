package com.dam.view;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import com.dam.control.Ctrl;
import com.dam.model.Usuario;

public class VRegistro extends JFrame {
	public static final int WIDTH = 400;
	public static final int HEIGHT = 250;
	public static final String BTN_ACCEDER = "Acceder";
	private static final String BTN_REGISTRARSE = "Registrarse";
	
	public static int insetsR;
	public static int insetsL;
	public static int insetsT;
	public static int insetsB;
	public static int menuH;
	
	private JTextField txtUser;
	private JButton btnOk;
	private JTextField txtC;
	private JTextField txtCC;
	private JButton btnCancel;
	
	public VRegistro() {
		configWindow();
		
		createComp();
	}

	private void configWindow() {
		setTitle("Registro");
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		setSize(WIDTH,HEIGHT);
		
		insetsR = this.getInsets().right;
		insetsL = this.getInsets().left;
		insetsT = this.getInsets().top;
		insetsB = this.getInsets().bottom;
		
		centerWindow();
		
		createMenu();
	}
	
	
	private void createMenu() {
		getContentPane().setLayout(null);
	}

	private void centerWindow() {
		Dimension pantalla = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		Dimension ventana = new Dimension(WIDTH, HEIGHT);
		setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);
	}

	private void createComp() {
		getContentPane().setLayout(null);
		
		JLabel lblUser = new JLabel("Usuario: ");
		lblUser.setBounds(30, 30, 120, 20);
		getContentPane().add(lblUser);
		
		txtUser = new JTextField();
		txtUser.setBounds(170,28,120,25);
		txtUser.setToolTipText("Introduce el usuario");
		getContentPane().add(txtUser);
		
		JLabel lblPassword = new JLabel("Contraseña: ");
		lblPassword.setBounds(30,65,120,20);
		getContentPane().add(lblPassword);
		
		btnOk = new JButton("Ok");
		btnOk.setBounds(49, 145, 89, 23);
		getContentPane().add(btnOk);
		
		JLabel lblConfirmaC = new JLabel("Confirmar contrase\u00F1a");
		lblConfirmaC.setBounds(30, 103, 120, 14);
		getContentPane().add(lblConfirmaC);
		
		txtC = new JTextField();
		txtC.setBounds(170, 64, 120, 20);
		getContentPane().add(txtC);
		txtC.setColumns(10);
		
		txtCC = new JTextField();
		txtCC.setBounds(170, 100, 120, 20);
		getContentPane().add(txtCC);
		txtCC.setColumns(10);
		
		btnCancel = new JButton("Cancelar");
		btnCancel.setBounds(182, 145, 89, 23);
		getContentPane().add(btnCancel);
		
	}
	
	
	public void setCtrl(Ctrl c) {
		btnCancel.setActionCommand(BTN_ACCEDER);
		btnCancel.addActionListener(c);
		
		btnOk.setActionCommand(BTN_REGISTRARSE);
		
	}
	
	public Usuario getUser() {
		String usuario = txtUser.getText().trim();
		String password = "";
		Usuario user = null;
		
		if(usuario.isEmpty()) {
			showError("Error con el usuario");
		}else {
			password = txtC.getText();
			if(password.isEmpty()) {
				showError("Error con la contraseña");
			}else {
				user =  new Usuario(usuario,password);
			}
		}
		return user;
	}
	
	
	public void showError(String msg) {
		JOptionPane.showMessageDialog(this, msg,"Mensaje",JOptionPane.INFORMATION_MESSAGE);
	}

	public void showWindow() {
		setVisible(true);
	}
}
