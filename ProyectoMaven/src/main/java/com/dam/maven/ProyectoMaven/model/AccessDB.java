package com.dam.maven.ProyectoMaven.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccessDB {
	private String driver;
	private String url;
	
	public AccessDB() {
		driver = "org.sqlite.JDBC";
		url = "jdbc:sqlite:DB/DatosPruebas.db";
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url);
		
		return con;
	}
}
