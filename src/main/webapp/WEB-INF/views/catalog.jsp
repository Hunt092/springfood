<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Food Catalogue</title>
</head>
<body>
    <h1>Food Catalogue</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Price</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${foodItems}" var="food">
                <tr>
                    <td scope="row">${food.foodId}</td>
                    <td>${food.name}</td>
                    <td>${food.price}</td>
                </tr>
                
            </c:forEach>
        </tbody>
    </table>
</body>
</html>