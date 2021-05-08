<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Todos</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
    rel="stylesheet">
</head>
<body>

<div align="right">
	<a class="button" href="/login" method = "GET">Logout</a>
</div>

<h1>Welcome, ${name}!</h1> </BR>
	</div class = "container">
	<table class = "table table-striped">
		<p>Please find your Todos below:</p>
		
		<thead>
			<tr>
				<th>Todo</th>
				<th>Details</th>
				<th>Start Date</th>
				<th>Target Date</th>
				<th>Is Completed?</th>
				<th></th>
				<th></th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items = "${todos}" var = "todo">
				<tr>
					<td>${todo.description}</td>
					<td>${todo.details}</td>
					<td><fmt:formatDate pattern="dd/MM/yyyy" value="${todo.startDate}" /></td>
					<td><fmt:formatDate pattern="dd/MM/yyyy" value="${todo.targetDate}" /></td>
					<td>${todo.done}</td>
					<td><a type="button" class="btn btn-danger" href = "/delete-todo?id=${todo.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
		
	</table>

	<div>
		<a class="button btn-success btn-lg" style="height:50px;width:100px"" href="/add-todos" method = "GET">Add</a>
	</div>
	
	</div>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>