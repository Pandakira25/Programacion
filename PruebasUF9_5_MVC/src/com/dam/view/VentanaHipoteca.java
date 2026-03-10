package com.dam.view;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.dam.control.ControladorHipoteca;
import com.dam.model.DatosHipoteca;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class VentanaHipoteca extends JFrame implements IVentanaHipoteca {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textCantidad;
	private JTextField textAnios;
	private JTextField textIntereses;
	private JButton btnCalcularC;
	private JLabel lblRes;
	private static final double LIM_SUP_CANTIDAD = 20000000;
	private static final double LIM_INF_CANTIDAD = 0;
	private static final int LIM_SUP_ANIOS = 50;
	private static final int LIM_INF_ANIOS = 0;
	private static final double LIM_SUP_INTERESES = 15;
	private static final double LIM_INF_INTERESES = 0;

	public VentanaHipoteca() {
		configurarVentana();
		crearComponentes();
		
	}
	
	public void configurarVentana() {
		// TODO Auto-generated method stub
		setTitle("Cálculo de la cuota mensual de una hipoteca");
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		setSize(500,200);
		
		//Provisional
		setLocationRelativeTo(null);
	}
	
	public void crearComponentes() {
		// TODO Auto-generated method stub
		getContentPane().setLayout(null);
		
		textCantidad = new JTextField();
		textCantidad.setBounds(66, 21, 86, 20);
		getContentPane().add(textCantidad);
		textCantidad.setColumns(10);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 24, 46, 14);
		getContentPane().add(lblCantidad);
		
		JLabel lblAnios = new JLabel("A\u00F1os");
		lblAnios.setBounds(172, 24, 46, 14);
		getContentPane().add(lblAnios);
		
		textAnios = new JTextField();
		textAnios.setBounds(206, 21, 46, 20);
		getContentPane().add(textAnios);
		textAnios.setColumns(10);
		
		JLabel lblIntereses = new JLabel("Intereses");
		lblIntereses.setBounds(272, 24, 46, 14);
		getContentPane().add(lblIntereses);
		
		textIntereses = new JTextField();
		textIntereses.setBounds(328, 21, 51, 20);
		getContentPane().add(textIntereses);
		textIntereses.setColumns(10);
		
		btnCalcularC = new JButton("Calcular Cuota");
		btnCalcularC.setBounds(182, 49, 117, 23);
		getContentPane().add(btnCalcularC);
		
		lblRes = new JLabel("");
		lblRes.setHorizontalAlignment(SwingConstants.CENTER);
		lblRes.setBounds(106, 94, 280, 14);
		getContentPane().add(lblRes);
	}
	
	public void setControlador(ControladorHipoteca ch) {
		// TODO Auto-generated method stub
		btnCalcularC.addActionListener(ch);
	}


	
	public DatosHipoteca getDatosHipoteca() {
		DatosHipoteca dh = null;
		
		String Scantidad = textCantidad.getText();
		String Sanios = textAnios.getText();
		String Sintereses = textIntereses.getText();
		
		try {
			double cantidad = Double.parseDouble(Scantidad);
			int anios = Integer.parseInt(Sanios);
			double intereses = Double.parseDouble(Sintereses);
			
			if(cantidad <= LIM_INF_CANTIDAD || cantidad > LIM_SUP_CANTIDAD ) {
				throw new Exception("La cantidad debe ser un valor entre " + LIM_INF_CANTIDAD + " y " + LIM_SUP_CANTIDAD);
			}else if(anios <= LIM_INF_ANIOS || anios > LIM_SUP_ANIOS){
				throw new Exception("La cantidad debe ser un valor entre " + LIM_INF_ANIOS + " y " + LIM_SUP_ANIOS);
			}else if(intereses <= LIM_INF_INTERESES || intereses > LIM_SUP_INTERESES) {
				throw new Exception("La cantidad debe ser un valor entre " + LIM_INF_INTERESES + " y " + LIM_SUP_INTERESES);
			}else {
				dh = new DatosHipoteca(cantidad, anios, intereses);
			}
			
		}catch (NumberFormatException e) {
			showMsg(lblRes,"Dato introducido incorrecto");
		}catch (Exception e) {
			showMsg(lblRes,e.getMessage());
		}
		
		return dh;
	}
	
	private void showMsg(JLabel lbl, String msg) {
		lbl.setText("Error: " + msg);
		lbl.setForeground(Color.RED);
	}

	public void hacerVisible() {
		setVisible(true);
	}

	public void mostrarCuota(Double cuotaM) {
		lblRes.setText("La cuota mensual es: " + cuotaM);
		lblRes.setForeground(Color.CYAN);
	}
}
