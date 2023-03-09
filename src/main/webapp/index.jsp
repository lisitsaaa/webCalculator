<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Main</title>
</head>
<body>
<c:if test="${currentUser == null}">
    <h1>CALCULATOR</h1>
    <button class="btn btn-outline-success"><a href="/registration">registration</a></button>
    <button><a href="/authorization">authorization</a></button>
</c:if>

</body>
</html>
