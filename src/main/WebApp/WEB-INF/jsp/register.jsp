<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<style>
input[type=text],  textarea {
	width:500px;
	height:40px;
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	margin-top: 6px;
	margin-bottom: 8px;
	resize: vertical;
}


input[type=password], select, textarea {
	
	width:500px;
	height:40px;
	
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	margin-top: 6px;
	margin-bottom: 10px;
	resize: vertical;
}
input[type=email], select, textarea {
	
	width:500px;
	height:40px;
	
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	margin-top: 6px;
	margin-bottom: 10px;
	resize: vertical;
}

button[type=submit] {
	background-color: #4CAF50;
	color: white;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	padding-left: 10%;
	padding-right: 15%;
	box-sizing: border-box;
	width: 40px;
	height: 40px;
}

button[type=submit]:hover {
	background-color: #45a049;
}

.container {
	border-radius: 8px;
	background-color: #f2f2f2;
	padding: 10px;
	
	height:400px;
}
</style>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome To Book Outlet</title>
</head>
<body>
	<div align ="center">
	<h3>Sign Up To BookOutlet</h3></div>
	<form action="../User/userLogin" method="POST">


		<div class="container">
			<div align="center">
							<div>

					 <input align="middle" type="text"
						placeholder="Enter name" name="name" required>
				</div>
											<div></div>
				<div>
					 <input align="middle"
						type="password" placeholder="Enter Password" name="password" required>
				</div>
				<div></div>
				<div>
					 <input align="middle"
						type="text" placeholder="Enter mobileNumber" name="mobileNo" required>
				</div>
				<div></div>
				<div>
					 <input align="middle" type="email"
						placeholder="Enter emailID" name="emailId" required>
				</div>
				<div></div>

				
				<div></div>
				<div>

                     <button align = "middle" type = "submit">Register</button>
					



				</div>
				<div></div>
			</div>
		</div>
	</form>
</body>
</html>
