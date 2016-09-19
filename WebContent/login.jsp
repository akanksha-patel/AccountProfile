<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<% String msg = (String)request.getAttribute("msg"); %>
				<% if(msg!=null){ %>
				<div class="msg" >
					<%= msg %>
				</div>
				<% } %>
				
	<form action="LoginController" name="loginform">
		<p>
			User Name : <input type="text" name="username" />
			
		</p>
		
		<p>
			 Password : <input type="password" name="password" />
		</p>
		<p>
			<input type="submit" value="LOGIN">
		</p>
	</form>

</body>
</html>