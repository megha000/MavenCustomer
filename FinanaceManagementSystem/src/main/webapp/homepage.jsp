<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<base href="/FinanaceManagementSystem/">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Rumana Finance, ${ sessionScope.user.username} </h1>
<h2>Your card type:${ sessionScope.user.cardtype} </h2>

 
          <c:choose>
			<c:when test="${ user.cardtype=='gold' }">
			Your joining fees:Rs 500/-<br>
				<br />
			</c:when>
			<c:otherwise>
				Your joining fees:Rs 1000/- <br>
				<br />
			</c:otherwise>
		</c:choose>
		<input type="submit" value="PAY NOW" onclick=pay()>
<a href="showcard.jsp">Card Details</a>
<a href="showproducts.jsp"> Buy Products</a>


</body>
</html>
<script>
function pay(){
	document.write("Your Payment is successful");

}
</script>