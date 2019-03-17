<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>

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
.flex-sb {
    display: -webkit-box;
    display: -webkit-flex;
    display: -moz-box;
    display: -ms-flexbox;
    display: flex;
    justify-content: space-between;
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
    }
    
    .wrap-input100 {
    width: 100%;
    position: relative;
    background-color: #fff;
    border: 1px solid #e6e6e6;
    border-radius: 2px;
    }

.wrap-login100 {
    width: 560px;
    background: #fff;
    border-radius: 10px;
    position: relative;
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
    line-height: 1.4;
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
    

</style>
</head>
<body>
<div class="  .container-login100">
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
<input type="submit" value="Login"   />
<span class="link_block"><a href="RegistrationForm.jsp">Create new Account</a></span><br>
<a href="resetusername.jsp">Forgot Password</a></span>
</div>
</form>

</div>

</div>
        
</body>

</html>