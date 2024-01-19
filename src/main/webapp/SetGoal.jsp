<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Set Goal</title>
</head>
<body>
    <h2>Set Goal</h2>
    <form action="setGoal" method="post">
        <!-- Form fields for goal setting -->
        <label for="libelle">Goal Label:</label>
        <input type="text" name="libelle" required><br>

        <!-- Add other form fields (date début, date fin, etc.) -->

        <input type="submit" value="Set Goal">
    </form>
</body>
</html>
