<%@ page import="java.util.List" %>
<%@ page import="by.tms.entity.Operation" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>all history</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<ul>
    <%
        List<Operation> operations = (List<Operation>) request.getAttribute("operations");
        operations.forEach(response.getWriter()::println);
    %>
</ul>
<form action="/personalAccount/history/historyMenu.jsp">
    <button type="submit" class="btn btn-outline-primary">back</button>
</form>
<form action="/personalAccount/personalAccount.jsp">
    <button type="submit" class="btn btn-outline-primary">account</button>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
</body>
</html>
