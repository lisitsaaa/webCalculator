<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>calculator</title>
</head>
<body>
<form action="/calculate" method="post">
  <h1>CALCULATOR</h1>
  <p> - Name <input type="text" name="numbers" placeholder="22,33,44,1"></p>
  <p> - Username <input type="text" name="type" placeholder="sum"></p>
  <p> operations type - sum - sub - mul - div</p>
  <button>calculate</button>
</form>
<button>
  <a href="../index.jsp">main menu</a>
</button>
</body>
</html>
