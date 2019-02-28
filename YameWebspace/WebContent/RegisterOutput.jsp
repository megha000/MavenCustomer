<%@page import="com.lti.servlet.EmployeeRegistration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result </title>
</head>
<body>
<%
EmployeeRegistration emp  =(EmployeeRegistration) session.getAttribute("Employeedata");
%>
 First Name: <%= emp.getEmployeeid()  %><br>
Last Name:<%=  emp.getFname()  %><br>
  Mobile:<%=  emp.getLname()  %><br>
    Mobile:<%=  emp.getEmail()  %><br>

</body>
</html>