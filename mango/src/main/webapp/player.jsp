<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">

<title>Player Page</title>
</head>
<body>
<nav class="navbar bg-success" data-bs-theme="dark">
		<ul class="nav justify-content-end">
			<li class="nav-item">
			<a class="nav-link" href="index1.jsp">Home</a>
			</li>
			<li class="nav-item">
			<a class="nav-link active" href="player.jsp">Player</a>
			</li>
			<li class="nav-item">
			<a class="nav-link" href="personaldetails.jsp">PersonalDetails</a>
			</li>
		</ul>
	</nav>
	
	<h1>This is Player Page</h1>
	<form class="form-control" action="player" method="post">
		Name <input type="text" name="name" class="form-control"/> <br>
		Sport <input type="text" name="sport" class="form-control" /> <br> 
		Country <input type="text" name="country" class="form-control"/> <br>
		Captain <input type="text" name="captain" class="form-control"/> <br>
		JerseyNo <input type="text" name="jerseyno" class="form-control"/> <br>
		Coach <input type="text" name="coach" class="form-control"/> <br>
		<button type="submit" value="Send" class="btn btn-info">Send</button>
	</form>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>