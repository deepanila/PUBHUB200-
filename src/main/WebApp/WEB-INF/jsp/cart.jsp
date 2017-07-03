<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <!--  <%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> -->
   <!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List</title>
<style>
</style>
</head>
<body>
<body>
<div class="wrapper">

			<div><%@ include file="../../layout/header.jsp"%></div>
			<div class="content">
				<div class="container-fluid">

					<div class="row">
						<div class="col-md-4">
						<h5>My Cart</h5>
											<c:if test="${empty MY_CART_ITEMS || MY_CART_ITEMS.orderItems.isEmpty()}">
						<img src="../assets/images/empty-cart.png" width="300" />
						<h5>Your Shopping Cart is empty</h5>
						
					</c:if>
				  <c:if test="${!empty MY_CART_ITEMS && !MY_CART_ITEMS.orderItems.isEmpty()}"> 
						<table border="1" class="table table-bordered">
							<thead>
								<tr>
									<th width="10%">#</th>
									<th>Item Name</th> 
									<th>Quantity</th>
									<th>Total Cost</th>
								</tr>
							</thead>
							<tbody>

								<c:forEach items="${MY_CART_ITEMS.orderItems}" var="item"
									varStatus="loop">
									<tr>
										<td>${loop.index+1}</td>
										<td>${selectbook.name}</td> 
										<td>${item.quantity}</td>
										<td>Rs.${selectbook.price*item.quantity }</td>
										<td><a href="../OrderItem/remove?id=${loop.index}"
											class="btn btn-danger">Remove</a>
									</tr>
								</c:forEach>
							</tbody>
						</table>


						<br />
						<a href="../Book/book" class="btn btn-info">Continue Shopping</a>


					</c:if>
				</div>

				<c:if test="${ MY_CART_ITEMS != null && MY_CART_ITEMS.orderItems.size()>0}">
					<div class="col-md-4">
						<b>Price Details</b>

						<c:set var="no_of_items"
							value="${MY_CART_ITEMS.orderItems.size()}" />
						<c:set var="total_price" value="0" />
						<c:forEach items="${MY_CART_ITEMS.orderItems}" var="item">
							<c:set var="total_price"
								value="${total_price +selectbook.price*item.quantity}" />
						</c:forEach>
						</div>
						
						
					
</form>
						<form name="orderForm" action="../Order/save" method="POST">
							<input type="hidden" name="total_price" value="${total_price}" />
							<table border="1" class="table table-bordered">

								<tbody>
									<tr>
										<td>Price ( ${no_of_items != null ?no_of_items:0} items )</td>
										<td>Rs. ${total_price}</td>
									</tr>
									<tr>
										<td>Delivery Charges</td>
										<td>FREE</td>
									</tr>
									<tr>
										<th><b>Amount Payable </b></th>
										<th><b>Rs. ${total_price}</b></th>
									</tr>
									<tr>
										<td colspan="2" align="center">
										
										<button type="submit" 
											class="btn btn-success btn-block" >Place an Order</button></td>
									</tr>
								</tbody>
							</table>
						</form>
					
				</c:if>
	</div>
	</div>
	</div>
	</div>
	</div>
			
			
</body>
</html>
