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
                <th>Id</th>
                <th>Name</th>
                <th>Price</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${foods}" var="food">
                <tr>
${food.name}</td>
                    <td>${food.price}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>