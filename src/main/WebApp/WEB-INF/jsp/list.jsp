<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<style>
button[type=btn] {
    background-color:  #4040a1;
    color: white;
       border: none;
    border-radius: 5px;
    cursor: pointer;
    padding-left: 5%;
	padding-right: 15%;
	box-sizing:border-box;
	width: 120px;
	height: 40px;
    display:inline-block;

}

button[type=btn]:hover {
    background-color: #45a049;
	
	
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LIST OF BOOKS</title>
</head>
<body>
<div class="wrapper">

			<div><%@ include file="../../layout/header.jsp"%></div>
			<div class="content">
				<div class="container-fluid">

					<div class="row">
						<div class="col-md-4">
							
									<h4>List of Books</h4>
								
							
<form action="/Book" method="GET">


<c:forEach items="${books}" var="Book">
								<div>
                        <img src="../assets/images/java.jpeg" alt="dbms" align="left" style="width:200px;height:120px;">
                        </div>	
								
									<p><span>ID:</span>${Book.id}</p>
									<p><span>TITLE:</span>${Book.name}</p>
									<p><span>Price:</span>${Book.price}</p>
									
								<div>
										<button type="btn"><a href="../Book/${Book.id}">ViewDetails</a></button>
									</div>
								</c:forEach>
							
<button align="top" type="btn"><a href="logout">LogOut</a></button>	
					
						
</form>
</div>
</div>
</div>
</div>
</div>


</body>
</html>

