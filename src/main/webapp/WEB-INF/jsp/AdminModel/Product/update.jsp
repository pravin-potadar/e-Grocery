<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!doctype html>
    <html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Dashboard</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">

        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>


        <link rel="stylesheet" href="${pageContext.request.contextPath}resources/AdminModel/css/dashboard.css">


        <script src="https://code.jquery.com/jquery-3.7.1.min.js"
            integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>


    </head>

    <body>

        <header class="fixed-top">
            <nav>
                <div class="top-area">
                    <div class="col-12 header">
                        <div class="  row">
                            <div class="col-3 mt-3">
                                <i class="ms-3 fa-solid fa-bars"></i>
                                <h3 class="ms-5 logo d-inline">e-Grocery</h3>
                            </div>

                            <div class="col-7"></div>

                            <div class="col-2">
                                <div class="row">
                                    <div class="col-6 mt-4">

                                        <i class="fa-solid fa-bell"></i>

                                    </div>
                                    <div class="col-6 mt-3">

                                        <img src="resources/AdminModel/img/users/pravin.jpg" alt="User" height="40px"
                                            width="40px" class="rounded-circle">

                                    </div>
                                    <div class="c0l-10"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </nav>
        </header>

        <div class=" col-12 bottum-area " style="margin-top: 45px; position: fixed;">
            <div class="row">
                <div class="col-12 ">
                    <div class="row">
                        <div class="col-2" style="position: static;">
                            <div class="sidebar col-12" style="height: 93vh;">
                                <div class="ms-3 mt-4">
                                    <div class="row">
                                        <div class="dashboard">
                                            <i class="fa-solid fa-house"></i>
                                            <i class="ms-3">Dashbord</i>
                                        </div>
                                    </div>
                                    <div class="row mt-2">
                                        <div class="Category">
                                            <button id="Category" class="col-12">
                                                <i class="fa-solid fa-clipboard-list"></i>
                                                <i class="ms-3">Category</i>
                                            </button>
                                            <div id="CategorySubPart" class="row ms-3 subList">
                                                <a href="category/add" class="col-12 mt-2"><i
                                                        class="fa-solid fa-plus"></i><i class="ms-3">Add</i></a>
                                                <a class="col-12"><i class="fa-solid fa-pen-to-square"></i><i
                                                        class="ms-3">update</i></a>
                                                <a class="col-12"><i class="fa-solid fa-table-list"></i><i
                                                        class="ms-3">List</i></a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row mt-3">
                                        <div class="product">
                                            <button id="product" class="col-12">
                                                <i class="fa-solid fa-box"></i>
                                                <i class="ms-3">Product</i>
                                            </button>
                                            <div id="productSubPart" class="row ms-3 subList">
                                                <a class="col-12 mt-2"><i class="fa-solid fa-plus"></i><i
                                                        class="ms-3">Add</i></a>
                                                <a class="col-12"><i class="fa-solid fa-pen-to-square"></i><i
                                                        class="ms-3">update</i></a>
                                                <a class="col-12"><i class="fa-solid fa-table-list"></i><i
                                                        class="ms-3">List</i></a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row mt-3">
                                        <div class="Orders">
                                            <button id="orders" class="col-12">
                                                <i class="fa-solid fa-box"></i>
                                                <i class="ms-3">Orders</i>
                                            </button>
                                            <div id="ordersSubPart" class="row ms-3 subList">
                                                <a class="col-12 mt-2"><i class="fa-solid fa-plus"></i><i
                                                        class="ms-3">Completed Orders</i>
                                                </a>
                                                <a class="col-12"><i class="fa-solid fa-pen-to-square"></i><i
                                                        class="ms-3">Pending Orders</i>
                                                </a>
                                                <a class="col-12"><i class="fa-solid fa-table-list"></i><i
                                                        class="ms-3">All Orders</i></a>
                                                <a class="col-12"><i class="fa-solid fa-table-list"></i><i
                                                        class="ms-3">Canceled Orders</i>
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row mt-3">
                                        <div class="Customers">
                                            <button id="Customers" class="col-12">
                                                <i class="fa-solid fa-box"></i>
                                                <i class="ms-3">Customers</i>
                                            </button>
                                            <div id="CustomersSubPart" class="row ms-3 subList">
                                                <a class="col-12 mt-2"><i class="fa-solid fa-plus"></i><i
                                                        class="ms-3">Customer Reviews</i>
                                                </a>
                                                <a class="col-12"><i class="fa-solid fa-pen-to-square"></i><i
                                                        class="ms-3">Customer
                                                        Queries</i></a>
                                                <a class="col-12"><i class="fa-solid fa-table-list"></i><i
                                                        class="ms-3">All Customers</i>
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row mt-3">
                                        <div class="Transactions">
                                            <button id="Transactions" class="col-12">
                                                <i class="fa-solid fa-box"></i>
                                                <i class="ms-3">Transactions</i>
                                            </button>
                                            <div id="TransactionsSubPart" class="row ms-3 subList">
                                                <a class="col-12 mt-2"><i class="fa-solid fa-plus"></i><i
                                                        class="ms-3">Payments</i></a>
                                                <a class="col-12"><i class="fa-solid fa-pen-to-square"></i><i
                                                        class="ms-3">Refunds</i></a>
                                                <a class="col-12"><i class="fa-solid fa-table-list"></i><i
                                                        class="ms-3">Payouts</i></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="main col-10" style="position: relative;">
                            <div class="container-fluid">
                                <div class="col-12 mt-5">

                                    <div class="container mt-4">
                                        <div class="card shadow p-4">
                                            <h2 class="text-center mb-4">Update Product</h2>
                                            <form action="submit_product.php" method="POST"
                                                enctype="multipart/form-data">

                                                <div class="row mb-3">
                                                    <div class="col-md-6">
                                                        <label class="form-label">Product Name</label>
                                                        <input type="text" name="name" class="form-control"
                                                            placeholder="Enter product name" required>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <label class="form-label">Price (₹)</label>
                                                        <input type="text" name="price" class="form-control"
                                                            placeholder="Enter price" required>
                                                    </div>
                                                </div>

                                                <div class="row mb-3">
                                                    <div class="col-md-6">
                                                        <label class="form-label">Discount (%)</label>
                                                        <input type="text" name="discount" class="form-control"
                                                            placeholder="Enter discount">
                                                    </div>
                                                    <div class="col-md-6">
                                                        <label class="form-label">Stock Quantity</label>
                                                        <input type="number" name="stock_quantity" class="form-control"
                                                            placeholder="Enter stock quantity" required>
                                                    </div>
                                                </div>

                                                <div class="row mb-3">
                                                    <div class="col-md-6">
                                                        <label class="form-label">Category</label>
                                                        <select name="category_id" class="form-select" required>
                                                            <option value="">Select Category</option>
                                                            <option value="1">Fruits</option>
                                                            <option value="2">Vegetables</option>
                                                            <option value="3">Dairy</option>
                                                        </select>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <label class="form-label">Brand</label>
                                                        <select name="brand_id" class="form-select">
                                                            <option value="">Select Brand</option>
                                                            <option value="1">Nestlé</option>
                                                            <option value="2">Amul</option>
                                                        </select>
                                                    </div>
                                                </div>

                                                <div class="row mb-3">
                                                    <div class="col-md-6">
                                                        <label class="form-label">Measurement Unit</label>
                                                        <input type="text" name="unit" class="form-control"
                                                            placeholder="e.g., Kg, Ltr, Pack" required>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <label class="form-label">Product Image</label>
                                                        <input type="file" name="image_url" class="form-control"
                                                            required>
                                                    </div>
                                                </div>

                                                <div class="mb-3">
                                                    <label class="form-label">Product Description</label>
                                                    <textarea name="description" class="form-control" rows="3"
                                                        placeholder="Enter product description"></textarea>
                                                </div>

                                                <button type="submit" class="btn btn-success w-100">Update
                                                    Product</button>

                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </body>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>

    <script src="${pageContext.request.contextPath}resources/AdminModel/js/dashboard.js"></script>

    </html>