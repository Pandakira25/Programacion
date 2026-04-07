import java.util.ArrayList;

import com.dam.model.RegTablaPrueba;
import com.dam.model.TablaPruebaPersistencia;

public class App 
{
    public static void main( String[] args )
    {
       //Consultar contenido de la tabla TablaPrueba
    	TablaPruebaPersistencia tpp = new TablaPruebaPersistencia();
    	
    	ArrayList<RegTablaPrueba> listaReg = tpp.realizarSelect();
    	
    	for(RegTablaPrueba regTablaPrueba : listaReg) {
    		System.out.println(regTablaPrueba);
    	}
    	
    	String desc = "bitch?";
    	
    	/*RegTablaPrueba regInsert = new RegTablaPrueba(desc);
    	
    	int result = tpp.realizarInsert(regInsert);
    	
    	if(result == 1) System.out.println("insert exitoso");*/
    	
    	//Queremos consultar un registro filtrando por el id
    	int id = 5;
    	RegTablaPrueba reg = tpp.realizarSelectId(id);
    	
    	System.out.println("\n" + reg);
    	
    	
    }
}
