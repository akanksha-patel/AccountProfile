<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PERSONAL DETAILS</title>
</head>
<body>
	<form action="ProfileController" name="personalform" method="post">
		<div>
			Full Name : <input type="text" name="name" required/> <br> <br>
		</div>
		<div>
			Email Id : <input type="email" name="email" required/> <br>
		</div>
		<div>
			Gender : <input type="radio" name="gender" value="male"> Male
					<input type="radio" name="gender" value="female"> Female
					<br><br>
		</div>
		<div>
			Hobbies : <input type="checkbox" value="reading" name="hobbies"> Reading
						<input type="checkbox" value="singing" name="hobbies"> Singing
						<input type="checkbox" value="singing" name="hobbies"> Swimming
						<br><br>
		</div>
	
		<div>
			<button type="submit" name="submit" value="save">Save</button>
			<button type="submit" name="submit" value="next">Next</button>
		</div>
	</form>
</body>
</html>