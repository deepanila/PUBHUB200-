<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<style>
input[type=text], select, textarea {
    width:50%
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing:border-box ;
    margin-top: 6px;
    margin-bottom: 10px;
	width:200px;
	height:40px;
    resize: vertical;
}

input[type=password], select, textarea {
    width:50%
	height:40px;
	width:200px;
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing:border-box ;
    margin-top: 6px;
    margin-bottom: 10px;
    resize: vertical;
    display:inline-block;
}
button[type=submit] {
    background-color: #4CAF50;
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

button[type=submit]:hover {
    background-color: #45a049;
	
	
}

.container {
    border-radius:8px;
    background-color: #f2f2f2;
    padding:10px;
    width:500px;
    height:200px;
    
    
    
	}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign in to Book Outlet</title>
</head>
<body>
<div align="center">
<h1>PUBHUB 200</h1>
<h2>Please Login</h2>
<form action="../User/booklist" method="POST">
<div class="container">

 <div>
  
   <label><b>UserName </b></label>
    <input align="middle" type="text" placeholder="Enter username" name="name" required>
</div>
 <div>
  
   <label><b>Password</b></label>
    <input align="middle" type="password" placeholder="Enter password" name="password" required>
</div>
<div>
<button align = "middle" type = "submit">SignIn</button>


<button  class = "btn" align = "middle" type = "submit"><a href="../User/register">SignUp</a></button>

</div>
<p><a href="#">Forgot Password?</a></p>

</div>

</form>
</div>

</body>
</html>
