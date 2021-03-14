<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.80.0">


<link rel="canonical"
	href="https://getbootstrap.com/docs/5.0/examples/carousel/">



<!-- Bootstrap core CSS -->
<link href="./css/bootstrap.min.css" rel="stylesheet">

<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>


</head>

<style>
body {
	padding-top: 3rem;
	padding-bottom: 3rem;
	color: #5a5a5a;
}

/* CUSTOMIZE THE CAROUSEL
-------------------------------------------------- */

/* Carousel base class */
.carousel {
	margin-bottom: 4rem;
}
/* Since positioning the image, we need to help out the caption */
.carousel-caption {
	bottom: 3rem;
	z-index: 10;
}

/* Declare heights because of positioning of img element */
.carousel-item {
	height: 32rem;
}

.carousel-item>img {
	position: absolute;
	top: 0;
	left: 0;
	min-width: 100%;
	height: 32rem;
}

/* MARKETING CONTENT
-------------------------------------------------- */

/* Center align the text within the three columns below the carousel */
.marketing .col-lg-4 {
	margin-bottom: 1.5rem;
	text-align: center;
}

.marketing h2 {
	font-weight: 400;
}
/* rtl:begin:ignore */
.marketing .col-lg-4 p {
	margin-right: .75rem;
	margin-left: .75rem;
}
/* rtl:end:ignore */

/* Featurettes
------------------------- */
.featurette-divider {
	margin: 5rem 0; /* Space out the Bootstrap <hr> more */
}

/* Thin out the marketing headings */
.featurette-heading {
	font-weight: 300;
	line-height: 1;
	/* rtl:remove */
	letter-spacing: -.05rem;
}

/* RESPONSIVE CSS
-------------------------------------------------- */
@media ( min-width : 40em) {
	/* Bump up size of carousel content */
	.carousel-caption p {
		margin-bottom: 1.25rem;
		font-size: 1.25rem;
		line-height: 1.4;
	}
	.featurette-heading {
		font-size: 50px;
	}
}

@media ( min-width : 62em) {
	.featurette-heading {
		margin-top: 7rem;
	}
}
</style>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
			<div class="container-fluid">
				<a class="navbar-brand" href="#">V-Park</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarCollapse"
					aria-controls="navbarCollapse" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarCollapse">
					<ul class="navbar-nav me-auto mb-2 mb-md-0">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="index.html">Home</a></li>
						<li class="nav-item"><a class="nav-link" href="login.jsp">Owner login</a></li>
						<li class="nav-item"><a class="nav-link" href="#contact">Contact</a></li>
						<li class="nav-item"><a class="nav-link disabled" href="#"
							tabindex="-1" aria-disabled="true">Disabled</a></li>
					</ul>
					<form class="d-flex">
						<input class="form-control me-2" type="search"
							placeholder="Search" aria-label="Search">
						<button class="btn btn-outline-success" type="submit">Search</button>
					</form> 
				</div>
			</div>
		</nav>
	</header>

	<main>

		<div id="myCarousel" class="carousel slide" data-bs-ride="carousel">
		
			<div class="carousel-indicators">
				<button type="button" data-bs-target="#myCarousel"
					data-bs-slide-to="0" class="active" aria-current="true"
					aria-label="Slide 1"></button>
				<button type="button" data-bs-target="#myCarousel"
					data-bs-slide-to="1" aria-label="Slide 2"></button>
				<button type="button" data-bs-target="#myCarousel"
					data-bs-slide-to="2" aria-label="Slide 3"></button>
			</div>
			
			<div class="carousel-inner">
			
				<div class="carousel-item active">
					<svg class="bd-placeholder-img" width="100%" height="100%"
						xmlns="http://www.w3.org/2000/svg" aria-hidden="true"
						preserveAspectRatio="xMidYMid slice" focusable="false">
						<rect width="100%" height="100%" fill="#777" /></svg>

					<div class="container">
						<div class="carousel-caption text-start">
							<h1>Book your spot for two wheeler</h1>
							<p>You can book the parking according to your need</p>
							<p>
								<a class="btn btn-lg btn-primary" href="Two_w_book">Book now</a>
							</p>
						</div>
					</div>
				</div>
				<div class="carousel-item">
					<svg class="bd-placeholder-img" width="100%" height="100%"
						xmlns="http://www.w3.org/2000/svg" aria-hidden="true"
						preserveAspectRatio="xMidYMid slice" focusable="false">
						<rect width="100%" height="100%" fill="#777" /></svg>

					<div class="container">
						<div class="carousel-caption">
							<h1>Book your spot for Four wheeler</h1>
							<p>You can book the parking according to your need</p>
							<p>
								<a class="btn btn-lg btn-primary" href="Four_w_booking.html">Book now</a>
							</p>
						</div>
					</div>
				</div>
				<div class="carousel-item">
					<svg class="bd-placeholder-img" width="100%" height="100%"
						xmlns="http://www.w3.org/2000/svg" aria-hidden="true"
						preserveAspectRatio="xMidYMid slice" focusable="false">
						<rect width="100%" height="100%" fill="#777" /></svg>

					<div class="container">
						<div class="carousel-caption text-end">
							<h1>Our Specialties</h1>
							<p>Gallery</p>
							<p>
								<a class="btn btn-lg btn-primary" href="#gallery">Browse gallery</a>
							</p>
						</div>
					</div>
				</div>
				
			</div>
			
			<button class="carousel-control-prev" type="button"
				data-bs-target="#myCarousel" data-bs-slide="prev">
				<span class="carousel-control-prev-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Previous</span>
			</button>
			<button class="carousel-control-next" type="button"
				data-bs-target="#myCarousel" data-bs-slide="next">
				<span class="carousel-control-next-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Next</span>
			</button>
		</div>


		<!-- Marketing messaging and featurettes
  ================================================== -->
		<!-- Wrap the rest of the page in another container to center all the content. -->

		<div class="container marketing">

			<!-- Three columns of text below the carousel -->
			<div class="row">
				<div class="col-lg-4">
					<svg class="bd-placeholder-img rounded-circle" width="140"
						height="140" xmlns="http://www.w3.org/2000/svg" role="img"
						aria-label="Placeholder: 140x140"
						preserveAspectRatio="xMidYMid slice" focusable="false">
						<title>Placeholder</title><rect width="100%" height="100%"
							fill="#777" />
						<text x="50%" y="50%" fill="#777" dy=".3em">140x140</text></svg>

					<h2>Heading</h2>
					<p>Some representative placeholder content for the three
						columns of text below the carousel. This is the first column.</p>
					<p>
						<a class="btn btn-secondary" href="#">View details &raquo;</a>
					</p>
				</div>
				<!-- /.col-lg-4 -->
				<div class="col-lg-4">
					<svg class="bd-placeholder-img rounded-circle" width="140"
						height="140" xmlns="http://www.w3.org/2000/svg" role="img"
						aria-label="Placeholder: 140x140"
						preserveAspectRatio="xMidYMid slice" focusable="false">
						<title>Placeholder</title><rect width="100%" height="100%"
							fill="#777" />
						<text x="50%" y="50%" fill="#777" dy=".3em">140x140</text></svg>

					<h2>Heading</h2>
					<p>Another exciting bit of representative placeholder content.
						This time, we've moved on to the second column.</p>
					<p>
						<a class="btn btn-secondary" href="#">View details &raquo;</a>
					</p>
				</div>
				<!-- /.col-lg-4 -->
				<div class="col-lg-4">
					<svg class="bd-placeholder-img rounded-circle" width="140"
						height="140" xmlns="http://www.w3.org/2000/svg" role="img"
						aria-label="Placeholder: 140x140"
						preserveAspectRatio="xMidYMid slice" focusable="false">
						<title>Placeholder</title><rect width="100%" height="100%"
							fill="#777" />
						<text x="50%" y="50%" fill="#777" dy=".3em">140x140</text></svg>

					<h2>Heading</h2>
					<p>And lastly this, the third column of representative
						placeholder content.</p>
					<p>
						<a class="btn btn-secondary" href="#">View details &raquo;</a>
					</p>
				</div>
				<!-- /.col-lg-4 -->
			</div>
			<!-- /.row -->


			<!-- START THE FEATURETTES -->

			<hr class="featurette-divider">

			<div class="row featurette">
				<div class="col-md-7">
					<h2 class="featurette-heading">
						First featurette heading. <span class="text-muted">It’ll
							blow your mind.</span>
					</h2>
					<p class="lead">Some great placeholder content for the first
						featurette here. Imagine some exciting prose here.</p>
				</div>
				<div class="col-md-5">
					<svg
						class="bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto"
						width="500" height="500" xmlns="http://www.w3.org/2000/svg"
						role="img" aria-label="Placeholder: 500x500"
						preserveAspectRatio="xMidYMid slice" focusable="false">
						<title>Placeholder</title><rect width="100%" height="100%"
							fill="#eee" />
						<text x="50%" y="50%" fill="#aaa" dy=".3em">500x500</text></svg>

				</div>
			</div>

			<hr class="featurette-divider">

			<div class="row featurette">
				<div class="col-md-7 order-md-2">
					<h2 class="featurette-heading">
						Oh yeah, it’s that good. <span class="text-muted">See for
							yourself.</span>
					</h2>
					<p class="lead">Another featurette? Of course. More placeholder
						content here to give you an idea of how this layout would work
						with some actual real-world content in place.</p>
				</div>
				<div class="col-md-5 order-md-1">
					<svg
						class="bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto"
						width="500" height="500" xmlns="http://www.w3.org/2000/svg"
						role="img" aria-label="Placeholder: 500x500"
						preserveAspectRatio="xMidYMid slice" focusable="false">
						<title>Placeholder</title><rect width="100%" height="100%"
							fill="#eee" />
						<text x="50%" y="50%" fill="#aaa" dy=".3em">500x500</text></svg>

				</div>
			</div>

			<hr class="featurette-divider">

			<div class="row featurette">
				<div class="col-md-7">
					<h2 class="featurette-heading">
						And lastly, this one. <span class="text-muted">Checkmate.</span>
					</h2>
					<p class="lead">And yes, this is the last block of
						representative placeholder content. Again, not really intended to
						be actually read, simply here to give you a better view of what
						this would look like with some actual content. Your content.</p>
				</div>
				<div class="col-md-5">
					<svg
						class="bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto"
						width="500" height="500" xmlns="http://www.w3.org/2000/svg"
						role="img" aria-label="Placeholder: 500x500"
						preserveAspectRatio="xMidYMid slice" focusable="false">
						<title>Placeholder</title><rect width="100%" height="100%"
							fill="#eee" />
						<text x="50%" y="50%" fill="#aaa" dy=".3em">500x500</text></svg>

				</div>
			</div>

			<hr class="featurette-divider">

			<!-- /END THE FEATURETTES -->

		</div>
		<!-- /.container -->
		
		<div id="contact" class="contact">
			<div class="container">
				<div class="contact-text">			
					<h3>Contact us</h3>
					<span></span>	
				</div>
			<div class="contact-grids">
				<div class="col-md-4 contact-grid text-center wow bounceIn" data-wow-delay="0.4s">
					<div class="icon1"></div>
				 <p>Phone no: 1234567890</p>
				
				</div>
				<div class="col-md-4 contact-grid text-center wow bounceIn" data-wow-delay="0.4s">
					<div class="icon2"></div>
				
					<p> MSRIT</p>
					<p> Anna Nagar, Bangalore</p>
	

				</div>
				<div class="col-md-4 contact-grid text-center wow bounceIn" data-wow-delay="0.4s">
					<div class="icon3"></div>
					<a href="mailto:example.com">xyz.com</a>
				</div>
				<div class="clearfix"></div>
		 </div>	 
	 </div>

</div>

		<!-- FOOTER -->
		<footer class="container">
			<p class="float-end">
				<a href="#">Back to top</a>
			</p>
			<p>
				&copy; 2017–2021 V-Park, Inc. &middot; <a href="#">Privacy</a>
				&middot; <a href="#">Terms</a>
			</p>
		</footer>
	</main>


	<script src="./js/bootstrap.bundle.min.js"></script>


</body>
</html>
