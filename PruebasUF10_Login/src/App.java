import java.awt.EventQueue;

import com.dam.control.Ctrl;
import com.dam.view.VLogin;
import com.dam.view.VPrincipal;
import com.dam.view.VRegistro;

public class App 
{
    public static void main( String[] args )
    {
       EventQueue.invokeLater(new Runnable() {
		
		@Override
		public void run() {
			VLogin v = new VLogin();
			VPrincipal vp = new VPrincipal();
			
			VRegistro vr = new VRegistro();
			
			vr.showWindow();
			
			v.showWindow();
			
			Ctrl c = new Ctrl(v,vp);
			
			v.setCtrl(c);
		}
	});
    	
    	
    }
}
