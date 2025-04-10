<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="resources/LoginAndRegister/login.css">
</head>
<body>
	<div class="login-container">
		<form class="login-form" action="/login" method="POST">
			<h2>Welcome Back</h2>

			<div class="form-group">
				<input type="email" name="email" placeholder="Email" required>
			</div>

			<div class="form-group">
				<input type="password" name="password" placeholder="Password"
					required>
			</div>

			<button type="submit">Login</button>

			<p class="register-link">
				Don't have an account? <a href="register">Register Here</a>
			</p>
		</form>
	</div>
</body>
</html>
