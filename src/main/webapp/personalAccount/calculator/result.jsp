<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-sm-5">
            <form action="/calculator" method="post">
                <h1>CALCULATOR</h1>
                <p> - Numbers <input type="text" name="numbers" placeholder="22,33,44,1"></p>
                <p> - operation type <input type="text" name="type" placeholder="sum"></p>
                <p style="color: steelblue"> example of types - sum - sub - mul - div</p>
                <p> - Last result ${result}</p>
                <button class="btn btn-outline-success">calculate</button>
            </form>
            <button class="btn btn-outline-primary"><a href="/personalAccount/personalAccount.jsp">account</a></button>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
</body>
</html>
