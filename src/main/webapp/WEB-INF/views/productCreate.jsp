<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">

    <link rel="stylesheet" type="text/css" href="xxx.css">

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">


    <title>product</title>
    <style>
        .forFieldSet  {
            width: 35em;
            margin-left: 30px;}

        span{
            float: left;
            width: 11em;
            margin-left: 15px;
        }


    </style>

</head>
<body>

<header>


</header>

<form method="post" action="../saveNewProducts" >
    <fieldset class="forFieldSet">
        <legend>Product Add form </legend>
    <%--<p><span> ProductID:</span></p>--%>
    <%--<p>
        <input class="input1" type="text" name="productId" value="${product.productId}"></p>
    --%>
        <p><span>Product name:</span>

            <input class="input1" type="text" name="productName"value="${product.productName}"></p>


    <p><span>Description:</span>

        <input class="input1" type="text" name="description"value="${product.description}"></p>

    <p><span>ImageLink:</span>
    <input class="input1" type="file" name="image" value="${product.image}" ></p>


    <p><span>Price:</span>

        <input class="input1" type="text" name="price" value="${product.price}"></p>

    <%--<p> Type: </p>
    <p>
        <input class="input1" type="checkbox" name="type" value="${product.type}"></p>--%>

    <p>
        <span><strong>Product type</strong></span><select name="type">
            <option value="CLOTHING">CLOTHING</option>
            <option value="SHOES">SHOES</option>
            <option value="BOOKS">BOOKS</option>
            <option value="AUDIO">AUDIO</option>
            <option value="ELECTRONICS">ELECTRONICS</option>
            <option value="HOUSEHOLDITEMS">HOUSEHOLDITEMS</option>
            <option value="FURNITURE">FURNITURE</option>
        </select>
    </p>

       <button type="submit" class="btn btn-success"> Save </button>

        <form action="/products/deletedproducts?productId=${productId}" RequestMethod.DELETE>

            <button type="submit" class="btn btn-danger">Remove</button>
</form>


    </fieldset>

</form>


</body>
</html>