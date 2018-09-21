<nav id="sidebar" role="navigation"
	class="navbar-default navbar-static-side">
	<div class="sidebar-collapse menu-scroll">
		<ul id="side-menu" class="nav">
			<li class="user-panel">
				<div class="thumb">
					<img src="img/48.jpg" alt="" class="img-circle" />
				</div>
				<div class="info">
					<p>Hiral Patel</p>
					<ul class="list-inline list-unstyled">
						<li><a href="extra-profile.html" data-hover="tooltip"
							title="Profile"><i class="fa fa-user"></i></a></li>
						<li><a href="email-inbox.html" data-hover="tooltip"
							title="Mail"><i class="fa fa-envelope"></i></a></li>
						<li><a href="#" data-hover="tooltip" title="Setting"
							data-toggle="modal" data-target="#modal-config"> <i
								class="fa fa-cog"></i></a></li>
						<li><a href="extra-signin.html" data-hover="tooltip"
							title="Logout"> <i class="fa fa-sign-out"></i></a></li>
					</ul>
				</div>
				<div class="clearfix"></div>
			</li>
			<li class="active"><a href="index.html"> <i
					class="fa fa-tachometer fa-fw">
						<div class="icon-bg bg-orange"></div>
				</i> <span class="menu-title">Dashboard</span></a></li>
			<li><a href="http://madmin.swlabs.co/" target="_blank"> <i
					class="fa fa-bullhorn fa-fw">
						<div class="icon-bg bg-orange"></div>
				</i> <span class="menu-title">Manage User</span><span class="fa arrow"></span>
					<!-- <span class="label label-violet">
						v4.0
				</span> --></a>
				<ul class="nav nav-second-level">
					<li><a href="frontend-one-page.html"> <i
							class="fa fa-rocket"></i> <span class="submenu-title">Add
								User</span></a></li>
				</ul></li>
			<li><a href="#"><i class="fa fa-laptop fa-fw"><div
								class="icon-bg bg-pink"></div></i><span class="menu-title">Seller Profile</span><span
								class="fa arrow"></span><span class="label label-yellow"></span></a>
						<ul class="nav nav-second-level">
								<li><a href="extra-signup.jsp"><i
										class="fa fa-rocket"></i><span class="submenu-title">Registration
											Form</span></a></li>
							<li><a href="<%=request.getContextPath()%>/SellerRegisController?flag=searchregis"><i
										class="fa fa-rocket"></i><span class="submenu-title">Search Registration 
											Details</span></a></li>
							
							<li><a href="<%=request.getContextPath() %>/ProfileController?flag=load"><i
										class="fa fa-rocket"></i><span class="submenu-title">Seller 
											Details</span></a></li>
							<li><a href="<%=request.getContextPath() %>/ProfileController?flag=searchprofile"><i
										class="fa fa-rocket"></i><span class="submenu-title">Search 
											Profile</span></a></li>
							
							</ul></li>
			<li><a href="#"><i class="fa fa-desktop fa-fw">
						<div class="icon-bg bg-pink"></div>
				</i> <span class="menu-title">Manage Categories</span> <span
					class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="addCategory.jsp"> <i class="fa fa-align-left"></i>
							<span class="submenu-title">Add Category</span></a></li>
					<li><a href="<%=request.getContextPath()%>/CategoryController?flag=loadCategory"> <i
							class="fa fa-angle-double-left"></i> <span class="submenu-title">Search
								Category</span></a></li>

				</ul></li>
			<li><a href="#"><i class="fa fa-send-o fa-fw"><div
							class="icon-bg bg-green"></div></i> <span class="menu-title">Manage
						Subcategories</span> <span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="<%=request.getContextPath()%>/SubcategoryController?flag=loadCategory"><i
							class="fa fa-briefcase"></i> <span class="submenu-title">Add
								Subcategory</span></a></li>
					<li><a href="<%=request.getContextPath()%>/SubcategoryController?flag=searchSubcategory"><i
							class="fa fa-instagram"></i> <span class="submenu-title">Search
								Subcategory</span></a></li>

				</ul></li>
			<li><a href="#"><i class="fa fa-rocket fa-fw">
						<div class="icon-bg bg-green"></div>
				</i> <span class="menu-title">Manage Package</span> <span
					class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="addPackage.jsp"> <i class="fa fa-spinner"></i>
							<span class="submenu-title">Add Package</span> <span
							class="label label-yellow">
								<!-- v4.1 -->
						</span></a></li>
					<li><a href="<%=request.getContextPath()%>/PackageController?flag=loadPackage"><i class="fa fa-edit"></i>
							<span class="submenu-title">Search Package</span></a></li>

				</ul></li>
			<!-- <li><a href="#"><i class="fa fa-edit fa-fw">
									<div class="icon-bg bg-violet"></div>
							</i> <span class="menu-title">Forms</span> <span class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<li><a href="form-layouts.jsp"> <i
										class="fa fa-columns"></i> <span class="submenu-title">Form
											Layouts</span></a></li>
								<li><a href="form-layouts1.jsp"> <i
										class="fa fa-columns"></i> <span class="submenu-title">Form
											Layouts</span></a></li>
								<li><a href="form-layouts2.jsp"> <i
										class="fa fa-columns"></i> <span class="submenu-title">Form
											Layouts</span></a></li>
								<li><a href="form-layouts3.jsp"> <i
										class="fa fa-columns"></i> <span class="submenu-title">Form
											Layouts</span></a></li>
							   <li><a href="form-basic.jsp"> <i
										class="fa fa-file-text-o"></i> <span class="submenu-title">Form
											Basics</span></a></li>
								<li><a href="form-components.jsp"><i
										class="fa fa-cube"></i> <span class="submenu-title">Form
											Components</span></a></li>
								<li><a href="form-xeditable.jsp"> <i
										class="fa fa-edit"></i> <span class="submenu-title">Form
											X-editable</span></a></li>
								<li><a href="form-wizard.jsp"><i class="fa fa-magic"></i>
										<span class="submenu-title">Form Wizard</span></a></li>
								<li><a href="form-validation.jsp"> <i
										class="fa fa-exclamation"></i> <span class="submenu-title">Form
											Validation</span></a></li>
								<li><a href="form-multiple-file-upload.jsp"> <i
										class="fa fa-upload"></i> <span class="submenu-title">Multiple
											File Upload</span></a></li>
								<li><a href="form-dropzone-file-upload.jsp"> <i
										class="fa fa-cloud-upload"></i> <span class="submenu-title">Dropzone
											File Upload</span></a></li>
							</ul></li>
						<li><a href="#"><i class="fa fa-th-list fa-fw"><div
										class="icon-bg bg-blue"></div></i> <span class="menu-title">Tables</span><span
								class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<li><a href="table-basic.html"><i
										class="fa fa-th-large"></i> <span class="submenu-title">Basic
											Tables</span></a></li>
								<li><a href="table-responsive.html"> <i
										class="fa fa-tablet"></i> <span class="submenu-title">Responsive
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
											Export</span> <span class="label label-yellow">v2.1</span></a></li>
								<li></li>
								<li><a href="table-editable.html"><i class="fa fa-edit"></i>
										<span class="submenu-title">Jeditable</span><span
										class="label label-blue">v2.0 </span></a></li>
								<li><a href="table-datatables.jsp"><i
										class="fa fa-list-alt"></i> <span class="submenu-title">DataTables</span>
										<span class="label label-pink">v2.0</span></a></li>
								<li><a href="table-sample.html"><i class="fa fa-table"></i>
										<span class="submenu-title">Sample Tables</span></a></li>
							</ul></li> -->
			<li><a href="#"><i class="fa fa-database fa-fw"><div
							class="icon-bg bg-red"></div></i> <span class="menu-title">Manage
						Feedback and Complain</span><span class="fa arrow"></span> <!-- <span
					class="label label-yellow">
						Hot
				</span> --></a>
				<ul class="nav nav-second-level">
					<li><a href="#"><i class="fa fa-th-large"></i><span
							class="submenu-title">Add Feedback and Complain</span> <span
							class="fa arrow"></span></a></li>
					<li><a href="#"><i class="fa fa-tencent-weibo"></i> <span
							class="submenu-title">Search Feedback and Complain</span> <span
							class="fa arrow"></span></a></li>

				</ul></li>
			<li><a href="#"><i class="fa fa-file-o fa-fw">
						<div class="icon-bg bg-yellow"></div>
				</i> <span class="menu-title">Manage Advertisement</span><span
					class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="<%=request.getContextPath()%>/AdvertisementController?flag=load"><i
							class="fa fa-suitcase"></i> <span class="submenu-title">Add
								Advertisement</span></a></li>

					<li><a href="<%=request.getContextPath()%>/AdvertisementController?flag=searchAdvertisement"> <i
							class="fa fa-puzzle-piece"></i> <span class="submenu-title">Search
								Advertisement</span></a></li>

				</ul></li>
			<li><a href="#"> <i class="fa fa-gift fa-fw"><div
							class="icon-bg bg-grey"></div></i><span class="menu-title">Manage
						Notification</span><span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="extra-profile.html"><i class="fa fa-user"></i><span
							class="submenu-title">Add Notification</span></a></li>
					<li><a href="extra-signin.html"><i class="fa fa-sign-in"></i><span
							class="submenu-title">Search Notification</span></a></li>

				</ul></li>
			<li><a href="#"> <i class="fa fa-sitemap fa-fw"><div
							class="icon-bg bg-dark"></div></i><span class="menu-title">Manage
						Recommendation</span> <span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="#"><i class="fa fa-angle-right"></i> <span
							class="submenu-title">Add Recommendation</span></a></li>
					<li><a href="#"><i class="fa fa-angle-right"></i> <span
							class="submenu-title">Search Recommendation</span></a></li>

				</ul></li>
			<li><a href="#"><i class="fa fa-envelope-o"><div
							class="icon-bg bg-primary"></div></i><span class="fa arrow"></span> <span class="menu-title">Manage
						Shipping and Delivery</span></a>
				<ul class="nav nav-second-level">
					<li><a href="email-inbox.html"><i class="fa fa-inbox"></i>
							<span class="submenu-title">Add Shipping and Delivery</span></a></li>
					<li><a href="email-compose-mail.html"><i
							class="fa fa-pencil"></i> <span class="submenu-title">Search
								Shipping and Delivery</span></a></li>

				</ul></li>
			<li><a href="#"><i class="fa fa-bar-chart-o fa-fw">
						<div class="icon-bg bg-orange"></div>
				</i><span class="menu-title">Manage Auction</span><span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="charts-flotchart.html"><i
							class="fa fa-angle-right"></i> <span class="submenu-title">Add
								Auction</span></a></li>
					<li><a href="charts-chartjs.html"><i
							class="fa fa-angle-right"></i> <span class="submenu-title">Search
								Auction</span></a></li>

				</ul></li>
			<li><a href="animations.html"><i class="fa fa-slack fa-fw"><div
							class="icon-bg bg-green"></div></i> <span class="menu-title">Manage
						Bid</span><span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="charts-flotchart.html"><i
							class="fa fa-angle-right"></i> <span class="submenu-title">Add
								Bid</span></a></li>
					<li><a href="charts-chartjs.html"><i
							class="fa fa-angle-right"></i> <span class="submenu-title">Search
								Bid</span></a></li>

				</ul></li>
				<li><a href="animations.html"><i class="fa fa-slack fa-fw"><div
							class="icon-bg bg-green"></div></i> <span class="menu-title">Manage
						Country</span><span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="addCountry.jsp"><i
							class="fa fa-angle-right"></i> <span class="submenu-title">Add
								Country</span></a></li>
					<li><a href="<%=request.getContextPath() %>/CountryController?flag=searchCountry"><i
							class="fa fa-angle-right"></i> <span class="submenu-title">Search
								Country</span></a></li>

				</ul></li>
				<li><a href="animations.html"><i class="fa fa-slack fa-fw"><div
							class="icon-bg bg-green"></div></i> <span class="menu-title">Manage
						State</span><span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="<%=request.getContextPath()%>/StateController?flag=load"><i
							class="fa fa-angle-right"></i> <span class="submenu-title">Add
								State</span></a></li>
					<li><a href="<%=request.getContextPath() %>/StateController?flag=statesearch"><i
							class="fa fa-angle-right"></i> <span class="submenu-title">Search
								State</span></a></li>

				</ul></li>
				<li><a href="animations.html"><i class="fa fa-slack fa-fw"><div
							class="icon-bg bg-green"></div></i> <span class="menu-title">Manage
						City</span><span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="<%=request.getContextPath()%>/CityController?flag=load"><i
							class="fa fa-angle-right"></i> <span class="submenu-title">Add
							
								City</span></a></li>
					<li><a href="<%=request.getContextPath() %>/CityController?flag=searchcity"><i
							class="fa fa-angle-right"></i> <span class="submenu-title">Search
								City</span></a></li>

				</ul></li>
			<!--li.charts-sum<div id="ajax-loaded-data-sidebar"></div>-->
		</ul>
	</div>
</nav>