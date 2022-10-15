<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<style>
  
  body {
	background-image:
		url('C:/Users/win10/Downloads/pay.jpg');
	height: 100%;
	background-repeat: no-repeat;
	background-size: cover;
}
  
  </style>
<body background ="https://st.depositphotos.com/1034895/2167/i/600/depositphotos_21671527-stock-photo-password.jpg" style = "background-repeat: no-repeat; background-size: 100% 100%">
<center>
<h1>Change Your Password</h1>
<h3>ENTER YOUR CREDENTIALS HERE</h3>
<br><form action="paw" method="post" >
Enter User id: <input type="text" name="uid" placeholder="enter UserId" /><br><br>
Enter Password: <input id="password" name="password" type="password" pattern="^\S{6,}$"  placeholder="Password" required /><br><br>
Confirm Password: <input id="password_two" name="password_two" type="password" pattern="^\S{6,}$" placeholder="Verify Password" required /><br><br>
<input type="submit" value="Change">
</form>


</center>
</body>
</html>