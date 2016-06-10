<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<!-- stylesheet -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<link rel="stylesheet" href="../public/css/bootstrap.min.css">
	<link rel="stylesheet" href="../public/css/main.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
	

	<!-- google font -->
	<link href='http://fonts.googleapis.com/css?family=Oswald:300,400' rel='stylesheet'>
	<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=PT+Sans' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,300' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Oxygen:400,300' rel='stylesheet' type='text/css'>
	<link href="http://fonts.googleapis.com/css?family=Rouge+Script" rel="stylesheet" type="text/css">
	<link href='http://fonts.googleapis.com/css?family=Milonga' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="css/style.css">
	<title>Log in Page</title>


</head>
<body>
	<nav class="navbar navbar-default">

		<div class="container container-fluid">

			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="bbb"> BILD IT TEAM X </a>
			</div>

			<ul class="nav navbar-nav navbar-right">
				<li ><a href="home.jsp">
					<span class="glyphicon glyphicon-new-window"></span>&nbsp;Home </a></li>
					
				</ul>
				
			</div><!-- end collapse navbar-collapse -->
		</div>
	</nav>

	<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		<div class="container" id="container1">
			<div class="row centered-form">
				<div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title text-center">Please Register</h3>
						</div>
						<div class="panel-body">
							<form role="form">
								<div class="form-group">
									<input type="text" name="first_name" id="first_name" class="form-control input-sm" placeholder="First Name">
								</div>

								<div class="form-group">
									<input type="text" name="last_name" id="last_name" class="form-control input-sm" placeholder="Last Name">
								</div>
								<div class="form-group">
									<input type="text" name="username" id="first_name" class="form-control input-sm" placeholder="Username">
								</div>

								<div class="form-group">
									<input type="email" name="email" id="email" class="form-control input-sm" placeholder="Email Address">
								</div>

								<div class="row">
									<div class="col-xs-6 col-sm-6 col-md-6">
										<div class="form-group">
											<input type="password" name="password" id="password" class="form-control input-sm" placeholder="Password">
										</div>
									</div>
									<div class="col-xs-6 col-sm-6 col-md-6">
										<div class="form-group">
											<input type="password" name="password_confirmation" id="password_confirmation" class="form-control input-sm" placeholder="Confirm Password">
										</div>
									</div>
								</div>

								<input type="submit" value="Register" class="btn btn-info btn-block">
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>


		<footer class="navbar navbar-fixed-bottom">
			<div class="row spacer" >
				<div class="text-center col-md-6 col-md-offset-3">
					<p>Copyright &copy; 2016 Ana, Dijana, Ensar & Mladen</p>
				</div>
			</div>
		</footer>


		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) --> 
		<script src="js/jquery-1.11.2.min.js"></script> 

		<!-- Include all compiled plugins (below), or include individual files as needed --> 
		<script src="js/bootstrap.js"></script>

	</body>
	</html>