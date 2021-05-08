<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add your Todos</title>
</head>
<body>
<div class = "container">
<div align="right">
	<a class="button" href="/login" method = "GET">Logout</a>
</div>
<H1>Add a Todo</H1>

<form action = "/add-todos" method = "POST">
	
	<div>Todo: <input name = "desc" type = "text" /> </div></BR> 
	<div>Details: <input name = "details" type = "text" /> </div></BR> 
	<div>Start Date: <input name = "sdate" type = "date" /> </div></BR>
	<div>End Date: <input name = "tdate" type = "date" /> </div></BR>
	<div><input type = "submit" /></div>
	
</form>
</div>

<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>