<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>name change</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-sm-5">
            <form action="/nameChange" method="post">
                <h1>CALCULATOR</h1>
                <p> - Name <input type="text" name="name" placeholder="new name"></p>
                <button class="btn btn-outline-success">change name</button>
            </form>
            <form action="/personalAccount/personalAccount.jsp">
                <button type="submit" class="btn btn-outline-primary">account</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
