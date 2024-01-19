<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
</head>
<body>
    <h2>User Registration</h2>
    <form action="register" method="post">
        <!-- Form fields for user registration -->
        <label for="nom">Nom:</label>
        <input type="text" name="nom" required><br>

        <!-- Add other form fields (prenom, date de naissance, email, etc.) -->

        <input type="submit" value="Register">
    </form>
</body>
</html>
