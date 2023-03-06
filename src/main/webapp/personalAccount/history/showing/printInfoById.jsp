<%@ page import="by.tms.entity.Operation" %>
<%@ page import="java.util.Optional" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>info by id</title>
</head>
<body>
<p>
    <%
        Optional<Operation> operation = (Optional<Operation>) request.getAttribute("operation");
        out.print(operation.get());
    %>
    <a href="/personalAccount/personalAccount.jsp">personal account</a>
</p
</form>
</body>
</html>
