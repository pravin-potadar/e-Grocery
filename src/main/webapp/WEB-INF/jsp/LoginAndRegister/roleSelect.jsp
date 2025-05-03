<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <title>Register</title>
  <link rel="stylesheet" href="resources/LoginAndRegister/register.css">

  <script src="https://code.jquery.com/jquery-3.7.1.min.js"
    integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>

  <style>
    .role-selection {
      display: flex;
      justify-content: space-around;
      margin-bottom: 20px;
    }

    .role-option {
      text-align: center;
      cursor: pointer;
      border: 2px solid transparent;
      border-radius: 12px;
      padding: 10px;
      transition: 0.3s;
    }

    .role-option img {
      width: 100px;
      height: 100px;
      object-fit: cover;
      border-radius: 50%;
    }

    .role-option.active {
      border-color: #007bff;
      background-color: #e9f3ff;
    }

    .role-label {
      margin-top: 10px;
      font-weight: bold;
    }
  </style>
</head>

<body>
  <div class="register-container">
    <form class="register-form" action="registerForm" method="POST" enctype="multipart/form-data">
      <h2>Register</h2>

      <!-- 🔶 Role Selection -->
      <div class="form-group single">
        <label>Select Role:</label>
        <div class="role-selection">
          <div class="role-option" id="userRole" onclick="selectRole('User')">
            <img src="resources/LoginAndRegister/user.png" alt="User">
            <div class="role-label">User</div>
          </div>
          <div class="role-option" id="sellerRole" onclick="selectRole('Seller')">
            <img src="resources/LoginAndRegister/seller.png" alt="Seller">
            <div class="role-label">Seller</div>
          </div>
        </div>
        <input type="hidden" name="role" id="selectedRole" required>
      </div>

      <!-- 🔶 Basic Details -->
      <div class="form-group double">
        <label for="firstName">First Name</label>
        <label for="lastName">Last Name</label>
        <input type="text" name="firstName" id="firstName" placeholder="First Name" required>
        <input type="text" name="lastName" id="lastName" placeholder="Last Name" required>
      </div>

      <div class="form-group double">
        <label for="email">Email</label>
        <label for="password">Password</label>
        <input type="email" name="email" id="email" placeholder="Email" required>
        <input type="password" name="password" id="password" placeholder="Password" required>
      </div>

      <div class="form-group triple">
        <label for="dob">Date of Birth</label>
        <label for="mobileNo">Mobile Number</label>
        <label for="areaPinCode">Area Pin Code</label>
        <input type="date" name="dob" id="dob" required>
        <input type="text" name="mobileNo" id="mobileNo" placeholder="Mobile Number" required>
        <input type="text" name="areaPinCode" id="areaPinCode" placeholder="Area Pin Code" required>
      </div>

      <div class="form-group single">
        <label for="address">Address</label>
        <input type="text" name="address" id="address" placeholder="Address" required>
      </div>

      <div class="form-group single">
        <label for="userImage">Upload Profile Image:</label>
        <input type="file" name="userImageFile" id="userImage" accept="image/*">
      </div>

      <button type="submit">Register</button>
    </form>
  </div>

  <script>
    function selectRole(role) {
      $('#selectedRole').val(role);
      $('.role-option').removeClass('active');
      if (role === 'User') {
        $('#userRole').addClass('active');
      } else {
        $('#sellerRole').addClass('active');
      }
    }
  </script>
</body>

</html>
