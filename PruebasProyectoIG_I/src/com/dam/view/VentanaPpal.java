package com.dam.view;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class VentanaPpal extends JFrame{
	public VentanaPpal() {
		configuracionVentana();
	}

	private void configuracionVentana() {

		setTitle("Primera prueba de Interfaz Gráfica");
		CrearComponentes();
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		setSize(1000, 1000);
	}

	private void CrearComponentes() {
		getContentPane().setBackground(new Color(182, 230, 243));
		getContentPane().setLayout(null);
		
		lblElPepe = new JLabel("El pepe");
		lblElPepe.setOpaque(true);
		lblElPepe.setVerticalAlignment(SwingConstants.BOTTOM);
		lblElPepe.setHorizontalAlignment(SwingConstants.CENTER);
		lblElPepe.setForeground(new Color(255, 255, 0));
		lblElPepe.setFont(new Font("Yu Gothic Light", Font.PLAIN, 14));
		lblElPepe.setBackground(new Color(152, 63, 121));
		lblElPepe.setBounds(112, 300, 182, 30);
		getContentPane().add(lblElPepe);
		
		textNombre = new JTextField();
		textNombre.setBounds(115, 158, 150, 20);
		getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		//----------
		btnElpepeButton = new JButton("Submit");
		btnElpepeButton.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnElpepeButton.setFont(new Font("Papyrus", Font.BOLD, 14));
		btnElpepeButton.setForeground(new Color(128, 0, 64));
		btnElpepeButton.setBackground(new Color(255, 0, 128));
		
		btnElpepeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = textNombre.getText();
				
				lblElPepe.setText("Hola " + nombre);
			}
		});
		
		//-----------
		btnElpepeButton.setBounds(102, 189, 163, 23);
		getContentPane().add(btnElpepeButton);
		
		lblBienvenida = new JLabel("Introduce tu nombre");
		lblBienvenida.setForeground(new Color(255, 255, 0));
		lblBienvenida.setOpaque(true);
		lblBienvenida.setBackground(new Color(128, 0, 255));
		lblBienvenida.setBounds(138, 127, 112, 20);
		getContentPane().add(lblBienvenida);
	}

	private static final long serialVersionUID = 1L;
	private JTextField textNombre;
	private JButton btnElpepeButton;
	private JLabel lblElPepe;
	private JLabel lblBienvenida;
	
	public void hacerVisible() {
		setVisible(true);
	}
}

