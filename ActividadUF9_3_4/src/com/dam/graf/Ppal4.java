package com.dam.graf;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Ppal4 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField textEntrada;

	public Ppal4() {
		
		configuracionVentana();
	}
	
	private void configuracionVentana() {
		
		setTitle("Actividad 4");
		CrearComponentes();
		
		getContentPane().setBackground(new Color(200,50,50));
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		setSize(500, 500);
	}

	private void CrearComponentes() {
		getContentPane().setLayout(null);
		
		JLabel lblMsg = new JLabel("Introduce un n\u00FAmero de 3 cifras para saber si es capic\u00FAa");
		lblMsg.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMsg.setBounds(34, 30, 331, 14);
		getContentPane().add(lblMsg);
		
		textEntrada = new JTextField();
		textEntrada.setBounds(34, 55, 86, 20);
		getContentPane().add(textEntrada);
		textEntrada.setColumns(10);
		
		JLabel lblRes = new JLabel("");
		lblRes.setBounds(34, 137, 86, 20);
		getContentPane().add(lblRes);
		
		JButton verificar = new JButton("verificar");
		verificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int n = Integer.parseInt(textEntrada.getText());
					StringBuilder nS = new StringBuilder (textEntrada.getText());
					StringBuilder nR = new StringBuilder (textEntrada.getText()).reverse();
					
					if(nS.length() == 3) {
						if(nS.toString().equals(nR.toString())) {
							lblRes.setText("Es capicúa");
						}else {
							lblRes.setText("No es capicúa");
						}
					}else {
						throw new Exception("Introduce un número entero de tres cifras");
					}
				}catch(NumberFormatException x) {
					lblRes.setBounds(34, 137, 250, 20);
					lblRes.setText("Introduce un número entero de tres cifras");
				}
				catch(Exception x) {
					lblRes.setBounds(34, 137, 250, 20);
					lblRes.setText(x.getMessage());
				}
			}
		});
		verificar.setBounds(31, 86, 89, 23);
		getContentPane().add(verificar);
		
		
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
}
