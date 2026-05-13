package com.dam.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//clase para manejar la informacion de la tabla TablaPrueba

public class TablaRestaurantesDAO {

	static final String NOM_TABLA = "RESTAURANTES";
	static final String COL_ID = "ID";
	static final String COL_NOM = "NOMBRE";
	static final String COL_REG = "REGION";
	static final String COL_CIUDAD = "CIUDAD";
	static final String COL_DISTINCION = "DISTINCION";
	static final String COL_DIRECCION = "DIRECCION";
	static final String COL_PRECIO_MIN = "PRECIO_MIN";
	static final String COL_PRECIO_MAX = "PRECIO_MAX";
	static final String COL_COCINA = "COCINA";
	static final String COL_TELEFONO = "TELEFONO";
	static final String COL_WEB = "WEB";
	
	private AccessDBProp acc;
	
	public TablaRestaurantesDAO() {
		acc = new AccessDBProp();
	}
	
	/*TODO: - Voy a necesitar un select general y uno que sea específico recibiendo el prametro del where; en ambos casos que me devuelvan un arrayList de resturantes
	 * 		- Delete recibiendo un restaurante
	 * 		- Modificar recibiendo dos restaurantes, uno que es el original y otro que sea el modificado
	 *      - La profe quiere que saquemos las regiones y eso de la bd */ 
	
	public ArrayList<String> getRegiones(){
		ArrayList<String> regiones = new ArrayList<String>();
		regiones.add("TODAS");
		
		String sen = "SELECT DISTINCT " + COL_REG + " FROM " + NOM_TABLA;
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rslt = null;
		
		try {
			con = acc.getConnection();
			
			stmt = con.createStatement();
			
			rslt = stmt.executeQuery(sen);
			
			while(rslt.next()) {
				regiones.add(rslt.getString(1));
			}
			
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
		
		return regiones;
	}
	
	public ArrayList<Restaurante> getConsulta(String region, String estrellas){
		ArrayList<Restaurante> rest = new ArrayList<Restaurante>();
		
		String sen = "SELECT * FROM " + NOM_TABLA;
		
		if(region != "TODAS" && estrellas != "TODAS") {
			sen += " WHERE " + COL_REG + " LIKE ? AND " + COL_DISTINCION + " LIKE ?";
		}else if(region == "TODAS" && estrellas != "TODAS") {
			sen += " WHERE " + COL_DISTINCION + " LIKE ?";
		}else if(region != "TODAS" && estrellas == "TODAS") {
			sen += " WHERE " + COL_REG + " LIKE ? ";
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rslt = null;
		
		try {
			con = acc.getConnection();
			
			pstmt = con.prepareStatement(sen);
			
			if(region != "TODAS" && estrellas != "TODAS") {
				pstmt.setString(1, region);
				pstmt.setString(2, estrellas);
			}else if(region == "TODAS" && estrellas != "TODAS") {
				pstmt.setString(1, estrellas);
			}else if(region != "TODAS" && estrellas == "TODAS") {
				pstmt.setString(1, region);
			}
			
			rslt = pstmt.executeQuery();
			
			while(rslt.next()) {
				rest.add(new Restaurante(rslt.getInt(COL_ID), rslt.getString(COL_NOM), rslt.getString(COL_REG), rslt.getString(COL_CIUDAD), rslt.getInt(COL_DISTINCION), rslt.getString(COL_DIRECCION), rslt.getDouble(COL_PRECIO_MIN), rslt.getDouble(COL_PRECIO_MAX), rslt.getString(COL_COCINA), rslt.getString(COL_TELEFONO), rslt.getString(COL_WEB)));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error: se ha producido un error al establecer la conexion con la base de datos");
		}finally {
			try {
				if(rslt != null) rslt.close();
				if(pstmt != null) pstmt.close();
				if(con != null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return rest;
	}
	
	public String deleteRest(String nombre) {
		
		String sen = "DELETE FROM " + NOM_TABLA + " WHERE nombre = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = acc.getConnection();
			
			pstmt = con.prepareStatement(sen);
			
			pstmt.setString(1, nombre);
			
			int f = pstmt.executeUpdate();
			
			if (f > 0) {
				return "Se ha eliminado el restaurante con exito";
			}else {
				return "Algo malo ocurrió";
			}
		}catch(Exception e) {
			e.printStackTrace();
			return "Error: se ha producido un error al establecer la conexion con la base de datos";
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public int insertRest(Restaurante rest) {
		String sen = "INSERT INTO " + NOM_TABLA + "(" + COL_NOM + "," + COL_REG + "," + COL_CIUDAD + "," + COL_DISTINCION + "," + COL_DIRECCION + "," + COL_PRECIO_MIN + "," + COL_PRECIO_MAX + "," + COL_COCINA + "," + COL_TELEFONO + "," + COL_WEB + ") VALUES(?,?,?,?,?,?,?,?,?,?) ";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = acc.getConnection();
			
			pstmt = con.prepareStatement(sen);
			
			pstmt.setString(1, rest.getNombre());
			pstmt.setString(2, rest.getRegion());
			pstmt.setString(3, rest.getCiudad());
			pstmt.setInt(4, rest.getDistincion());
			pstmt.setString(5, rest.getDireccion());
			pstmt.setDouble(6, rest.getPrecioMin());
			pstmt.setDouble(7, rest.getPrecioMax());
			pstmt.setString(8, rest.getCocina());
			pstmt.setString(9, rest.getTelefono());
			pstmt.setString(10, rest.getWeb());
			
			int f = pstmt.executeUpdate();
			
			return f;
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Restaurante searchRest(String nombre) {
		
		return null;
	}
}
