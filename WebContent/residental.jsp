<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resident Details</title>
</head>
<body>
	<form action="ResidentialController">
	<div>
		Permanent Address : <textarea name="paddr" required></textarea><br>
	</div>
	<div>
		Temporary Address : <textarea name="taddr"></textarea><br>
	</div>
	<div>
		Contact no : <input type="number" name="mobile" maxlength="10" required><br>
	</div>
	<div>
		Landline no : <input type="number" name="landline" ><br>
	</div>
	<div>	<br><br>
			<button type="submit" name="submit" value="save">Save</button> &nbsp;&nbsp;
			<button type="submit" name="submit" value="next">Next</button>
		</div>
		</form>
</body>
</html>