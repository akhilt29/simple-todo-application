<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
<div align="right">
	<a class="button" href="/login" method = "GET">Logout</a>
</div>
	Welcome ${name} </BR>
	You can manage your Todos <a href = "/list-todos">here.</a>
</body>
</html>