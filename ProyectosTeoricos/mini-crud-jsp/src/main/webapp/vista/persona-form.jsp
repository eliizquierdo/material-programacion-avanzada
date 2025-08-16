<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String baseURL = request.getContextPath();
%>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <title>Agregar Persona</title>
  <link rel="stylesheet" href="<%= baseURL %>/css/persona.css">
</head>
<body>

  <div class="form-container">
    <h1>Agregar Persona</h1>

    <!-- Enviaremos SIEMPRE al controlador JSP con action=agregar -->
    <form action="<%= baseURL %>/persona.jsp?action=agregar" method="post">
      <label for="codigo">Código:</label>
      <input type="number" id="codigo" name="codigo" required />

      <label for="nombre">Nombre:</label>
      <input type="text" id="nombre" name="nombre" required />

      <button type="submit">Guardar</button>
    </form>

    <a class="btn" href="<%= baseURL %>/persona.jsp?action=listar">Volver al listado</a>
  </div>

</body>
</html>


</body>
</html>
