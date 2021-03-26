<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<style>
#invoice {
	padding: 30px;
}

.invoice {
	position: relative;
	background-color: #FFF;
	min-height: 680px;
	padding: 15px
}

.invoice header {
	padding: 10px 0;
	margin-bottom: 20px;
	border-bottom: 1px solid #3989c6
}

.invoice .company-details {
	text-align: right
}

.invoice .company-details .name {
	margin-top: 0;
	margin-bottom: 0
}

.invoice .contacts {
	margin-bottom: 20px
}

.invoice .invoice-to {
	text-align: left
}

.invoice .invoice-to .to {
	margin-top: 0;
	margin-bottom: 0
}

.invoice .invoice-details {
	text-align: right
}

.invoice .invoice-details .invoice-id {
	margin-top: 0;
	color: #3989c6
}

.invoice main {
	padding-bottom: 50px
}

.invoice main .thanks {
	margin-top: -100px;
	font-size: 2em;
	margin-bottom: 50px
}

.invoice main .notices {
	padding-left: 6px;
	border-left: 6px solid #3989c6
}

.invoice main .notices .notice {
	font-size: 1.2em
}

.invoice table {
	width: 100%;
	border-collapse: collapse;
	border-spacing: 0;
	margin-bottom: 20px
}

.invoice table td, .invoice table th {
	padding: 15px;
	background: #eee;
	border-bottom: 1px solid #fff
}

.invoice table th {
	white-space: nowrap;
	font-weight: 400;
	font-size: 16px
}

.invoice table td h3 {
	margin: 0;
	font-weight: 400;
	color: #3989c6;
	font-size: 1.2em
}

.invoice table .qty, .invoice table .total, .invoice table .unit {
	text-align: right;
	font-size: 1.2em
}

.invoice table .no {
	color: #fff;
	font-size: 1.6em;
	background: #3989c6
}

.invoice table .unit {
	background: #ddd
}

.invoice table .total {
	background: #3989c6;
	color: #fff
}

.invoice table tbody tr:last-child td {
	border: none
}

.invoice table tfoot td {
	background: 0 0;
	border-bottom: none;
	white-space: nowrap;
	text-align: right;
	padding: 10px 20px;
	font-size: 1.2em;
	border-top: 1px solid #aaa
}

.invoice table tfoot tr:first-child td {
	border-top: none
}

.invoice table tfoot tr:last-child td {
	color: #3989c6;
	font-size: 1.4em;
	border-top: 1px solid #3989c6
}

.invoice table tfoot tr td:first-child {
	border: none
}

.invoice footer {
	width: 100%;
	text-align: center;
	color: #777;
	border-top: 1px solid #aaa;
	padding: 8px 0
}

@media print {
	.invoice {
		font-size: 11px !important;
		overflow: hidden !important
	}
	.invoice footer {
		position: absolute;
		bottom: 10px;
		page-break-after: always
	}
	.invoice>div:last-child {
		page-break-before: always
	}
}
</style>
</head>

<body>
	<!-- HEADER START -->
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
							aria-current="page" href="/index">Home</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>

	<div id="invoice">
		<div class="invoice overflow-auto">
			<div style="min-width: 600px">
				<header>
					<div class="row">
						<div class="col company-details">
							<h2 class="name">
								<a target="_blank" href="#">V-park</a>
							</h2>
							<div>22, Ring road, Juhu, Mumbai, India</div>
							<div>Phone no: 1234567890</div>
							<div>xyz@gmail.com</div>
						</div>
					</div>
				</header>
				<main>
					<div class="row contacts">
						<div class="col invoice-to">
							<div class="text-gray-light">INVOICE TO:</div>
							<h2 class="to">${name}</h2>
							<div class="email">
								<a href="${email}">${email}</a>
							</div>
						</div>
					</div>
					<table>
						<thead>
							<tr>
								<th class="text-left">DESCRIPTION</th>
								<th class="text-right">Check in time</th>
								<th class="text-right">Check out time</th>
								<th class="text-right">Bill</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td class="text-left"><h3>Hello ${name}</h3>Thank you. You
									can pay at exit point else you can pay now</td>
								<td class="unit">${date1}</td>
								<td class="qty">${date2}</td>
								<td class="total">${bill}  Rupees</td>
							</tr>
						</tbody>
					</table>
				</main>
				<footer> Invoice was created on a computer and is valid
					without the signature and seal. </footer>
			</div>
			<button type="button">Pay now</button>
		</div>
	</div>
</body>
</html>