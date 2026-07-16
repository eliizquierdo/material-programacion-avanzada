<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String baseURL = request.getContextPath();
%>
<!DOCTYPE html>
    <html>
    <head>
        <title>Formulario Agregar Personas</title>
        <link rel="stylesheet" href="<%= baseURL %>/css/styles.css">
    </head>
    <body>
        <div class="form-container">
            <h1>Bienvenido</h1>
            <!-- Página de inicio con dos botones -->
            <a class="btn" href="persona?action=agregar">Agregar Persona</a>
            <a class="btn" href="persona?action=listar">Listar Personas</a>
        </div>
    </body>
</html>