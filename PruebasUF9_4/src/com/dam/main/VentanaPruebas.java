package com.dam.main;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.WindowConstants;

import com.dam.control.ControladorP;
import com.dam.model.Alumno;
import javax.swing.JButton;



public class VentanaPruebas extends JFrame implements IVentanasPruebas{
	private static final int ANCHO = 1000;
	private static final int ALTO = 800;
	private JComboBox <Alumno> cmbAlumnos;
	private DefaultComboBoxModel<Alumno> dcbmAlumnos;
	private JButton btnComprobarContenido;
	private JTextArea taComentarios;
	private JComboBox<String> cmbDias;

	public VentanaPruebas() {
		configurarVentana();
		
		crearComponentes();
	}

	@Override
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

	}

	@Override
	public void crearComponentes() {
		getContentPane().setLayout(null);
		
		
		JScrollPane scrpTextArea = new JScrollPane();
		scrpTextArea.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrpTextArea.setBounds(54, 42, 888, 104);
		getContentPane().add(scrpTextArea);
		
		taComentarios = new JTextArea();
		taComentarios.setLineWrap(true);
		taComentarios.setEditable(false);//Para que no sea editable la caja de texto
		scrpTextArea.setViewportView(taComentarios);
		
		cmbDias = new JComboBox<String>();
		// se asigna el listado de datos que se van a mostrar
		String dias[] = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
		//Cuando queramos cargar un comboBox desde fuera de la ventana necesitaremos hacer variable global o atributo al default comboBoxModel
		DefaultComboBoxModel<String>dcbm = new DefaultComboBoxModel<String>(dias);
		cmbDias.setModel(dcbm);
		
		cmbDias.setBounds(54, 183, 133, 22);
		getContentPane().add(cmbDias);
		
		cmbAlumnos = new JComboBox<Alumno>();
		cmbAlumnos.setBounds(54, 251, 133, 22);
		getContentPane().add(cmbAlumnos);
		
		dcbmAlumnos = new DefaultComboBoxModel<Alumno>();
		cmbAlumnos.setModel(dcbmAlumnos);
		
		btnComprobarContenido = new JButton("ComprobarContenido");
		btnComprobarContenido.setBounds(54, 310, 151, 23);
		getContentPane().add(btnComprobarContenido);

	}
	
	public void cargarCmbAlumnos(ArrayList <Alumno> listaAlumnos) {
		dcbmAlumnos.addAll(listaAlumnos);
	}

	@Override
	public void hacerVisible() {
		setVisible(true);
	}

	public void setControlador(ControladorP control) {
		btnComprobarContenido.addActionListener(control);
	}

	public String obtenerDatos() {
		// recuperar los datos introducidos o seleccionados en la ventana
		
		String datos = " ** Datos introducidos ** ";
		
		//Cómo recuperamos el valor seleccionado en un combo
		//1.Recuperando el elemento seleccionado
		String diaSel = (String) cmbDias.getSelectedItem();
		datos += "\n\nDá seleccionado: " + diaSel;
		//2.Recuperando el indice del elemento seleccionado
		int iAS = cmbAlumnos.getSelectedIndex();
		if(iAS == -1) {
			datos += "\n\tNo se ha seleccionado ningún alumno";
		}else {
			Alumno alumnoSel = (Alumno)cmbAlumnos.getSelectedItem();
			datos += "\n\tAlumno seleccionado: " + alumnoSel;
		}
		
		return datos;
	}

	public void mostrarDatos(String datos) {
		taComentarios.setText(datos);
	}
}
