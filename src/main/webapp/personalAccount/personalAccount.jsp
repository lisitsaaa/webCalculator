<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>account</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-sm-5">
            <h1>CALCULATOR</h1>
            <p>good day ${name}</p>

            <form action="/nameChange">
                <button type="submit" class="btn btn-outline-success">change name</button>
            </form>
            <form action="/passwordChange">
                <button type="submit" class="btn btn-outline-success">change password</button>
            </form>
            <form action="/calculate">
                <button type="submit" class="btn btn-outline-success">calculator</button>
            </form>
            <form action="/personalAccount/history/historyMenu.jsp">
                <button type="submit" class="btn btn-outline-success">history</button>
            </form>
            <form action="/logout">
                <button type="submit" class="btn btn-outline-danger"\>log out</button>
            </form>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
</body>
</html>
