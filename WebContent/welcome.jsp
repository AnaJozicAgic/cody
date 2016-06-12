<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>

<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link
	href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<style>
#border {
	border: 3px #ffa366 dashed;
}

hr {
	margin: 5px;
}

pre {
	margin-right: 30px;
}
</style>
</head>
<body>
	<nav class="navbar navbar-default">

		<div class="container container-fluid">

			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="welcome.jsp"> BILD IT TEAM X </a>
			</div>

			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="welcome.jsp"> <span
							class="glyphicon glyphicon-new-window"></span>&nbsp;Home
					</a></li>
					<li><a href="#modal2" data-toggle="modal"
						data-target="#modal2"> <span class="glyphicon glyphicon-off"></span>&nbsp;Logout
					</a></li>

				</ul>

			</div>
			<!-- end collapse navbar-collapse -->
	</nav>
	
	
	<div class="section">
		<div class="container">
			<div class="row">
				<div class="col-md-10">
					<div class="page-header">
						<h1 class="text-primary">Welcome, ${user.username}</h1>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="text-center">
		<h3><c:out value="${message}"></c:out></h3>
	</div>

	<div class="section">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<form role="form" action="listsnipets" method="post">
						<div class="form-group">
							<div class="input-group">
								<input type="text" class="form-control"
									placeholder="Search  Snippet "> 
									<span class="input-group-btn"> 
									<button name="search" class="btn btn-primary"
									type="submit">search</button>
								</span>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<div class="section">
		<div class="container">
			<div class="row">
				<div class="col-md-offset-8 col-md-4">
					<a class="btn btn-block btn-lg btn-warning" data-toggle="modal"
						data-target="#modal1">Add Snippet</a>
				</div>
			</div>
			<div class="row">
				<div class="col-md-offset-8 col-md-4">
					<form action="listsnipets" method="get">
						<button name="submit" class="btn btn-block btn-lg btn-warning" value="list">List All Snippets</button>
					</form>
				</div>
			</div>
			<hr>
		</div>

	</div>
<!-- 	<div class="section container"> -->

<!-- 		<div class="row"> -->
<!-- 			<div class="col-lg-12"> -->
<!-- 				<div id="snippet_item" class="container"> -->
<!-- 					<div class="row"> -->
<!-- 						<div class="col-md-12" id="border"> -->
<!-- 							<div class="container"> -->
<!-- 								<div class="row"> -->
<!-- 									<div class="col-md-12"> -->
<!-- 										<h3 class="text-primary">Name of snippet goes here</h3> -->
										
<!-- 										<pre> -->
<%-- 										 <code>   </code> --%>
<!--                                         </pre> -->
                                        
<!-- 										<div class="col-md-12"> -->
<!-- 											<button type="submit" name="" value="" -->
<!-- 												class="btn btn-primary btn-xs active"> -->
<!-- 												<span class="glyphicon glyphicon-pencil"></span>Edit -->
<!-- 											</button> -->
<!-- 										</div> -->
<!-- 									</div> -->
<!-- 								</div> -->
<!-- 							</div> -->

<!-- 						</div> -->
<!-- 					</div> -->
<!-- 				</div> -->
<!-- 			</div> -->
<!-- 		</div> -->
<!-- 	</div> -->



	<footer class="navbar navbar-fixed-bottom">
		<div class="row spacer">
			<div class="text-center col-md-6 col-md-offset-3">
				<p>Copyright &copy; 2016 Ana, Dijana, Ensar & Mladen</p>
			</div>
		</div>
	</footer>
	<div class="modal fade" id="modal1">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h2 class="modal-title text-muted">Add your Snippet Below</h2>
				</div>
				<div class="modal-body">
					<form role="form" action="AddSnippet" method="post">
						<div class="form-group">
							<input class="form-control" name="snippetName" id="exampleInputEmail1"
								placeholder="Snippet Name" type="text">
						</div>

						<div class="form-group">
							<textarea class="form-control" name="snippetCode" id="exampleInputEmail1"
								placeholder="Snippet Code" type="text"></textarea>
						</div>

					<div class="modal-footer">
	
						<a class="btn btn-default btn-lg" data-dismiss="modal">Close</a> 
						<button type="submit" class="btn btn-lg btn-warning" name="save">Save Snippet</button>
					</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<div class="modal fade" id="modal2">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h2 class="modal-title text-center text-muted">Are you sure
						you want to logout?</h2>
				</div>
				<div class="modal-footer">
					<form action="Logout" method="get">
						<button class="btn btn-block btn-lg btn-success center-block">Confirm</button>
						<a class="btn btn-block btn-danger btn-lg center-block"
							data-dismiss="modal">Cancel</a>
					</form>
				</div>
			</div>
		</div>
	</div>

	<script type="text/javascript"
		src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
	<script type="text/javascript"
		src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</body>
</html>