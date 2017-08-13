<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">

    <%--<link rel="stylesheet" type="text/css" href="xxx.css">--%>
   <%-- <link rel="stylesheet" href="static/bootstrap-4.0.0-alpha.6-dist/css/bootstrap.css">--%>
    <link rel="stylesheet" href="../../static/bootstrap-4.0.0-alpha.6-dist/css/bootstrap-grid.css">
    <%--<link rel="stylesheet" href="static/bootstrap-4.0.0-alpha.6-dist/css/bootstrap-reboot.css">
    <script src="static/bootstrap-4.0.0-alpha.6-dist/js/bootstrap.js"/>--%>


    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

   <%-- <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>--%>

    <title>product</title>


</head>
<body>

<div class="row">
    <c:forEach var="product" items="${products}">
        <div class="col-4">
            <img src="${pageContext.request.contextPath}/images/${product.image}"
            width="50%" height="50%" style="padding: 10px 10px"/>
            <div class="row">
                <div class="col-12">
                <h4>${product.description}</h4>
                </div>
            </div>
        <div class="row">
            <div class="col-6">
                <fmt:formatNumber type="currency">${product.price}</fmt:formatNumber>


            </div>
            <div class="col-6" style="float: right">
                <a href="#" class="btn btn-success">Add to cart</a>
            </div>
        </div>

        </div>



    </c:forEach>


</div>



</body>
</html>