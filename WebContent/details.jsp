<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:useBean id="profile" class="com.bitwise.models.Profile" scope="session"></jsp:useBean>
<jsp:useBean id="educational" class="com.bitwise.models.Educational" scope="session"></jsp:useBean>
<jsp:useBean id="residental" class="com.bitwise.models.Residental" scope="session"></jsp:useBean>

				<h1> YOUR DETAILS  </h1>

<h3>
NAME : <jsp:getProperty property="name" name="profile"/><br>
EMAIL : <jsp:getProperty property="email" name="profile"/><br>
GENDER : <jsp:getProperty property="gender" name="profile"/><br>
HOBBIES : <jsp:getProperty property="hobbies" name="profile"/><br>


<br><br>


TENTH % : <jsp:getProperty property="tenth" name="educational"/><br>
TWELTH % : <jsp:getProperty property="twelth" name="educational"/><br>
CGPA : <jsp:getProperty property="cgpa" name="educational"/><br>
FAVOURITE SUBJECT : <jsp:getProperty property="favouriteSubject" name="educational"/><br>



<br><br>


PERMANENT ADDRESS : <jsp:getProperty property="permanentAddress" name="residental"/><br>
TEMPORART ADDRESS : <jsp:getProperty property="temporaryAddress" name="residental"/><br>
MOBILE : <jsp:getProperty property="mobile" name="residental"/><br>
LANDLINE : <jsp:getProperty property="landline" name="residental"/><br>
</h3>