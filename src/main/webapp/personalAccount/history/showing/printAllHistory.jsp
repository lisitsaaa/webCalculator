<%@ page import="java.util.List" %>
<%@ page import="by.tms.entity.Operation" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>all history</title>
</head>
<body>
<ul>
    <%
        List<Operation> operations = (List<Operation>) request.getAttribute("operations");
        operations.forEach(response.getWriter()::println);
    %>
    <a href="/personalAccount/personalAccount.jsp">personal account</a>
</ul>
</body>
</html>
