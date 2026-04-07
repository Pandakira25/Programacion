package com.dam.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//clase para manejar la informacion de la tabla TablaPrueba

public class TablaPruebaPersistencia {

	static final String NOM_TABLA = "TablaPrueba";
	static final String COL_ID = "ID";
	static final String COL_DESC = "Descripcion";
	
	private AccessDBProp acc;
	
	public TablaPruebaPersistencia() {
		acc = new AccessDBProp();
	}
	
	public ArrayList<RegTablaPrueba> realizarSelect() {
		//sentencia que queremos ejecutar: select * from TablaPrueba;
		ArrayList<RegTablaPrueba> listaReg = new ArrayList<RegTablaPrueba>();
		
		String sentencia = "select " + COL_ID + "," + COL_DESC + " from " + NOM_TABLA;
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rslt = null;
		
		//1. Establecer la conexion
		try {
			con = acc.getConnection();
			
			//2. Crear el statement, el objeto que nos permitira ejecutar una sentencia sql
			stmt = con.createStatement();
			
			//3.Ejecutar sentencia, como es un selec usamos excecuteQuery que devuelve un ResultSet
			//ResultSet es una "coleccion" que contiene los registros resultado de la select
			rslt = stmt.executeQuery(sentencia);
			
			//4.Obtener los datos recorriendo el resultSet
			int id;
			String desc;
			while(rslt.next()) {
				//id = rslt.getInt(1); //Posicion que ocupa la columna en la sentencia
				id = rslt.getInt(COL_ID); 
				
				//desc = rslt.getString(2);
				desc = rslt.getString(COL_DESC);
				
				//5.Guardar los datos en por ejemplo un arrayList
				listaReg.add(new RegTablaPrueba(id, desc));
			}
			
			//6. Liberar recursos con un finally
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error: se ha producido un error al establecer la conexion con la base de datos");
		}finally {
			try {
				if(rslt != null) rslt.close();
				if(stmt != null) stmt.close();
				if(con != null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return listaReg;
	}
	
	public RegTablaPrueba realizarSelectId(int id) {
		String sentencia = "select " + COL_ID + "," + COL_DESC + " from " + NOM_TABLA + " where " + COL_ID + " = ?";

		//String sentencia2 = "select " + COL_ID + " from " + NOM_TABLA + " where " + COL_ID + " like ?";
		
		Connection con = null;
		PreparedStatement pstmt = null; //Usamos prepare statemnt por que nuestra sentencia depende del valor que venga como parámeto y por esta razon contendrá interrogaciones
		ResultSet rslt = null;
		
		RegTablaPrueba reg = null;
		
		try {
			con = acc.getConnection();
			
			pstmt = con.prepareStatement(sentencia);
			
			//2.1 Completar/configurar la sentencia
			pstmt.setInt(1, id); //Interrogacion por ejemplo para la descripcion pstmt.setString(2,desc)
			
			//si tenemos like ? pstmt.setString(2,desc + "%") filtrado por contener lo que nos llega por parámetro
			
			rslt = pstmt.executeQuery();
			
			if(rslt.next()) {
				reg = new RegTablaPrueba(rslt.getInt(1),rslt.getString(2));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rslt != null) rslt.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(SQLException e) {
				e.getStackTrace();
			}
		}
		
		return reg;
	}
	
	//Metodo para insertar un registro en la tabla 
	public int realizarInsert(RegTablaPrueba reg) {
		String sentencia = "insert into " + NOM_TABLA + " ("+COL_DESC+") values (?)";
		int result = 0;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = acc.getConnection();
			
			pstmt = con.prepareStatement(sentencia);
			
			//2.1 Completar/configurar la sentencia
			pstmt.setString(1, reg.getDesc());
			
			
			 result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(SQLException e) {
				e.getStackTrace();
			}
		}
		return result;
	}

}

//TODO metodo de update
