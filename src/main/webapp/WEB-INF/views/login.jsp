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
	<form action = "login" method = "POST">
		<div>Name: <input name = "name" type = "text" /> </div></BR> 
		<div>Password: <input name = "password" type = "password" /> </div></BR>
		<input type = "submit" />
	</form>
</body>
</html>