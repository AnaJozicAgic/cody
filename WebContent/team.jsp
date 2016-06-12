<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <!-- stylesheet -->
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="css/font-awesome.min.css">
  <link rel="stylesheet" href="css/owl.carousel.css">
  <link rel="stylesheet" href="css/owl.theme.min.css">
  <link rel="stylesheet" href="css/animate.css">
  <link rel="stylesheet" href="css/main.css">

  <!-- google font -->
  <link href='http://fonts.googleapis.com/css?family=Oswald:300,400'
  rel='stylesheet'>
  <link href='http://fonts.googleapis.com/css?family=Open+Sans'
  rel='stylesheet' type='text/css'>
  <link href='http://fonts.googleapis.com/css?family=PT+Sans'
  rel='stylesheet' type='text/css'>
  <link
  href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,300'
  rel='stylesheet' type='text/css'>
  <link href='http://fonts.googleapis.com/css?family=Oxygen:400,300'
  rel='stylesheet' type='text/css'>
  <link href="http://fonts.googleapis.com/css?family=Rouge+Script"
  rel="stylesheet" type="text/css">
  <link href='http://fonts.googleapis.com/css?family=Milonga'
  rel='stylesheet' type='text/css'>

</head>
<body>
  <br>
  <ul class="nav navbar-nav navbar-right">
    <a href="home.jsp">
      <button class="btn btn-default">
        <span class="glyphicon glyphicon-log-in"></span>&nbsp;Home
      </button>
    </a>

  </ul>

  <div class="content-block" id="testimonials">


    <header class="block-heading cleafix text-center">
      <h1>Meet Our Team</h1>
      <!-- <p>Lorem Ipsum Text</p> -->
    </header>
    <div class="block-content text-center">
      <div class="container">
        <div class="row">
          <div class="col-md-6 col-md-offset-3">
            <div class="owl-carousel">
              <div class="owl-item">
                <div class="testimonial">
                  <img
                  src="http://img.freepik.com/free-vector/flat-screens-with-web-elements_23-2147543851.jpg?size=338c&ext=jpg"
                  alt="Ana foto" /> <strong>Ana Agic Jozic</strong><br> <span>Team
                  Lead, Java Developer</span>
                </div>
              </div>
              <!-- owl-item -->
              <div class="owl-item">
                <div class="testimonial">
                  <img
                  src="http://img.freepik.com/free-vector/flat-screens-with-web-elements_23-2147543851.jpg?size=338c&ext=jpg">
                  <strong>Dijana Markovic</strong><br> <span>Java
                  Developer</span>
                </div>
              </div>
              <!-- owl-item -->
              <div class="owl-item">
                <div class="testimonial">
                  <img
                  src="http://img.freepik.com/free-vector/flat-screens-with-web-elements_23-2147543851.jpg?size=338c&ext=jpg">

                  <strong>Ensar Bavrk</strong><br> <span>Head of
                  Ideas, Java Developer</span>
                </div>
              </div>
              <!-- owl-item -->
              <div class="owl-item">
                <div class="testimonial">
                  <img src="http://img.freepik.com/free-vector/flat-screens-with-web-elements_23-2147543851.jpg?size=338c&ext=jpg"">
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

  <footer class="navbar navbar-fixed-bottom">
    <div class="row spacer">
      <div class="text-center col-md-6 col-md-offset-3">
        <p>Copyright &copy; 2016 Ana, Dijana, Ensar & Mladen</p>
      </div>
    </div>
  </footer>

  <script>
    new WOW().init();
  </script>

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