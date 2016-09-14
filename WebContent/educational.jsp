<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Education Details</title>
</head>
<body>
	<form action="ResidentalController" name="residentalform">
	<div>
		10th % : <input type="text" name="tenth"> &nbsp;&nbsp;&nbsp;
		12th % : <input type="text" name="twelth"><br>
	</div>
	<div>
		<br>
		 CGPA :  <input type="text" name="cgpa">
	</div>
	<div>
		<br>
		 Favourite Subject :  <br> <input type="checkbox" value="dbms" name="subject"> DataBaseManagement System <br>
		 					<input type="checkbox" value="sepm" name="subject"> Software Engineering <br>
		 					<input type="checkbox" value="java" name="subject"> Java <br>
		 					<input type="checkbox" value="oracle" name="subject"> Oracle <br>
	</div>
	<div>	<br><br>
			<button type="submit" name="submit" value="save">Save</button> &nbsp;&nbsp;
			<button type="submit" name="submit" value="next">Next</button>
		</div>
		</form>
</body>
</html>