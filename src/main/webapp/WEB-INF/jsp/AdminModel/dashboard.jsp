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
            <div class="  row">
              <div class="col-3 mt-2">
                <i class="ms-3 fa-solid fa-bars"></i>
                <h3 class="ms-5 logo">e-Grocery</h3>
              </div>

              <div class="col-7"></div>

              <div class="col-2">
                <div class="row">
                  <div class="col-6 mt-2">

                    <i class="fa-solid fa-bell"></i>

                  </div>
                  <div class="col-6 mt-3">

                    <img src="resources/AdminModel/img/users/pravin.jpg" alt="User" height="40px" width="40px"
                      class="rounded-circle">

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
            <div class="sidebar col-2" style="height: 93vh;">
              <div class="ms-3 mt-4">
                <div class="row">
                  <div class="dashboard">
                    <i class="fa-solid fa-house"></i>
                    <i class="ms-3">Dashbord</i>
                  </div>
                </div>
                <div class="row mt-2">
                  <div class="Category">
                    <div class="col-12">
                      <i class="fa-solid fa-clipboard-list"></i>
                      <i class="ms-3">Category</i>
                    </div>
                    <div class="row ms-3">
                      <div class="col-12 mt-2"><i class="fa-solid fa-plus"></i><i class="ms-3">Add</i></div>
                      <div class="col-12"><i class="fa-solid fa-pen-to-square"></i><i class="ms-3">update</i></div>
                      <div class="col-12"><i class="fa-solid fa-table-list"></i><i class="ms-3">List</i></div>
                    </div>
                  </div>
                </div>
                <div class="row mt-3">
                  <div class="product">
                    <div class="col-12">
                      <i class="fa-solid fa-box"></i>
                      <i class="ms-3">Product</i>
                    </div>
                    <div class="row ms-3">
                      <div class="col-12 mt-2"><i class="fa-solid fa-plus"></i><i class="ms-3">Add</i></div>
                      <div class="col-12"><i class="fa-solid fa-pen-to-square"></i><i class="ms-3">update</i></div>
                      <div class="col-12"><i class="fa-solid fa-table-list"></i><i class="ms-3">List</i></div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="main col-10">
              <div class="container-fluid">
                <div class="col-12">
                  <div class="topCards">
                    <div class="row">

                      <div class="col-12 mt-5">
                        <div class="row d-flex justify-content-around">

                          <div class="col-2">
                            <div class="row">
                              <div class="col-12 headerCard">
                                <h5 class="d-inline">Revenue</h5>
                                <h5 class="ms-2 fa-solid fa-money-bill-wave"></h5>
                              </div>
                              <hr width="80%">
                              <div class="col-12 mainCard ">
                                <div class="row">
                                  <div class="col-6">
                                    <span>10 00 000 </span> 
                                  </div>
                                  <div class="col-6">
                                    <span class="fa-solid fa-indian-rupee-sign"></span>

                                    <span class="ms-4  fa-solid fa-arrow-up"></span>
                                    <span class="fa-solid fa-arrow-down"></span>
                                  </div>
                                </div>
                              </div>
                              <hr class="mt-2">
                            </div>
                          </div>

                          <!-- <div class="col-2">
                            <div class="row">
                              <div class="col-12 headerCard">
                                <h5>Total Sales</h5>
                              </div>
                              <hr width="80%">
                              <div class="col-12 mainCard ">
                                <span>10 00 000 </span> <s class="fa-solid fa-indian-rupee-sign"></s>
                              </div>
                              <hr width="80%">
                              <div class="footerCard ">
                                <span class="fa-solid fa-arrow-up"></span>
                                <span class="fa-solid fa-arrow-down"></span>
                              </div>
                            </div>
                          </div> -->

                          <div class="col-2">
                            <div class="row">
                              <div class="col-12 headerCard">
                                <h5 class="d-inline">Total Products</h5>
                                <h5 class="ms-2 fa-solid fa-box"></h5>
                              </div>
                              <hr width="80%">
                              <div class="col-12 mainCard ">

                                <div class="row">
                                  <div class="col-6">
                                    <span>10 00 000 </span>
                                  </div>
                                  <div class="col-6">
                                    <span class="fa-solid fa-arrow-up"></span>
                                    <span class="fa-solid fa-arrow-down"></span>
                                  </div>
                                </div>
                              </div>
                              <hr class="mt-2">
                            </div>
                          </div>

                          <div class="col-2">
                            <div class="row">
                              <div class="col-12 headerCard">
                                <h5 class="d-inline">Total Customers</h5>
                                <h5 class="ms-2 fa-solid fa-users"></h5>
                              </div>
                              <hr width="80%">
                              <div class="col-12 mainCard ">

                                <div class="row">
                                  <div class="col-6">
                                    <span>1 00 000 </span>
                                  </div>
                                  <div class="col-6">
                                    <span class="fa-solid fa-arrow-up"></span>
                                    <span class="fa-solid fa-arrow-down"></span>
                                  </div>
                                </div>
                              </div>
                              <hr class="mt-2">
                            </div>
                          </div>

                          <div class="col-2">
                            <div class="row">
                              <div class="col-12 headerCard">
                                <h5 class="d-inline">Total Orders</h5>
                                <h5 class="fa-solid fa-cart-shopping"></h5>
                              </div>
                              <hr width="80%">
                              <div class="col-12 mainCard ">
                                <div class="row">
                                  <div class="col-6">
                                    <span>1000 </span>
                                  </div>
                                  <div class="col-6">
                                    <span class="fa-solid fa-arrow-up"></span>
                                    <span class="fa-solid fa-arrow-down"></span>
                                  </div>
                                </div>

                              </div>
                              <hr class="mt-2">
                            </div>
                          </div>

                        </div>
                      </div>

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

  </html>