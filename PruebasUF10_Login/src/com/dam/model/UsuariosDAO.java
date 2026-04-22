package com.dam.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//clase para manejar la informacion de la tabla USUARIOS

public class UsuariosDAO {

	static final String NOM_TABLA = "USUARIOS";
	static final String COL_USUARIO = "USUARIO";
	static final String COL_PWD = "PASSWORD";
	
	private AccessDBProp acc;
	
	public UsuariosDAO() {
		acc = new AccessDBProp();
	}
	
	public String consultarPassword(String usuario) {
		String pwd = null;
		
		String sentencia = "SELECT " + COL_PWD + " FROM " + NOM_TABLA + " WHERE " + COL_USUARIO  + " = ?";
		
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rslt = null;
		
		try {
			con = acc.getConnection();
			
			stmt = con.prepareStatement(sentencia);
			
			stmt.setString(1,usuario);
			
			rslt = stmt.executeQuery();
			
			if(rslt.next()) {
				pwd = rslt.getString(COL_PWD);
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error en la comunicacion con la bd");
		}finally{
			try {
				if(rslt != null) rslt.close();
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return pwd;
	}
}


//TODO metodo de update
