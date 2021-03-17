<!doctype html>
<html lang="en">
<head>
<title>Home Page</title>
<meta charset="utf-8">
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

.footer{
  background: #152F4F;
  color:white;
  
  .links{
    ul {list-style-type: none;}
    li a{
      color: white;
      transition: color .2s;
      &:hover{
        text-decoration:none;
        color:#4180CB;
        }
    }
  }  
  .about-company{
    i{font-size: 25px;}
    a{
      color:white;
      transition: color .2s;
      &:hover{color:#4180CB}
    }
  } 
  .location{
    i{font-size: 18px;}
  }
  .copyright p{border-top:1px solid rgba(255,255,255,.1);} 
}
</style>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
			<div class="container-fluid">
				<a class="navbar-brand" href="#">V-Park</a>
				<div class="collapse navbar-collapse" id="navbarCollapse">
					<ul class="navbar-nav me-auto mb-2 mb-md-0">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="index.jsp">Home</a></li>
						<li class="nav-item"><a class="nav-link" href="login.jsp">Owner
								login</a></li>
						<li class="nav-item"><a class="nav-link" href="#contact">Contact</a></li>
						<li class="nav-item"><a class="nav-link disabled" href="#"
							tabindex="-1" aria-disabled="true">Disabled</a></li>
					</ul>
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
					<img src="/images/zhanjiang-chen-GAsXZVqYqFA-unsplash.jpg">

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
					<img src="/images/jung-ho-park-Iif_Jf_QNPk-unsplash.jpg">
					<div class="container">
						<div class="carousel-caption">
							<h1>Book your spot for Four wheeler</h1>
							<p>You can book the parking according to your need</p>
							<p>
								<a class="btn btn-lg btn-primary" href="Four_w_booking">Book now</a>
							</p>
						</div>
					</div>
				</div>
				<div class="carousel-item">
					<svg class="bd-placeholder-img" width="100%" height="100%"
						xmlns="http://www.w3.org/2000/svg" aria-hidden="true"
						preserveAspectRatio="xMidYMid slice" focusable="false">
						<rect width="100%" height="100%" fill="#777" /></svg>
					<img src="/images/wengang-zhai-adA47gBo6us-unsplash.jpg">
					<div class="container">
						<div class="carousel-caption text-end">
							<h1>Our Specialties</h1>
							<p>Gallery</p>
							<p>
								<a class="btn btn-lg btn-primary" href="#show_now">Click to view</a>
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

			<hr class="featurette-divider" id="show_now">
			
			<!-- Feature 1 -->
			<div class="row featurette">
				<div class="col-md-7">
					<h2 class="featurette-heading">Hassle Free Booking</h2>
					<p class="lead">We provide easy Booking Process</p>
				</div>
				<div class="col-md-5">
					<svg width="400" height="400" xmlns="http://www.w3.org/2000/svg">
					<image href="images/mak-DBHWvSqTp4M-unsplash.jpg" 
					height="400" width="400"/></svg>
				</div>
			</div>
			<!-- Feature 1 complete-->
			
			<hr class="featurette-divider">

			<!-- Feature 2 -->
			<div class="row featurette">
				<div class="col-md-7 order-md-2">
					<h2 class="featurette-heading">Automated Parking System (APS)</h2>
					<p class="lead">An Automated Parking System or APS is a mechanical system that moves cars 
						from the entry to an available parking space.</p>
				</div>
				<div class="col-md-5 order-md-1">
					<svg width="400" height="400" xmlns="http://www.w3.org/2000/svg">
					<image href="images/erik-mclean-FriutX_vqnc-unsplash.jpg" 
					height="400" width="400"/></svg>
				</div>
			</div>
			<!-- Feature 2 complete-->
			
			<hr class="featurette-divider">

			<!-- Feature 3 -->
			<div class="row featurette">
				<div class="col-md-7">
					<h2 class="featurette-heading">Easy Check in Check out System</h2>
					<p class="lead">We provide easy Check in Check out System for good customer experience</p>
				</div>
				<div class="col-md-5">
					<svg width="400" height="400" xmlns="http://www.w3.org/2000/svg">
					<image href="images/aaron-lutas-JKZkFk8WnrI-unsplash.jpg" 
					height="400" width="400"/></svg>
				</div>
			</div>
			<!-- Feature 3 complete-->

			<!-- /END THE FEATURETTES -->
		</div>
		
		<!-- /.container -->

		<!-- FOOTER -->

		<div class="mt-5 pt-5 pb-5 footer" id="contact">
			<div class="container">
				<div class="row">
					<div class="col-lg-5 col-xs-12 about-company">
						<h2>Heading</h2>
						<p class="pr-5 text-white-50">Some text</p>
					</div>
					<div class="col-lg-3 col-xs-12 links">
						<h4 class="mt-lg-0 mt-sm-3">Contribution</h4>
						<ul class="m-0 p-0">
							<li>Amey Yeole</li>
						</ul>
					</div>
					<div class="col-lg-4 col-xs-12 location">
						<h4 class="mt-lg-0 mt-sm-4">Contact us</h4>
						<p>22, Ring road, Juhu, Mumbai</p>
						<p class="mb-0">
							<i class="fa fa-phone mr-3"></i>Phone no: 1234567890
						</p>
						<p>
							<i class="fa fa-envelope-o mr-3"></i>xyz.com
						</p>
					</div>
				</div>
				<div class="row mt-5">
					<div class="col copyright">
						<p class="">
							<small class="text-white-50">&copy; 2017 - 2021 V-Park, Inc. &middot;
							<a href="#">Privacy</a> &middot; <a href="#">Terms</a></small>
						</p>
					</div>
				</div>
				<p class="float-end">
				<a href="#">Back to top</a>
			</p>
			</div>
		</div>
	</main>
	<script src="./js/bootstrap.bundle.min.js"></script>
</body>
</html>
