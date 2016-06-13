<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- stylesheet -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="css/owl.carousel.css">
<link rel="stylesheet" href="css/owl.theme.min.css">
<link rel="stylesheet" href="css/animate.css">
<link rel="stylesheet" href="css/main.css">


</head>
<body>
	<div class="container">
		<jsp:include page="includes/logoutheader.jsp"></jsp:include>

		<div class="content-block" id="testimonials">
			<header class="block-heading cleafix text-center">
				<h1>Meet Our Team</h1>
			</header>
			<div class="block-content text-center">
				<div class="container">
					<div class="row">
						<div class="col-md-6 col-md-offset-3">
							<div class="owl-carousel">
								<div class="owl-item">
									<div class="testimonial">
										<img
											src="http://img.freepik.com/free-vector/flat-screens-with-web-elements_23-2147543851.jpg?size=338c&ext=jpg" />
										<br> <strong>Ana Agic Jozic</strong><br> <span>Team
											Lead, Java Developer</span>
									</div>
								</div>
								<!-- owl-item -->
								<div class="owl-item">
									<div class="testimonial">
										<img
											src="http://img.freepik.com/free-vector/flat-screens-with-web-elements_23-2147543851.jpg?size=338c&ext=jpg">
										<br>
										<strong>Dijana Markovic</strong><br> <span>Java
											Developer</span>
									</div>
								</div>
								<!-- owl-item -->
								<div class="owl-item">
									<div class="testimonial">
										<img
											src="http://img.freepik.com/free-vector/flat-screens-with-web-elements_23-2147543851.jpg?size=338c&ext=jpg">

										<br> <strong>Ensar Bavrk</strong><br> <span>Head
											of Ideas, Java Developer</span>
									</div>
								</div>
								<!-- owl-item -->
								<div class="owl-item">
									<div class="testimonial">
										<img
											src="http://img.freepik.com/free-vector/flat-screens-with-web-elements_23-2147543851.jpg?size=338c&ext=jpg"">
										<br>
										<strong>Dejan Mladjenovic </strong><br> <span>Java
											Developer</span>
									</div>
								</div>
								<!-- owl-item -->
							</div>
							<!-- owl-carousel -->
						</div>
						<!-- col-md-12 -->
					</div>
					<!-- row -->
				</div>
				<!-- container -->
			</div>
			<!-- block-content -->
		</div>
		<!-- content-block -->

		<jsp:include page="includes/footer.jsp"></jsp:include>

	</div>

	<script src="js/jquery-2.1.3.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.actual.min.js"></script>
	<script src="js/isotope.pkgd.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/jquery.isonscreen.js"></script>

	<script src="js/main.js"></script>
	<script>
    $(document).ready(function() {
    $('.owl-carousel').owlCarousel({
    loop : true,
    margin : 10,
    autoplay : true,
    autoplayTimeout : 3000,
    autoplayHoverPause : true,
    responsiveClass : true,
    responsive : {
    0 : {
    items : 1,
  },
  600 : {
  items : 1,
},
1000 : {
items : 1,
}
}
})
});
</script>
</body>
</html>