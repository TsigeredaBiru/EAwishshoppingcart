<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <link rel="stylesheet" href="/bootstraps/css/bootstrap.min.css">
    <title>Product Details</title>
</head>
<body>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">WishSoppingCart</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#">Page 1</a></li>
            <li><a href="#">Page 2</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
            <li><a href="#"><span class="glyphicon glyphicon-user"></span> Hello User!</a></li>
        </ul>
    </div>
</nav>
<div class="container-wrapper">
    <div class="container">
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Product Details</h1>
                    <p>Your product details!</p>
                </div>
            </div>

        </section>
    </div>
</div>

<img src="${product.image}" width="50%" height="50%" style="padding: 10px 10px"/>
<div class="productdisplay">
    <p>${product.description}</p>
    <p>${product.price}</p>
    <p>${product.type}</p>

    <label>Quantity:</label><input type="number" class="item_quantity" id="#" value="#" style="width: 50px">


    <a href="#" class="btn btn-success">Add to cart</a>

</div>

<div class="container">
    <a href="<c:url value="/shop/index"/>" class="btn btn-success">Back to shopping</a>
    <a href="<c:url value="/shop/checkout"/>" class="btn btn-success" style="float: right">Proceeed Checkout</a>
</div>
</body>
</html>

