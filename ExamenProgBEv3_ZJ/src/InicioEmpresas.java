import java.awt.EventQueue;

import com.dam.control.ControladorEmpresas;
import com.dam.view.PConsultaEmpresas;
import com.dam.view.PModificarEmpresa;
import com.dam.view.PRegistrarEmpresa;
import com.dam.view.VPEmpresas;

public class InicioEmpresas {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				VPEmpresas vpe = new VPEmpresas();
				PRegistrarEmpresa pr = new PRegistrarEmpresa();
				PModificarEmpresa pm = new PModificarEmpresa();
				PConsultaEmpresas pc = new PConsultaEmpresas();
				
				ControladorEmpresas ctrl = new ControladorEmpresas(vpe,pr,pm,pc);
				
				vpe.hacerVisible();
				vpe.setControlador(ctrl);
				pr.setControlador(ctrl);
				pm.setControlador(ctrl);
				pc.setControlador(ctrl);
			}
		});

	}
}
