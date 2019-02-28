package com.lti.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/curr.jpg")
public class CurrencyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String from =request.getParameter("fromcurrency");
		String to= request.getParameter("tocurrency");
		double amount = Double.parseDouble(request.getParameter("amount"));
		double result= 0;
		if(from.equals("USD") && to.equals("INR"))
			result =amount *72.7;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>result of conversion is "+result+"</h1>");
		out.println("</html></body>");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		doGet(request, response);
	}

}
