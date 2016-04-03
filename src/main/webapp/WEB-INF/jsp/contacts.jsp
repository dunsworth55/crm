<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Manage Contacts</title>
</head>
<body>
<!-- 	<table> -->
<!-- 		<tr> -->
<!-- 			<th>ID</th> -->

<%-- 				<c:forEach items="${contacts}" var="contact"> --%>
<%-- 					<td>${contact.id}</td><td>${contact.forename}</td><td>${contact.surname}</td> --%>
<%-- 				</c:forEach> --%>
<!-- 		</tr> -->
<!-- 	</table> -->

	<div>
		<h2>Add new contact</h2>
		<form:form commandName="contact">

			<table style="width: 80%">
				<tr>
					<th>Field</th>
					<th>Input</th>
				</tr>
				<tr>
					<td>Forename</td>
					<td><form:input path="forename" /></td>
				</tr>
				<tr>
					<td>Surname</td>
					<td><form:input path="surname" /></td>
				</tr>
				<tr>
					<td>mobilePhoneNumber</td>
					<td><form:input path="mobilePhoneNumber" /></td>
				</tr>
				<tr>
					<td>workPhoneNumber</td>
					<td><form:input path="officePhoneNumber" /></td>
				</tr>
			</table>

			<input type="submit" value="Add">

		</form:form>
	</div>
</body>
</html>