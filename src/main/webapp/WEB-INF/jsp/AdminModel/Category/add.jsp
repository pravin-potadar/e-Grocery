<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!doctype html>
    <html lang="en">

    <head>
       <%--  <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Dashboard</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">

        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>


        <link rel="stylesheet" href="${pageContext.request.contextPath}resources/AdminModel/css/dashboard.css">


        <script src="https://code.jquery.com/jquery-3.7.1.min.js"
            integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
 --%>
    </head>

    <body>

      
						
						<jsp:include page="../header.jsp"></jsp:include>

						
                        <div class="main col-10" style="position: relative;">
                            <div class="container-fluid">
                                <div class="col-12 mt-5">
                                    <h1>Add Category</h1>
                                    <form action="addCategory" method="post" enctype="multipart/form-data"
                                        class="mt-4">
                                        <div class="mb-3">
                                            <label for="name" class="form-label">Category Name</label>
                                            <input type="text" id="name" name="categoryName" class="form-control" required>
                                        </div>

                                        <div class="mb-3">
                                            <label for="image" class="form-label">Upload Image</label>
                                            <input type="file" id="image" name="categoryImage" class="form-control"
                                                accept="image/*" required>
                                        </div>

                                        <button type="submit" class="btn btn-success">Create Category</button>
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