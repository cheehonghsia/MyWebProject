<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result database</title>
</head>
<body>

	<h1>Retrieving data from Database:</h1>
	
	
	<c:if test="${not empty users}">
	    <table>
	        <c:forEach var="user" items="${users}">
	        	<h4>${user.lastname}</h4>
	        </c:forEach>
	    </table>
	</c:if>	
	

</body>
</html>