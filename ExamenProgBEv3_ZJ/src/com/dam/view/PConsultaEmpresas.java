package com.dam.view;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import com.dam.control.ControladorEmpresas;
import com.dam.model.datos.Empresa;
import com.dam.model.datos.Textos;

public class PConsultaEmpresas extends JPanel implements IPaneles {
	public static final String NAME = "PConsultaEmpresas";

	private static final int ANCHO = VPEmpresas.ANCHO - VPEmpresas.insetsL - VPEmpresas.insetsR;
	private static final int ALTO = VPEmpresas.ALTO - VPEmpresas.insetsT - VPEmpresas.insetsB - VPEmpresas.menuH;

	private JTextField txtCIF;
	private JTextField txtRazon;
	private JButton btnBuscar;
	private JLabel lblListado;
	private JScrollPane scrpEmpresas;
	private JTable tblEmpresas;
	private DefaultTableModel tModel;
	private JButton btnEliminar;
	private JButton btnModificar;

	public PConsultaEmpresas() {
		setSize(ANCHO, ALTO);
		setName(NAME);
		crearComponentes();
	}

	@Override
	public void crearComponentes() {
		setLayout(null);

		JLabel lblConsulta = new JLabel(Textos.LBL_TIT_CONSULTA);
		lblConsulta.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblConsulta.setBounds(20, 15, 300, 20);
		add(lblConsulta);

		JLabel lblCIF = new JLabel(Textos.LBL_CIF_F);
		lblCIF.setBounds(30, 55, 60, 20);
		add(lblCIF);

		txtCIF = new JTextField();
		txtCIF.setBounds(120, 53, 150, 24);
		add(txtCIF);
		txtCIF.setColumns(10);

		JLabel lblRazon = new JLabel(Textos.LBL_RAZON_F);
		lblRazon.setBounds(30, 95, 100, 20);
		add(lblRazon);

		txtRazon = new JTextField();
		txtRazon.setBounds(150, 93, 270, 24);
		add(txtRazon);
		txtRazon.setColumns(10);

		btnBuscar = new JButton(Textos.BTN_BUSCAR);
		btnBuscar.setBounds(400, 135, 150, 24);
		add(btnBuscar);

		lblListado = new JLabel(Textos.LBL_LISTADO);
		lblListado.setVisible(false);
		lblListado.setBounds(30, 137, 218, 20);
		add(lblListado);

		scrpEmpresas = new JScrollPane();
		scrpEmpresas.setVisible(false);
		scrpEmpresas.setBounds(30, 175, 520, 175);
		add(scrpEmpresas);

		tblEmpresas = new JTable();
		tblEmpresas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tblEmpresas.setBounds(0, 0, 1, 1);
		scrpEmpresas.setViewportView(tblEmpresas);

		configurarTabla();

		btnEliminar = new JButton(Textos.BTN_ELIMINAR);
		btnEliminar.setBounds(400, 365, 150, 24);
		btnEliminar.setVisible(false);
		btnEliminar.setEnabled(false);
		add(btnEliminar);

		btnModificar = new JButton(Textos.BTN_MODIFICAR);
		btnModificar.setBounds(30, 365, 150, 24);
		btnModificar.setVisible(false);
		btnModificar.setEnabled(false);
		add(btnModificar);

	}

	private void configurarTabla() {
		tModel = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		tModel.addColumn(Textos.CLM_CIF);
		tModel.addColumn(Textos.CLM_RAZON_SOCIAL);
		tModel.addColumn(Textos.CLM_REPRE_LEGAL);
		tModel.addColumn(Textos.CLM_CONVENIO);

		tblEmpresas.setModel(tModel);

		tblEmpresas.getColumn(Textos.CLM_CIF).setPreferredWidth(60);
		tblEmpresas.getColumn(Textos.CLM_RAZON_SOCIAL).setPreferredWidth(120);
		tblEmpresas.getColumn(Textos.CLM_REPRE_LEGAL).setPreferredWidth(220);
		tblEmpresas.getColumn(Textos.CLM_CONVENIO).setPreferredWidth(60);

	}

	public void cargarTabla(ArrayList<Empresa> listaEmpresas) {
		tblEmpresas.clearSelection();
		tModel.getDataVector().clear();

		Object[] fila = new Object[5];

		if (listaEmpresas.size() != 0) {
			setVisibleTabla(true);
			for (Empresa e : listaEmpresas) {
				fila[0] = e.getCif();
				fila[1] = e.getRazonSocial();
				fila[2] = e.getRepresentante();
				fila[3] = e.traducirConvenio();
				tModel.addRow(fila);

			}
		} else {
			setVisibleTabla(false);
			mostrarMensaje("No se han encontrado datos para el filtro indicado", "Información de consulta",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public void clearTable() {
		int r = tModel.getRowCount();
		for (int i = 0; i < r; i++) {
			// System.out.println(i);
			tModel.removeRow(0);
		}
	}

	public void setVisibleTabla(boolean b) {
		lblListado.setVisible(b);
		scrpEmpresas.setVisible(b);
		btnEliminar.setVisible(b);
		btnEliminar.setEnabled(b);
		btnModificar.setVisible(b);
		btnModificar.setEnabled(b);

	}

	public String[] getConsulta() {
		String[] consulta = { txtCIF.getText(), txtRazon.getText() };
		return consulta;
	}

	@Override
	public void setControlador(ControladorEmpresas control) {
		btnBuscar.addActionListener(control);
		btnEliminar.addActionListener(control);
		btnModificar.addActionListener(control);

	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public String getTextoTxtCIF() {
		return txtCIF.getText();
	}

	public String getTextoTxtRazon() {
		return txtRazon.getText();
	}

	public JTable getTblEmpresas() {
		return tblEmpresas;
	}

	public DefaultTableModel gettModel() {
		return tModel;
	}

	public void mostrarMensaje(String mensaje, String titulo, int tipo) {
		JOptionPane.showMessageDialog(this, mensaje, titulo, tipo);

	}

	public int mostrarConfirmacion(String mensaje, String titulo, int tipo) {
		return JOptionPane.showConfirmDialog(this, mensaje, titulo, JOptionPane.YES_NO_OPTION, tipo);

	}
	
	public String getCifSelected() {
		if(tblEmpresas.getSelectedRow() < 0) {
			return null;
		}else {
			return (String) tblEmpresas.getValueAt(tblEmpresas.getSelectedRow(), 0);
		}
	}
}
