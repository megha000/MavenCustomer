<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<%= String message =(String)session.getAttribute("message");
if(message!=null)

out.println("</b>" + message + "</b>");
session.removeAttribute("message");
%>

<form method="post" action="log.html">
<b><%= session.getAttribute("message") %> </b>
USER: <input type="text"  name="user" required/>
PASSWORD: <input type="password" name="password" required>
<button type="submit"> Login</button>

</form>
</body>
</html>