<%@ page import="by.tms.entity.Operation" %>
<%@ page import="java.util.Optional" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>info by id</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<p>
        <%
        Optional<Operation> operation = (Optional<Operation>) request.getAttribute("operation");
        out.print(operation.get());
    %>
<form action="/personalAccount/personalAccount.jsp">
    <button type="submit">account</button>
</form>
</p
</form>
</body>
</html>
