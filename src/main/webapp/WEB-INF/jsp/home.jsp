<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	
	
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Owlsgate CRM</title>

	<script type="text/javascript" src="jquery-1.8.3.js"></script>

	<script type="text/javascript">
		$(document).ready(
			function() {
				$.getJSON('<spring:url value="allentries.json"/>', {
					ajax : 'true'
				}, function(data){
					var html = '<table> <td> ';
					var len = data.length;
					for (var i = 0; i < len; i++) {
						html += data[i].desc;
					}
					html += '</td> </table>';
					
					$('#allentries').html(html);
				}).success(function(data){
					var html = '<table><tr><th>Company</th><th>Job Title</th> <tr> ';
					var len = data.length;
					for (var i = 0; i < len; i++) {
						html += "<tr> <td>";
						html += data[i].company;
						html += "</td> <td>";
						html += data[i].jobTitle;
						html += "</td> </tr>";
					}
					html += '</table>';
					
					$('#allentries').html(html);
					
				}).fail( function(d, textStatus, error) {
			        alert("getJSON failed, status: " + textStatus + ", error: "+error)		    
				});
				
			});
		
	</script>
</head>
<body>
<div>
	<h2>Entries</h2>
	<table id="allentries" style="width: 80%">
		<tr>
			<th>Company</th>
			<th>Job Title</th>
		</tr>
		<tr>
			<td>no entries</td>
		</tr>
	</table>
</div>
<br/>
	<div id="links">
	<a href="http://localhost:8080/crm/newEntry.html">Add New Entry</a>
	<a href="http://localhost:8080/crm/contacts.html">Manage contacts</a>
	</div>
	
</body>
</html>