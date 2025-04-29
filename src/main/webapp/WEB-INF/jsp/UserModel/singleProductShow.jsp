<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- 
<meta charset="UTF-8">
<title>Insert title here</title> -->
</head>
<body>

    <jsp:include page="comman/header.jsp"></jsp:include>


    <div class="main">

        <div class="container mt-5">
            <div class="row product-card">
                <div class=" col-md-6">
                    <img  style="height: 360px; width: 350px;" src="resources/AdminModel/img/Products/${productShow.imageUrl}" alt="${productShow.name}" class="product-image img-fluid mt-2">
                </div>
                <div class="col-md-6 p-4">
                    <h2 class="mb-3">${productShow.name}</h2>
                    <p class="text-muted">Brand: ${productShow.brand}</p>
                    <p class="price-tag">₹${productShow.price} <span class="discount">(${productShow.discount}% OFF)</span></p>
                    <p><strong>Status:</strong> ${productShow.status}</p>
                    <p><strong>Stock Available:</strong> ${productShow.stock} ${productShow.unitType}</p>
                    <hr>
                    <p>${productShow.description}</p>
                    
                    <div class="row">
                       
                        <div class="col-6">
                            <form action="buyProduct" method="post">
                                <input type="hidden" name="productId" value="${product.id}" />
                                <button type="submit" class="buy-button mt-4">Buy Now</button>
                            </form>
                        </div>
    
                        <div class="col-6">
                            <form action="addToCart" method="post">
                                <input type="hidden" name="productId" value="${product.id}" />
                                <button type="submit" class="buy-button mt-4">Add To Cart</button>
                            </form>
                        </div>

                    </div>
                   
                </div>
            </div>
        </div>

    </div>


</body>

<jsp:include page="comman/footer.jsp"></jsp:include>

</html>