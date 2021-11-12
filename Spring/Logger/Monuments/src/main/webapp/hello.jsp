<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
 	<%@ page isELIgnored = "false" %>
 	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>
	<h2>Result:${msg}</h2>
	<table>
		<c:forEach var="item" items="${list}">
			<tr>
				<td>${item.name}</td>
				<td>${item.year}</td>
				<td>${item.height}</td>
				<td>${item.location}</td>
				<td>${item.entryFee}</td>
			</tr>
		</c:forEach>
	</table>
	
	
	
</body>
</html>