<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <% final String APP_ROOT = request.getContextPath(); %>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/menu.css">
</head>
<body div="menu"> 
	<div class="header">
	    <h1>User Management</h1>
		<ul class="nav">
		    <li><a href='<c:url value="/ListerUser"/>'>Accueil</a></li>
		    <li><a href='<c:url value="/AjouterUser"/>'>Ajouter</a></li>
			<li><a href='<c:url value="/ListerActiviter"/>'>Ajouter</a></li>
		    <li><a href='<c:url value="/AjouterActiviter"/>'>Ajouter</a></li>
			<c:if test="${isConnected}">
		    	<li><a href='<c:url value="/Deconnexion"/>'>Deconnexion</a></li>
		    </c:if>
		</ul>	
	</div>
</body>
</html>