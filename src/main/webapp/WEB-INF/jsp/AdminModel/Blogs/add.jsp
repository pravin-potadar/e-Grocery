<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
  <head> </head>

  <body>
    <jsp:include page="../header.jsp"></jsp:include>

    <div class="main col-10" style="position: relative">
      <div class="container-fluid">
        <div class="col-12 mt-2">
          <h1>Add Blog</h1>
          <form
            action="add-blog"
            method="post"
            enctype="multipart/form-data"
          >
            <input type="hidden" name="id" value="${blog.id}" />

            <div class="mb-3">
              <input
                type="file"
                class="form-control mt-2"
                name="imageUrl"
                id="blogImage"
              />
            </div>

            <div class="mb-3">
              <input
                placeholder="Enter The Blog Title"
                type="text"
                class="form-control"
                name="title"
                id="blogTitle"
                value="${blog.title}"
                required
              />
            </div>

            <div class="mb-3">
              <!-- <label for="blogDescription" class="form-label"
                >Description</label -->

              <textarea
                placeholder="Enter The Blog Description"
                class="form-control"
                name="description"
                id="blogDescription"
                rows="5"
                required
              ></textarea>
            </div>

            <div class="mb-3">
              <!-- <label for="blogMore" class="form-label">See More</label> -->
              <textarea
                placeholder="Enter your Conclusion"
                class="form-control"
                name="conclusion"
                id="blogMore"
                rows="3"
              ></textarea>
            </div>

            <button type="submit" class="btn btn-success">Add Blog</button>
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

  <script
    src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
    crossorigin="anonymous"
  ></script>

  <script src="resources/AdminModel/js/dashboard.js"></script>
</html>
