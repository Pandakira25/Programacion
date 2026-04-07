

import java.sql.Connection;
import java.sql.SQLException;

import com.dam.model.AccessDBProp;

/**
 * Try the connection with db;
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AccessDBProp access = new AccessDBProp();
        try {
        	Connection con = access.getConnection();
        	
        	System.out.println("Conexión establecida");
        	
        	con.close();
        	
        	System.out.println("Conexión cerrada");
        }catch(ClassNotFoundException e) {
        	System.out.println("El driver no es correcto");
        }catch(SQLException e) {
        	System.out.println("La url no es correcta o hay algún problema con la base de datos");
        }
    }
}
