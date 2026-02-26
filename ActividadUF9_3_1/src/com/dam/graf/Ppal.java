package com.dam.graf;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ppal extends JFrame{
	public Ppal() {
		
		configuracionVentana();
	}
	
	private void configuracionVentana() {
		
		setTitle("Actividad 1");
		CrearComponentes();
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		setSize(1000, 1000);
	}

	private void CrearComponentes() {
		getContentPane().setLayout(null);
		
		JLabel lblIntro = new JLabel("Introduzca un n\u00FAmero");
		lblIntro.setBounds(54, 45, 110, 14);
		getContentPane().add(lblIntro);
		
		textReadT = new JTextField();
		textReadT.setBounds(54, 70, 86, 20);
		getContentPane().add(textReadT);
		textReadT.setColumns(10);
		
		JLabel lblRes = new JLabel("Para descubrir si es par o  impar mira aqui");
		lblRes.setBounds(58, 148, 242, 14);
		getContentPane().add(lblRes);
		
		
		JButton btnConfirm = new JButton("Comprobar");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					lblRes.setBorder(BorderFactory.createLineBorder(new Color(0, 0 ,0), 0));
					int num = Integer.parseInt(textReadT.getText());
					if(num % 2 == 0) {
						lblRes.setText("El número introducido es par");
					}else {
						lblRes.setText("El número introducido es inpar");
					}
				}catch(NumberFormatException x) {
					lblRes.setText("Introduce un número");
					lblRes.setBorder(BorderFactory.createLineBorder(new Color(255, 0 ,0), 2));
				}
				
			}
		});
		btnConfirm.setBounds(54, 101, 89, 23);
		getContentPane().add(btnConfirm);
		
		
		
	}

	private static final long serialVersionUID = 1L;
	private JTextField textReadT;
	
	public void hacerVisible() {
		setVisible(true);
	}
}
