<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

</head>
<body>
	<jsp:include page="includes/welcomeheader.jsp"></jsp:include>

	<div class="container" class="row" class="col-md-10">
		<div class="page-header">
			<h1 class="text-primary">
				Thanks for giving Cody a try
				<c:out value="${param.name}" default=""></c:out>
			</h1>
		</div>
	</div>

	<div class="container" class="row" class="col-md-12">
		<form role="form" action="listsnipets" method="get">
			<div class="form-group">
				<div class="input-group">
					<input type="text" name="search" class="form-control"
						placeholder="Search  Snippet "> <span
						class="input-group-btn">
						<button name="submit" class="btn btn-primary" type="submit"
							value="search">search</button>
					</span>
				</div>
			</div>
		</form>
	</div>

	<div class="container">
		<div class="row">
			<form action="listsnipets" method="get">
				<div class="col-md-6">
					<button name="submit" class="btn btn-block btn-lg btn-info"
						value="list">List All Snippets</button>
				</div>
				<div class="col-md-6">
					<a class="btn btn-block btn-lg btn-info" data-toggle="modal"
						data-target="#modal1">Add Snippet</a>
				</div>
			</form>
		</div>

		<hr>
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-default text-center">This is first 10 snippets
				</h1>
				<hr>
			</div>
		</div>
	</div>

	<div class="container" class="well" class="table-responsive">
		<form action="">
			<table class="table table-striped">
				<thead>
					<tr class="info">
						<th>Number</th>
						<th>Snippet Name</th>
						<th>Author</th>
						<th>Show</th>
					</tr>
				</thead>
				<c:forEach items="${snipets}" var="snipet">
					<tbody>

						<td><c:out value="${snipet.name}" /></td>
						<td><c:out value="${snipet.usernameId}" /></td>
						<td>
							<p data-placement="top" data-toggle="tooltip" title="Show">
								<button type="submit" name="show" value="${snipet.textSnipet}"
									class="btn btn-success btn-md" data-toggle="modal"
									data-target="#modal3">
									<span class="glyphicon glyphicon-list-alt"></span>
								</button>
							</p>
						</td>
					</tbody>
				</c:forEach>
			</table>
		</form>
	</div>

	<jsp:include page="includes/footer.jsp"></jsp:include>

	<div class="modal fade" id="modal1">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h2 class="modal-title text-muted">Add your Snippet Below</h2>
				</div>
				<div class="modal-body">
					<form role="form">
						<div class="form-group">
							<input class="form-control" placeholder="Snippet Name"
								type="text">
						</div>
					</form>
					<form role="form">
						<div class="form-group">
							<textarea rows="20" cols="20" class="form-control"
								placeholder="Snippet Code" type="text"></textarea>
						</div>
					</form>
					<div class="modal-footer">

						<a class="btn btn-warning btn-md" data-dismiss="modal">Cancel</a>
						<a class="btn btn-md btn-success">Save Snippet</a>
					</div>
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
						<a class="btn btn-block btn-warning btn-lg center-block"
							data-dismiss="modal">Cancel</a>
					</form>
				</div>
			</div>
		</div>
	</div>

	<div class="modal fade" id="modal3">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h2 class="modal-title text-muted">El ubaciti ime snipeta ovde</h2>
				</div>
				<div class="modal-body">
					<pre>
					
					<code> El naredba ide ovde da ispise code koji je korisnik stisnua na show ikoni </code>
                                        
                    </pre>
				</div>
				<div class="modal-footer">
					<form action="">
						<button class="btn btn-s  btn-primary">
							Edit <span class="glyphicon glyphicon-pencil"></span>

						</button>
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