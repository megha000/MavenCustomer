package com.lti.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseRegister {

	public EmployeeRegistration getdata(int id) {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
					
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "Newuser123");
String sql = "select "
			+ "first_name,last_name,"
			+ "email,phone_number,salary "
			+ "from employees where employee_id=?";

st = conn.prepareStatement(sql);
st.setInt(1, id);
rs = st.executeQuery();

if (rs.next()) {
EmployeeRegistration emp = new EmployeeRegistration();
   emp.setEmployeeid(id);
   emp.setFname(rs.getString(1));
   emp.setLname(rs.getString(2));
   emp.setEmail(rs.getString(3));
   emp.setMob(rs.getString(4));
   emp.setSal(rs.getString(5));
 
   return emp;
   
}
return null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
			return null;
		} catch (SQLException e) {
	
			e.printStackTrace();
			return null;
		}
	}
}
