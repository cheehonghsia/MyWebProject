<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>forms</title>
</head>
<body>
	<p>
		Below is an example for how to submit form field values to a JSP and
		print them.<br>
	</p>
	<form:form role="form"  method="post" commandName="user">
		<table>
			<tbody>
				<tr>
					<td>BSN</td>
					<td>:</td>
					<td><form:input type="text" name="BSN" size="20" path="BSN" id="BSN"/></td>
				<tr>
					<td>Firstname</td>
					<td>:</td>
					<td><form:input type="text" name="firstname" size="20" path="firstname" id="firstname"/></td>
				</tr>
				<tr>
					<td>Lastname</td>
					<td>:</td>
					<td><form:input type="text" name="lastname" size="20" path="lastname" id="lastname"/></td>
				</tr>
				<tr>
					<td>Address</td>
					<td>:</td>
					<td><form:textarea rows="2" cols="20" name="address" path="address" id="address"/></td>
				</tr>
				<tr>
					<td>City</td>
					<td>:</td>
					<td><form:input type="text" name="city" size="20" path="city" id="city"/></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td><input type="submit" name="submit" value="Submit">
						<input type="reset" value="Reset"></td>
				</tr>
			</tbody>
		</table>
	</form:form>

</body>
</html>