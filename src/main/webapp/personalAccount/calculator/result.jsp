<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/calculate" method="post">
    <h1>CALCULATOR</h1>
    <p> - Numbers <input type="text" name="numbers" placeholder="22,33,44,1"></p>
    <p> - operation type <input type="text" name="type" placeholder="sum"></p>
    <p style="color: steelblue"> example of types - sum - sub - mul - div</p>
    <p> - Last result ${result}</p>
    <button>calculate</button>
</form>
<button>
    <a href="../index.jsp">main menu</a>
</button>
</body>
</html>
