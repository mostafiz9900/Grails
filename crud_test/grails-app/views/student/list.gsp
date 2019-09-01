<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>
</head>
<body>


<table border="1">
    <tr>
        <th>Name</th>
        <th>Brand</th>
        <th>Price</th>
    </tr>
    <g:each in="${allProduct}" var="thisProduct">
<tr>
    <td>${thisProduct.name}</td>
    <td>${thisProduct.brand}</td>
    <td>${thisProduct.price}</td>
</tr>
    </g:each>
</table>

</body>
</html>
