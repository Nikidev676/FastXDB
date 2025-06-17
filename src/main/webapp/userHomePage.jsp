<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<jsp:include page="bootstrap_links.jsp"></jsp:include>
<body>
	<div class="container-fluid">
		<h3>User Home - ${loggedInUser.getEmail()}</h3>
		<div>
			<a class="text-primary" href="logOut">Logout</a>
		</div>
	</div>
	<img alt="sorry..." class="img img-thumbnail"
		src="/images/busHomeOriginal.jpg">
</body>
</html>