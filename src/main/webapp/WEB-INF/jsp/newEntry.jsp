<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Add New Entry</title>
</head>

<body>

<form:form commandName="entry">
	<h2>New entry</h2>
	<table style="width: 80%">
		<tr>
			<th>Field</th>
			<th>Input</th>
		</tr>
		<tr>
			<td>Job Title</td>
			<td>
				<form:input path="jobTitle"/>				
			</td>
		</tr>
		<tr>
			<td>Company</td>
			<td>
				<form:input path="company"/>
			</td>
		</tr>
	</table>

	<input type="submit" value="Add">
	
</form:form>

<h1>The new job is ${entry.jobTitle}</h1>
</body>
</html>
