<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!doctype html>


    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <html lang="en">

        <%-- <head>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <title>Dashboard</title>

            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
                integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
                crossorigin="anonymous">

            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">

            <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>


            <link rel="stylesheet" href="${pageContext.request.contextPath}resources/AdminModel/css/dashboard.css">


            <script src="https://code.jquery.com/jquery-3.7.1.min.js"
                integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>

            </head> --%>

            <body>



                <jsp:include page="../header.jsp"></jsp:include>

                <div class="main col-10" style="position: relative;">
                    <div class="container-fluid">
                        <div class="col-12 mt-5">
                            <h1>Product List</h1>

                            <div class="col-2 mb-3">
                                <button style="color: black; background: blue;" class="col-12"
                                    onclick="window.location.href='product-add'" type="button">Add Product</button>
                            </div>

                            <div class="table-responsive" style="max-height: 500px; overflow-y: auto;">
                                <table class="table table-bordered">
                                    <thead class="table-dark"
                                        style="position: sticky; top: 0; z-index: 1; background-color: #343a40;">
                                        <tr>
                                            <!-- <th>ID</th> -->
                                            <th>Name</th>
                                            <th>Image</th>
                                            <th>Price</th>
                                            <th>Discount</th>
                                            <th>Stock</th>
                                            <th>Category</th>
                                            <th>Brand</th>
                                            <th>Actions</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="products" items="${products}">
                                            <tr>
                                                <!-- <td>${products.id}</td> -->
                                                <td>${products.name}</td>
                                                <td>
                                                    <img src="resources/AdminModel/img/Products/${products.imageUrl}"
                                                        alt="Product Image" width="80" height="80">
                                                </td>
                                                <td>${products.price} ₹</td>
                                                <td>${products.discount} %</td>
                                                <td>
                                                    <c:choose>
                                                        <c:when test="${products.stock > 0}">
                                                            <span class="text-success">${products.stock}</span>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="text-danger">Out of Stock</span>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </td>
                                                <td>${products.categoryId}</td>
                                                <td>${products.brand}</td>
                                                <td>
                                                    <span class="ms-4"><a href="listSearchCategory?id=${category.id}"><i
                                                                class="fa-solid fa-pen-to-square"></i></a></span>

                                                    <span class="ms-4"><a href=""><i
                                                                class="fa-solid fa-trash"></i></a></i></span>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>

                        </div>
                    </div>
                </div>



            </body>

            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
                crossorigin="anonymous"></script>

            <script src="resources/AdminModel/js/dashboard.js"></script>

        </html>