<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Multiple File Upload | Forms</title>
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
	href="css/jquery.fileupload.css">
<link type="text/css" rel="stylesheet"
	href="css/jquery.fileupload-ui.css">
<link type="text/css" rel="stylesheet"
	href="css/blueimp-gallery.min.css">
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
		<div id="header-topbar-option-demo" class="page-header-topbar">
			<nav id="topbar" role="navigation"
				style="margin-bottom: 0; z-index: 2;"
				class="navbar navbar-default navbar-static-top">
				<div class="navbar-header">
					<button type="button" data-toggle="collapse"
						data-target=".sidebar-collapse" class="navbar-toggle">
						<span class="sr-only">Toggle navigation</span><span
							class="icon-bar"></span><span class="icon-bar"></span><span
							class="icon-bar"></span>
					</button>
					<a id="logo" href="index.html" class="navbar-brand"><span
						class="fa fa-rocket"></span><span class="logo-text">µAdmin</span><span
						style="display: none" class="logo-text-icon">µ</span></a>
				</div>
				<div class="topbar-main">
					<a id="menu-toggle" href="#" class="hidden-xs"><i
						class="fa fa-bars"></i></a>
					<ul class="nav navbar-nav    ">
						<li class="active"><a href="index.html">Dashboard</a></li>
						<li><a href="javascript:;" data-toggle="dropdown"
							class="dropdown-toggle">Layouts &nbsp;<i
								class="fa fa-angle-down"></i></a>
						<ul class="dropdown-menu">
								<li><a href="layout-left-sidebar.html">Left Sidebar</a></li>
								<li><a href="layout-right-sidebar.html">Right Sidebar</a></li>
								<li><a href="layout-left-sidebar-collapsed.html">Left
										Sidebar Collasped</a></li>
								<li><a href="layout-right-sidebar-collapsed.html">Right
										Sidebar Collasped</a></li>
								<li class="dropdown-submenu"><a href="javascript:;"
									data-toggle="dropdown" class="dropdown-toggle">More Options</a>
								<ul class="dropdown-menu">
										<li><a href="#">Second level link</a></li>
										<li class="dropdown-submenu"><a href="javascript:;"
											data-toggle="dropdown" class="dropdown-toggle">More
												Options</a>
										<ul class="dropdown-menu">
												<li><a href="#">Third level link</a></li>
												<li><a href="#">Third level link</a></li>
												<li><a href="#">Third level link</a></li>
												<li><a href="#">Third level link</a></li>
												<li><a href="#">Third level link</a></li>
											</ul></li>
										<li><a href="#">Second level link</a></li>
									</ul></li>
							</ul></li>
						<li class="mega-menu-dropdown"><a href="javascript:;"
							data-toggle="dropdown" class="dropdown-toggle">UI Elements
								&nbsp;<i class="fa fa-angle-down"></i>
						</a>
						<ul class="dropdown-menu">
								<li><div class="mega-menu-content">
										<div class="row">
											<ul class="col-md-4 mega-menu-submenu">
												<li><h3>Neque porro quisquam</h3></li>
												<li><a href="#"><i class="fa fa-angle-right"></i>Lorem
														ipsum dolor sit amet</a></li>
												<li><a href="#"><i class="fa fa-angle-right"></i>Consectetur
														adipisicing elit</a></li>
												<li><a href="#"><i class="fa fa-angle-right"></i>Sed
														ut perspiciatis unde omnis</a></li>
												<li><a href="#"><i class="fa fa-angle-right"></i>At
														vero eos et accusamus et iusto</a></li>
												<li><a href="#"><i class="fa fa-angle-right"></i>Nam
														libero tempore cum soluta</a></li>
												<li><a href="#"><i class="fa fa-angle-right"></i>Et
														harum quidem rerum facilis est</a></li>
											</ul>
											<ul class="col-md-4 mega-menu-submenu">
												<li><h3>Neque porro quisquam</h3></li>
												<li><a href="#"><i class="fa fa-angle-right"></i>Lorem
														ipsum dolor sit amet</a></li>
												<li><a href="#"><i class="fa fa-angle-right"></i>Consectetur
														adipisicing elit</a></li>
												<li><a href="#"><i class="fa fa-angle-right"></i>Sed
														ut perspiciatis unde omnis</a></li>
												<li><a href="#"><i class="fa fa-angle-right"></i>At
														vero eos et accusamus et iusto</a></li>
												<li><a href="#"><i class="fa fa-angle-right"></i>Nam
														libero tempore cum soluta</a></li>
												<li><a href="#"><i class="fa fa-angle-right"></i>Et
														harum quidem rerum facilis est</a></li>
											</ul>
											<ul class="col-md-4 mega-menu-submenu">
												<li><h3>Neque porro quisquam</h3></li>
												<li><a href="#"><i class="fa fa-angle-right"></i>Lorem
														ipsum dolor sit amet</a></li>
												<li><a href="#"><i class="fa fa-angle-right"></i>Consectetur
														adipisicing elit</a></li>
												<li><a href="#"><i class="fa fa-angle-right"></i>Sed
														ut perspiciatis unde omnis</a></li>
												<li><a href="#"><i class="fa fa-angle-right"></i>At
														vero eos et accusamus et iusto</a></li>
												<li><a href="#"><i class="fa fa-angle-right"></i>Nam
														libero tempore cum soluta</a></li>
												<li><a href="#"><i class="fa fa-angle-right"></i>Et
														harum quidem rerum facilis est</a></li>
											</ul>
										</div>
									</div></li>
							</ul></li>
						<li class="mega-menu-dropdown mega-menu-full"><a
							href="javascript:;" data-toggle="dropdown"
							class="dropdown-toggle">Extras &nbsp;<i
								class="fa fa-angle-down"></i></a>
						<ul class="dropdown-menu">
								<li><div class="mega-menu-content">
										<div class="row">
											<div class="col-md-7">
												<ul class="col-md-4 mega-menu-submenu">
													<li><h3>Neque porro quisquam</h3></li>
													<li><a href="#"><i class="fa fa-angle-right"></i>Lorem
															ipsum dolor sit amet</a></li>
													<li><a href="#"><i class="fa fa-angle-right"></i>Consectetur
															adipisicing elit</a></li>
													<li><a href="#"><i class="fa fa-angle-right"></i>Sed
															ut perspiciatis unde omnis</a></li>
													<li><a href="#"><i class="fa fa-angle-right"></i>At
															vero eos et accusamus et iusto</a></li>
													<li><a href="#"><i class="fa fa-angle-right"></i>Nam
															libero tempore cum soluta</a></li>
													<li><a href="#"><i class="fa fa-angle-right"></i>Et
															harum quidem rerum facilis est</a></li>
												</ul>
												<ul class="col-md-4 mega-menu-submenu">
													<li><h3>Neque porro quisquam</h3></li>
													<li><a href="#"><i class="fa fa-angle-right"></i>Lorem
															ipsum dolor sit amet</a></li>
													<li><a href="#"><i class="fa fa-angle-right"></i>Consectetur
															adipisicing elit</a></li>
													<li><a href="#"><i class="fa fa-angle-right"></i>Sed
															ut perspiciatis unde omnis</a></li>
													<li><a href="#"><i class="fa fa-angle-right"></i>At
															vero eos et accusamus et iusto</a></li>
													<li><a href="#"><i class="fa fa-angle-right"></i>Nam
															libero tempore cum soluta</a></li>
													<li><a href="#"><i class="fa fa-angle-right"></i>Et
															harum quidem rerum facilis est</a></li>
												</ul>
												<ul class="col-md-4 mega-menu-submenu">
													<li><h3>Neque porro quisquam</h3></li>
													<li><a href="#"><i class="fa fa-angle-right"></i>Lorem
															ipsum dolor sit amet</a></li>
													<li><a href="#"><i class="fa fa-angle-right"></i>Consectetur
															adipisicing elit</a></li>
													<li><a href="#"><i class="fa fa-angle-right"></i>Sed
															ut perspiciatis unde omnis</a></li>
													<li><a href="#"><i class="fa fa-angle-right"></i>At
															vero eos et accusamus et iusto</a></li>
													<li><a href="#"><i class="fa fa-angle-right"></i>Nam
															libero tempore cum soluta</a></li>
													<li><a href="#"><i class="fa fa-angle-right"></i>Et
															harum quidem rerum facilis est</a></li>
												</ul>
											</div>
											<div class="col-md-5 document-demo">
												<ul class="col-md-4 mega-menu-submenu">
													<li><a href="#"><i class="fa fa-info-circle"></i><span>Introduction</span></a></li>
													<li><a href="#"><i class="fa fa-download"></i><span>Installation</span></a></li>
												</ul>
												<ul class="col-md-4 mega-menu-submenu">
													<li><a href="#"><i class="fa fa-cog"></i><span>T3
																Settings</span></a></li>
													<li><a href="#"><i class="fa fa-desktop"></i><span>Layout
																System</span></a></li>
												</ul>
												<ul class="col-md-4 mega-menu-submenu">
													<li><a href="#"><i class="fa fa-magic"></i><span>Customization</span></a></li>
													<li><a href="#"><i class="fa fa-question-circle"></i><span>FAQs</span></a></li>
												</ul>
											</div>
										</div>
									</div></li>
							</ul></li>
					</ul>
					<form id="topbar-search" action="#" method="GET" class="hidden-xs">
						<div class="input-group">
							<input type="text" placeholder="Search..." class="form-control" /><span
								class="input-group-btn"><a href="javascript:;"
								class="btn submit"><i class="fa fa-search"></i></a></span>
						</div>
					</form>
					<ul class="nav navbar navbar-top-links navbar-right mbn">
						<li class="dropdown"><a data-hover="dropdown" href="#"
							class="dropdown-toggle"><i class="fa fa-bell fa-fw"></i><span
								class="badge badge-green">3</span></a>
						<ul class="dropdown-menu dropdown-alerts">
								<li><p>You have 14 new notifications</p></li>
								<li><div class="dropdown-slimscroll">
										<ul>
											<li><a href="extra-user-list.html" target="_blank"><span
													class="label label-blue"><i class="fa fa-comment"></i></span>New
													Comment<span class="pull-right text-muted small">4
														mins ago</span></a></li>
											<li><a href="extra-user-list.html" target="_blank"><span
													class="label label-violet"><i class="fa fa-twitter"></i></span>3
													New Followers<span class="pull-right text-muted small">12
														mins ago</span></a></li>
											<li><a href="extra-user-list.html" target="_blank"><span
													class="label label-pink"><i class="fa fa-envelope"></i></span>Message
													Sent<span class="pull-right text-muted small">15
														mins ago</span></a></li>
											<li><a href="extra-user-list.html" target="_blank"><span
													class="label label-green"><i class="fa fa-tasks"></i></span>New
													Task<span class="pull-right text-muted small">18
														mins ago</span></a></li>
											<li><a href="extra-user-list.html" target="_blank"><span
													class="label label-yellow"><i class="fa fa-upload"></i></span>Server
													Rebooted<span class="pull-right text-muted small">19
														mins ago</span></a></li>
											<li><a href="extra-user-list.html" target="_blank"><span
													class="label label-green"><i class="fa fa-tasks"></i></span>New
													Task<span class="pull-right text-muted small">2 days
														ago</span></a></li>
											<li><a href="extra-user-list.html" target="_blank"><span
													class="label label-pink"><i class="fa fa-envelope"></i></span>Message
													Sent<span class="pull-right text-muted small">5 days
														ago</span></a></li>
										</ul>
									</div></li>
								<li class="last"><a href="extra-user-list.html"
									class="text-right">See all alerts</a></li>
							</ul></li>
						<li class="dropdown"><a data-hover="dropdown" href="#"
							class="dropdown-toggle"><i class="fa fa-envelope fa-fw"></i><span
								class="badge badge-orange">7</span></a>
						<ul class="dropdown-menu dropdown-messages">
								<li><p>You have 14 new messages</p></li>
								<li><div class="dropdown-slimscroll">
										<ul>
											<li><a href="email-view-mail.html" target="_blank"><span
													class="avatar"><img
														src="img/48.jpg"
														alt="" class="img-responsive img-circle" /></span><span
													class="info"><span class="name">Jessica
															Spencer</span><span class="desc">Lorem ipsum dolor sit
															amet...</span></span></a></li>
											<li><a href="email-view-mail.html" target="_blank"><span
													class="avatar"><img
														src="img/48.jpg"
														alt="" class="img-responsive img-circle" /></span><span
													class="info"><span class="name">John Smith<span
															class="label label-blue pull-right">New</span></span><span
														class="desc">Lorem ipsum dolor sit amet...</span></span></a></li>
											<li><a href="email-view-mail.html" target="_blank"><span
													class="avatar"><img
														src="img/48.jpg"
														alt="" class="img-responsive img-circle" /></span><span
													class="info"><span class="name">John Doe<span
															class="label label-orange pull-right">10 min</span></span><span
														class="desc">Lorem ipsum dolor sit amet...</span></span></a></li>
											<li><a href="email-view-mail.html" target="_blank"><span
													class="avatar"><img
														src="img/48.jpg"
														alt="" class="img-responsive img-circle" /></span><span
													class="info"><span class="name">John Smith</span><span
														class="desc">Lorem ipsum dolor sit amet...</span></span></a></li>
											<li><a href="email-view-mail.html" target="_blank"><span
													class="avatar"><img
														src="img/48.jpg"
														alt="" class="img-responsive img-circle" /></span><span
													class="info"><span class="name">John Smith</span><span
														class="desc">Lorem ipsum dolor sit amet...</span></span></a></li>
										</ul>
									</div></li>
								<li class="last"><a href="email-view-mail.html"
									target="_blank">Read all messages</a></li>
							</ul></li>
						<li class="dropdown"><a data-hover="dropdown" href="#"
							class="dropdown-toggle"><i class="fa fa-tasks fa-fw"></i><span
								class="badge badge-yellow">8</span></a>
						<ul class="dropdown-menu dropdown-tasks">
								<li><p>You have 14 pending tasks</p></li>
								<li><div class="dropdown-slimscroll">
										<ul>
											<li><a href="page-blog-item.html" target="_blank"><span
													class="task-item">Fix the HTML code<small
														class="pull-right text-muted">40%</small></span>
												<div class="progress progress-sm">
														<div role="progressbar" aria-valuenow="40"
															aria-valuemin="0" aria-valuemax="100" style="width: 40%;"
															class="progress-bar progress-bar-orange">
															<span class="sr-only">40% Complete (success)</span>
														</div>
													</div></a></li>
											<li><a href="page-blog-item.html" target="_blank"> <span
													class="task-item">Make a wordpress theme<small
														class="pull-right text-muted">60%</small></span>
												<div class="progress progress-sm">
														<div role="progressbar" aria-valuenow="60"
															aria-valuemin="0" aria-valuemax="100" style="width: 60%;"
															class="progress-bar progress-bar-blue">
															<span class="sr-only">60% Complete (success)</span>
														</div>
													</div></a></li>
											<li><a href="page-blog-item.html" target="_blank"> <span
													class="task-item">Convert PSD to HTML<small
														class="pull-right text-muted">55%</small></span>
												<div class="progress progress-sm">
														<div role="progressbar" aria-valuenow="55"
															aria-valuemin="0" aria-valuemax="100" style="width: 55%;"
															class="progress-bar progress-bar-green">
															<span class="sr-only">55% Complete (success)</span>
														</div>
													</div></a></li>
											<li><a href="page-blog-item.html" target="_blank"> <span
													class="task-item">Convert HTML to Wordpress<small
														class="pull-right text-muted">78%</small></span>
												<div class="progress progress-sm">
														<div role="progressbar" aria-valuenow="78"
															aria-valuemin="0" aria-valuemax="100" style="width: 78%;"
															class="progress-bar progress-bar-yellow">
															<span class="sr-only">78% Complete (success)</span>
														</div>
													</div></a></li>
										</ul>
									</div></li>
								<li class="last"><a href="page-blog-item.html"
									target="_blank">See all tasks</a></li>
							</ul></li>
						<li class="dropdown topbar-user"><a data-hover="dropdown"
							href="#" class="dropdown-toggle"><img
								src="img/48.jpg"
								alt="" class="img-responsive img-circle" />&nbsp;<span
								class="hidden-xs">John Doe</span>&nbsp;<span class="caret"></span></a>
						<ul class="dropdown-menu dropdown-user pull-right">
								<li><a href="extra-profile.html"><i class="fa fa-user"></i>My
										Profile</a></li>
								<li><a href="page-calendar.html"><i
										class="fa fa-calendar"></i>My Calendar</a></li>
								<li><a href="email-inbox.html"><i
										class="fa fa-envelope"></i>My Inbox<span
										class="badge badge-danger">3</span></a></li>
								<li><a href="#"><i class="fa fa-tasks"></i>My Tasks<span
										class="badge badge-success">7</span></a></li>
								<li class="divider"></li>
								<li><a href="extra-lock-screen.html"><i
										class="fa fa-lock"></i>Lock Screen</a></li>
								<li><a href="extra-signin.html"><i class="fa fa-key"></i>Log
										Out</a></li>
							</ul></li>
						<li id="topbar-chat" class="hidden-xs"><a
							href="javascript:void(0)" class="btn-chat"><i
								class="fa fa-comments"></i><span class="badge badge-info">3</span></a></li>
						<li class="dropdown hidden-xs">
							<!--BEGIN THEME SETTING-->
							<a id="theme-setting" href="javascript:;" data-hover="dropdown"
							data-step="1"
							data-intro="&lt;b&gt;Header&lt;/b&gt;, &lt;b&gt;sidebar&lt;/b&gt;, &lt;b&gt;border style&lt;/b&gt; and &lt;b&gt;color&lt;/b&gt;, all of them can change for you to create the best"
							data-position="left" class="dropdown-toggle"><i
								class="fa fa-cogs"></i></a>
						<ul class="dropdown-menu dropdown-theme-setting pull-right">
								<li><h4 class="mtn">Theme Styles</h4>
									<select id="list-style" class="form-control"><option
											value="style1">Flat Squared style</option>
										<option value="style2">Flat Rounded style</option>
										<option value="style3">Flat Border style</option></select></li>
								<li><h4 class="mtn">Menu Styles</h4>
									<select id="list-menu" class="form-control"><option
											value="sidebar-default">Menu style 1</option>
										<option value="sidebar-colors">Menu style 2</option>
										<option value="sidebar-icons">Menu style 3</option>
										<option value="sidebar-collapsed">Menu style 4</option></select></li>
								<li><h4 class="mtn">Header & Sidebar</h4>
									<select id="list-header" class="form-control"><option
											value="header-static">Static</option>
										<option value="header-fixed">Fixed</option></select></li>
								<li><h4 class="mtn">Theme Colors</h4>
									<ul id="list-color" class="list-unstyled list-inline">
										<li data-color="green-dark" data-hover="tooltip"
											title="Green - Dark" class="green-dark"></li>
										<li data-color="red-dark" data-hover="tooltip"
											title="Red - Dark" class="red-dark"></li>
										<li data-color="pink-dark" data-hover="tooltip"
											title="Pink - Dark" class="pink-dark"></li>
										<li data-color="blue-dark" data-hover="tooltip"
											title="Blue - Dark" class="blue-dark"></li>
										<li data-color="yellow-dark" data-hover="tooltip"
											title="Yellow - Dark" class="yellow-dark"></li>
										<li data-color="green-grey" data-hover="tooltip"
											title="Green - Grey" class="green-grey"></li>
										<li data-color="red-grey" data-hover="tooltip"
											title="Red - Grey" class="red-grey"></li>
										<li data-color="pink-grey" data-hover="tooltip"
											title="Pink - Grey" class="pink-grey"></li>
										<li data-color="blue-grey" data-hover="tooltip"
											title="Blue - Grey" class="blue-grey"></li>
										<li data-color="yellow-grey" data-hover="tooltip"
											title="Yellow - Grey" class="yellow-grey"></li>
										<li data-color="yellow-green" data-hover="tooltip"
											title="Yellow - Green" class="yellow-green"></li>
										<li data-color="orange-grey" data-hover="tooltip"
											title="Orange - Grey" class="orange-grey"></li>
										<li data-color="pink-blue" data-hover="tooltip"
											title="Pink - Blue" class="pink-blue"></li>
										<li data-color="pink-violet" data-hover="tooltip"
											title="Pink - Violet" class="pink-violet active"></li>
										<li data-color="orange-violet" data-hover="tooltip"
											title="Orange - Violet" class="orange-violet"></li>
										<li data-color="pink-green" data-hover="tooltip"
											title="Pink - Green" class="pink-green"></li>
										<li data-color="pink-brown" data-hover="tooltip"
											title="Pink - Brown" class="pink-brown"></li>
										<li data-color="orange-blue" data-hover="tooltip"
											title="Orange - Blue" class="orange-blue"></li>
										<li data-color="yellow-blue" data-hover="tooltip"
											title="Yellow - Blue" class="yellow-blue"></li>
										<li data-color="green-blue" data-hover="tooltip"
											title="Green - Blue" class="green-blue"></li>
									</ul></li>
							</ul>
							<!--END THEME SETTING-->
						</li>
					</ul>
				</div>
			</nav>
			<!--BEGIN MODAL CONFIG PORTLET-->
			<div id="modal-config" class="modal fade">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" data-dismiss="modal" aria-hidden="true"
								class="close">&times;</button>
							<h4 class="modal-title">Modal title</h4>
						</div>
						<div class="modal-body">
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
								Sed eleifend et nisl eget porta. Curabitur elementum sem
								molestie nisl varius, eget tempus odio molestie. Nunc vehicula
								sem arcu, eu pulvinar neque cursus ac. Aliquam ultricies
								lobortis magna et aliquam. Vestibulum egestas eu urna sed
								ultricies. Nullam pulvinar dolor vitae quam dictum condimentum.
								Integer a sodales elit, eu pulvinar leo. Nunc nec aliquam nisi,
								a mollis neque. Ut vel felis quis tellus hendrerit placerat.
								Vivamus vel nisl non magna feugiat dignissim sed ut nibh. Nulla
								elementum, est a pretium hendrerit, arcu risus luctus augue,
								mattis aliquet orci ligula eget massa. Sed ut ultricies felis.</p>
						</div>
						<div class="modal-footer">
							<button type="button" data-dismiss="modal"
								class="btn btn-default">Close</button>
							<button type="button" class="btn btn-primary">Save
								changes</button>
						</div>
					</div>
				</div>
			</div>
			<!--END MODAL CONFIG PORTLET-->
		</div>
		<!--END TOPBAR-->
		<div id="wrapper">
			<!--BEGIN SIDEBAR MENU-->
			<nav id="sidebar" role="navigation"
				class="navbar-default navbar-static-side">
				<div class="sidebar-collapse menu-scroll">
					<ul id="side-menu" class="nav">
						<li class="user-panel"><div class="thumb">
								<img
									src="img/128.jpg"
									alt="" class="img-circle" />
							</div>
							<div class="info">
								<p>John Doe</p>
								<ul class="list-inline list-unstyled">
									<li><a href="extra-profile.html" data-hover="tooltip"
										title="Profile"><i class="fa fa-user"></i></a></li>
									<li><a href="email-inbox.html" data-hover="tooltip"
										title="Mail"><i class="fa fa-envelope"></i></a></li>
									<li><a href="#" data-hover="tooltip" title="Setting"
										data-toggle="modal" data-target="#modal-config"><i
											class="fa fa-cog"></i></a></li>
									<li><a href="extra-signin.html" data-hover="tooltip"
										title="Logout"><i class="fa fa-sign-out"></i></a></li>
								</ul>
							</div>
							<div class="clearfix"></div></li>
						<li><a href="index.html"><i
								class="fa fa-tachometer fa-fw"><div
										class="icon-bg bg-orange"></div></i><span class="menu-title">Dashboard</span></a></li>
						<li><a href="http://madmin.swlabs.co/" target="_blank"><i
								class="fa fa-bullhorn fa-fw"><div class="icon-bg bg-orange"></div></i><span
								class="menu-title">Angular JS Version</span><span
								class="label label-violet">v4.0</span></a></li>
						<li><a href="#"><i class="fa fa-laptop fa-fw"><div
										class="icon-bg bg-pink"></div></i><span class="menu-title">Frontend</span><span
								class="fa arrow"></span><span class="label label-yellow">v3.0</span></a>
						<ul class="nav nav-second-level">
								<li><a href="frontend-one-page.html"><i
										class="fa fa-rocket"></i><span class="submenu-title">One
											Page</span></a></li>
							</ul></li>
						<li><a href="#"><i class="fa fa-desktop fa-fw"><div
										class="icon-bg bg-pink"></div></i><span class="menu-title">Layouts</span><span
								class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
								<li><a href="layout-left-sidebar.html"><i
										class="fa fa-align-left"></i><span class="submenu-title">Left
											Sidebar</span></a></li>
								<li><a href="layout-left-sidebar-collapsed.html"><i
										class="fa fa-angle-double-left"></i><span
										class="submenu-title">Left Sidebar Collapsed</span></a></li>
								<li><a href="layout-right-sidebar.html"><i
										class="fa fa-align-right"></i><span class="submenu-title">Right
											Sidebar</span></a></li>
								<li><a href="layout-right-sidebar-collapsed.html"><i
										class="fa fa-angle-double-right"></i><span
										class="submenu-title">Right Sidebar Collapsed</span></a></li>
								<li><a href="layout-horizontal-menu.html"><i
										class="fa fa-header"></i><span class="submenu-title">Horizontal
											Menu</span></a></li>
								<li><a href="layout-horizontal-menu-sidebar.html"><i
										class="fa fa-h-square"></i><span class="submenu-title">Horizontal
											Menu & Sidebar</span></a></li>
								<li><a href="layout-fixed-topbar.html"><i
										class="fa fa-magnet"></i><span class="submenu-title">Fixed
											Topbar</span></a></li>
								<li><a href="layout-boxed.html"><i
										class="fa fa-columns"></i><span class="submenu-title">Boxed
											Layout</span></a></li>
								<li><a href="layout-hidden-footer.html"><i
										class="fa fa-eye-slash"></i><span class="submenu-title">Hidden
											Footer</span></a></li>
								<li><a href="layout-header-topbar.html"><i
										class="fa fa-paperclip"></i><span class="submenu-title">Header
											& Topbar</span></a></li>
								<li><a href="layout-title-breadcrumb.html"><i
										class="fa fa-link"></i><span class="submenu-title">Title
											& Breadcrumb</span></a></li>
							</ul></li>
						<li><a href="#"><i class="fa fa-send-o fa-fw"><div
										class="icon-bg bg-green"></div></i><span class="menu-title">UI
									Elements</span><span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
								<li><a href="ui-generals.html"><i
										class="fa fa-briefcase"></i><span class="submenu-title">Generals</span></a></li>
								<li><a href="ui-portlets.html"><i
										class="fa fa-instagram"></i><span class="submenu-title">Portlets</span></a></li>
								<li><a href="ui-buttons.html"><i
										class="fa fa-hand-o-up"></i><span class="submenu-title">Buttons</span></a></li>
								<li><a href="ui-tabs.html"><i class="fa fa-trello"></i><span
										class="submenu-title">Tabs</span></a></li>
								<li><a href="ui-progressbars.html"><i
										class="fa fa-ellipsis-h"></i><span class="submenu-title">Progress
											Bars</span></a></li>
								<li><a href="ui-typography.html"><i class="fa fa-font"></i><span
										class="submenu-title">Typography</span></a></li>
								<li><a href="ui-modals.html"><i class="fa fa-list-alt"></i><span
										class="submenu-title">Modals</span></a></li>
								<li><a href="ui-sliders.html"><i class="fa fa-arrows-h"></i><span
										class="submenu-title">Sliders</span></a></li>
								<li><a href="ui-icons.html"><i class="fa fa-tint"></i><span
										class="submenu-title">Icons</span></a></li>
								<li><a href="ui-checkbox-radio.html"><i
										class="fa fa-dot-circle-o"></i><span class="submenu-title">Checkbox
											& Radio</span></a></li>
								<li><a href="ui-panels.html"><i class="fa fa-th-large"></i><span
										class="submenu-title">Panels</span></a></li>
							</ul></li>
						<li><a href="#"><i class="fa fa-rocket fa-fw"><div
										class="icon-bg bg-green"></div></i><span class="menu-title">UI
									Advanced</span><span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
								<li><a href="ui-preloader.html"><i
										class="fa fa-spinner"></i><span class="submenu-title">Preloader</span><span
										class="label label-yellow">v4.1</span></a></li>
								<li><a href="ui-editors.html"><i class="fa fa-edit"></i><span
										class="submenu-title">Editors</span></a></li>
								<li><a href="ui-nestable-list.html"><i
										class="fa fa-list-ol"></i><span class="submenu-title">Nestable
											List</span></a></li>
								<li><a href="ui-dropdown-select.html"><i
										class="fa fa-level-down"></i><span class="submenu-title">Dropdown
											Select</span><span class="label label-yellow">v2.1</span></a></li>
								<li><a href="ui-notific8-notifications.html"><i
										class="fa fa-exclamation-circle"></i><span
										class="submenu-title">Notific8 & Message</span><span
										class="label label-blue">v2.1</span></a></li>
								<li><a href="ui-toastr-notifications.html"><i
										class="fa fa-exclamation-triangle"></i><span
										class="submenu-title">Toastr Notifications</span></a></li>
								<li><a href="ui-treeview.html"><i class="fa fa-tasks"></i><span
										class="submenu-title">Tree View</span></a></li>
							</ul></li>
						<li class="active"><a href="#"><i
								class="fa fa-edit fa-fw"><div class="icon-bg bg-violet"></div></i><span
								class="menu-title">Forms</span><span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
								<li><a href="form-layouts.html"><i
										class="fa fa-columns"></i><span class="submenu-title">Form
											Layouts</span></a></li>
								<li><a href="form-basic.html"><i
										class="fa fa-file-text-o"></i><span class="submenu-title">Form
											Basics</span></a></li>
								<li><a href="form-components.html"><i
										class="fa fa-cube"></i><span class="submenu-title">Form
											Components</span></a></li>
								<li><a href="form-xeditable.html"><i class="fa fa-edit"></i><span
										class="submenu-title">Form X-editable</span></a></li>
								<li><a href="form-wizard.html"><i class="fa fa-magic"></i><span
										class="submenu-title">Form Wizard</span></a></li>
								<li><a href="form-validation.html"><i
										class="fa fa-exclamation"></i><span class="submenu-title">Form
											Validation</span></a></li>
								<li class="active"><a href="form-multiple-file-upload.html"><i
										class="fa fa-upload"></i><span class="submenu-title">Multiple
											File Upload</span></a></li>
								<li><a href="form-dropzone-file-upload.html"><i
										class="fa fa-cloud-upload"></i><span class="submenu-title">Dropzone
											File Upload</span></a></li>
							</ul></li>
						<li><a href="#"><i class="fa fa-th-list fa-fw"><div
										class="icon-bg bg-blue"></div></i><span class="menu-title">Tables</span><span
								class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
								<li><a href="table-basic.html"><i
										class="fa fa-th-large"></i><span class="submenu-title">Basic
											Tables</span></a></li>
								<li><a href="table-responsive.html"><i
										class="fa fa-tablet"></i><span class="submenu-title">Responsive
											Tables</span></a></li>
								<li><a href="table-action.html"><i
										class="fa fa-tencent-weibo"></i><span class="submenu-title">Action
											Tables</span></a></li>
								<li><a href="table-filter.html"><i class="fa fa-filter"></i><span
										class="submenu-title">Filter Tables</span></a></li>
								<li><a href="table-advanced.html"><i
										class="fa fa-indent"></i><span class="submenu-title">Advanced
											Tables</span></a></li>
								<li><a href="table-export.html"><i
										class="fa fa-paperclip"></i><span class="submenu-title">Table
											Export</span><span class="label label-yellow">v2.1</span></a></li>
								<li></li>
								<li><a href="table-editable.html"><i class="fa fa-edit"></i><span
										class="submenu-title">Jeditable</span><span
										class="label label-blue">v2.0 </span></a></li>
								<li><a href="table-datatables.html"><i
										class="fa fa-list-alt"></i><span class="submenu-title">DataTables</span><span
										class="label label-pink">v2.0</span></a></li>
								<li><a href="table-sample.html"><i class="fa fa-table"></i><span
										class="submenu-title">Sample Tables</span></a></li>
							</ul></li>
						<li><a href="#"><i class="fa fa-database fa-fw"><div
										class="icon-bg bg-red"></div></i><span class="menu-title">Data
									Grids</span><span class="fa arrow"></span><span
								class="label label-yellow">Hot</span></a>
						<ul class="nav nav-second-level">
								<li><a href="#"><i class="fa fa-th-large"></i><span
										class="submenu-title">Layout Examples</span><span
										class="fa arrow"></span></a>
								<ul class="nav nav-third-level">
										<li><a href="grid-layout-div.html"><i
												class="fa fa-angle-right"></i><span class="submenu-title">DIVs
													Layout</span></a></li>
										<li><a href="grid-layout-table-1.html"><i
												class="fa fa-angle-right"></i><span class="submenu-title">Table
													Demo 1</span></a></li>
										<li><a href="grid-layout-table-2.html"><i
												class="fa fa-angle-right"></i><span class="submenu-title">Table
													Demo 2</span></a></li>
										<li><a href="grid-layout-2-table.html"><i
												class="fa fa-angle-right"></i><span class="submenu-title">2
													Tables on the Page</span></a></li>
										<li><a href="grid-layout-ul-li.html"><i
												class="fa fa-angle-right"></i><span class="submenu-title">UL
													LI</span></a></li>
									</ul></li>
								<li><a href="#"><i class="fa fa-tencent-weibo"></i><span
										class="submenu-title">Actions Examples</span><span
										class="fa arrow"></span></a>
								<ul class="nav nav-third-level">
										<li><a href="grid-filter-with-ul-li.html"><i
												class="fa fa-angle-right"></i><span class="submenu-title">Filters
													With UL/LI</span></a></li>
										<li><a href="grid-filter-with-select.html"><i
												class="fa fa-angle-right"></i><span class="submenu-title">Filters
													With SELECT</span></a></li>
										<li><a href="grid-double-sort.html"><i
												class="fa fa-angle-right"></i><span class="submenu-title">Double
													Sort</span></a></li>
										<li><a href="grid-deep-linking.html"><i
												class="fa fa-angle-right"></i><span class="submenu-title">Deep
													Linking</span></a></li>
										<li><a href="grid-pagination-only.html"><i
												class="fa fa-angle-right"></i><span class="submenu-title">Pagination
													Only</span></a></li>
										<li><a href="grid-without-item-per-page.html"><i
												class="fa fa-angle-right"></i><span class="submenu-title">Without
													"Items per Page"</span></a></li>
										<li><a href="grid-hidden-sort.html"><i
												class="fa fa-angle-right"></i><span class="submenu-title">Hidden
													Sort</span></a></li>
									</ul></li>
								<li><a href="#"><i class="fa fa-table"></i><span
										class="submenu-title">jPList with jQuery UI</span><span
										class="fa arrow"></span></a>
								<ul class="nav nav-third-level">
										<li><a href="grid-range-slider.html"><i
												class="fa fa-angle-right"></i><span class="submenu-title">Range
													Slider</span></a></li>
										<li><a href="grid-datepicker.html"><i
												class="fa fa-angle-right"></i><span class="submenu-title">Date
													Picker Filter</span></a></li>
									</ul></li>
							</ul></li>
						<li><a href="#"><i class="fa fa-file-o fa-fw"><div
										class="icon-bg bg-yellow"></div></i><span class="menu-title">Pages</span><span
								class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
								<li><a href="page-gallery.html"><i
										class="fa fa-suitcase"></i><span class="submenu-title">Gallery</span></a></li>
								<li><a href="page-timeline.html"><i class="fa fa-steam"></i><span
										class="submenu-title">Timeline</span></a></li>
								<li><a href="page-blog.html"><i
										class="fa fa-puzzle-piece"></i><span class="submenu-title">Blog</span></a></li>
								<li><a href="page-blog-item.html"><i
										class="fa fa-chain"></i><span class="submenu-title">Blog
											Item</span></a></li>
								<li><a href="page-about.html"><i class="fa fa-group"></i><span
										class="submenu-title">About Us</span></a></li>
								<li><a href="page-contact.html"><i class="fa fa-send-o"></i><span
										class="submenu-title">Contact Us</span></a></li>
								<li><a href="page-calendar.html"><i
										class="fa fa-calendar"></i><span class="submenu-title">Full
											Calendar</span></a></li>
							</ul></li>
						<li><a href="#"><i class="fa fa-gift fa-fw"><div
										class="icon-bg bg-grey"></div></i><span class="menu-title">Extras</span><span
								class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
								<li><a href="extra-profile.html"><i class="fa fa-user"></i><span
										class="submenu-title">User Profile</span></a></li>
								<li><a href="extra-signin.html"><i
										class="fa fa-sign-in"></i><span class="submenu-title">Sign
											In</span></a></li>
								<li><a href="extra-signup.html"><i
										class="fa fa-sign-out"></i><span class="submenu-title">Sign
											Up</span></a></li>
								<li><a href="extra-lock-screen.html"><i
										class="fa fa-lock"></i><span class="submenu-title">Lock
											Screen</span></a></li>
								<li><a href="extra-user-list.html"><i
										class="fa fa-user"></i><span class="submenu-title">User
											List</span><span class="label label-yellow">v2.1</span></a></li>
								<li><a href="extra-invoice.html"><i class="fa fa-print"></i><span
										class="submenu-title">Invoice</span></a></li>
								<li><a href="extra-faq.html"><i
										class="fa fa-graduation-cap"></i><span class="submenu-title">FAQ</span></a></li>
								<li><a href="extra-pricing-table.html"><i
										class="fa fa-money"></i><span class="submenu-title">Pricing
											Tables</span></a></li>
								<li><a href="extra-blank.html"><i class="fa fa-file-o"></i><span
										class="submenu-title">Blank</span></a></li>
								<li><a href="extra-404.html"><i
										class="fa fa-exclamation-circle"></i><span
										class="submenu-title">404 Page</span></a></li>
								<li><a href="extra-500.html"><i
										class="fa fa-exclamation-circle"></i><span
										class="submenu-title">500 Page</span></a></li>
								<li><a href="javascript:void(0)" title="FullScreen"
									class="btn-fullscreen"><i class="fa fa-arrows"></i><span
										class="submenu-title">Full Screen</span></a></li>
							</ul></li>
						<li><a href="#"><i class="fa fa-sitemap fa-fw"><div
										class="icon-bg bg-dark"></div></i><span class="menu-title">Multi-Level
									Dropdown</span><span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
								<li><a href="#"><i class="fa fa-angle-right"></i><span
										class="submenu-title">Second Level Item</span></a></li>
								<li><a href="#"><i class="fa fa-angle-right"></i><span
										class="submenu-title">Second Level Item</span></a></li>
								<li><a href="#"><i class="fa fa-angle-right"></i><span
										class="submenu-title">Third Level</span><span class="fa arrow"></span></a>
								<ul class="nav nav-third-level">
										<li><a href="#"><i class="fa fa-angle-double-right"></i><span
												class="submenu-title">Third Level Item</span></a></li>
										<li><a href="#"><i class="fa fa-angle-double-right"></i><span
												class="submenu-title">Third Level Item</span></a></li>
										<li><a href="#"><i class="fa fa-angle-double-right"></i><span
												class="submenu-title"> Third Level Item</span></a></li>
										<li><a href="#"><i class="fa fa-angle-double-right"></i><span
												class="submenu-title">Third Level Item</span></a></li>
									</ul></li>
							</ul></li>
						<li><a href="#"><i class="fa fa-envelope-o"><div
										class="icon-bg bg-primary"></div></i><span class="menu-title">Email</span><span
								class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
								<li><a href="email-inbox.html"><i class="fa fa-inbox"></i><span
										class="submenu-title">Inbox</span></a></li>
								<li><a href="email-compose-mail.html"><i
										class="fa fa-pencil"></i><span class="submenu-title">Compose
											Mail</span></a></li>
								<li><a href="email-view-mail.html"><i class="fa fa-eye"></i><span
										class="submenu-title">View Mail</span></a></li>
							</ul></li>
						<li><a href="#"><i class="fa fa-bar-chart-o fa-fw"><div
										class="icon-bg bg-orange"></div></i><span class="menu-title">Charts</span><span
								class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
								<li><a href="charts-flotchart.html"><i
										class="fa fa-angle-right"></i><span class="submenu-title">Flot
											Charts</span></a></li>
								<li><a href="charts-chartjs.html"><i
										class="fa fa-angle-right"></i><span class="submenu-title">Chartjs</span></a></li>
								<li><a href="#"><i class="fa fa-angle-right"></i><span
										class="submenu-title">HighCharts</span><span class="fa arrow"></span></a>
								<ul class="nav nav-third-level">
										<li><a href="charts-highchart-line.html"><i
												class="fa fa-angle-double-right"></i><span
												class="submenu-title">Line Charts</span></a></li>
										<li><a href="charts-highchart-area.html"><i
												class="fa fa-angle-double-right"></i><span
												class="submenu-title">Area Charts</span></a></li>
										<li><a href="charts-highchart-column-bar.html"><i
												class="fa fa-angle-double-right"></i><span
												class="submenu-title">Column & Bar Charts</span></a></li>
										<li><a href="charts-highchart-pie.html"><i
												class="fa fa-angle-double-right"></i><span
												class="submenu-title">Pie Charts</span></a></li>
										<li><a href="charts-highchart-scatter-bubble.html"><i
												class="fa fa-angle-double-right"></i><span
												class="submenu-title">Scatter & Bubble Charts</span></a></li>
										<li><a href="charts-highchart-dynamic.html"><i
												class="fa fa-angle-double-right"></i><span
												class="submenu-title">Dynamic Charts</span></a></li>
										<li><a href="charts-highchart-combinations.html"><i
												class="fa fa-angle-double-right"></i><span
												class="submenu-title">Combinations</span></a></li>
										<li><a href="charts-highchart-more.html"><i
												class="fa fa-angle-double-right"></i><span
												class="submenu-title">More Chart Types</span></a></li>
									</ul></li>
							</ul></li>
						<li><a href="animations.html"><i
								class="fa fa-slack fa-fw"><div class="icon-bg bg-green"></div></i><span
								class="menu-title">Animations</span></a></li>
						<!--li.charts-sum<div id="ajax-loaded-data-sidebar"></div>-->
					</ul>
				</div>
			</nav>
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
						<div class="page-title">Multiple File Upload</div>
					</div>
					<ol class="breadcrumb page-breadcrumb">
						<li><i class="fa fa-home"></i>&nbsp;<a href="index.html">Home</a>&nbsp;&nbsp;<i
							class="fa fa-angle-right"></i>&nbsp;&nbsp;</li>
						<li><a href="#">Forms</a>&nbsp;&nbsp;<i
							class="fa fa-angle-right"></i>&nbsp;&nbsp;</li>
						<li class="active">Multiple File Upload</li>
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
							<div class="note">
								<p>
									File Upload widget with multiple file selection, drag&drop
									support, progress bars, validation and preview images, audio
									and video for jQuery.<br />Supports cross-domain, chunked and
									resumable file uploads and client-side image resizing.<br />Works
									with any server-side platform (PHP, Python, Ruby on Rails,
									Java, Node.js, Go etc.) that supports standard HTML form file
									uploads.
								</p>
							</div>
							<form id="fileupload" action="//jquery-file-upload.appspot.com/"
								method="POST" enctype="multipart/form-data">
								<!-- Redirect browsers with JavaScript disabled to the origin page-->
								<noscript>
									<input type="hidden" name="redirect"
										value="http://blueimp.github.io/jQuery-File-Upload/" />
								</noscript>
								<!--The fileupload-buttonbar contains buttons to add/delete files and start/cancel the upload-->
								<div class="row fileupload-buttonbar">
									<div class="col-lg-7">
										<!--The fileinput-button span is used to style the file input field as button-->
										<span class="btn btn-success fileinput-button"><i
											class="glyphicon glyphicon-plus"></i>&nbsp;<span>Add
												files...</span><input type="file" name="files[]"
											multiple="multiple" /></span>&nbsp; &nbsp;
										<button type="submit" class="btn btn-primary start">
											<i class="glyphicon glyphicon-upload"></i>&nbsp;<span>Start
												upload</span>
										</button>
										&nbsp; &nbsp;
										<button type="reset" class="btn btn-warning cancel">
											<i class="glyphicon glyphicon-ban-circle"></i>&nbsp;<span>Cancel
												upload</span>
										</button>
										&nbsp; &nbsp;
										<button type="button" class="btn btn-danger delete">
											<i class="glyphicon glyphicon-trash"></i>&nbsp;<span>Delete</span>
										</button>
										&nbsp; &nbsp;<input type="checkbox" class="toggle" />
										<!--The global file processing state-->
										<span class="fileupload-process"></span>
									</div>
									<!--The global progress state-->
									<div class="col-lg-5 fileupload-progress fade">
										<!--The global progress bar-->
										<div role="progressbar" aria-valuemin="0" aria-valuemax="100"
											class="progress progress-striped active">
											<div style="width: 0%;"
												class="progress-bar progress-bar-success"></div>
										</div>
										<!--The extended global progress state-->
										<div class="progress-extended"> </div>
									</div>
								</div>
								<!--The table listing the files available for upload/download-->
								<table role="presentation" class="table table-striped">
									<tbody class="files"></tbody>
								</table>
							</form>
							<div class="panel panel-default">
								<div class="panel-heading">
									<h3 class="panel-title">Demo Notes</h3>
								</div>
								<div class="panel-body">
									<ul>
										<li>The maximum file size for uploads in this demo is
											&nbsp;<strong>5 MB</strong>&nbsp; (default file size is
											unlimited).
										</li>
										<li>Only image files ( &nbsp;<strong>JPG, GIF,
												PNG</strong>&nbsp; ) are allowed in this demo (by default there is no
											file type restriction).
										</li>
										<li>Uploaded files will be deleted automatically after
											&nbsp;<strong>5 minutes</strong>&nbsp; (demo setting).
										</li>
										<li>You can &nbsp;<strong>drag & drop</strong>&nbsp;
											files from your desktop on this webpage (see &nbsp;<a
											href="https://github.com/blueimp/jQuery-File-Upload/wiki/Browser-support">Browser
												support</a>&nbsp; ).
										</li>
										<li>Please refer to the &nbsp;<a
											href="https://github.com/blueimp/jQuery-File-Upload">project
												website</a>&nbsp; and &nbsp;<a
											href="https://github.com/blueimp/jQuery-File-Upload/wiki">documentation</a>&nbsp;
											for more information.
										</li>
										<li>Built with Twitter's &nbsp;<a
											href="http://twitter.github.com/bootstrap/">Bootstrap</a>&nbsp;
											CSS framework and Icons from &nbsp;<a
											href="http://glyphicons.com/">Glyphicons</a>&nbsp; .
										</li>
									</ul>
								</div>
							</div>
							<!--The blueimp Gallery widget-->
							<div id="blueimp-gallery" data-filter=":even"
								class="blueimp-gallery blueimp-gallery-controls">
								<div class="slides"></div>
								<h3 class="title"></h3>
								<a class="prev">‹</a><a class="next">›</a><a class="close">×</a><a
									class="play-pause"></a>
								<ol class="indicator"></ol>
							</div>
							<!-- The template to display files available for upload-->
							<script id="template-upload" type="text/x-tmpl">{% for (var i=0, file; file=o.files[i]; i++) { %}
    <tr class="template-upload fade">
        <td>
            <span class="preview"></span>
        </td>
        <td>
            <p class="name">{%=file.name%}</p>
            <strong class="error text-danger"></strong>
        </td>
        <td>
            <p class="size">Processing...</p>
            <div class="progress progress-striped active" role="progressbar" aria-valuemin="0" aria-valuemax="100" aria-valuenow="0"><div class="progress-bar progress-bar-success" style="width:0%;"></div></div>
        </td>
        <td>
            {% if (!i && !o.options.autoUpload) { %}
                <button class="btn btn-primary start" disabled>
                    <i class="glyphicon glyphicon-upload"></i>
                    <span>Start</span>
                </button>
            {% } %}
            {% if (!i) { %}
                <button class="btn btn-warning cancel">
                    <i class="glyphicon glyphicon-ban-circle"></i>
                    <span>Cancel</span>
                </button>
            {% } %}
        </td>
    </tr>
{% } %}</script>
							<!-- The template to display files available for download-->
							<script id="template-download" type="text/x-tmpl">{% for (var i=0, file; file=o.files[i]; i++) { %}
    <tr class="template-download fade">
        <td>
            <span class="preview">
                {% if (file.thumbnailUrl) { %}
                    <a href="{%=file.url%}" title="{%=file.name%}" download="{%=file.name%}" data-gallery><img src="{%=file.thumbnailUrl%}"></a>
                {% } %}
            </span>
        </td>
        <td>
            <p class="name">
                {% if (file.url) { %}
                    <a href="{%=file.url%}" title="{%=file.name%}" download="{%=file.name%}" {%=file.thumbnailUrl?'data-gallery':''%}>{%=file.name%}</a>
                {% } else { %}
                    <span>{%=file.name%}</span>
                {% } %}
            </p>
            {% if (file.error) { %}
                <div><span class="label label-danger">Error</span> {%=file.error%}</div>
            {% } %}
        </td>
        <td>
            <span class="size">{%=o.formatFileSize(file.size)%}</span>
        </td>
        <td>
            {% if (file.deleteUrl) { %}
                <button class="btn btn-danger delete" data-type="{%=file.deleteType%}" data-url="{%=file.deleteUrl%}"{% if (file.deleteWithCredentials) { %} data-xhr-fields='{"withCredentials":true}'{% } %}>
                    <i class="glyphicon glyphicon-trash"></i>
                    <span>Delete</span>
                </button>
                <input type="checkbox" name="delete" value="1" class="toggle">
            {% } else { %}
                <button class="btn btn-warning cancel">
                    <i class="glyphicon glyphicon-ban-circle"></i>
                    <span>Cancel</span>
                </button>
            {% } %}
        </td>
    </tr>
{% } %}</script>
						</div>
					</div>
				</div>
				<!--END CONTENT-->
			</div>
			<!--BEGIN FOOTER-->
			<div id="footer">
				<div class="copyright">2014 © &mu;Admin - Responsive
					Multi-Style Admin Template</div>
			</div>
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
	<script src="js/jquery.ui.widget.js"></script>
	<script src="js/tmpl.min.js"></script>
	<script src="js/load-image.min.js"></script>
	<script
		src="js/canvas-to-blob.min.js"></script>
	<script
		src="js/jquery.blueimp-gallery.min.js"></script>
	<script src="js/jquery.iframe-transport.js"></script>
	<script src="js/jquery.fileupload.js"></script>
	<script
		src="js/jquery.fileupload-process.js"></script>
	<script src="js/jquery.fileupload-image.js"></script>
	<script src="js/jquery.fileupload-audio.js"></script>
	<script src="js/jquery.fileupload-video.js"></script>
	<script
		src="js/jquery.fileupload-validate.js"></script>
	<script src="js/jquery.fileupload-ui.js"></script>
	<script
		src="js/jquery.xdr-transport.js"></script>
	<script src="js/form-multiple-file-upload.js"></script>
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