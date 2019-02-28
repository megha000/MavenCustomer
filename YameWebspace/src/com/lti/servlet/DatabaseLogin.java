package com.lti.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseLogin {
	// public static void main(String[] args) {
	//
	// Connection conn = null;
	//
	// try {
	// conn = JdbcFactory.getConnection();
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// System.out.println("connected ");
	//
	// }
	public boolean isValidUser(String user, String password) {
		Connection conn = null;
		PreparedStatement st = null;
		PreparedStatement st2 = null;
		ResultSet rs = null;
		ResultSet rs2 = null;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "Newuser123");
			String sql = "select count(1) from " + "login where " + "username=? and password =? " + "and active ='Y'";
			String sql2 = "select fullname from login where username=? ";

			st = conn.prepareStatement(sql);
			st.setString(1, user);
			st.setString(2, password);
			rs = st.executeQuery();
			if (rs.next()) {
				int count = rs.getInt(1);
				if (count == 1)
					return true;

				return false;
			} else
				return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				rs.close();
			} catch (Exception e) {
			}
			try {
				st.close();
			} catch (Exception e) {
			}
			try {
				conn.close();
			} catch (Exception e) {
			}
		}
}

	public String fullname(String user)
	{
		Connection conn = null;
		PreparedStatement st2 = null;
		ResultSet rs2 = null;
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "Newuser123");
			String sql2="select fullname from tbl_user where username =?";
			st2=conn.prepareStatement(sql2);
			st2.setString(1, user);
			if (rs2.next())
			{
				String fullname=rs2.getString("fullname");
				return fullname;
			}
			else
				return "anonymous";
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
			return "anonymous";
		} catch (SQLException e) {
			
			e.printStackTrace();
			return "anonymous";
		}
		
	}

















}
