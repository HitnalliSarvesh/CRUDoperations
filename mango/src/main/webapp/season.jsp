<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">

<title>Season JSP</title>
</head>
<body>
<nav class="navbar bg-success" data-bs-theme="dark">
<ul class="nav justify-content-end">
  <li class="nav-item">
    <a class="nav-link" href="index.jsp">Home</a>
  </li>
  <li class="nav-item">
    <a class="nav-link active" href="season.jsp">Season</a>
  </li>
</ul>
</nav>
<h1>This is Season Page..</h1>
<form action="season" method="post">
Country <input type="text" name="country"/>
Season <input type="text" name="season"/>
Months <input type="number" name="months" />
<button type="submit" value="Send"  class="btn btn-danger btn-lg">Send</button>

</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>