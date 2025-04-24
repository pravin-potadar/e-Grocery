<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


	<!DOCTYPE html>
	<html lang="en">

	<%-- <head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<title>Dashboard</title>

		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
			integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
			crossorigin="anonymous" />

		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" />

		<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

		<link rel="stylesheet" href="${pageContext.request.contextPath}resources/AdminModel/css/dashboard.css" />

		<script src="https://code.jquery.com/jquery-3.7.1.min.js"
			integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
	</head>
 --%>
	<body>
		<!-- <header class="fixed-top">
			<nav>
				<div class="top-area">
					<div class="col-12 header">
						<div class="row">
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
											width="40px" class="rounded-circle" />
									</div>
									<div class="c0l-10"></div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</nav>
		</header>

		<div class="col-12 bottum-area" style="margin-top: 45px; position: fixed">
			<div class="row">
				<div class="col-12">
					<div class="row">
						<div class="col-2" style="position: static">
							<div class="sidebar col-12" style="height: 93vh">
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
												<a href="category-add" class="col-12 mt-2"><i
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
														class="ms-3">Customer Queries</i></a>
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
						</div> -->
						
						 <jsp:include page="../header.jsp"></jsp:include>

						<div class="main col-12" style="position: relative; height: 100vh; overflow: hidden">
							<div class="container-fluid">
								<div class="col-12 mt-5">
									<h1>Add Product</h1>

									<!-- Scrollable Form Wrapper -->
									<div style="
                      max-height: 80vh;
                      overflow-y: auto;
                      padding-right: 10px;
                    ">
										<form action="addProduct" method="post" enctype="multipart/form-data"
											class="mt-4">
											<div class="row">
												<div class="col-md-6 mb-3">
													<label for="productName" class="form-label">Product Name</label>
													<input type="text" id="productName" name="name" class="form-control"
														required />
												</div>

												<div class="col-md-6 mb-3">
													<label for="brand" class="form-label">Brand</label>
													<input type="text" id="brand" name="brand" class="form-control"
														required />
												</div>
											</div>

											<div class="mb-3">
												<label for="description" class="form-label">Description</label>
												<textarea id="description" name="description" rows="4"
													class="form-control" required></textarea>
											</div>

											<div class="row">
												<div class="col-md-4 mb-3">
													<label for="price" class="form-label">Price</label>
													<input type="number" id="price" name="price" class="form-control"
														step="0.01" required />
												</div>

												<div class="col-md-4 mb-3">
													<label for="discount" class="form-label">Discount (%)</label>
													<input type="number" id="discount" name="discount"
														class="form-control" step="0.01" />
												</div>

												<div class="col-md-4 mb-3">
													<label for="quantity" class="form-label">Quantity / Stock</label>
													<input type="number" id="quantity" name="stock" class="form-control"
														required />
												</div>
											</div>

											<div class="row">
												<div class="col-md-6 mb-3">
													<select class="form-select" id="category" name="categoryId" required>
														<option value="" disabled selected>Select a category</option>
														<c:forEach var="cat" items="${categories}">
															<option value="${cat.id}">${cat.name}</option>
														</c:forEach>
													</select>
												</div>

												<div class="col-md-6 mb-3">
													<select id="unitType" name="unitType" class="form-select" required>
														<option value="" disabled selected>Select a unit</option>
														<option value="kg">Kilogram (kg)</option>
														<option value="liter">Liter (liter)</option>
														<option value="pcs">Pieces (pcs)</option>
														<option value="dozen">Dozen</option>
													</select>

												</div>
											</div>

											<div class="mb-3">
												<label for="status" class="form-label">Status</label>
												<select id="status" name="status" class="form-control" required>
													<option value="ACTIVE">Active</option>
													<option value="INACTIVE">Inactive</option>
													<option value="OUT_OF_STOCK">Out of Stock</option>
												</select>
											</div>

											<div class="mb-3">
												<label for="productImage" class="form-label">Upload Product
													Image</label>
												<input type="file" id="productImage" name="imgFile" class="form-control"
													accept="image/*" required />
											</div>

											<button type="submit" class="btn btn-success mb-3">
												Add Product
											</button>
										</form>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
	
	 <jsp:include page="../footer.jsp"></jsp:include>

	<%-- <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>

	<script src="${pageContext.request.contextPath}resources/AdminModel/js/dashboard.js"></script>
 --%>
	</html>