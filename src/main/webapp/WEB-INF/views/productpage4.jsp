<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">

    <link rel="stylesheet" type="text/css" href="../../static/pageStyle.css">
    <!-- Bootstrap Core CSS -->
    <link href="static/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- MetisMenu CSS -->
    <link href="static/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="static/css/sb-admin-2.min.css" rel="stylesheet">
    <!-- Custom Fonts -->
    <link href="static/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <title>product</title>

</head>
<body>
<div id="wrapper">
    <!-- Navigation -->
    <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
        <div class="navbar-header">
            <p>where I am located????</p>
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <input type="text" name="search">
            <a class="navbar-brand" href="/">WishShoppingCart</a>
        </div>
        <!-- /.navbar-header -->
       <p>Tsigereda tsigereda tsigereda tsigereda</p>

        <ul class="nav navbar-top-links navbar-right">

            <!-- /.dropdown -->
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                    <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
                </a>
                <ul class="dropdown-menu dropdown-user">
                    <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                    </li>
                    <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                    </li>
                    <li class="divider"></li>
                    <li><a href="/logout"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                    </li>
                </ul>

            </li>

        </ul>

    </nav>


        </div>
        <!-- /.row -->

                    <!-- /.panel-heading -->
                    <div class="col-2">this is col 2</div>
                    <div class="panel-body">
                    <p>hello this is panel body</p>
                    </div>


<!-- jQuery -->
<script src="static/vendor/jquery/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="static/vendor/bootstrap/js/bootstrap.min.js"></script>

<!-- Metis Menu Plugin JavaScript -->
<script src="static/vendor/metisMenu/metisMenu.min.js"></script>

<!-- Morris Charts JavaScript -->
<script src="static/vendor/raphael/raphael.min.js"></script>
<script src="static/vendor/morrisjs/morris.min.js"></script>


<!-- Custom Theme JavaScript -->
<script src="static/js/sb-admin-2.js"></script>



    <ul class="forImagelist">
    <c:forEach var="product" items="${products}">
        <li>
           <a href="123"> <img src="${pageContext.request.contextPath}/images/${product.image}"
            width="50%" height="50%" style="padding: 10px 10px"/></a>


                <h4>${product.description}</h4>

            <p>
                <fmt:formatNumber type="currency">${product.price}</fmt:formatNumber>


            </p>
            <p>
                <a href="#" class="btn btn-success">Add to cart</a>
            </p>


        </li>



    </c:forEach>






</body>
</html>