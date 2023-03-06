<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>user not found</title>
</head>
<body>
<form action="/authorization" method="post">
    <h1>CALCULATOR</h1>
    <p> - Username <input type="text" name="username" placeholder="lisitsaaa"></p>
    <p> - Password <input type="password" name="password" placeholder="A1a2A3a4"></p>
    <button>log in</button>
</form>
<p style="color: darkred">user not found</p>
<a href="../index.jsp">main menu</a>
</body>
</html>
