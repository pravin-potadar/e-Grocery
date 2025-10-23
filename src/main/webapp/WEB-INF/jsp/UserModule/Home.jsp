<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>e-Medical</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link rel="stylesheet" href="resources/CSS/Home.css">
  </head>

  <body>

    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-light shadow-sm bg-light">
      <div class="container">
        <a class="navbar-brand fw-bold text-teal" href="#">🩺 e-Medical</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll"
          aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarScroll">
          <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
            <li class="nav-item"><a class="nav-link active" href="#">Home</a></li>
            <li class="nav-item"><a class="nav-link" href="#products">Products</a></li>
            <li class="nav-item"><a class="nav-link" href="#contact">Contact</a></li>
          </ul>
          <form class="d-flex ms-3">
            <input class="form-control me-2" type="search" placeholder="Search medicine..." aria-label="Search">
            <button class="btn btn-outline-success" type="submit">Search</button>
          </form>
        </div>
      </div>
    </nav>

    <!-- Hero Carousel -->
    <div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
      <div class="carousel-indicators">
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active"
          aria-current="true"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2"></button>
      </div>

      <div class="carousel-inner">
        <div class="carousel-item active">
          <img src="resources/images/slide1.jpg" class="d-block w-100" alt="Medicines">
          <div class="carousel-caption d-none d-md-block bg-opacity rounded p-3">
            <h3>Trusted Medicines Delivered</h3>
            <p>Order your prescriptions easily and safely from e-Medical.</p>
          </div>
        </div>
        <div class="carousel-item">
          <img src="resources/images/slide2.jpg" class="d-block w-100" alt="Health">
          <div class="carousel-caption d-none d-md-block bg-opacity rounded p-3">
            <h3>Health & Wellness Products</h3>
            <p>Everything you need for a healthier life in one place.</p>
          </div>
        </div>
        <div class="carousel-item">
          <img src="resources/images/slide3.jpg" class="d-block w-100" alt="Doctor">
          <div class="carousel-caption d-none d-md-block bg-opacity rounded p-3">
            <h3>Online Doctor Consultation</h3>
            <p>Get professional advice anytime, anywhere.</p>
          </div>
        </div>
      </div>

      <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions"
        data-bs-slide="prev">
        <span class="carousel-control-prev-icon"></span>
      </button>
      <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions"
        data-bs-slide="next">
        <span class="carousel-control-next-icon"></span>
      </button>
    </div>

    <!-- Product Cards -->
    <section id="products" class="py-5">
      <div class="container">
        <h2 class="text-center mb-4 text-teal">Popular Medicines</h2>
        <div class="row row-cols-1 row-cols-md-3 g-4">

          <div class="col">
            <div class="card h-100 shadow-sm">
              <img src="resources/images/paracetamol.jpg" class="card-img-top" alt="Paracetamol">
              <div class="card-body">
                <h5 class="card-title">Paracetamol</h5>
                <p class="card-text">Used for pain relief and fever reduction. Trusted by doctors.</p>
              </div>
              <div class="card-footer text-center">
                <button class="btn btn-teal">Add to Cart</button>
              </div>
            </div>
          </div>

          <div class="col">
            <div class="card h-100 shadow-sm">
              <img src="resources/images/syrup.jpg" class="card-img-top" alt="Cough Syrup">
              <div class="card-body">
                <h5 class="card-title">Cough Syrup</h5>
                <p class="card-text">Effective syrup for throat irritation and dry cough.</p>
              </div>
              <div class="card-footer text-center">
                <button class="btn btn-teal">Add to Cart</button>
              </div>
            </div>
          </div>

          <div class="col">
            <div class="card h-100 shadow-sm">
              <img src="resources/images/ointment.jpg" class="card-img-top" alt="Pain Ointment">
              <div class="card-body">
                <h5 class="card-title">Pain Relief Ointment</h5>
                <p class="card-text">Fast relief from joint and muscle pain.</p>
              </div>
              <div class="card-footer text-center">
                <button class="btn btn-teal">Add to Cart</button>
              </div>
            </div>
          </div>

        </div>
      </div>
    </section>

    <!-- Footer -->
    <!-- Footer Section -->
    <footer class="footer">
      <div class="footer-container">
        <!-- Logo and About -->
        <div class="footer-col">
          <h2 class="logo">💊 MedCare</h2>
          <p>
            Your trusted online pharmacy delivering quality medicines and healthcare products right to your door.
          </p>
        </div>

        <!-- Quick Links -->
        <div class="footer-col">
          <h3>Quick Links</h3>
          <ul>
            <li><a href="#">Home</a></li>
            <li><a href="#">About Us</a></li>
            <li><a href="#">Products</a></li>
            <li><a href="#">Contact</a></li>
          </ul>
        </div>

        <!-- Contact Info -->
        <div class="footer-col">
          <h3>Contact Us</h3>
          <p>Email: support@medcare.com</p>
          <p>Phone: +91 98765 43210</p>
          <p>Address: Pune, Maharashtra, India</p>
        </div>
      </div>

      <div class="footer-bottom">
        <p>© 2025 MedCare. All Rights Reserved.</p>
      </div>
    </footer>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
  </body>

  </html>