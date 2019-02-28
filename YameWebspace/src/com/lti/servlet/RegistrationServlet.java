package com.lti.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/register.jpg")
public class RegistrationServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	int id = Integer.parseInt(request.getParameter("id"));

		
		DatabaseRegister data = new DatabaseRegister();
		EmployeeRegistration emp = data.getdata(id);
//		
//		boolean enter =data.dataset(employee_id);

HttpSession session =request.getSession();
session.setAttribute("Employeedata", emp);
response.sendRedirect("RegisterOutput.jsp");

	}}