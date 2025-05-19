<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Order Details</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

        <style>
            body {
                background-color: #f8f9fa;
            }

            .product-img {
                height: 300px;
                width: 300px;
                object-fit: cover;
                border-radius: 12px;
                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            }

            .details-box {
                background-color: #fff;
                padding: 30px;
                border-radius: 12px;
                box-shadow: 0 6px 12px rgba(0, 0, 0, 0.05);
            }

            .product-title {
                font-size: 1.5rem;
                font-weight: 600;
            }

            .product-desc {
                color: #555;
                margin-top: 10px;
            }

            .qty-btn {
                padding: 6px 12px;
                font-size: 18px;
                border: none;
                border-radius: 6px;
                background-color: #0d6efd;
                color: white;
            }

            .qty-display {
                margin: 0 10px;
                font-weight: 600;
            }

            .submit-btn {
                margin-top: 40px;
                padding: 12px;
                font-size: 18px;
                border: none;
                background-color: #198754;
                color: white;
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

        <div class="container mt-5">
            <div>
                <form action="orderConfirmation ${product.id}" method="get" >
                    <h3 class="text-center mb-4">Order Details</h3>

                    <div class="row">
                        <div class="col-md-6 mb-4">
                            <center>
                                <img class="product-img" src="resources/AdminModel/img/Products/${product.imageUrl}"
                                    alt="${product.name}" />
                            </center>
                        </div>

                        <div class="col-md-6 details-box">
                            <div class="product-title">${product.name}</div>
                            <div class="product-desc">${product.description}</div>

                            <div class="row mt-4">
                                <div class="col-6">
                                    <strong>Price:</strong> ₹${product.price} <br>
                                    <strong>Discount:</strong> ${product.discount}%
                                </div>
                                <div class="col-6">
                                    <strong>Stock:</strong>
                                    <c:choose>
                                        <c:when test="${product.stock > 0}">Available</c:when>
                                        <c:otherwise>Out of Stock</c:otherwise>
                                    </c:choose>
                                </div>
                            </div>

                            <div class="mt-4">
                                <label class="mb-2">Quantity:</label><br>
                                <button class="qty-btn" type="button">-</button>
                                <span class="qty-display">1</span>
                                <button class="qty-btn" type="button">+</button>
                                <input type="hidden" name="quantity" value="1" />
                                <input type="hidden" name="productId" value="${product.id}" />
                            </div>
                        </div>
                    </div>

                    <input class="submit-btn" type="submit" value="Delivery Here...!">
                </form>

            </div>
        </div>

        <jsp:include page="comman/footer.jsp"></jsp:include>

    </body>

    </html>