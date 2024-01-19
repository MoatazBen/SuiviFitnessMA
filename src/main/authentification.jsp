<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/content.css">
</head>
<body > 
	<%@ include file="menu.jsp" %>
	<div class="content">
	<div class="formuA">
	<div>
		<h2>S'authentifiez</h2>
	</div>
	<form method="post" >
			<div class="message">
					${statusMessage}
			</div>
			<div class="label">
			<label for="login">Login</label><br>
			<input type="text" name="login" id="login" value="">
			</div>
			<div class="label">
			<label for="password">Mot de passe</label><br>
			<input type="password" name="password" id="password" value="">
			</div>
			<div class="label">
			<input class="button" type="submit" value="Se Connecter">
			</div>
	</form>
	</div>
	</div>
	<%@ include file="footer.html" %>
</body>
</html>