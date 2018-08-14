<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>magExpress</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/templates/public/assets/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/templates/public/assets/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/templates/public/assets/css/animate.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/templates/public/assets/css/slick.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/templates/public/assets/css/theme.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/templates/public/assets/css/style.css">
<!--[if lt IE 9]>
<script src="assets/js/html5shiv.min.js"></script>
<script src="assets/js/respond.min.js"></script>
<![endif]-->
</head>
<body>
<div id="preloader">
  <div id="status">&nbsp;</div>
</div>
<a class="scrollToTop" href="#"><i class="fa fa-angle-up"></i></a>
<div class="container">
  <header id="header">
    <div class="row">
      <div class="col-lg-12 col-md-12">
        <div class="header_top">
          <div class="header_top_left">
            <ul class="top_nav">
              <li><a href="index.jsp">Home</a></li>
              <li><a href="pages/page.jsp">About</a></li>
              <li><a href="pages/contact.jsp">Contact</a></li>
              <li><a href="pages/404.jsp">Error Page</a></li>
            </ul>
          </div>
          <div class="header_top_right">
            <form action="#" class="search_form">
              <input type="text" placeholder="Text to Search">
              <input type="submit" value="">
            </form>
          </div>
        </div>
        <div class="header_bottom">
          <div class="header_bottom_left"><a class="logo" href="index.jsp">mag<strong>Express</strong> <span>A Pro Magazine Template</span></a></div>
          <div class="header_bottom_right"><a href="#"><img src="<%=request.getContextPath() %>/templates/public/images/addbanner_728x90_V1.jpg" alt=""></a></div>
        </div>
      </div>
    </div>
  </header>
  <div id="navarea">
    <nav class="navbar navbar-default" role="navigation">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav custom_nav">
            <li class=""><a href="index.jsp">Home</a></li>
            <li class="dropdown"> <a href="#" class="" data-toggle="dropdown" role="button" aria-expanded="false">Archives</a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="pages/archive-main.jsp">Archive</a></li>
                <li><a href="pages/archive1.jsp">Archive 1</a></li>
                <li><a href="pages/archive2.jsp">Archive 2</a></li>
                <li><a href="pages/archive3.jsp">Archive 3</a></li>
              </ul>
            </li>
            <li><a href="pages/single.jsp">Single page</a></li>
            <li><a href="pages/contact.jsp">Contact</a></li>
            <li><a href="pages/404.jsp">404 page</a></li>
          </ul>
        </div>
      </div>
    </nav>
  </div>