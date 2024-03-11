<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Food Item</title>
</head>
<body>
    <h1>Add Food Item</h1>
    <form action="/food/addItem" method="post">
        <label for="name">Name:</label>
        <input type="text" name="name" id="name" required>
        <br>
        <label for="price">Price:</label>
        <input type="number" name="price" id="price" required>
        <br>
        <input type="submit" value="Add Food">
    </form>
</body>
</html>