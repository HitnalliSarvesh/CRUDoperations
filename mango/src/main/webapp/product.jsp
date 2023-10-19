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

<title>Product Page</title>
</head>
<body>
	<nav class="navbar bg-success" data-bs-theme="dark">
		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link"
				href="index1.jsp">Home</a></li>
			<li class="nav-item"><a class="nav-link active" href="product.jsp">Product</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="vendor.jsp">Vendor</a>
			</li>
		</ul>
	</nav>

	<form  action="product" method="post" > 
		Name <input type="text" name="name" /> 
		Price <input type="text" name="price" />  
		Type <input type="text" name="type" /> 
		Quantity <input type="text" name="quantity" /> 
		<button type="submit" value="Send" class="btn btn-info">Send</button>
	</form>

	<h1>This is Product Page</h1>
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>