package com.dam.control;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import com.dam.model.datos.Empresa;
import com.dam.model.datos.Textos;
import com.dam.model.db.EmpresasDAO;
import com.dam.view.PConsultaEmpresas;
import com.dam.view.PModificarEmpresa;
import com.dam.view.PRegistrarEmpresa;
import com.dam.view.VPEmpresas;

public class ControladorEmpresas implements ActionListener {

	VPEmpresas vpe;
	PRegistrarEmpresa pr;
	PModificarEmpresa pm;
	PConsultaEmpresas pc;

	EmpresasDAO edao = new EmpresasDAO();

	public ControladorEmpresas(VPEmpresas vpe, PRegistrarEmpresa pr, PModificarEmpresa pm, PConsultaEmpresas pc) {
		this.vpe = vpe;
		this.pr = pr;
		this.pm = pm;
		this.pc = pc;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String ac = e.getActionCommand();
		/*
		 * TODO: implementar lo necesario para que funcione la aplicación Si se pulsa la
		 * opción de menú de Registrar --> se cargará el panel de registro Si se pulsa
		 * la opción de menú de Consultar --> se cargará el panel de consulta Si se
		 * pulsa el botón guardar del panel de registro --> invocar a registrar Si se
		 * pulsa el botón cancelar del panel de registro --> se limpiarán los campos del
		 * panel de registro Si se pulsa el botón buscar del panel de consulta -->
		 * invocar a buscar Si se pulsa el botón eliminar del panel de consulta -->
		 * invocar a eliminar Si se pulsa el botón modificar del panel de consulta -->
		 * invocar a abrirModificar Si se pulsa el botón guardar del panel de
		 * modificación --> invocar a modificar Si se pulsa el botón cancelar del panel
		 * de modificación --> invocar a buscar y cargar el panel de consulta
		 */
		if (e.getSource() instanceof JMenuItem) {
			switch (ac) {
			case Textos.MNTM_REGISTRAR:
				vpe.cargarPanel(pr);
				break;
			case Textos.MNTM_CONSULTAR:
				vpe.cargarPanel(pc);
				break; 
			}

		} else if (e.getSource() instanceof JButton) {
			Component source = (Component)e.getSource();
			Container srcC = source.getParent();
			
			if(srcC.getName().equals(PConsultaEmpresas.NAME)) {
				switch (ac) {
				case Textos.BTN_BUSCAR:
					buscar();
					break;
				case Textos.BTN_ELIMINAR:
					eliminar();
					break;
				case Textos.BTN_MODIFICAR:
					abrirModificar();
				}
			}else if(srcC.getName().equals(PModificarEmpresa.NAME)) {
				switch(ac) {
				case Textos.BTN_GUARDAR:
					//System.out.println("guardar de modificar");
					//Me dio pereza hacer las validaciones
					break;
				case Textos.BTN_CANCELAR:
					vpe.cargarPanel(pc);
					break;
				}
				
			}else if(srcC.getName().equals(PRegistrarEmpresa.NAME)) {
				switch(ac) {
				case Textos.BTN_GUARDAR:
					//System.out.println("guardar de registro");
					registrar();
					break;
				case Textos.BTN_CANCELAR:
					pr.limpiarDatos();
					break;
				}
			}
		}
	}

	private void modificar() {
		/*
		 * TODO: Obtener datos de la empresa del panel de modificación Si los datos son
		 * válidos realizar un update en la base de datos de los datos de la empresa por
		 * cif dar feedback al usuario de cómo ha ido la operación
		 */
	}

	private void abrirModificar() {
		if(pc.getCifSelected() != null) {
			vpe.cargarPanel(pm);
			pm.cargarDatos(edao.getEmpresaByCIF(pc.getCifSelected()));
		}else {
			pc.mostrarMensaje("Debe seleccionar una entrada", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void eliminar() {
		/*
		 * TODO: Si hay un registro seleccionado en la tabla Confirmar que desea
		 * continuar con el borrado Obtener el valor del model que ocupa la fila
		 * seleccionada y la columna 0, que corresponderá al cif eliminar de la base de
		 * datos los datos de la empresa por su cif dar feedback al usuario de cómo ha
		 * ido la operación
		 */
		if(pc.getCifSelected() != null) {
			int respuesta = JOptionPane.showConfirmDialog(pc, "¿Está seguro de que desea eliminar?",
					"Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

			if (respuesta == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(pc, edao.deleteEmpresa(pc.getCifSelected()), "Resultado de la operación", JOptionPane.INFORMATION_MESSAGE);
				pc.cargarTabla(edao.getAll());
			}
		}else {
			pc.mostrarMensaje("Debe seleccionar una entrada", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void buscar() {
		pc.cargarTabla(edao.getConsulta(pc.getConsulta()));
	}

	private void registrar() {
		/*
		 * TODO: Obtener datos validados de la empresa del panel de registro Si los
		 * datos son válidos realizar un insert en la base de datos de los datos de la
		 * empresa dar feedback al usuario de cómo ha ido la operación Si la operación
		 * ha tenido éxito se limpiarán los componentes.
		 */
		if(pr.obtenerDatos() == null) {
			JOptionPane.showMessageDialog(pr, "Uno de los datos no es válido", "Error", JOptionPane.ERROR_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(pr, edao.insertEmpresa(pr.obtenerDatos()),"Resultado de la operación", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
