<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>history menu</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>

<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-sm-5">
            <h1>CALCULATOR</h1>
            <button class="btn btn-outline-success"><a href="/showingAll">check all</a></button>
            <br>
            <br>
            <button class="btn btn-outline-success"><a href="/removingAll">remove all</a></button>
            <br>
            <br>
            <button class="btn btn-outline-success"><a href="/showingById">check by id</a></button>
            <br>
            <br>
            <button class="btn btn-outline-success"><a href="/removingById">remove by id</a></button>
            <br>
            <br>
            <button class="btn btn-outline-primary"><a href="/">menu</a></button>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
</body>
</html>
