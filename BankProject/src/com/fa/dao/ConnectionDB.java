package com.fa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	private static Connection con;
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","manager");
		}
		catch(SQLException se) {
			se.printStackTrace();
			System.err.println("SQL problem ");
		}
		catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			System.err.println("class not Found Exception");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("Unknow Exception");
		}
	}
	
	public static Connection dbConn() {
		return con;
	}
}
