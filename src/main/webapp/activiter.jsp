<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Activities</title>
</head>
<body>
    <h2>User Activities</h2>
    <!-- Display user activities from the servlet -->
    <c:forEach var="activity" items="${userActivities}">
        <p>${activity.type} - ${activity.date} - ${activity.duration} minutes</p>
        <!-- Add other activity details as needed -->
    </c:forEach>
</body>
</html>
