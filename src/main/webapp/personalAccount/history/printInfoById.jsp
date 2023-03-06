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
//        out.print(String.format("numbers = %s ", operation.get().getNumbers()));
//        out.print(String.format("type = '%s' ", operation.get().getType()));
//        out.print(String.format("result = %s", operation.get().getResult()));
    %>
</p
</form>
</body>
</html>
