<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

		<!doctype html>
		<html lang="en">

		<head>

		</head>

		<body>



			<jsp:include page="../header.jsp"></jsp:include>


			<div class="main col-10" style="position: relative;">
				<div class="container-fluid">
					<h2 class="mt-5">Blog List</h2>
					<table class="table table-bordered table-striped mt-3">
						<thead class="table-dark">
							<tr>
								<th>Title</th>
								<th>Description</th>
								<th>Conclusion</th>
								<th>Image</th>
								<!-- <th>Status</th> -->
								<th>Date</th>
								<th>Actions</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="blog" items="${blogsData}">
								<tr>
									<td>${blog.title}</td>
									<td>${blog.description}</td>
									<td>${blog.conclusion}</td>
									<td>
										<img src="resources/AdminModel/img/BlogImges/${blog.imageUrl}" width="100px"
											height="80px" alt="${blog.imageUrl}">
									</td>
									<!-- <td>${blog.status}</td> -->
									<td>${blog.date}</td>
									<td>
										<span class="ms-4"><a href="#"><i
													class="fa-solid fa-pen-to-square"></i></a></span>

										<span class="ms-4"><a href=""><i class="fa-solid fa-trash"></i></a></i></span>
									</td>
								</tr>
							</c:forEach>

						</tbody>
					</table>
				</div>
			</div>

		</body>

		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
			crossorigin="anonymous"></script>

		<script src="resources/AdminModel/js/dashboard.js"></script>



		</html>