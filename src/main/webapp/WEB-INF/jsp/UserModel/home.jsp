<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

		<!DOCTYPE html>
		<html>

		<head>
			

		</head>

		<body>


			

			<jsp:include page="comman/header.jsp"></jsp:include>

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
										<h4>Shop Products</h4>
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
						

						<c:forEach var="categories" items="${categories}">
							<form action="searchCategory" class="col" method="post">

								<input type="hidden" name="searchCategoryId" value="${categories.id}">

								<button type="submit" class="categoryProducts d-flex justify-content-center mt-2">
									<img class="p-2" src="resources/AdminModel/img/Category/${categories.imageUrl}"
										alt="${categories.name}">
								</button>

								<p class="d-flex mt-2 text-center word-wrap justify-content-center">${categories.name}</p>
							</form>
						</c:forEach>

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

										

										<c:forEach var="product" items="${listOfProducts}">
											<div id="singleProduct" class="col-2 shopCard d-flex justify-content-center align-items-center">
												<div class="p-3">
													<div class="d-flex justify-content-center shopImg">
														<img src="resources/AdminModel/img/Products/${product.imageUrl}"
															alt="${product.name}">

													</div>
													<div class="shopTital">
														<p>${product.name}</p>
													</div>
													<div class="shopDiscription">
														<p class=" word-wrap  text-wrap">${product.description}</p>
													</div>
													<div class="shopBtn mt-2">
														<div class="row">
															<div class="col-12">
																<p>Price: ${product.price} &#8377;</p>
															</div>
															<div class="col-12">
																<form class="row"
																	action="onClickProductAndShowDatails${product.id}">
																	<input type="submit" class="col-12 ShopCardBuyNow"
																		value="Buy"></input>


																</form>
															</div>
														</div>
													</div>
												</div>
											</div>
										</c:forEach>

									</div>

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

			

		</body>

		<jsp:include page="comman/footer.jsp"></jsp:include>

	

		</html>