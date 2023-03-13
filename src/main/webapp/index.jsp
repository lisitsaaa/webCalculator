<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Main</title>
</head>
<body>
<h1>CALCULATOR</h1>
<c:if test="${sessionScope.currentUser == null}">
    <button class="btn btn-outline-success"><a href="/registration">registration</a></button>
    <button><a href="/authorization">authorization</a></button>
</c:if>

<c:if test="${sessionScope.currentUser != null}">
    <p>good day ${name}</p>
    <button class="btn btn-outline-success"><a href="/nameChange">change name</a></button>
    <br>
    <br>
    <button class="btn btn-outline-success"><a href="/passwordChange">change password</a></button>
    <br>
    <br>
    <button class="btn btn-outline-success"><a href="/calculator">calculator</a></button>
    <br>
    <br>
    <button class="btn btn-outline-success"><a href="/history/historyMenu.jsp">history</a></button>
    <br>
    <br>
    <button class="btn btn-outline-danger"><a href="/logout">log out</a></button>
</c:if>

</body>
</html>
