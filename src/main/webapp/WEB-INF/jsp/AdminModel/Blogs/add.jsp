<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<!doctype html>
	<html lang="en">

	<head>

	</head>

	<body>



		<jsp:include page="../header.jsp"></jsp:include>


		 <div class="main col-10" style="position: relative;">
			<div class="container-fluid">
				<div class="col-12 mt-5">
					<h1>Add Blog</h1>
					<form action="UpdateBlogServlet" method="post"
					enctype="multipart/form-data">
					<input type="hidden" name="blogId" value="${blog.id}" />

					<div class="mb-3">
						<label for="blogImage" class="form-label">Current Blog
							Image</label><br> <img src="../../uploads/${blog.image}"
							alt="Current Blog Image" width="150"> <input type="file"
							class="form-control mt-2" name="blogImage" id="blogImage">
					</div>

					<div class="mb-3">
						<label for="blogTitle" class="form-label">Heading</label> <input
							type="text" class="form-control" name="blogTitle" id="blogTitle"
							value="${blog.title}" required>
					</div>

					<div class="mb-3">
						<label for="blogDescription" class="form-label">Description</label>
						<textarea class="form-control" name="blogDescription"
							id="blogDescription" rows="5" required>${blog.description}</textarea>
					</div>

					<div class="mb-3">
						<label for="blogMore" class="form-label">See More</label>
						<textarea class="form-control" name="blogMore" id="blogMore"
							rows="3">${blog.more}</textarea>
					</div>

					<button type="submit" class="btn btn-success">Update Blog</button>
				</form>
				</div>
			</div>
		</div> 
		<!-- <div class="main col-10" style="position: relative;">
		<div class="container-fluid">
			<div class="col-12 mt-5">

				<h3>add Blog</h3>
				
			</div>
		</div>
	</div> -->

	</body>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
    crossorigin="anonymous"></script>

    <script src="resources/AdminModel/js/dashboard.js"></script>



	</html>