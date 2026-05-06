package com.dam.ctrl;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import com.dam.model.TablaRestaurantesDAO;
import com.dam.view.VConsRes;
import com.dam.view.VModRes;
import com.dam.view.VPrincipal;
import com.dam.view.VRegRes;

public class Ctrl implements ActionListener {

	private VPrincipal vp;
	private VRegRes vr;
	private VModRes vm;
	private VConsRes vc;
	private TablaRestaurantesDAO tr = new TablaRestaurantesDAO();

	private static final String MN_SALIR = VPrincipal.MN_SALIR;
	private static final String MN_MOD_RES = VPrincipal.MN_MOD_RES;
	private static final String MN_REG_RES = VPrincipal.MN_REG_RES;
	private static final String MN_CON_RES = VPrincipal.MN_CON_RES;

	public static final String BTN_CONS = VConsRes.BTN_CONS;
	public static final String BNT_DELL = VConsRes.BNT_DELL;

	public static final String BTN_SAVE_D_R = VRegRes.BTN_SAVE_D;
	public static final String BTN_WIPE_D = VRegRes.BTN_WIPE_D;

	public static final String BTN_SAVE_D_M = VModRes.BTN_SAVE_D;
	public static final String BTN_CANCEL = VModRes.BTN_CANCEL;
	public static final String BTN_SEARCH = VModRes.BTN_SEARCH;

	public Ctrl(VPrincipal vp, VRegRes vr, VModRes vm, VConsRes vc) {
		this.vp = vp;
		this.vr = vr;
		this.vm = vm;
		this.vc = vc;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String ac = e.getActionCommand();

		if (e.getSource() instanceof JMenuItem) {

			switch (ac) {
			case MN_SALIR:
				System.out.println(ac);
				int respuesta = JOptionPane.showConfirmDialog(vp, "Va a cerrar la aplicación ¿Desea continuar?",
						"Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

				if (respuesta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
				break;
			case MN_CON_RES:
				System.out.println(ac);
				// System.out.println(tr.getRegiones());
				vp.runPanel(vc);
				vc.cmb(tr);
				vc.hideComp();
				break;
			case MN_REG_RES:
				vp.runPanel(vr);

				break;
			case MN_MOD_RES:
				vp.runPanel(vm);
				break;
			}
		} else if (e.getSource() instanceof JButton) {
			// System.out.println(ac);
			
			Component source = (Component)e.getSource();
			Container srcC = source.getParent();
			
			if(srcC.getName() == VConsRes.NAME) {
				switch (ac) {
				case BTN_CONS:
					// System.out.println(BTN_CONS);
					vc.showComp();
					// System.out.println(vc.getConsulta()[0]+ " " + vc.getConsulta()[1]);
					vc.chargeTable(tr.getConsulta(vc.getConsulta()[0], vc.getConsulta()[1]));
					break;
					
				case BNT_DELL:
					if (vc.deleteRest() == null) {
						JOptionPane.showMessageDialog(vc, "Debe seleccionar el registro a eliminar", "Error",
								JOptionPane.ERROR_MESSAGE);
					} else {
						int respuesta = JOptionPane.showConfirmDialog(vc,
								"Se va a eliminar el registro seleccionado ¿Desea continuar?", "Confirmación",
								JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

						if (respuesta == JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(vc, tr.deleteRest(vc.deleteRest()), "Error",
									JOptionPane.INFORMATION_MESSAGE);
							vc.chargeTable(tr.getConsulta(vc.getConsulta()[0], vc.getConsulta()[1]));
						}
					}
					break;
				}
			}else if(srcC.getName() == VRegRes.NAME) {
				switch(ac) {
				case BTN_SAVE_D_R:
					if(vr.getRest() != null) {
						//TODO: Hacer el insert del DAO
						JOptionPane.showMessageDialog(vr, "Se ha registrado el restaurante con éxito", "Resultado de la operación", JOptionPane.INFORMATION_MESSAGE);
					}else {
						//TODO ver lo que retorna los campos vacíos y decidir si hacer un constructor sin los campos que no tienen verificación.
					}
					
					break;
					
				case BTN_WIPE_D:
					vr.clearD();
					break;
				}
				
			}else if(srcC.getName() == VModRes.NAME) {
				switch(ac) {
				case BTN_SAVE_D_M:
					break;
					
				case BTN_CANCEL:
					break;
					
				case BTN_SEARCH:
					break;
				}
			}
		}
	}

}
