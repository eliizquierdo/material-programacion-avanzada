<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Agregar Mago</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h2>Agregar Mago</h2>
    <form action="MagoServlet" method="post">
        <label>Nombre:</label><input type="text" name="nombre" required><br>
        <label>Poder:</label><input type="number" name="poder" required><br>
        <label>Nivel:</label><input type="number" name="nivel" required><br>
        <button type="submit">Guardar</button>
    </form>
    <a href="index.jsp">Volver</a>
</body>
</html>