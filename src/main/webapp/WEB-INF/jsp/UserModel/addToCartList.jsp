<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add to Cart</title>
    
    <!-- Bootstrap CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    
    <style>
        body {
            background-color: #f8f9fa;
        }
        .cart-container {
            background-color: #ffffff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0px 0px 15px rgba(0,0,0,0.1);
        }
        .cart-item {
            border-bottom: 1px solid #dee2e6;
            padding: 15px 0;
        }
        .cart-item:last-child {
            border-bottom: none;
        }
        .cart-total {
            font-weight: bold;
            font-size: 1.2rem;
        }
        .btn-checkout {
            width: 100%;
        }
    </style>
</head>
<body>

    <jsp:include page="comman/header.jsp"></jsp:include>

    <div class="container mt-5">
        <div class="cart-container">
            <h2 class="mb-4 text-center">🛒 Your Cart</h2>

            <!-- Example Cart Item -->
            <div class="cart-item row align-items-center">
                <div class="col-md-2">
                    <img src="images/product1.jpg" class="img-fluid rounded" alt="Product Image">
                </div>
                <div class="col-md-4">
                    <h5>Fresh Tomatoes</h5>
                    <p class="text-muted">1 kg</p>
                </div>
                <div class="col-md-2">
                    ₹40
                </div>
                <div class="col-md-2">
                    <input type="number" class="form-control" value="1" min="1">
                </div>
                <div class="col-md-2 text-end">
                    <button class="btn btn-danger btn-sm">Remove</button>
                </div>
            </div>

            <!-- Add more cart-item blocks here -->

            <!-- Cart Summary -->
            <div class="mt-4 text-end">
                <p class="cart-total">Total: ₹40</p>
                <button class="btn btn-success btn-checkout">Proceed to Checkout</button>
            </div>
        </div>
    </div>

    <jsp:include page="comman/footer.jsp"></jsp:include>

    <!-- Bootstrap JS (Optional) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
