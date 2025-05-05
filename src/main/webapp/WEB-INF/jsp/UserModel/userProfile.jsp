<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <title>User Profile - e-Grocery</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<jsp:include page="comman/header.jsp"/>

<div class="container mt-5">
    <div class="card p-4">
        <div class="row">
            <!-- Profile Picture -->
            <div class="col-md-3 text-center">
                <img src="resources/UserModel/img/profile/default-user.png" class="img-fluid rounded-circle mb-3" width="150" alt="Profile">
                <h5>${user.name}</h5>
                <p class="text-muted">${user.email}</p>
            </div>

            <!-- User Info -->
            <div class="col-md-9">
                <h4>User Details</h4>
                <table class="table">
                    <tr><th>Email</th><td>${user.email}</td></tr>
                    <tr><th>Phone</th><td>${user.phone}</td></tr>
                    <tr><th>Address</th><td>${user.address}</td></tr>
                </table>

                <a href="editProfile" class="btn btn-warning">Edit Profile</a>
                <a href="changePassword" class="btn btn-secondary">Change Password</a>
            </div>
        </div>
    </div>

    <!-- Order History -->
    <div class="card p-4 mt-4">
        <h4>Order History</h4>
        <table class="table table-bordered mt-3">
            <thead class="table-light">
                <tr>
                    <th>Order ID</th>
                    <th>Date</th>
                    <th>Items</th>
                    <th>Total (₹)</th>
                    <th>Status</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="order" items="${userOrders}">
                    <tr>
                        <td>${order.id}</td>
                        <td>${order.date}</td>
                        <td>${order.items}</td>
                        <td>${order.total}</td>
                        <td>${order.status}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>

<jsp:include page="comman/footer.jsp"/>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
