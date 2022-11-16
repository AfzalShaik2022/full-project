<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file ="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create</title>
</head>
<body>
<h2>Create | Lead</h2>
			<form action="saveLead">
			<pre>
		FirstName<input type = "text" name = "firstName"/>
		LastName<input type ="text" name = "lastName"/>
		Email<input type = "email" name = "email"/>
		Mobile<input type = "number" name = "mobile"/>
		Source:<select name = "Source">
		<option value = "News">newsPaper</option>
		<option value = "TV">TV</option>
		<option value= "radio">Radio</option>
		<option value = "online">Online</option>
		</select>
		<input type = "submit" value = "save"/>
		</pre>
		</form>
</body>
</html>