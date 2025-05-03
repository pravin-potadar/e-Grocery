<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
        <form action="orderNow" method="post" enctype="multipart/form-data">
            <h3 class="text-center mb-4">Order Details</h3>

            <div class="row">
                <div class="col-md-6 mb-4">
                    <center>
                        <img class="product-img"
                        src="https://www.shutterstock.com/image-photo/ripe-mango-isolated-on-white-600w-2500576635.jpg"
                        alt="Mango">
                    </center>
                </div>
    
                <div class="col-md-6 details-box">
                    <div class="product-title">Fresh Mango</div>
                    <div class="product-desc">
                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Cupiditate, tempore! Illum unde
                        reiciendis voluptates ipsum officiis fugit, quo inventore quasi odit eveniet debitis nisi in
                        molestias ullam officia, animi obcaecati repellendus laudantium!
                    </div>
    
                    <div class="row mt-4">
                        <div class="col-6">
                            <strong>Price:</strong> ₹250 <br>
                            <strong>Discount:</strong> 10%
                        </div>
                        <div class="col-6">
                            <strong>Stock:</strong> Available
                        </div>
                    </div>
    
                    <div class="mt-4">
                        <label class="mb-2">Quantity:</label><br>
                        <button class="qty-btn">-</button>
                        <span class="qty-display">1</span>
                        <button class="qty-btn">+</button>
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
