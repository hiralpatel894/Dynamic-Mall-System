<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>DataTables | Tables</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="Thu, 19 Nov 1900 08:52:00 GMT">
<link rel="shortcut icon" href="images/icons/favicon.ico">
<link rel="apple-touch-icon" href="images/icons/favicon.png">
<link rel="apple-touch-icon" sizes="72x72"
	href="images/icons/favicon-72x72.png">
<link rel="apple-touch-icon" sizes="114x114"
	href="images/icons/favicon-114x114.png">
<!--Loading bootstrap css-->
<link type="text/css" rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,400,300,700">
<link type="text/css" rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Oswald:400,700,300">
<link type="text/css" rel="stylesheet"
	href="css/jquery-ui-1.10.4.custom.min.css">
<link type="text/css" rel="stylesheet"
	href="css/font-awesome.min.css">
<link type="text/css" rel="stylesheet"
	href="css/bootstrap.min.css">
<!--LOADING STYLESHEET FOR PAGE-->
<link type="text/css" rel="stylesheet"
	href="css/jquery.dataTables.css">
<link type="text/css" rel="stylesheet"
	href="css/dataTables.tableTools.min.css">
<link type="text/css" rel="stylesheet"
	href="css/dataTables.bootstrap.css">
<!--Loading style vendors-->
<link type="text/css" rel="stylesheet"
	href="css/animate.css">
<link type="text/css" rel="stylesheet"
	href="css/pace.css">
<link type="text/css" rel="stylesheet"
	href="css/all.css">
<link type="text/css" rel="stylesheet"
	href="css/jquery.notific8.min.css">
<link type="text/css" rel="stylesheet"
	href="css/daterangepicker-bs3.css">
<!--Loading style-->
<link type="text/css" rel="stylesheet"
	href="css/orange-blue.css" class="default-style">
<link type="text/css" rel="stylesheet"
	href="css/orange-blue.css" id="theme-change"
	class="style-change color-change">
<link type="text/css" rel="stylesheet" href="css/style-responsive.css">
</head>
<body class=" ">
	<div>
		<div class="news-ticker bg-orange">
			<div class="container">
				<ul id="news-ticker-content" class="list-unstyled mbn">
					<li><a href='http://madmin.swlabs.co/' , target='_blank'>This
							is HTML app version of this template. To see Angular app version,
							please click here</a></li>
				</ul>
				<a id="news-ticker-close" href="javascript:;"><i
					class="fa fa-times"></i></a>
			</div>
		</div>
		<!--BEGIN BACK TO TOP-->
		<a id="totop" href="#"><i class="fa fa-angle-up"></i></a>
		<!--END BACK TO TOP-->
		<!--BEGIN TOPBAR-->
		<jsp:include page="header.jsp"></jsp:include>
		<!--END TOPBAR-->
		<div id="wrapper">
			<!--BEGIN SIDEBAR MENU-->
			<jsp:include page="menu.jsp"></jsp:include>
			<!--END SIDEBAR MENU-->
			<!--BEGIN CHAT FORM-->
			<div id="chat-form" class="fixed">
				<div class="chat-inner">
					<h2 class="chat-header">
						<a href="javascript:;" class="chat-form-close pull-right"><i
							class="glyphicon glyphicon-remove"></i></a><i class="fa fa-user"></i>&nbsp;
						Chat &nbsp;<span class="badge badge-info">3</span>
					</h2>
					<div id="group-1" class="chat-group">
						<strong>Favorites</strong><a href="#"><span
							class="user-status is-online"></span><small>Verna Morton</small><span
							class="badge badge-info">2</span></a><a href="#"><span
							class="user-status is-online"></span><small>Delores Blake</small><span
							class="badge badge-info is-hidden">0</span></a><a href="#"><span
							class="user-status is-busy"></span><small>Nathaniel
								Morris</small><span class="badge badge-info is-hidden">0</span></a><a
							href="#"><span class="user-status is-idle"></span><small>Boyd
								Bridges</small><span class="badge badge-info is-hidden">0</span></a><a
							href="#"><span class="user-status is-offline"></span><small>Meredith
								Houston</small><span class="badge badge-info is-hidden">0</span></a>
					</div>
					<div id="group-2" class="chat-group">
						<strong>Office</strong><a href="#"><span
							class="user-status is-busy"></span><small>Ann Scott</small><span
							class="badge badge-info is-hidden">0</span></a><a href="#"><span
							class="user-status is-offline"></span><small>Sherman
								Stokes</small><span class="badge badge-info is-hidden">0</span></a><a
							href="#"><span class="user-status is-offline"></span><small>Florence
								Pierce</small><span class="badge badge-info">1</span></a>
					</div>
					<div id="group-3" class="chat-group">
						<strong>Friends</strong><a href="#"><span
							class="user-status is-online"></span><small>Willard
								Mckenzie</small><span class="badge badge-info is-hidden">0</span></a><a
							href="#"><span class="user-status is-busy"></span><small>Jenny
								Frazier</small><span class="badge badge-info is-hidden">0</span></a><a
							href="#"><span class="user-status is-offline"></span><small>Chris
								Stewart</small><span class="badge badge-info is-hidden">0</span></a><a
							href="#"><span class="user-status is-offline"></span><small>Olivia
								Green</small><span class="badge badge-info is-hidden">0</span></a>
					</div>
				</div>
				<div id="chat-box" style="top: 400px">
					<div class="chat-box-header">
						<a href="#" class="chat-box-close pull-right"><i
							class="glyphicon glyphicon-remove"></i></a><span
							class="user-status is-online"></span><span class="display-name">Willard
							Mckenzie</span><small>Online</small>
					</div>
					<div class="chat-content">
						<ul class="chat-box-body">
							<li><p>
									<img
										src="img/128.jpg"
										class="avt" /><span class="user">John Doe</span><span
										class="time">09:33</span>
								</p>
								<p>Hi Swlabs, we have some comments for you.</p></li>
							<li class="odd"><p>
									<img
										src="img/48.jpg"
										class="avt" /><span class="user">Swlabs</span><span
										class="time">09:33</span>
								</p>
								<p>Hi, we're listening you...</p></li>
						</ul>
					</div>
					<div class="chat-textarea">
						<input placeholder="Type your message" class="form-control" />
					</div>
				</div>
			</div>
			<!--END CHAT FORM-->
			<!--BEGIN PAGE WRAPPER-->
			<div id="page-wrapper">
				<!--BEGIN TITLE & BREADCRUMB PAGE-->
				<div id="title-breadcrumb-option-demo" class="page-title-breadcrumb">
					<div class="page-header pull-left">
						<div class="page-title">DataTables</div>
					</div>
					<ol class="breadcrumb page-breadcrumb">
						<li><i class="fa fa-home"></i>&nbsp;<a href="index.html">Home</a>&nbsp;&nbsp;<i
							class="fa fa-angle-right"></i>&nbsp;&nbsp;</li>
						<li><a href="#">Tables</a>&nbsp;&nbsp;<i
							class="fa fa-angle-right"></i>&nbsp;&nbsp;</li>
						<li class="active">DataTables</li>
					</ol>
					<div class="btn btn-blue reportrange hide">
						<i class="fa fa-calendar"></i>&nbsp;<span></span>&nbsp;report&nbsp;<i
							class="fa fa-angle-down"></i><input type="hidden"
							name="datestart" /><input type="hidden" name="endstart" />
					</div>
					<div class="clearfix"></div>
				</div>
				<!--END TITLE & BREADCRUMB PAGE-->
				<!--BEGIN CONTENT-->
				<div class="page-content">
					<div class="row">
						<div class="col-lg-12">
							<div class="note note-success">
								<h4 class="box-heading">Datatables</h4>
								<p>Main features from datatables: paging, search, sorter,
									filter</p>
								<p>
									Export tool work on Flash Environment, check other <a
										href="table-export.html" target="_blank">Table Export</a>
								</p>
								<p>
									To use "Edit" feature, please check it <a
										href="table-editable.html" target="_blank">Editable</a>
								</p>
							</div>
						</div>
						<div class="col-lg-12">
							<div class="portlet box">
								<div class="portlet-header">
									<div class="caption">Active Table</div>
								</div>
								<div class="portlet-body">
									<div class="row mbm">
										<div class="col-lg-12">
											<div class="table-responsive">
												<table id="table_id"
													class="table table-hover table-striped table-bordered table-advanced tablesorter display">
													<thead>
														<tr>
															<th style="width: 3%; padding: 10px; background: #efefef"><input
																type="checkbox" class="checkall" /></th>
															<th width="9%">Rec #</th>
															<th>Username</th>
															<th width="10%">Country</th>
															<th width="10%">Gender</th>
															<th width="7%">Order</th>
															<th width="12%">Date</th>
															<th width="10%">Price</th>
															<th width="9%">Status</th>
															<th width="12%">Actions</th>
														</tr>
													<tbody>
														<tr>
															<td><input type="checkbox" /></td>
															<td>1</td>
															<td>Henry</td>
															<td>England</td>
															<td>Male</td>
															<td>32</td>
															<td>20-05-2014</td>
															<td>$112.40</td>
															<td><span class="label label-sm label-success">Approved</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
														<tr>
															<td><input type="checkbox" /></td>
															<td>2</td>
															<td>Melinda</td>
															<td>Germany</td>
															<td>Female</td>
															<td>45</td>
															<td>21-09-1999</td>
															<td>$240.50</td>
															<td><span class="label label-sm label-info">Pending</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
														<tr>
															<td><input type="checkbox" /></td>
															<td>18</td>
															<td>Joh Doe</td>
															<td>England</td>
															<td>Male</td>
															<td>40</td>
															<td>21-09-1999</td>
															<td>$240.50</td>
															<td><span class="label label-sm label-warning">Suspended</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
														<tr>
															<td><input type="checkbox" /></td>
															<td>19</td>
															<td>Lahm</td>
															<td>United States</td>
															<td>Female</td>
															<td>15</td>
															<td>20-05-2014</td>
															<td>$240.50</td>
															<td><span class="label label-sm label-danger">Blocked</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
														<tr>
															<td><input type="checkbox" /></td>
															<td>20</td>
															<td>Henry</td>
															<td>France</td>
															<td>Male</td>
															<td>32</td>
															<td>21-09-1999</td>
															<td>$240.50</td>
															<td><span class="label label-sm label-success">Approved</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
														<tr>
															<td><input type="checkbox" /></td>
															<td>20</td>
															<td>Henry</td>
															<td>France</td>
															<td>Male</td>
															<td>32</td>
															<td>20-05-2014</td>
															<td>$240.50</td>
															<td><span class="label label-sm label-success">Approved</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
														<tr>
															<td><input type="checkbox" /></td>
															<td>20</td>
															<td>Jane</td>
															<td>England</td>
															<td>Male</td>
															<td>32</td>
															<td>21-09-2014</td>
															<td>$240.50</td>
															<td><span class="label label-sm label-success">Approved</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
														<tr>
															<td><input type="checkbox" /></td>
															<td>3</td>
															<td>Larry</td>
															<td>England</td>
															<td>Female</td>
															<td>40</td>
															<td>20-05-2014</td>
															<td>$112.40</td>
															<td><span class="label label-sm label-warning">Suspended</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
														<tr>
															<td><input type="checkbox" /></td>
															<td>4</td>
															<td>Melinda</td>
															<td>United States</td>
															<td>Female</td>
															<td>15</td>
															<td>20-05-2014</td>
															<td>$123.40</td>
															<td><span class="label label-sm label-danger">Blocked</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
														<tr>
															<td><input type="checkbox" /></td>
															<td>5</td>
															<td>Henry</td>
															<td>United States</td>
															<td>Male</td>
															<td>32</td>
															<td>21-09-1999</td>
															<td>$240.50</td>
															<td><span class="label label-sm label-success">Approved</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
														<tr>
															<td><input type="checkbox" /></td>
															<td>6</td>
															<td>Melinda</td>
															<td>Brazil</td>
															<td>Male</td>
															<td>32</td>
															<td>20-05-2014</td>
															<td>$240.50</td>
															<td><span class="label label-sm label-success">Approved</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
														<tr>
															<td><input type="checkbox" /></td>
															<td>7</td>
															<td>John</td>
															<td>England</td>
															<td>Female</td>
															<td>45</td>
															<td>21-09-1999</td>
															<td>$240.50</td>
															<td><span class="label label-sm label-info">Pending</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
														<tr>
															<td><input type="checkbox" /></td>
															<td>8</td>
															<td>Larry</td>
															<td>United States</td>
															<td>Female</td>
															<td>40</td>
															<td>20-05-2014</td>
															<td>$240.50</td>
															<td><span class="label label-sm label-warning">Suspended</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
														<tr>
															<td><input type="checkbox" /></td>
															<td>9</td>
															<td>Lahm</td>
															<td>United States</td>
															<td>Female</td>
															<td>15</td>
															<td>20-05-2014</td>
															<td>$240.50</td>
															<td><span class="label label-sm label-danger">Blocked</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
														<tr>
															<td><input type="checkbox" /></td>
															<td>10</td>
															<td>Melinda</td>
															<td>Germany</td>
															<td>Male</td>
															<td>32</td>
															<td>21-09-1999</td>
															<td>$240.50</td>
															<td><span class="label label-sm label-success">Approved</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
														<tr>
															<td><input type="checkbox" /></td>
															<td>11</td>
															<td>Henry</td>
															<td>England</td>
															<td>Male</td>
															<td>32</td>
															<td>20-05-2014</td>
															<td>$240.50</td>
															<td><span class="label label-sm label-success">Approved</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
														<tr>
															<td><input type="checkbox" /></td>
															<td>12</td>
															<td>John</td>
															<td>United States</td>
															<td>Female</td>
															<td>45</td>
															<td>20-05-2014</td>
															<td>$240.50</td>
															<td><span class="label label-sm label-info">Pending</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
														<tr>
															<td><input type="checkbox" /></td>
															<td>13</td>
															<td>Larry</td>
															<td>United States</td>
															<td>Female</td>
															<td>40</td>
															<td>21-09-1999</td>
															<td>$240.50</td>
															<td><span class="label label-sm label-warning">Suspended</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
														<tr>
															<td><input type="checkbox" /></td>
															<td>14</td>
															<td>Lahm</td>
															<td>Germany</td>
															<td>Female</td>
															<td>15</td>
															<td>20-05-2014</td>
															<td>$240.50</td>
															<td><span class="label label-sm label-danger">Blocked</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
														<tr>
															<td><input type="checkbox" /></td>
															<td>15</td>
															<td>Henry</td>
															<td>Japan</td>
															<td>Male</td>
															<td>32</td>
															<td>20-05-2014</td>
															<td>$240.50</td>
															<td><span class="label label-sm label-success">Approved</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
														<tr>
															<td><input type="checkbox" /></td>
															<td>16</td>
															<td>Henry</td>
															<td>United States</td>
															<td>Male</td>
															<td>32</td>
															<td>21-09-1999</td>
															<td>$240.50</td>
															<td><span class="label label-sm label-success">Approved</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
														<tr>
															<td><input type="checkbox" /></td>
															<td>17</td>
															<td>Melinda</td>
															<td>United States</td>
															<td>Female</td>
															<td>45</td>
															<td>20-05-2014</td>
															<td>$240.50</td>
															<td><span class="label label-sm label-info">Pending</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
														<tr>
															<td><input type="checkbox" /></td>
															<td>18</td>
															<td>Luan</td>
															<td>VietNam</td>
															<td>Male</td>
															<td>40</td>
															<td>21-09-1999</td>
															<td>$240.50</td>
															<td><span class="label label-sm label-warning">Suspended</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
														<tr>
															<td><input type="checkbox" /></td>
															<td>19</td>
															<td>Lahm</td>
															<td>United States</td>
															<td>Female</td>
															<td>15</td>
															<td>20-05-2014</td>
															<td>$240.50</td>
															<td><span class="label label-sm label-danger">Blocked</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
														<tr>
															<td><input type="checkbox" /></td>
															<td>20</td>
															<td>Henry</td>
															<td>France</td>
															<td>Male</td>
															<td>32</td>
															<td>21-09-1999</td>
															<td>$240.50</td>
															<td><span class="label label-sm label-success">Approved</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
														<tr>
															<td><input type="checkbox" /></td>
															<td>20</td>
															<td>Henry</td>
															<td>France</td>
															<td>Male</td>
															<td>32</td>
															<td>20-05-2014</td>
															<td>$240.50</td>
															<td><span class="label label-sm label-success">Approved</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
														<tr>
															<td><input type="checkbox" /></td>
															<td>20</td>
															<td>Jane</td>
															<td>England</td>
															<td>Male</td>
															<td>32</td>
															<td>21-09-2014</td>
															<td>$240.50</td>
															<td><span class="label label-sm label-success">Approved</span></td>
															<td><button type="button"
																	class="btn btn-default btn-xs">
																	<i class="fa fa-edit"></i>&nbsp; Edit
																</button></td>
														</tr>
													</tbody>
													</thead>
												</table>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!--END CONTENT-->
			</div>
			<!--BEGIN FOOTER-->
			<jsp:include page="footer.jsp"></jsp:include>
			<!--END FOOTER-->
			<!--END PAGE WRAPPER-->
		</div>
	</div>
	<script src="js/jquery-1.10.2.min.js"></script>
	<script src="js/jquery-migrate-1.2.1.min.js"></script>
	<script src="js/jquery-ui.js"></script>
	<!--loading bootstrap js-->
	<script src="js/bootstrap.min.js"></script>
	<script
		src="js/bootstrap-hover-dropdown.js"></script>
	<script src="js/html5shiv.js"></script>
	<script src="js/respond.min.js"></script>
	<script src="js/jquery.metisMenu.js"></script>
	<script src="js/jquery.slimscroll.js"></script>
	<script src="js/jquery.cookie.js"></script>
	<script src="js/icheck.min.js"></script>
	<script src="js/custom.min.js"></script>
	<script src="js/jquery.notific8.min.js"></script>
	<script src="js/highcharts.js"></script>
	<script src="js/jquery.menu.js"></script>
	<script src="js/pace.min.js"></script>
	<script src="js/holder.js"></script>
	<script src="js/responsive-tabs.js"></script>
	<script src="js/jquery.newsTicker.min.js"></script>
	<script src="js/moment.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
	<script src="js/daterangepicker.js"></script>
	<!--CORE JAVASCRIPT-->
	<script src="js/main.js"></script>
	<!--LOADING SCRIPTS FOR PAGE-->
	<script src="js/jquery.dataTables.js"></script>
	<script src="js/dataTables.bootstrap.js"></script>
	<script
		src="js/dataTables.tableTools.min.js"></script>
	<script src="js/table-datatables.js"></script>
	<script type="text/javascript">(function (i, s, o, g, r, a, m) {
    i['GoogleAnalyticsObject'] = r;
    i[r] = i[r] || function () {
        (i[r].q = i[r].q || []).push(arguments)
    }, i[r].l = 1 * new Date();
    a = s.createElement(o),
            m = s.getElementsByTagName(o)[0];
    a.async = 1;
    a.src = g;
    m.parentNode.insertBefore(a, m)
})(window, document, 'script', '//js/analytics.js', 'ga');
ga('create', 'UA-145464-14', 'auto');
ga('send', 'pageview');










</script>
</body>
</html>