<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:useBean id="ep" class="com.bitwise.controllers.ProfileController" scope="session">
</jsp:useBean>
<jsp:useBean id="op" class="com.bitwise.controllers.ResidentalController" scope="session">
</jsp:useBean>


<c:out value="${user}"></c:out> 