<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>e-Grocery</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">

        <link rel="stylesheet" href="resources/UserModel/css/index.css">

    </head>

    <body>


        <header class="headerTop">

            <nav class="navbar navbar-expand-lg bg-body-tertiary fixed-top">
                <div class="container-fluid">
                    <a class="navbar-brand" href="#">
                        <!-- <div class="row">
                            <span class="col logo">e</span>
                            <span class="col logo">-</span>
                            <span class="col logo">G</span>
                            <span class="col logo">r</span>
                            <span class="col logo">o</span>
                            <span class="col logo">c</span>
                            <span class="col logo">e</span>
                            <span class="col logo">r</span>
                            <span class="col logo">y</span>
                        </div> -->
                    </a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                        data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                        aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse justify-content-center" id="navbarSupportedContent">
                        <ul class="navbar-nav  mb-5  mb-lg-0">
                            <li class="nav-item">
                                <a class="ms-4 nav-link active" aria-current="page" href="#">Home</a>
                            </li>
                            <li class="nav-item">
                                <a class="ms-4 nav-link active" aria-current="page" href="#">Shop</a>
                            </li>

                            <li class="nav-item">
                                <a class="ms-4 nav-link active" aria-current="page" href="#">Blog</a>
                            </li>
                            <li class="nav-item">
                                <a class="ms-4 nav-link active" aria-current="page" href="#">Contact</a>
                            </li>
                            <li class="nav-item">
                                <a class="ms-4 nav-link active" aria-current="page" href="#">About Us</a>
                            </li>

                        </ul>
                    </div>
                    <div class=" justify-content-end">
                        <ul class="navbar-nav">
                            <li class="nav-item">
                                <a class="ms-2 nav-link active" aria-current="page" href="dashboard">Login</a>
                            </li>


                        </ul>

                    </div>

                </div>
            </nav>

        </header>

        <div class="main">
            <div class="slide">
                <div class="container-fluid ">
                    <div id="carouselExampleDark" class="carousel carousel-dark slide">
                        <div class="carousel-indicators">
                            <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="0"
                                class="active" aria-current="true" aria-label="Slide 1"></button>
                            <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="1"
                                aria-label="Slide 2"></button>
                            <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="2"
                                aria-label="Slide 3"></button>
                        </div>
                        <div class="carousel-inner">
                            <div class="carousel-item active" data-bs-interval="10000">
                                <img src="resources/UserModel/img/slideImg/1.png" class=" d-block w-100"
                                    style="height: 300px;" alt="...">
                                <div class="carousel-caption d-none d-md-block">
                                    <h2>e-Grocery</h2>
                                    <h4>Shop Products</h4>
                                </div>
                            </div>
                            <div class="carousel-item" data-bs-interval="2000">
                                <img src="resources/UserModel/img/slideImg/2.png" class="d-block w-100"
                                    style="height: 300px;" alt="...">
                                <div class="carousel-caption d-none d-md-block">
                                    <h2>e-Grocery</h2>
                                    <h4>SShop Products</h4>
                                </div>
                            </div>
                            <div class="carousel-item">
                                <img src="resources/UserModel/img/slideImg/3.png" class="d-block w-100"
                                    style="height: 300px;" alt="...">
                                <div class="carousel-caption d-none d-md-block">
                                    <h2>e-Grocery</h2>
                                    <h4>Shop Products</h4>
                                </div>
                            </div>
                        </div>
                        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleDark"
                            data-bs-slide="prev">
                            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                            <span class="visually-hidden">Previous</span>
                        </button>
                        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleDark"
                            data-bs-slide="next">
                            <span class="carousel-control-next-icon" aria-hidden="true"></span>
                            <span class="visually-hidden">Next</span>
                        </button>
                    </div>
                </div>
            </div>

            <div class="container-fluid ms-2 col-12">
                <div class="mt-5 col-12 categoryHeader">
                    <h2 class="text-center">categorys</h2>
                </div>
                <div class="col-12 row  justify-content-evenly">
                    <div class="col">
                        <div class="categoryProducts d-flex justify-content-center mt-2">
                            <img class="p-2" src="resources\UserModel\img\categoryLogos\Bakery&Bread.png" alt="">
                        </div>
                        <p class="mt-2 text-center">Bakery & Bread</p>
                    </div>
                    <div class="col">
                        <div class="categoryProducts d-flex justify-content-center mt-2">
                            <img class="p-2" src="resources\UserModel\img\categoryLogos\Canned&JarredGoods.png" alt="">
                        </div>
                        <p class="mt-2 text-center">Canned & Jarred Goods</p>
                    </div>
                    <div class="col">
                        <div class="categoryProducts d-flex justify-content-center mt-2">
                            <img class="p-2" src="resources\UserModel\img\categoryLogos\Dairy&Eggs.png" alt="">
                        </div>
                        <p class="mt-2 text-center">Dairy & Eggs</p>
                    </div>
                    <div class="col">
                        <div class="categoryProducts d-flex justify-content-center mt-2">
                            <img class="p-2" src="resources\UserModel\img\categoryLogos\FreshProduce.png" alt="">
                        </div>
                        <p class="mt-2 text-center">Fresh Produce</p>
                    </div>
                    <div class="col">
                        <div class="categoryProducts d-flex justify-content-center mt-2">
                            <img class="p-2" src="resources\UserModel\img\categoryLogos\FrozenFoods.png" alt="">
                        </div>
                        <p class="mt-2 text-center">Frozen Foods</p>
                    </div>
                    <div class="col">
                        <div class="categoryProducts d-flex justify-content-center mt-2">
                            <img class="p-2" src="resources\UserModel\img\categoryLogos\Grains&Pasta.png" alt="">
                        </div>
                        <p class="mt-2 text-center">Grains & Pasta</p>
                    </div>
                    <div class="col">
                        <div class="categoryProducts d-flex justify-content-center mt-2">
                            <img class="p-2" src="resources\UserModel\img\categoryLogos\HouseholdEssentials.png" alt="">
                        </div>
                        <p class="mt-2 text-center">House hold Essentials</p>
                    </div>
                    <div class="col">
                        <div class="categoryProducts d-flex justify-content-center mt-2">
                            <img class="p-2" src="resources\UserModel\img\categoryLogos\Snacks&Beverages.png" alt="">
                        </div>
                        <p class="mt-2 text-center">Snacks & Beverages</p>
                    </div>
                    <div class="col">
                        <div class="categoryProducts d-flex justify-content-center mt-2">
                            <img class="p-2" src="resources\UserModel\img\categoryLogos\Spices&Condiments.png" alt="">
                        </div>
                        <p class="mt-2 text-center">Spices & Condiments</p>
                    </div>
                </div>
            </div>

            <div class="mt-5 shopArea col-12">
                <div class="container-fluid">
                    <div class="col-12">
                        <div class="shopHeader">
                            <h2 class="shopHeaderName text-center">Grocery Products</h2>
                        </div>
                    </div>
                    <div class="ms-3 col-12">
                        <div class="row">
                            <div class="col-12">

                                <div class="mt-5 row justify-content-evenly">

                                    <div class="col-2 shopCard">
                                        <div class="p-3">
                                            <div class="d-flex justify-content-center shopImg">
                                                <img src="resources\UserModel\img\Products\Bakery&Bread\Naan.png"
                                                    alt="">
                                            </div>
                                            <div class=" shopTital">
                                                <p>Naan</p>
                                            </div>
                                            <div class=" shopDiscription">
                                                <p>discription</p>
                                            </div>
                                            <div class=" shopBtn">
                                                <div class="row">
                                                    <div class="col-12">
                                                        <p>Price : 50 &#8377</p>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-2 shopCard">
                                        <div class="p-3">
                                            <div class="d-flex justify-content-center shopImg">
                                                <img src="resources\UserModel\img\Products\Bakery&Bread\Naan.png"
                                                    alt="">
                                            </div>
                                            <div class=" shopTital">
                                                <p>Naan</p>
                                            </div>
                                            <div class=" shopDiscription">
                                                <p>discription</p>
                                            </div>
                                            <div class=" shopBtn">
                                                <button class="ShopCardBuyNow">Buy</button>
                                                <button class="ShopCardBuyNow">Add To Card</button>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-2 shopCard">
                                        <div class="p-3">
                                            <div class="d-flex justify-content-center shopImg">
                                                <img src="resources\UserModel\img\Products\Bakery&Bread\Naan.png"
                                                    alt="">
                                            </div>
                                            <div class=" shopTital">
                                                <p>Naan</p>
                                            </div>
                                            <div class=" shopDiscription">
                                                <p>discription</p>
                                            </div>
                                            <div class=" shopBtn">
                                                <button class="ShopCardBuyNow">Buy</button>
                                                <button class="ShopCardBuyNow">Add To Card</button>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-2 shopCard">
                                        <div class="p-3">
                                            <div class="d-flex justify-content-center shopImg">
                                                <img src="resources\UserModel\img\Products\Bakery&Bread\Naan.png"
                                                    alt="">
                                            </div>
                                            <div class=" shopTital">
                                                <p>Naan</p>
                                            </div>
                                            <div class=" shopDiscription">
                                                <p>discription</p>
                                            </div>
                                            <div class=" shopBtn">
                                                <button class="ShopCardBuyNow">Buy</button>
                                                <button class="ShopCardBuyNow">Add To Card</button>
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

        <div class="mt-5 p-5">
            <div class="footer">
                <footer>
                    <div class="row">
                        <div class="col-3 d-flex align-items-center ">
                            <h2 class="ms-5">e-Grocery</h2>
                        </div>
                        <div class="col-3">
                            <div class="disabled">ABOUT</div>
                            <div class="mt-2">Shop</div>
                            <div>Blog</div>
                            <div>Contact</div>
                            <div>About Us</div>
                        </div>
                        <div class="col-3">
                            <div class="disabled">HELP</div>
                            <div class="mt-2">Cancellation and Return</div>
                            <div>Payments</div>
                            <div>shipping</div>
                            <div>FAQ</div>
                        </div>
                        <div class="col-3">
                            <div class="disabled">CONSUMER POLICY</div>
                            <div class="mt-2">Terms of Use</div>
                            <div>Security</div>
                            <div>Privecy</div>
                        </div>
                    </div>
                </footer>
            </div>
        </div>

    </body>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>

    </html>