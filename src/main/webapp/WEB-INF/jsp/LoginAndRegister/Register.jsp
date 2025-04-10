
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel="stylesheet" href="resources/LoginAndRegister/register.css">
</head>
<body>
	<div class="register-container">
		<form class="register-form" action="/register" method="POST"
			enctype="multipart/form-data">
			<h2>Register</h2>

			<div class="form-group">
				<input type="text" name="firstName" placeholder="First Name"
					required> <input type="text" name="lastName"
					placeholder="Last Name" required>
			</div>

			<div class="form-group">
				<input type="email" name="email" placeholder="Email" required>
				<input type="password" name="password" placeholder="Password"
					required>
			</div>

			<div class="form-group">
				<input type="date" name="dob" placeholder="Date of Birth" required>
				<input type="text" name="mobileNo" placeholder="Mobile Number"
					required>
			</div>

			<div class="form-group">
				<input type="text" name="address" placeholder="Address" required>
				<input type="text" name="areaPinCode" placeholder="Area Pin Code"
					required>
			</div>

			<div class="form-group">
				<label for="userImage">Upload Profile Image:</label> <input
					type="file" name="userImage" accept="image/*">
			</div>

			<button type="submit">Register</button>
		</form>
	</div>
</body>
</html>
