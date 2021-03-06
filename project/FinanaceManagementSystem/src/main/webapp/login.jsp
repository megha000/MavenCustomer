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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<style>
.submit_button {
    text-align: center;
    padding-top: 15px;
}
.container .info span a {
  color: #000000;
  text-decoration: none;
}
.container .info span .fa {
  color: #EF3B3A;
}
.login100-form {
    width: 100%;
}
.login100-form-title {
    font-family: Raleway-Medium;
    font-size: 30px;
    color: #555;
    line-height: 1.2;
    text-transform: uppercase;
    text-align: left;
    width: 100%;
    display: block;
    padding-bottom: 25px;
    }
    
    .wrap-input100 {
    width: 100%;
    position: relative;
    background-color: #fff;
    border: 1px solid #e6e6e6;
    border-radius: 2px;
    height: 55px;
    }
.wrap-login100 {
    width: 560px;
    background: #fff;
    border-radius: 10px;
    position: relative;
    margin: 0 auto;
        background-color: aliceblue;
}
.p-r-85 {
    padding-right: 85px;
}
.p-l-85 {
    padding-left: 85px;
}
.p-b-55 {
    padding-bottom: 55px;
}
.p-t-55 {
    padding-top: 55px;
}
.txt1 {
    font-family: Raleway-SemiBold;
    font-size: 13px;
    color: #555;
    line-height: 2.8;
    text-transform: uppercase;
}
.input100 {
    font-family: Raleway-Medium;
    color: #555;
    line-height: 1.2;
    font-size: 18px;
    display: block;
    width: 100%;
    background: 0 0;
    height: 55px;
    padding: 0 25px;
}
input {
    outline: none;
    border: none;
}
textarea:focus, input:focus {
    border-color: transparent!important;
}
.input100 {
    font-family: Raleway-Medium;
    color: #555;
    line-height: 1.2;
    font-size: 18px;
    display: block;
    width: 100%;
    background: 0 0;
    height: 55px;
    padding: 0 25px;
    }
/*     
    .container-login100 {
    width: 100%;
    min-height: 100vh;
    display: -webkit-box;
    display: -webkit-flex;
    display: -moz-box;
    display: -ms-flexbox;
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
    align-items: center;
    padding: 15px;
    background-color: #ebebeb;
    }
     */
     body{    font-family: Raleway-SemiBold;}
     .link_block{
    width: 50%;
    text-align: center;
    margin: 10 0 0 0;
    float: right;
    text-align: right;
    bottom: 0;
     }
     .links_click {
    overflow: hidden;
    text-align: center;
    font-size: 17px;
    text-align: center;
    font-size: 17px;
        width: 72%;
    display: block;
    }

footer.footer.clearfix {
    /* padding: 29px; */
    bottom: 0;
    position: fixed;
  background: transparent; 
    width: 100%;
    }

</style>
</head>
<body>



<div class="container-login100">
<div class="wrap-login100 p-l-85 p-r-85 p-t-55 p-b-55">
<div class="login">
<form class="login_form login100-form validate-form flex-sb flex-w"  method="post" action="controller/login">
<span class="login100-form-title p-b-32">
Account Login
</span>
<span class="txt1 p-b-11">
Username
</span>
<div class="wrap-input100 validate-input m-b-36" data-validate="Username is required">
<input class="input100" type="text" name="username" required>
<span class="focus-input100"></span>
</div>

<span class="txt1 p-b-11">
Password
</span>
<div class="wrap-input100 validate-input m-b-12">
 <input class="input100"  type="password" name="password" required/> <br/>
<span class="focus-input100"></span>
</div>
<div class="submit_button"><input class="btn btn-primary btn-lg" type="submit" value="Login"   /></div>
<div class="links_click"><span class="link_block"><a href="RegistrationForm.jsp">Create new Account</a></span><br>


    <span class="link_block"><a href="resetusername.jsp">Forgot Password</a></span>
</div>
</div>
</form>

</div>

</div>


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