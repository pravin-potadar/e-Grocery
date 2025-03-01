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

    <link rel="stylesheet" href="resources/AdminModel/css/dashboard.css">

  </head>

  <body>

    <header>
      <nav>
        <div class="top-area">
          <div class="col-12 header">
            <div class="row">
              <div class="col-3">
                <h3 class="ms-3">e-Grocery</h3>
              </div>
              <div class="col-6"></div>
              <div class="col-3">
                <div class="row">
                  <div class="col-1">
                    <i class="fa-solid fa-bell"></i>
                  </div>
                  <div class="col-1">
                    <i class="fa-solid fa-circle-user"></i>
                  </div>
                  <div class="c0l-10"></div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </nav>
    </header>

    <div class="col-12 bottum-area ">
      <div class="row">
        <div class="col-12 ">
          <div class="row">
            <div class="sidebar col-3" style="height: 93vh;">
              <div class="ms-5 mt-4">
                <div class="row">
                  <div class="dashboard">
                    <p>Dashbord</p>
                  </div>
                </div>
                <div class="row mt-2">
                  <div class="Category">
                    <div class="col-12">Category</div>
                    <div class="row">
                      <div class="col-12">Add</div>
                      <div class="col-12">update</div>
                      <div class="col-12">List</div>
                    </div>
                  </div>
                </div>
                <div class="row mt-3">
                  <div class="product">
                    <div class="col-12">Product</div>
                    <div class="row">
                      <div class="col-12">Add</div>
                      <div class="col-12">update</div>
                      <div class="col-12">List</div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="main"></div>
          </div>
        </div>
      </div>
    </div>

  </body>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
    crossorigin="anonymous"></script>

  </html>