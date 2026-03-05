import java.awt.EventQueue;
import com.dam.control.Ecuacion2GListener;
import com.dam.view.VEcuacion2G;

public class Ejercicio3_Ecuacion {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				VEcuacion2G v = new VEcuacion2G();
				
				Ecuacion2GListener e2gl = new Ecuacion2GListener(v);
				
				v.setListener(e2gl);
				v.hacerVisible();
			}
		});
	}

}
