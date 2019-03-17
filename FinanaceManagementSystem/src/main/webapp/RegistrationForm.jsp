<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="../js/jquery-1.4.3.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>

<style>
.login-page {
  width: 360px;
  padding: 8% 0 0;
  margin: auto;
}
.form {
  position: relative;
  z-index: 1;
  background: #FFFFFF;
  max-width: 360px;
  margin: 0 auto 100px;
  padding: 45px;
  text-align: center;
  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
}
.form input {
  font-family: "Roboto", sans-serif;
  outline: 0;
  background: #f2f2f2;
  width: 100%;
  border: 0;
    margin: 0 0 15px 30px;
    padding: 12px;
  box-sizing: border-box;
  font-size: 14px;
}
.form button {
  font-family: "Roboto", sans-serif;
  text-transform: uppercase;
  outline: 0;
  background: #4CAF50;
  width: 100%;
  border: 0;
  padding: 15px;
  color: #FFFFFF;
  font-size: 14px;
  -webkit-transition: all 0.3 ease;
  transition: all 0.3 ease;
  cursor: pointer;
}
.form button:hover,.form button:active,.form button:focus {
  background: #43A047;
}
.form .message {
  margin: 15px 0 0;
  color: #b3b3b3;
  font-size: 12px;
}
.form .message a {
  color: #4CAF50;
  text-decoration: none;
}
.form .register-form {
  display: none;
}
.container {
  position: relative;
  z-index: 1;
  max-width: 300px;
  margin: 0 auto;
}
.container:before, .container:after {
  content: "";
  display: block;
  clear: both;
}
.container .info {
  margin: 50px auto;
  text-align: center;
}
.container .info h1 {
  margin: 0 0 15px;
  padding: 0;
  font-size: 36px;
  font-weight: 300;
  color: #1a1a1a;
}
.container .info span {
  color: #4d4d4d;
  font-size: 12px;
}
.container .info span a {
  color: #000000;
  text-decoration: none;
}
.container .info span .fa {
  color: #EF3B3A;
}
.emi_card {
    display: inline-flex;
}


</style>
</head>
<script>
function validateForm() {
  var x = document.forms["myForm"]["Register"].value;
  if (x == "") {
    alert("Are you sure to submit the form");
    return false;
  }
}
</script>
<body>
<div class="login-form">
<div class="form">
	<form name="myForm" class="register_form" action="controller/register" method="post" >
		Enter Name<span class="err">*</span>:<input type="text" name="name"pattern="[A-Za-z]{1,32}" maxlength="32" title="Please Enter your name"required /><br />
		<br>Enter Date of Birth <span class="err">*</span>:<input type="date" name="dob"  required /><br />
		<br> Enter Phone no<span class="err">*</span>:<input type="tel"  name="phone" pattern="^\d{10}$" title=" Please enter 10 digits numbers " maxlength="10" required /><br />
		<br> Enter Username<span class="err">*</span>:<input type="text" name="username" pattern="^[a-z0-9_]{3,15}$" title="Must contain atleast one number,letters,'_'"required/><br />
		<br> Enter Email id<span class="err">*</span>:<input type="email" name="email"  pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" title="Please Enter your valid email" required/><br />
		<br> Enter Password<span class="err">*</span>:<input type="password" name="password"pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"  required/><br />
		<br> Enter Address<span class="err">*</span>:
		<textarea input type=text name="address"> </textarea>
		<br /><br>
		<div class="emi_card">
		<span class="name_card">Card Type</span> <span class="err">*</span>:
		<input class="radio_set"  type="radio" name="cardtype" value="gold"> GOLD
		<input class="radio_set"  type="radio" name="cardtype" value="titanium" >TITANIUM
			</div><br>
		 Enter Bank<span class="err">*</span>:<select name="bank" required>
			<option value="select">select</option>
			<option value="SBI">SBI</option>
			<option value="ATLANTICA">ATLANTICA</option>
			
		<option value="CITI BANK">CITI BANK</option>
		</select><br />
		<br> Enter Saving Account No<span class="err">*</span>:<input type="number"
			name="accountno" pattern="^([0-11]{12})$" title="Please enter your 11 digit account number"required/><br />
		<br> Enter IFSC Code<span class="err">*</span>:<input type="text" name="ifsccode" pattern="^[A-Za-z]{4}[a-zA-Z0-9]{7}$" title="Please Enter 11 digit IFSC Code"required /><br />
		<br>Enter your Security Question<span class="err">*</span>:
		<select name="securityQuestion" required>
		<option value="select">select</option>
		<option value="What was your childhood nickname? ">What was your childhood nickname? </option>
		<option value="What is the name of your favorite childhood friend? ">What is the name of your favorite childhood friend? </option>
		<option value="What is your pet's name?">What is your pet's name?</option>
		<option value="What was your favorite sport in high school?">What was your favorite sport in high school?</option>
		<option value="What is the name of the High School you graduated from?">What is the name of the High School you graduated from?</option>
		<option value="What is the name of the first school you attended?">What is the name of the first school you attended?</option><br>
			</select>
			<br>Enter your Security Answer <span class="err">*</span>:
			<input type="text" name="securityAnswer"  required /><br />
		<br> <input type="submit" value="Register" onclick="return validateForm()"/>
		<input type="reset" value="Reset">
		Already a User? <a href="http://localhost:8181/FinanaceManagementSystem/Login.jsp">Sign In </a> 
	</form>
</div>
</div>

</body>
</html>
