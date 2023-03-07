<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-sm-5">
            <form action="/registration" method="post">
                <h1>CALCULATOR</h1>
                <p> - Name <input type="text" name="name" placeholder="Kate"></p>
                <p> - Username <input type="text" name="username" placeholder="lisitsaaa"></p>
                <p> - Password <input type="password" name="password" placeholder="A1a2A3a4"></p>
                <button class="btn btn-outline-success">sign up</button>
            </form>
            <form action="/index.jsp">
                <button type="submit" class="btn btn-outline-primary">menu</button>
            </form>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
</body>
</html>
