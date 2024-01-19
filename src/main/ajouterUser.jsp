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
	    <div class="formu">
	           <div>
	               <h2>S'inscrire</h2>
	           </div>
				<form method="post" > 
						<div class="message">
								${statusMessage}
						</div>
						
						<div class="label">
						<label for="prenom" >Prenom</label><br>
						<input type="text" name="prenom" id="prenom" value="${user.prenom }">
						<span>${erreurs.prenom}</span>
						</div>
						
						<div class="label">
						<label for="nom">Nom</label><br>
						<input type="text" name="nom" id="nom" value="${user.nom }">
						<span>${erreurs.nom}</span>
						</div>
						
						<div class="label">
						<label for="login">Login</label><br>
						<input type="text" name="login" id="login" value="${user.login }">
						<span>${erreurs.login}</span>
						</div>
						
						<div class="label">
						<label for="password">Mot de passe</label><br>
						<input type="password" name="password" id="password" value="${user.password}">
						</div>
						
						<div class="label">
						<label for="password">Mot de passe Confirmation </label><br>
						<input type="password" name="passwordBis" id="passwordBis">
						<span>${erreurs.password}</span>
						</div>
						
						<div class="label">
						<input class="button" type="submit" value="Soumettre">
						</div>
				</form>
		</div>
	</div>
	<%@ include file="footer.html" %>
</body>
</html>