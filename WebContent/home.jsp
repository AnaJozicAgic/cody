<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">

<title>Home Page</title>
<link rel="stylesheet" href="css/font-awesome.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.default.css"
	id="theme-stylesheet">
</head>
<body>
	<div class="main">

		<video id="video-background" preload="auto" autoplay="true"
			loop="loop" muted="muted" volume="0">
			<source src="MP4/Typing.mp4" type="video/mp4">
		</video>
		<div class="container">

			<jsp:include page="includes/logoutheader.jsp"></jsp:include>

			<h1 class="cursive">Team X Snippet App</h1>
			<h2 class="sub">If you have a problem with your code and you're
				asking for help. No one wants to see your whole application. They
				want you show them a Code Snippet which they can use to reproduce
				the problem.</h2>
			<div class="mailing-list">
				<h3 class="mailing-list-heading">Join our Code Snippet App and
					we will make your coding easy!</h3>
				<a href="team.jsp">
					<button class="btn btn-default">Our Team</button>
				</a>
			</div>
		</div>
	</div>

	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.cookie.js"></script>
	<script src="js/front.js"></script>

</body>
</html>