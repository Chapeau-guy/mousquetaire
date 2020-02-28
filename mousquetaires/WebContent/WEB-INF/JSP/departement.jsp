<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Departement</title>
</head>
<body>
	<h2>Liste des departements</h2>
	
	<form:form method="POST" action="saveDepartement"
			modelAttribute="departement" border="1">
			<tr>
				<td>Nom du departement</td>
				<td><form:input path="nomDepartement" /></td>
			</tr>
			<tr>
				<td>numéro du département</td>
				<td><form:input path="numDepartement" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="enregistrer!"></td>
			</tr>
		</form:form>
	
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
				<td><a href="delete/${v.idDepartement}">Supprimer</a></td>
			</tr>
		</c:forEach>

	</table>
	
</body>
</html>