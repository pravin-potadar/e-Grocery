<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <!DOCTYPE html>
        <html>

        <head>


            <style>
                .card {
                    transition: transform 0.2s, box-shadow 0.3s;
                }

                .card:hover {
                    transform: translateY(-5px);
                    box-shadow: 0 8px 20px rgba(0, 0, 0, 0.15);
                }
            </style>

        </head>

        <body>




            <jsp:include page="comman/header.jsp"></jsp:include>

            <div class="main">


                <div class="mt-5 shopArea container-fluid row">
                    <!-- Sidebar with Filters -->
                    <div class="col-md-3 filterSidebar p-4">
                        <h4 class="text-center">Filters</h4>
                        <hr>
                        <div class="filterSection">
                            <h6>Price Range</h6>
                            <input type="range" min="0" max="1000" value="500" class="form-range">
                            <p>Up to ₹1000</p>
                        </div>
                        <hr>
                        <div class="filterSection">
                            <h6>Sort By</h6>
                            <select class="form-select">
                                <option value="low-high">Price: Low to High</option>
                                <option value="high-low">Price: High to Low</option>
                                <option value="popularity">Popularity</option>
                            </select>
                        </div>
                    </div>

                    <!-- Products Section -->
                    <div class="col-md-9">
                        <div class="text-center shopHeader">
                            <h2 class="shopHeaderName">Grocery Products</h2>
                        </div>

                        <div class="mt-5 row justify-content-start">
                            <!-- Product Cards (Repeat as needed) -->

                            <c:forEach var="product" items="${listOfProducts}">
                                <div class="col-md-4 mb-4">
                                    <div class="card h-100 shadow rounded-4 border-0 p-3">
                                        <!-- Product Image -->
                                        <div class="text-center mb-3">
                                            <img src="resources/AdminModel/img/Products/${product.imageUrl}"
                                                alt="${product.name}" class="img-fluid rounded-3"
                                                style="height: 200px; object-fit: contain;" />
                                        </div>

                                        <!-- Product Title -->
                                        <h5 class="text-center fw-semibold">${product.name}</h5>

                                        <!-- Product Description -->
                                        <p class="text-muted text-center small">${product.description}</p>

                                        <!-- Price -->
                                        <p class="text-center fw-bold text-primary mb-3">Price: ₹${product.price}</p>

                                        <!-- Buttons -->
                                        <div class="row g-2">
                                            <div class="col-6">
                                                <form action="onClickProductAndShowDatails${product.id}" method="get">
                                                    <button class="btn btn-success w-100 rounded-3">Buy</button>
                                                </form>
                                            </div>
                                            <div class="col-6">
                                                <form action="" method="get">
                                                    <button class="btn btn-outline-primary w-100 rounded-3">Add to
                                                        Cart</button>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>





                            <!-- Repeat card as needed -->
                        </div>
                    </div>
                </div>




        </body>


        <jsp:include page="comman/footer.jsp"></jsp:include>



        </html>