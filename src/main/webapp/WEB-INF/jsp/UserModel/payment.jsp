<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Payment Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f1f2f6;
        }

        .payment-container {
            margin-top: 50px;
            background-color: #fff;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.05);
        }

        .payment-method {
            border: 2px solid #dee2e6;
            padding: 15px;
            border-radius: 8px;
            cursor: pointer;
            transition: border-color 0.3s;
        }

        .payment-method.active {
            border-color: #0d6efd;
            background-color: #e7f1ff;
        }

        .form-control {
            border-radius: 8px;
        }

        .btn-pay {
            padding: 12px;
            width: 100%;
            border-radius: 8px;
            font-size: 18px;
            background-color: #198754;
            color: #fff;
            border: none;
        }

        .btn-pay:hover {
            background-color: #157347;
        }
    </style>

    <script>
        function selectMethod(id) {
            document.querySelectorAll(".payment-method").forEach(div => div.classList.remove("active"));
            document.getElementById(id).classList.add("active");
        }
    </script>
</head>

<body>

    <jsp:include page="comman/header.jsp"></jsp:include>

    <div class="container">
        <div class="payment-container">
            <h3 class="text-center mb-4">Payment</h3>

            <!-- Order Summary -->
            <div class="mb-4">
                <h5>Order Summary</h5>
                <p><strong>Product:</strong> Fresh Mango</p>
                <p><strong>Quantity:</strong> 2 kg</p>
                <p><strong>Total:</strong> ₹1000</p>
            </div>

            <!-- Payment Method -->
            <div class="mb-4">
                <h5>Select Payment Method</h5>
                <div class="row g-3">
                    <div class="col-md-4">
                        <div id="card" class="payment-method active" onclick="selectMethod('card')">
                            <strong>Credit / Debit Card</strong>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div id="upi" class="payment-method" onclick="selectMethod('upi')">
                            <strong>UPI / Wallet</strong>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div id="cod" class="payment-method" onclick="selectMethod('cod')">
                            <strong>Cash on Delivery</strong>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Payment Details -->
            <div class="mb-4">
                <h5>Payment Details</h5>
                <div class="row g-3">
                    <div class="col-md-6">
                        <label for="cardName" class="form-label">Cardholder Name</label>
                        <input type="text" class="form-control" id="cardName" placeholder="John Doe">
                    </div>
                    <div class="col-md-6">
                        <label for="cardNumber" class="form-label">Card Number</label>
                        <input type="text" class="form-control" id="cardNumber" placeholder="1234 5678 9012 3456">
                    </div>
                    <div class="col-md-4">
                        <label for="expDate" class="form-label">Expiry Date</label>
                        <input type="text" class="form-control" id="expDate" placeholder="MM/YY">
                    </div>
                    <div class="col-md-4">
                        <label for="cvv" class="form-label">CVV</label>
                        <input type="text" class="form-control" id="cvv" placeholder="123">
                    </div>
                    <div class="col-md-4">
                        <label for="upiId" class="form-label">UPI ID (if applicable)</label>
                        <input type="text" class="form-control" id="upiId" placeholder="example@upi">
                    </div>
                </div>
            </div>

            <!-- Payment Button -->
            <button class="btn-pay">Pay ₹1000</button>
        </div>
    </div>

    <jsp:include page="comman/footer.jsp"></jsp:include>

</body>

</html>
