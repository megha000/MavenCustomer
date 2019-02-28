<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>hello page</title>
</head>
<body>
     <center>
<% // this is called a scriptlet(piece of java code to achieve dynamism)
      String str = " hello everyone";
%>
<h1><%= str.toUpperCase() %></h1>  <!--  prints the value of string (appending basically)-->

<%
      for(int i=0;i<=6;i++)
      {
    	  
 
%>
    
                 <font size=" <%=  i %>"> hello world!</font><br/>                                                                                          <!--  space left for html code  -->
<%
      }

%>

</center>
</body>
</html>