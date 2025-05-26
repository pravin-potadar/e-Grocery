<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
				<form action="addCategory" method="post"
					enctype="multipart/form-data" class="mt-4">
					<div class="mb-3">
						<label for="name" class="form-label">Category Name</label> <input
							type="text" id="name" name="categoryName" class="form-control"
							required>
					</div>

					<div class="mb-3">
						<label for="image" class="form-label">Upload Image</label> <input
							type="file" id="image" name="categoryImage" class="form-control"
							accept="image/*" required>
					</div>

					<button type="submit" class="btn btn-success">Create
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

<jsp:include page="../footer.jsp"></jsp:include>



</html>