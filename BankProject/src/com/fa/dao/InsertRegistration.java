package com.fa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.fa.basic.RandomAccountAndPin;
import com.fa.bean.RegisterBean;

public class InsertRegistration {
	private static final String INSER_REG_QUERY="INSERT INTO BANKREGISTER VALUES(BANK_SNO_SEQ.nextval,?,?,?,?,?,?,?,?,?)";
	public static void insertRegisterDB() {
		Connection con=null;
		PreparedStatement ps=null;
		try {
		con=ConnectionDB.dbConn();
		ps=con.prepareStatement(INSER_REG_QUERY);
		ps.setString(1, RegisterBean.getName());
		ps.setLong(2, RegisterBean.getMobile());
		ps.setString(3, RegisterBean.getGender());
		ps.setString(4, RegisterBean.getEmail());
		ps.setString(5, RegisterBean.getCity());
		ps.setString(6, RegisterBean.getState());
		ps.setInt(7, RegisterBean.getZip());
		ps.setLong(8,RandomAccountAndPin.generatedAccount());
		ps.setLong(9, RandomAccountAndPin.genratedPin());
		int result=ps.executeUpdate();
		if(result==0) {
			System.out.println("Record not inserted");
		}
		else {
			System.out.println("Record inserted");
		}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
	}
}
