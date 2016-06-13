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
	<jsp:include page="includes/regheader.jsp"></jsp:include>

	<div class="text-center">
		<h3>
			<c:out value="${message}"></c:out>
		</h3>
	</div>

	<div class="collapse navbar-collapse">
		<div class="container" id="container1">
			<div class="row centered-form">
				<div
					class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title text-center">Please Register</h3>
						</div>
						<div class="panel-body">

							<c:if test="${not empty message}">
								<div class="panel-heading">
									<h3 class="panel-title text-center">${message}</h3>
								</div>
							</c:if>

							<form role="form" action="Register" method="post">
								<div class="form-group">
									<input type="text" name="first_name" id="first_name"
										class="form-control input-sm" placeholder="First Name"
										required>
								</div>

								<div class="form-group">
									<input type="text" name="last_name" id="last_name"
										class="form-control input-sm" placeholder="Last Name" required>
								</div>
								<div class="form-group">
									<input type="text" name="username" id="first_name"
										class="form-control input-sm" placeholder="Username" required>
								</div>

								<div class="form-group">
									<input type="email" name="email" id="email"
										class="form-control input-sm" placeholder="Email Address"
										required>
								</div>

								<div class="row">
									<div class="col-xs-12 col-sm-12 col-md-12">
										<div class="form-group">
											<input type="password" name="password" id="password"
												class="form-control input-sm" placeholder="Password"
												required>
										</div>
									</div>
								</div>

								<input type="submit" value="Register"
									class="btn btn-info btn-block">
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


	<jsp:include page="includes/footer.jsp"></jsp:include>


	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="js/jquery-1.11.2.min.js"></script>

	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.js"></script>

</body>
</html>