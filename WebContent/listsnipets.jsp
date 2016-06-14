<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

	<div class="section">
		<div class="container">
			<div class="row">
				<div class="col-md-10">
					<div class="page-header">
						<h1 class="text-primary">
							Thanks for giving Cody a try
							<c:out value="${user.name}" default="Guest"></c:out>
						</h1>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="container" class="well" class="table-responsive">
		<form action="" method="">
			<table class="table table-striped">
				<thead>
					<tr class="info">
						<th>Snippet Name</th>
						<th>Author</th>
						<th>Show</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${snippets}" var="snippet">
						<tr>

							<td><c:out value="${snippet.name}" /></td>
							<td><c:out value="${snippet.usernameId}" /></td>

							<td>
								<p data-placement="top" data-toggle="tooltip" title="Show">
									<button type="submit" name="show" value="${snippet.textSnipet}"
										class="btn btn-success btn-md a" data-toggle="modal"
										data-target="#modal3">
										<span class="glyphicon glyphicon-list-alt"></span>
									</button>
								</p>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</form>
	</div>

	<jsp:include page="includes/footer.jsp"></jsp:include>

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
	
	<div class="modal fade" id="modal3">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h2 class="modal-title text-muted">Expresion Leanguage</h2>
				</div>
				<div class="modal-body">
					<pre>
					
					<code> Expresion Leangiage </code>
                                        
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