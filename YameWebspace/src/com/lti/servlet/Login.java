package com.lti.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/log.html")
public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		String fullname =request.getParameter("fullname");
		
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
		//if a valid use
		//InMemoryLoginService login = new InMemoryLoginService();	
		
		DatabaseLogin login = new DatabaseLogin();
		boolean isValid =login.isValidUser(user,password);
String fulln=login.fullname(fullname);

HttpSession session =request.getSession();

if(isValid==true) {
	
			session.setAttribute("loggedin", user); //key and value like hashmap 
			session.setAttribute("fulln",fullname);
			response.sendRedirect("welcome.jsp");

			//response.sendRedirect("welcome.html");		
		}
		else
			session.setAttribute("message","Invalid username/password");
			response.sendRedirect("Login.jsp");
	}
}
		
//		if (user.equals("yame") && password.equals("123"))
//response.sendRedirect("welcome.html");
//	
//		else
//			response.sendRedirect("Login.html");
		// doGet(request, response);

