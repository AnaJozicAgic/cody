<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html class="no-js">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Home Page</title>
  <meta name="description" content="">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="robots" content="all,follow">
  <!-- Bootstrap and Font Awesome css-->
  <link rel="stylesheet" href="css/font-awesome.css">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <!-- Google fonts-->
  <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Pacifico">
  <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700">
  <!-- Theme stylesheet-->
  <link rel="stylesheet" href="css/style.default.css" id="theme-stylesheet">
  <!-- Custom stylesheet - for your changes-->
  <link rel="stylesheet" href="css/custom.css">
  
  
  
</head>
<body>
  <div class="main"> 
    <!-- video background-->
    <!-- replace URLs with your video content URL-->
    <video id="video-background" preload="auto" autoplay="true" loop="loop" muted="muted" volume="0">
      <source src="MP4/Noted.mp4" type="video/webm">
        <source src="MP4/Noted.mp4" type="video/mp4">
        </video>
        
        

        <div class="container">

         <ul class="nav navbar-nav navbar-right">
           <a href="login.jsp">
            <button>
             <span
             class="glyphicon glyphicon-log-in"></span>&nbsp;Log in
           </button>
         </a>
         
         <a href="register.jsp"> 
          <button >
            <span
            class="glyphicon glyphicon-user"> </span>&nbsp;Sign Up
          </button>
        </a>
        
        
      </ul>
      <h1 class="cursive">Team X Snippet App</h1>
      <h2 class="sub">If you have a problem with your code and you're
        asking for help. No one wants to see your whole application. They
        want you show them a Code Snippet which they can use to reproduce
        the problem.</h2>
        <div class="mailing-list">
          <h3 class="mailing-list-heading">Join our Code Snippet App and
           we will make your coding easy!</h3>
           <div class="row">
             <a href="team.jsp"> <button class="btn btn-default">
              Our Team
            </button>
          </a>

        </div>
      </div>
    </div>
  </div>


  <!-- JAVASCRIPT FILES -->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
  <script>window.jQuery || document.write('<script src="javascripts/vendor/jquery-1.11.0.min.js"><\/script>')</script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/jquery.cookie.js"></script>
  <script src="js/front.js"></script>
  <!-- Google Analytics: change UA-XXXXX-X to be your site's ID.-->
  <script>
  (function(b,o,i,l,e,r){b.GoogleAnalyticsObject=l;b[l]||(b[l]=
    function(){(b[l].q=b[l].q||[]).push(arguments)});b[l].l=+new Date;
  e=o.createElement(i);r=o.getElementsByTagName(i)[0];
  e.src='//www.google-analytics.com/analytics.js';
  r.parentNode.insertBefore(e,r)}(window,document,'script','ga'));
  ga('create','UA-XXXXX-X');ga('send','pageview');
  </script>
</body>
</html>