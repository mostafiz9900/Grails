<!doctype html>
<html>
<head>
    %{--<meta name="layout" content="main"/>--}%
    <title>Product List</title>
</head>
<body>

%{--${allProducts.name}
${allProducts.brand}
${allProducts.price}--}%
<table border="1">
    <thead>
    <tr>
        <th scope="col">Name</th>
        <th scope="col">Brand</th>
        <th scope="col">Price</th>
    </tr>
    </thead>
    <tbody>
    <g:each in="${allProducts}" var="products">
        <tr>
            <td>${products.name}</td>
            <td>${products.brand}</td>
            <td>${products.price}</td>
        </tr>
    </g:each>
    </tbody>
</table>
</body>
</html>
