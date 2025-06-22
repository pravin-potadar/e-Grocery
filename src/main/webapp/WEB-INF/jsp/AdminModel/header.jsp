<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <title>Admin Dashboard</title>
  <meta name="viewport" content="width=device-width, initial-scale=1" />

  <!-- Bootstrap & Font Awesome -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" />

  <script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>

  <!-- Custom CSS -->
  <style>
    body {
      margin: 0;
      padding: 0;
    }

    /* Fixed Header */
    header {
      position: fixed;
      top: 0;
      left: 0;
      right: 0;
      height: 70px;
      background-color: #fff;
      z-index: 999;
      box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    }

    .header-inner {
      height: 100%;
      display: flex;
      align-items: center;
      justify-content: space-between;
      padding: 0 20px;
    }

    /* Fixed Sidebar */
    .sidebar {
      position: fixed;
      top: 70px;
      left: 0;
      width: 250px;
      height: calc(100vh - 70px);
      background-color: #f8f9fa;
      padding-top: 20px;
      overflow-y: auto;
      border-right: 1px solid #ddd;
    }

    /* Main Content */
    .main-content {
      margin-top: 70px;
      margin-left: 250px;
      padding: 20px;
    }

    .sidBarBtn,
    .sidBarAtag {
      background-color: transparent;
      border: none;
      width: 100%;
      text-align: left;
      padding: 10px 20px;
      font-size: 16px;
      color: #333;
      display: flex;
      align-items: center;
      gap: 10px;
    }

    .sidBarAtag {
      text-decoration: none;
      color: #333;
    }

    .sidBarBtn:hover,
    .sidBarAtag:hover {
      background-color: #e9ecef;
      color: #000;
    }

    .subList { 
      /* display: none; */
      padding-left: 20px;
    }

    .logo {
      font-weight: bold;
    }
  </style>
</head>

<body>
  <!-- HEADER -->
  <header>
    <div class="header-inner">
      <div>
        <i class="fa-solid fa-bars me-3"></i>
        <span class="logo">e-Grocery</span>
      </div>
      <div class="d-flex align-items-center gap-4">
        <i class="fa-solid fa-bell"></i>
        <img src="resources/AdminModel/img/users/pravin.jpg" alt="User" height="40" width="40" class="rounded-circle" />
      </div>
    </div>
  </header>

  <!-- SIDEBAR -->
  <aside class="sidebar">
    <button class="sidBarBtn"><i class="fa-solid fa-house"></i>Dashboard</button>

    <button id="categoryBtn" class="sidBarBtn"><i class="fa-solid fa-clipboard-list"></i>Category</button>
    <div class="subList">
      <a href="category-add" class="sidBarAtag"><i class="fa-solid fa-plus"></i>Add</a>
      <a href="category-update" class="sidBarAtag"><i class="fa-solid fa-pen-to-square"></i>Update</a>
      <a href="listCategory" class="sidBarAtag"><i class="fa-solid fa-table-list"></i>List</a>
    </div>

    <button class="sidBarBtn"><i class="fa-solid fa-cart-shopping"></i>Product</button>
    <div class="subList">
      <a href="product-add" class="sidBarAtag"><i class="fa-solid fa-plus"></i>Add</a>
      <a href="product-update" class="sidBarAtag"><i class="fa-solid fa-pen-to-square"></i>Update</a>
      <a href="product-list" class="sidBarAtag"><i class="fa-solid fa-table-list"></i>List</a>
    </div>

    <button class="sidBarBtn"><i class="fa-solid fa-blog"></i>Blogs</button>
    <div class="subList">
      <a href="blog-add" class="sidBarAtag"><i class="fa-solid fa-plus"></i>Add</a>
      <a href="blog-page" class="sidBarAtag"><i class="fa-solid fa-pen-to-square"></i>Update</a>
      <a href="blogs-list" class="sidBarAtag"><i class="fa-solid fa-table-list"></i>List</a>
    </div>

    <button class="sidBarBtn"><i class="fa-solid fa-box"></i>Orders</button>
    <div class="subList">
      <a class="sidBarAtag"><i class="fa-solid fa-plus"></i>Completed</a>
      <a class="sidBarAtag"><i class="fa-solid fa-pen-to-square"></i>Pending</a>
      <a class="sidBarAtag"><i class="fa-solid fa-table-list"></i>All Orders</a>
      <a class="sidBarAtag"><i class="fa-solid fa-times"></i>Canceled</a>
    </div>

    <button class="sidBarBtn"><i class="fa-solid fa-file-invoice-dollar"></i>Transactions</button>
    <div class="subList">
      <a class="sidBarAtag"><i class="fa-solid fa-money-bill-wave"></i>Payments</a>
      <a class="sidBarAtag"><i class="fa-solid fa-rotate-left"></i>Refunds</a>
      <a class="sidBarAtag"><i class="fa-solid fa-hand-holding-usd"></i>Payouts</a>
    </div>
  </aside>

  

  <!-- MAIN CONTENT -->
  <!-- <main class="main-content">
    <h2>Welcome to Admin Dashboard</h2>
    <p>This is the scrollable area. Add your main content here.</p>
    <p style="height: 1000px;">(Scroll to test fixed header & sidebar)</p>
  </main> -->

  <!-- Bootstrap JS -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<!-- </body>

</html> -->
