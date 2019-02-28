package com.lti.servlet;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Properties;

public class InMemoryLoginService {
	
	private HashMap<String, String> users =new HashMap<>();
	public InMemoryLoginService()
	{
	
//		users.put("megha","123");
//		users.put("yashi","12345");
//		
	}
	

public boolean isValidUser(String user, String password) {
	if(users.containsKey(user))
		if(users.get(user).equals(password))
			return true;
	return false;
	
}


}
