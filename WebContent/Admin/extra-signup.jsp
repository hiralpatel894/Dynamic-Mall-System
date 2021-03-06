<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Sign Up | Extras</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="Thu, 19 Nov 1900 08:52:00 GMT">
<!--Loading bootstrap css-->
<link type="text/css"
	href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,700italic,800italic,400,700,800">
<link type="text/css" rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Oswald:400,700,300">
<link type="text/css" rel="stylesheet"
	href="css/jquery-ui-1.10.3.custom.css">
<link type="text/css" rel="stylesheet"
	href="css/font-awesome.min.css">
<link type="text/css" rel="stylesheet"
	href="css/bootstrap.min.css">
<!--Loading style vendors-->
<link type="text/css" rel="stylesheet"
	href="css/animate.css">
<link type="text/css" rel="stylesheet"
	href="css/all4.css">
<!--Loading style-->
<link type="text/css" rel="stylesheet"
	href="css/pink-blue.css" class="default-style">
<link type="text/css" rel="stylesheet"
	href="css/pink-blue.css" id="theme-change"
	class="style-change color-change">
<link type="text/css" rel="stylesheet" href="css/style-responsive.css">
<link rel="shortcut icon" href="images/favicon.ico">
</head>
<body id="signup-page">
	<div class="page-form">
		<form id="signup-form" action="<%=request.getContextPath()%>/SellerRegisController" method="post" class="form">
			<div class="header-content">
				<h1>Register</h1>
			</div>
			<div class="body-content">
				<div class="form-group">
					<div class="input-icon right">
						<i class="fa fa-user"></i><input type="text"
							placeholder="Username" name="username" class="form-control">
					</div>
				</div>
				<div class="form-group">
					<div class="input-icon right">
						<i class="fa fa-envelope"></i><input type="email"
							placeholder="Email address" name="email" class="form-control">
					</div>
				</div>
				<div class="form-group">
					<div class="input-icon right">
						<i class="fa fa-key"></i><input id="password" type="password"
							placeholder="Password" name="password" class="form-control">
					</div>
				</div>
				<div class="form-group">
					<div class="input-icon right">
						<i class="fa fa-key"></i><input type="password"
							placeholder="Confirm Password" name="passwordConfirm"
							class="form-control">
					</div>
				</div>
				<hr>
				<div style="margin-bottom: 15px" class="row">
					<div class="col-lg-6">
						<label><input type="text" placeholder="First Name"
							name="firstname" class="form-control"></label>
					</div>
					<div class="col-lg-6">
						<label><input type="text" placeholder="Last Name"
							name="lastname" class="form-control"></label>
					</div>
				</div>
				<div class="form-group">
					<label style="display: block" class="select"><select
						name="gender" class="form-control"><option value="0"
								selected disabled>Gender</option>
							<option value="1">Male</option>
							<option value="2">Female</option>
							<option value="3">Other</option></select></label>
				</div>
				<div class="form-group">
					<div class="checkbox-list">
						<label><input id="subscription" type="checkbox"
							name="subscription">&nbsp; I want to receive news and
							special offers</label>
					</div>
				</div>
				<div class="form-group">
					<div class="checkbox-list">
						<label><input id="terms" type="checkbox" name="terms">&nbsp;
							I agree with the Terms and Conditions</label>
					</div>
				</div>
				<hr>
				<div class="form-group mbn">
					<a href="extra-signin.html" class="btn btn-warning"><i
						class="fa fa-chevron-circle-left"></i>&nbsp; Back</a>
					<input type="hidden" name="flag" value="insert">
					<button type="submit" class="btn btn-info pull-right">
						Submit &nbsp;<i class="fa fa-chevron-circle-right"></i>
					</button>
				</div>
			</div>
		</form>
	</div>
	<script src="js/jquery-1.10.2.min.js"></script>
	<script src="js/jquery-migrate-1.2.1.min.js"></script>
	<script src="js/jquery-ui.js"></script>
	<!--loading bootstrap js-->
	<script src="js/bootstrap.min.js"></script>
	<script
		src="js/bootstrap-hover-dropdown.js"></script>
	<script src="js/jquery.validate.min.js"></script>
	<script src="js/html5shiv.js"></script>
	<script src="js/respond.min.js"></script>
	<script src="js/extra-signup.js"></script>
	<script src="js/icheck.min.js"></script>
	<script src="js/custom.min.js"></script>
	<script>
		//BEGIN CHECKBOX & RADIO
		$('input[type="checkbox"]').iCheck({
			checkboxClass : 'icheckbox_minimal-grey',
			increaseArea : '20%' // optional
		});
		$('input[type="radio"]').iCheck({
			radioClass : 'iradio_minimal-grey',
			increaseArea : '20%' // optional
		});
		//END CHECKBOX & RADIO
	</script>
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
ga('create', 'UA-145464-12', 'auto');
ga('send', 'pageview');</script>
</body>
</html>