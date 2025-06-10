<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

		<!doctype html>
		<html lang="en">

		<head>
			<%-- <meta charset="utf-8">
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

		</head>
		--%>

		<body>

			

			<jsp:include page="../header.jsp"></jsp:include>

			<div class="main col-10" style="position: relative;">
				<div class="container-fluid">
					<div class="col-12 mt-5">

						<div class="col-12">
							<dov class="row">
								<div class="col-10">
									<h1>Category List</h1>
								</div>
								<div class="col-2">
									<button style="color: black; background: blue;" class="col-12"
										onclick="window.location.href='category-add'" type="submit">New Add
										Category</button>
								</div>
							</dov>
						</div>

						<div class="table-container">
							<table class="table table-bordered">
								<thead class="table-dark"
									style="position: sticky; top: 0; z-index: 1; background-color: #343a40;">
									<tr>
										<th>ID</th>
										<th>Category Name</th>
										<th>Image</th>
										<th>Date</th>
										<th>Time</th>
										<th>Action</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="category" items="${categories}">
										<tr>
											<td>${category.id}</td>
											<td>${category.name}</td>
											<td><img src="resources/AdminModel/img/Category/${category.imageUrl}"
													width="50" height="50"></td>
											<td>${category.createdDate}</td>
											<td>${category.createdTime}</td>
											<td>
												<!-- <a href="listSearchCategory-${category.id}"><span class="ms-2"><i class="fa-solid fa-pen-to-square"></i></span></a>  -->

												<form class="d-inline" action="listSearchCategory" method="get">

												

														<input  type="hidden" name="id"
															value="${category.id}">

														<button class="border border-0" type="submit"><span class="ms-2"><i class=" text-black fa-solid fa-pen-to-square"></i></span></button>
														
													


												</form>

												<span class="ms-4"><i class="fa-solid fa-trash"></i></span>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
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

    <script src="resources/AdminModel/js/dashboard.js"></script>

		</html>