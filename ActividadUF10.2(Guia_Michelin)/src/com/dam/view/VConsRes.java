package com.dam.view;

import javax.swing.JPanel;

import com.dam.ctrl.Ctrl;
import com.dam.model.Restaurante;
import com.dam.model.TablaRestaurantesDAO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class VConsRes extends JPanel implements IPanels{
	
	private static final int WIDTH = VPrincipal.WIDTH - VPrincipal.insetsL - VPrincipal.insetsR;
	private static final int HEIGHT = VPrincipal.HEIGHT - VPrincipal.insetsT - VPrincipal.insetsB - VPrincipal.menuH;
	
	public static final String BTN_CONS = "Consultar";
	public static final String BNT_DELL = "Eliminar";
	
	private JTable tblRest;
	private JComboBox<String> cmbRegion;
	private JComboBox<String> cmbDis;
	private JButton btnCons;
	private JButton btnDell;
	private JLabel lblListRes;
	private DefaultComboBoxModel<String> dfcmb;
	private DefaultTableModel dtblR;
	private JScrollPane scrollPane;
	
	
	public VConsRes () {
		setSize(WIDTH,HEIGHT);
		createComp();
	}
	
	@Override
	public void createComp() {
		setLayout(null);
		
		JLabel lblCons = new JLabel("Consulta de Restaurantes");
		lblCons.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCons.setBounds(23, 26, 211, 14);
		add(lblCons);
		
		JLabel lblReg = new JLabel("Región:");
		lblReg.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblReg.setBounds(23, 65, 46, 14);
		add(lblReg);
		
		cmbRegion = new JComboBox<String>();
		cmbRegion.setBounds(79, 62, 85, 22);
		dfcmb = new DefaultComboBoxModel<String>();
		cmbRegion.setModel(dfcmb);
		add(cmbRegion);
		
		JLabel lblDist = new JLabel("Distinción:");
		lblDist.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDist.setBounds(244, 66, 74, 14);
		add(lblDist);
		
		cmbDis = new JComboBox<String>();
		cmbDis.setModel(new DefaultComboBoxModel<String>(new String[] {"TODAS", "1 estrella", "2 estrellas", "3 estrellas"}));
		cmbDis.setBounds(311, 62, 85, 22);
		add(cmbDis);
		
		btnCons = new JButton(BTN_CONS);
		btnCons.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCons.setBounds(452, 62, 89, 23);
		add(btnCons);
		
		lblListRes = new JLabel("Listado de resturantes");
		lblListRes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblListRes.setBounds(23, 112, 129, 14);
		add(lblListRes);
		
		btnDell = new JButton(BNT_DELL);
		btnDell.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDell.setBounds(438, 341, 89, 23);
		add(btnDell);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 137, 504, 195);
		add(scrollPane);
		
		tblRest = new JTable();
		tblRest.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(tblRest);
		
		configurarTabla();
	}
	
	public void showComp() {
		lblListRes.setVisible(true);
		scrollPane.setVisible(true);
		tblRest.setVisible(true);
		btnDell.setVisible(true);
	}
	
	public void hideComp() {
		lblListRes.setVisible(false);
		scrollPane.setVisible(false);
		tblRest.setVisible(false);
		btnDell.setVisible(false);
	}
	
	public String[] getConsulta() {
		String es = "TODAS";
		switch((String)cmbDis.getSelectedItem()) {
		case "1 estrella":
			es = "1";
			break;
		case "2 estrellas":
			es = "2";
			break;
		case "3 estrellas":
			es = "3";
			break;
		}
		
		//System.out.println((String)cmbDis.getSelectedItem() + "  " + (String)cmbRegion.getSelectedItem() + "  es:" + es);
		
		String consulta[] = {(String)cmbRegion.getSelectedItem(), es};
		return consulta;
	}
	
	public void cmb(TablaRestaurantesDAO tr) {
		dfcmb.removeAllElements();
		dfcmb.addAll(tr.getRegiones());
		//System.out.println(tr.getRegiones());
		dfcmb.setSelectedItem(tr.getRegiones().get(0));
	}

	@Override
	public void setCtrl(Ctrl c) {
		btnCons.setActionCommand(BTN_CONS);
		btnCons.addActionListener(c);
		
		btnDell.setActionCommand(BNT_DELL);
		btnDell.addActionListener(c);
		
	}
	
	private void configurarTabla() {
		dtblR = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		tblRest.setModel(dtblR);
		
		dtblR.addColumn("NOMBRE");
		dtblR.addColumn("CIUDAD");
		dtblR.addColumn("DISTINCION");
		dtblR.addColumn("COCINA");
		dtblR.addColumn("PRECIO");
		
		tblRest.getColumn("NOMBRE").setPreferredWidth(25);
		tblRest.getColumn("CIUDAD").setPreferredWidth(25);
		tblRest.getColumn("DISTINCION").setPreferredWidth(25);
		tblRest.getColumn("COCINA").setPreferredWidth(25);
		tblRest.getColumn("PRECIO").setPreferredWidth(25);
	}
	
	public void chargeTable(ArrayList<Restaurante> restaurante) {
		//System.out.println(restaurante + "\n");
		if(restaurante.size() != 0) {
			clearTable();
			Object[] row = new Object[5];
			String dist = "*";
			for(Restaurante rest : restaurante) {
				row[0] = rest.getNombre();
				row[1] = rest.getCiudad();
				dist = "*";
				if(rest.getDistincion() == 2) {
					dist += "*";
				}else if(rest.getDistincion() == 3) {
					dist += "**";
				}
				row[2] = dist;
				row[3] = rest.getCocina();
				String precio = Double.toString(rest.getPrecioMin());
				if(rest.getPrecioMax() > 0) {
					precio += " - " + rest.getPrecioMax();
				}
				row[4] = precio;
				dtblR.addRow(row);
			}
		}else {
			hideComp();
			JOptionPane.showMessageDialog(this, "No se han encontrado items con los filtros seleccionados","Mensaje",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void clearTable() {
		//System.out.println(dtblR.getRowCount());
		int r = dtblR.getRowCount();
		for(int i = 0; i < r; i++) {
			//System.out.println(i);
			dtblR.removeRow(0);
		}
	}

	public String deleteRest() {
		if(tblRest.getSelectedRow() < 0){
			return null;
		}else {
			return (String)tblRest.getValueAt(tblRest.getSelectedRow(), 0);
		}
	}
}
