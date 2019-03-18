<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/style.css">
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:600italic,400,800,700,300' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=BenchNine:300,400,700' rel='stylesheet' type='text/css'>
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
 <link rel="stylesheet" href="css/madebyme.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Answer</title>
<base href="/FinanaceManagementSystem/">





</head>
<body>
<body>
<div class=" .container-login100">
<div class="wrap-login100 p-l-85 p-r-85 p-t-55 p-b-55">

	<h3>
		Security Question is: <b>${ userDetails.securityQuestion }</b>
	</h3>
	<form class="login_form login100-form validate-form flex-sb flex-w" action="controller/getanswer" method="post">
		<c:if test="${error!=null}">
			<p>${error}</p>
		</c:if>
		<span class="txt1 p-b-11">
		Enter Answer: 
		</span>
		<div class="wrap-input100 validate-input m-b-12">
		<input class="input100" type="text" name="securityAnswer"> 
		</div>
		<div class="submit_button">
		<input class="btn btn-primary btn-lg" type="submit" value="Submit">
		</div>
</form>
</div></div>


	<!-- footer starts here -->
    <footer class="footer clearfix">
            <div class="container">
                <div class="row">
                    <div class="col-xs-6 footer-para">
                        <p>&copy; <a href="https://FinanaceManagementSystem/index.html">EasyFinanace.com</a> &copy All right reserved</p>
                    </div>

                    <div class="col-xs-6 text-right">
                        <a href=""><i class="fa fa-facebook"></i></a>
                        <a href=""><i class="fa fa-twitter"></i></a>
                        <a href=""><i class="fa fa-skype"></i></a>
                    </div>
                </div>
            </div>
        </footer>

</body>
</html>

