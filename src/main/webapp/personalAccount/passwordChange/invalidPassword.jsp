<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>invalid password</title>
</head>
<body>
<form action="/passwordChange" method="post">
    <h1>CALCULATOR</h1>
    <p> - Password <input type="password" name="password" placeholder="new password"></p>
    <button>change password</button>
</form>
<p style="color: darkred">invalid password</p>
<a href="/personalAccount/personalAccount.jsp">main menu</a>
</body>
</html>
