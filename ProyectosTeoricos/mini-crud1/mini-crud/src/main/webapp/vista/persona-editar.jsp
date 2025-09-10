<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="modelo.vo.PersonaVO" %>
<%
  String baseURL = request.getContextPath();
  PersonaVO persona = (PersonaVO) request.getAttribute("persona");
%>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <title>Editar Persona</title>
  <link rel="stylesheet" href="<%= baseURL %>/css/styles.css">
</head>
<body>
<div class="form-container">
  <h1>Editar Persona</h1>

  <form action="<%= baseURL %>/persona" method="post">
  
    <input type="hidden" name="action" value="editar">

    <label>Código</label>
    <input type="number" name="codigo" value="<%= persona.getCodigo() %>" readonly required>

    <label>Nombre</label>
    <input type="text" name="nombre" value="<%= persona.getNombre() %>" required>

    <button class="btn" type="submit">Actualizar</button>
    <a class="btn btn-secondary" href="<%= baseURL %>/persona">Volver</a>
  </form>
</div>
</body>
</html>
