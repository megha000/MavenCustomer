package com.lti.dao; //data access object

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.lti.mavenfirst.Customer;

public class CustomerDao {

	// public void cust_details(int id, String name,String email) {
	public void cust_details(Customer customer) {

		Connection conn = null;
		PreparedStatement st = null;
		/// ResultSet rs = null;
		try {

			Properties dbProps = new Properties();
			dbProps.load(this.getClass().getClassLoader().getResourceAsStream("prod-db.properties")); // used for reading
																										// the
																										// properties
																										// file

			Class.forName(dbProps.getProperty("driverClassName"));
			conn = DriverManager.getConnection(dbProps.getProperty("url"), dbProps.getProperty("username"),
					dbProps.getProperty("password"));
			String sql = ("insert into yame_customer values(?,?,?)");

			st = conn.prepareStatement(sql);

			st.setInt(1, customer.getId());
			st.setString(2, customer.getName());
			st.setString(3, customer.getEmail());
			st.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {	st.close(); } catch(Exception e) {}
			try { conn.close(); } catch (Exception e) {}
	}
	}

}
