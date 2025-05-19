<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Order Confirmation</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

        <style>
            body {
                background-color: #f5f5f5;
            }

            .main {
                padding: 40px 0;
            }

            .product-card {
                background: #fff;
                border-radius: 12px;
                padding: 20px;
                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.05);
                margin-bottom: 20px;
            }

            .product-img {
                height: 200px;
                width: 100%;
                object-fit: cover;
                border-radius: 8px;
                background-color: #eaeaea;
            }

            .form-control {
                border-radius: 8px;
            }

            .submit-btn {
                margin-top: 30px;
                padding: 12px;
                font-size: 18px;
                background-color: #198754;
                color: white;
                border: none;
                border-radius: 8px;
                width: 100%;
            }

            .submit-btn:hover {
                background-color: #157347;
            }
        </style>
    </head>

    <body>

        <jsp:include page="comman/header.jsp"></jsp:include>

        <div class="main container">

            <h3 class="text-center mb-4">Order Confirmation</h3>

            <div class="product-card">
                <div class="row">
                    <div class="col-md-6">
                        <img style="height: 300px; width: 300px;" class="product-img" src="resources/AdminModel/img/Products/${product.imageUrl}"
                            alt="${product.name}" />
                    </div>
                    <div class="col-md-6 d-flex flex-column justify-content-center">
                        <h5 class="mb-2">Product Name: ${product.name}</h5>
                        <p>Quantity: ${quantity} kg</p>
                    </div>
                </div>

                <div class="text-center mt-4">
                    <h4>Net Amount = ₹${netAmount}</h4>
                </div>
            </div>


            <form action="orderConfirm" method="post">

                <div class="product-card">
                    <h5 class="mb-3">Delivery Address</h5>
                    <div class="row">
                        <div class="col-md-6 mb-3">
                            <label for="landmark" class="form-label">Landmark & Area</label>
                            <input type="text" class="form-control" id="landmark" placeholder="e.g., Near post office">
                        </div>
                        <div class="col-md-6 mb-3">
                            <label for="address" class="form-label">Full Address</label>
                            <input type="text" class="form-control" id="address" placeholder="Street, City">
                        </div>
                        <div class="col-md-6 mb-3">
                            <label for="pincode" class="form-label">Pin Code</label>
                            <input type="text" class="form-control" id="pincode" placeholder="e.g., 411001">
                        </div>
                    </div>
                </div>

                <input type="submit" value="Proceed to Payment" class="submit-btn">

            </form>

        </div>

        <jsp:include page="comman/footer.jsp"></jsp:include>

    </body>

    </html>