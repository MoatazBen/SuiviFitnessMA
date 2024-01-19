<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>
    <h2>User Dashboard</h2>
    <!-- Display user details from the servlet -->
    <p>Welcome, ${user.fullName}!</p>
    
    <!-- Add links to other pages -->
    <a href="activities.jsp">View Activities</a><br>
    <a href="setGoal.jsp">Set Goal</a><br>
    <!-- Add more links as needed -->
</body>
</html>
