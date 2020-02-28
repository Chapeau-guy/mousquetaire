<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Departement</title>
</head>
<body>
	<h2>Liste des departements</h2>
	<table>
		<tr>
			<th>Departement</th>
			<th>nomDepartement</th>
			<th>numDepartement</th>
		</tr>

		<c:forEach var="v" items="${listDepartement}">
			<tr>
				<td>${v.nomDepartement}</td>
				<td>${v.numDepartement}</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>