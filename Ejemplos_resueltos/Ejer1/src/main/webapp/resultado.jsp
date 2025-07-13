<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Resultado</title>
</head>
<body>
    <h2>Resultado del cálculo del Servlet</h2>
    <h3>El <%= request.getAttribute("operacion") %> del cuadrado es: 
        <%= request.getAttribute("resultado") %></h3>
</body>
</html>
