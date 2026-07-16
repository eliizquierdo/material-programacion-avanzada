<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String baseURL = request.getContextPath();
%>
<!DOCTYPE html>
    <html>
    <head>
        <title>Formulario Agregar Personas</title>
        <link rel="stylesheet" href="<%= baseURL %>/css/persona.css">
    </head>
    <body>
        <h1>Bienvenido</h1>
        <!-- Página de inicio con dos botones -->
        <a class="btn" href="persona.jsp">Agregar Persona</a>
        <a class="btn" href="persona.jsp?action=listar">Listar Personas</a>
    </body>
</html>