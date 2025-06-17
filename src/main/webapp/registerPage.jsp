<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<jsp:include page="bootstrap_links.jsp"></jsp:include>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="container-fluid">

		<div class="row">
			<div class="col-sm-6">
				<img alt="sorry..." class="img img-thumbnail"
					src="/images/registration.jpg">
			</div>
			<div class="col-sm-6">
				<h2 class="fw-bold">User/Bus Operator Registration Page</h2>
				<form action="register" method="post">
					<div class="mb-4"></div>
					<div class="mb-4">
						<input type="email" class="form-control" name="email"
							placeholder="Email:" required>
					</div>
					<div class="mb-4">
						<input type="password" class="form-control" name="password"
							placeholder="Password:" required>
					</div>
					<div class="mb-4">
						<input type="text" class="form-control" name="fullName"
							placeholder="Full Name:" required>
					</div>
					<div class="mb-4">
						<input type="tel" class="form-control" name="phone"
							placeholder="Phone:" required>
					</div>
					<div class="mb-4">
						<textarea class="form-control" rows="" cols="" name="address"
							placeholder="Address:" required></textarea>
					</div>
					<div class="mb-4">
						<input type="radio" name="gender" value="male" required>
						Male <input type="radio" name="gender" value="female">
						Female
					</div>
					<div class="mb-4">
						<input type="radio" name="accountType" value="User" required>
						User <input type="radio" name="accountType" value="BusOperator">
						Bus Operator
					</div>
					<div class="mb-4">
						<button type="submit" class="btn btn-primary">SignUp</button>
						<button type="reset" class="btn btn-danger">Reset</button>
					</div>
				</form>
			</div>
		</div>

	</div>

</body>
</html>