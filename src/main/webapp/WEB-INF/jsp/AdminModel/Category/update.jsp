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
								<div class="col-12 mt-5">
									<h1>update Category</h1>

									<form action="searchCategory" method="get">

										<div class="row">

											<input class="col-5" type="search" name="categorySearchData"
												placeholder="Enter the Category ID Or Name" value="${presentCategory.id}">

											<input class="col-2" type="submit" value="Search">
											<div class="col-5"></div>
										</div>

									</form>

									<form action="updateCategory" method="POST" enctype="multipart/form-data"
										class="mt-4">

										<input type="hidden" name="id" value="${presentCategory.id}">

										<div class="mb-3">
											<label for="name" class="form-label">Category Name</label> 
											<input type="text" id="name" name="name" class="form-control" value="${presentCategory.name}" required>

										</div>

										<div class="mb-3">
											<label for="image" class="form-label">Upload Image</label> <input
												type="file" id="image" name="image" class="form-control"
												accept="image/*" value="${presentCategory.imageUrl}" >
										</div>

										<button type="submit" class="btn btn-success">Update
											Category</button>
									</form>
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