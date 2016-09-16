<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:useBean id="profile" class="com.bitwise.models.Profile" scope="session"></jsp:useBean>
<jsp:useBean id="educational" class="com.bitwise.models.Educational" scope="session"></jsp:useBean>
<jsp:useBean id="residental" class="com.bitwise.models.Residental" scope="session"></jsp:useBean>


<jsp:getProperty property="name" name="profile"/><br>
<jsp:getProperty property="email" name="profile"/><br>
<jsp:getProperty property="gender" name="profile"/><br>
<jsp:getProperty property="hobbies" name="profile"/><br>


<br><br>


<jsp:getProperty property="tenth" name="educational"/><br>
<jsp:getProperty property="twelth" name="educational"/><br>
<jsp:getProperty property="cgpa" name="educational"/><br>
<jsp:getProperty property="favouriteSubject" name="educational"/><br>



<br><br>


<jsp:getProperty property="permanentAddress" name="residental"/><br>
<jsp:getProperty property="temporaryAddress" name="residental"/><br>
<jsp:getProperty property="mobile" name="residental"/><br>
<jsp:getProperty property="landline" name="residental"/><br>
