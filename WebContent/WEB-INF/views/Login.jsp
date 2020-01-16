<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>   
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<div align="center">
	<!-- action attribute defines the RequestMapping chosen inside the controller
		method attribute is method
		modelAttribute defines the object used to perform the action. It is created inside the controller. -->
		<header>Login Page</header>
		<form:form action="tryLoginUser" method="post" modelAttribute="user">
			<table>
				<tr>
					<td>Email: </td>
					<td><form:input path="email" /></td>
				</tr>

				<tr>
					<td>Password: </td>
					<td><form:password path="password" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Submit"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>