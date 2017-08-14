<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <title>Cart</title>
</head>
<body>
<header>

</header>

<div class="container-wrapper">
    <div class = "container">
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Shopping Cart</h1>
                    <p>All yours selected products!</p>
                </div>
            </div>
        </section>
        <section>
            <div>
                <a class="btn btn-danger pull-left"><span class="glyphicon glyphicon-remove-sign"></span>Clear Cart</a>
            </div>
            <table class="table table-hover">
                <thead>
                <tr>
                    <th>Product</th>
                    <th>Unit Price</th>
                    <th>Quantity</th>
                    <th>Total Price</th>
                    <th>Action</th>
                </tr>
                </thead>
                <tbody>

                <tr>
                    <td>product name</td>
                    <td>product price</td>
                    <td>quantity</td>
                    <td>total price</td>
                    <td>remove button</td>
                </tr>

                <tr>
                    <th></th>
                    <th></th>
                    <th>Grand Total</th>
                    <th>grand total</th>
                    <th></th>
                </tr>

                <%--<c:forEach var="order" items="${order}">
                    <tr>
                        <td>${order.orderline.product.image}</td>
                        <td>${order.orderline.product.description}
                            <ul>
                                <li>by${order.user.username}</li>
                                <li>Shipped from${order.shipping.shipId}</li>
                            </ul>
                            <form action="/products/delete?productId=${product.productId}" method="post">
                                <button type="submit" class="btn btn-danger">Delete</button>
                            </form>
                        </td>
                        <td>${order.orderline.product.price}</td>
                        <td>${order.orderline.quantity}</td>
                    </tr>
                </c:forEach>--%>
                </tbody>
            </table>
            <a href="shopcontinue"><button type="button" class="btn btn-primary pull-left">Continue Shopping</button></a>
            <a href="checkout.jsp"><button type="button" class="btn btn-primary pull-right">Proceed to Checkout</button></a>
        </section>
    </div>
</body>
</html>

