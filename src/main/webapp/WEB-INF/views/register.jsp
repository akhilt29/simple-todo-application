<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
	<h1 style="font-size:150%;">Please Enter The Following Details:</h1>
	<form action = "/register" method = "POST">
		<div>Registration Name: <input name = "name" type = "text" /> </div></BR> 
		<div>Registration Password: <input name = "password" type = "password" /> </div></BR>
		<input name = "register" type = "submit" />
	</form>
	
</body>
</html>