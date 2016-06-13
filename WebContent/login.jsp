<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!--  directive -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="css/style.css">
<title>Log in Page</title>
</head>
<body>
	<jsp:include page="includes/logheader.jsp"></jsp:include>

	<div class="text-center">
		<h3>
			<c:out value="${message}"></c:out>
		</h3>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-sm-6 col-md-4 col-md-offset-4">
				<div class="account-wall">
					<img class="profile-img"
						src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=120"
						alt="">
					<h1 class="text-center login-title">Please Log In</h1>

					<form class="form-signin" action="LoginHendler" method="post">
						<input type="text" class="form-control" placeholder="User name"
							name="username" required autofocus> <input
							type="password" class="form-control" placeholder="Password"
							required name="password">
						<button class="btn btn-lg btn-info btn-block" type="submit"
							name="action" value="login">Log in</button>
					</form>
				</div>
			</div>
		</div>
	</div>

	<jsp:include page="includes/footer.jsp"></jsp:include>F


	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="js/jquery-1.11.2.min.js"></script>

	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.js"></script>


</body>
</html>