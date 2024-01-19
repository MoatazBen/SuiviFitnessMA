
<%@page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="css/content.css">
</head>
<body div="section">
    <%@ include file="menu.jsp" %>
    <div class="content">	
    <div class="welcome">
         <div class="title">
             <h1>Bienvenue sur votre site prefere</h1>
              <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Optio tenetur corrupti laudantium. Soluta saepe sunt eos id distinctio excepturi molestiae fugit, nostrum maiores repellendus numquam ipsum odit vitae, ea natus.</p>
         </div>
         <div class="nexttitle"></div>
    </div>
    <script type="text/javascript">

		function delete() {
		    return confirm('Etes vous sur ?')
		}

	</script>
    
	<h1>Liste des Utilisateurs</h1>
     <c:choose>
     		<c:when test="users.isEmpty()">
     		</c:when>
     		<c:otherwise>
				     <div class="items">
						    <c:forEach var="user" items="${users}">   
						 <div class="item"> 
						 	<div class="info">
						 		<h2>${user.getPrenom()}</h2>
						 		<h2>${user.getNom()}</h2>
						 		<h2>${user.getLogin()}</h2>
						 		<h2>${user.getPassword()}</h2>
						 	</div>
						 	 <div class="button">
						 		<div class="delete">
						 			<h2><a href="SupprimerUser?id=${user.getId()}" onClick="return delete()">Supprimer</a></h2>
						 		</div>
						 		<div class="update">
						 			<h2><a href="ModifierUser?id=${user.getId()}">Modifier</a></h2>
						 		</div>
						 	 </div>
					  </div>
						</c:forEach>
					</div>
     		</c:otherwise>
     </c:choose>
	
	<%@ include file="footer.html" %>
</body>
</html>