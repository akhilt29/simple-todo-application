<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<p><font color="red">${errorMessage}</font></p>
	<h1 style="font-size:150%;">Please Enter Your Username And Password</h1>
	<form action = "/login" method = "POST">
		<div>Name: <input name = "name" type = "text" /> </div></BR> 
		<div>Password: <input name = "password" type = "password" /> </div></BR>
		<input type = "submit" />
	</form>
	
	<div><a href="/register">Click here to register</a></div>
</body>
</html>