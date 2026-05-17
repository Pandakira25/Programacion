package com.dam.model.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.dam.model.datos.Empresa;

public class EmpresasDAO {

	private static final String NOM_TAB = "EMPRESAS";
	private static final String COL_CIF = "CIF";
	private static final String COL_RZSL = "RAZON_SOCIAL";
	private static final String COL_DMO = "DOMICILIO";
	private static final String COL_RL = "REPRESENTANTE_LEGAL";
	private static final String COL_CR = "CORREO_RL";
	private static final String COL_CNV = "CONVENIO";
	private static final String COL_NE = "NUM_EMPLEADOS";// int
	private static final String COL_TEL = "TELEFONO";
	private static final String COL_WEB = "WEB";

	private AccesoDB acc;

	public EmpresasDAO() {
		acc = new AccesoDB();
	}
	
	public ArrayList<Empresa> getAll(){
		ArrayList<Empresa> emp = new ArrayList<Empresa>();
		
		String sen = "SELECT * FROM " + NOM_TAB;
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rslt = null;
		
		try {
			con = acc.getConnection();
			
			stmt = con.createStatement();
			
			rslt = stmt.executeQuery(sen);
			
			while(rslt.next()) {
				emp.add(new Empresa(rslt.getString(COL_CIF), rslt.getString(COL_RZSL), rslt.getString(COL_DMO),
						rslt.getString(COL_RL), rslt.getString(COL_CR), rslt.getString(COL_CNV), rslt.getInt(COL_NE),
						rslt.getString(COL_TEL), rslt.getString(COL_WEB)));
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
		
		return emp;
	}

	public ArrayList<Empresa> getConsulta(String[] consulta) {
		ArrayList<Empresa> emp = new ArrayList<Empresa>();
		// consulta[0] = cif
		// consulta[1] = razon social

		String sen = "SELECT * FROM " + NOM_TAB;

		if (!consulta[0].isEmpty() && consulta[1].isEmpty()) {
			sen += " WHERE " + COL_CIF + " like ?";
		} else if (consulta[0].isEmpty() && !consulta[1].isEmpty()) {
			sen += " WHERE " + COL_RZSL + " like ?";
		} else if (!consulta[0].isEmpty() && !consulta[1].isEmpty()) {
			sen += " WHERE " + COL_CIF + " like ? or " + COL_RZSL + " like ?";
		}

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rslt = null;

		try {
			con = acc.getConnection();

			pstmt = con.prepareStatement(sen);

			if (!consulta[0].isEmpty() && consulta[1].isEmpty()) {
				pstmt.setString(1, consulta[0]);
			} else if (consulta[0].isEmpty() && !consulta[1].isEmpty()) {
				pstmt.setString(1, consulta[1] + "%");
			} else if (!consulta[0].isEmpty() && !consulta[1].isEmpty()) {
				pstmt.setString(1, consulta[0]);
				pstmt.setString(2, consulta[1] + "%");
			}

			rslt = pstmt.executeQuery();

			while (rslt.next()) {
				emp.add(new Empresa(rslt.getString(COL_CIF), rslt.getString(COL_RZSL), rslt.getString(COL_DMO),
						rslt.getString(COL_RL), rslt.getString(COL_CR), rslt.getString(COL_CNV), rslt.getInt(COL_NE),
						rslt.getString(COL_TEL), rslt.getString(COL_WEB)));
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error: se ha producido un error al establecer la conexion con la base de datos");
		} finally {
			try {
				if (rslt != null)
					rslt.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return emp;
	}
	
	public Empresa getEmpresaByCIF(String cif) {
		Empresa em = null;
		
		String sen = "SELECT * FROM " + NOM_TAB + " WHERE " + COL_CIF + " = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		
		try {
			
			con = acc.getConnection();

			pstmt = con.prepareStatement(sen);
			
			pstmt.setString(1, cif);
			
			ResultSet rslt = pstmt.executeQuery();
			
			if(rslt.next()) {
				em = new Empresa(rslt.getString(COL_CIF), rslt.getString(COL_RZSL), rslt.getString(COL_DMO),
						rslt.getString(COL_RL), rslt.getString(COL_CR), rslt.getString(COL_CNV), rslt.getInt(COL_NE),
						rslt.getString(COL_TEL), rslt.getString(COL_WEB));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error: se ha producido un error al establecer la conexion con la base de datos");
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return em;
	}
	
	public String deleteEmpresa(String cif) {
		String sen = "DELETE FROM " + NOM_TAB + " WHERE " + COL_CIF + " = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = acc.getConnection();
			
			pstmt = con.prepareStatement(sen);
			
			pstmt.setString(1, cif);
			
			int f = pstmt.executeUpdate();
			
			if (f > 0) {
				return "Se ha eliminado la empresa con exito";
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
	
	public String insertEmpresa(Empresa em) {
		String sen = "INSERT INTO " + NOM_TAB + " VALUES(?,?,?,?,?,?,?,?,?)";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = acc.getConnection();
			
			pstmt = con.prepareStatement(sen);
			
			pstmt.setString(1, em.getCif());
			pstmt.setString(2, em.getRazonSocial());
			pstmt.setString(3, em.getDomicilio());
			pstmt.setString(4, em.getRepresentante());
			pstmt.setString(5, em.getCorreoRL());
			pstmt.setString(6, em.getConvenio());
			pstmt.setInt(7, em.getNumEmpleados());
			pstmt.setString(8, em.getTelefono());
			pstmt.setString(9, em.getWeb());
			
			int f = pstmt.executeUpdate();
			
			if (f > 0) {
				return "Se ha insertado el restaurante con éxito";
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
	
	public String updateEmpresa(Empresa em) {
		String sen = "UPDATE EMPRESAS SET RAZON_SOCIAL = ?, DOMICILIO = ?, "
				+ "REPRESENTANTE_LEGAL = ?, CORREO_RL = ?, CONVENIO = ?, "
				+ "NUM_EMPLEADOS = ?, TELEFONO = ?, WEB = ? WHERE CIF = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = acc.getConnection();
			
			pstmt = con.prepareStatement(sen);
			
			
			pstmt.setString(1, em.getRazonSocial());
			pstmt.setString(2, em.getDomicilio());
			pstmt.setString(3, em.getRepresentante());
			pstmt.setString(4, em.getCorreoRL());
			pstmt.setString(5, em.getConvenio());
			pstmt.setInt(6, em.getNumEmpleados());
			pstmt.setString(7, em.getTelefono());
			System.out.println(em.getWeb()+ " dao");
			pstmt.setString(8, em.getWeb());
			pstmt.setString(9, em.getCif());
			
			int f = pstmt.executeUpdate();
			
			if (f > 0) {
				return "Se ha modificado el restaurante con éxito";
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
}
