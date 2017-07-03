<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <!DOCTYPE html>
<html>
<head>
<style>
button[type=btn] {
    background-color:  #87bdd8;
    color: white;
       border: none;
    border-radius: 5px;
    cursor: pointer;
    padding-left: 5%;
	padding-right: 15%;
	box-sizing:border-box;
	width: 40px;
	height: 40px;
    display:inline-block;

}

button[type=btn]:hover {
    background-color: #45a049;
	
	
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BookDetails</title>
</head>
<body>
<body>
<%@ include file="../../layout/header.jsp"%>
	<div class="content">
		<div class="container-fluid">

			<div class="row">

				<div class="col-md-8">

<!-- <form action="../OrderItem/addToCart" method="POST"> -->
<form action="../OrderItem/addToCart" method="POST">
<div align="left">

<h1>BookDetails</h1>
                           
				<c:if test="${empty LOGGED_IN_USER}">
					<div class="alert alert-danger" role="alert">
						Please <strong>Login</strong> to add items to cart.
					</div>
				</c:if>
							<input type="hidden" name="book_id" value="${selectbook.id}" />
							
						
									
									<p><span>TITLE:</span>${selectbook.name}</p>
									<p><span>PUBLISHDATE:</span>${selectbook.releasedDate}</p>
									<p><span>PRICE:</span>${selectbook.price}</p>
									
									
									
									<p><span>Quantity:</span><input type="number" name="quantity" min="1" max="100" value="1" required></p>
								
									
		<button type="btn" class="btn btn-primary">AddToCart</button>
									
									
														
												

</div>
</form>
</div>
</div>
</div>
</div>

</body>
</html>
