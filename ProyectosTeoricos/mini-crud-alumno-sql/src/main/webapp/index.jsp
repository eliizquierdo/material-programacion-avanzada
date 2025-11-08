<%@ page contentType="text/html; charset=UTF-8" %> <% String baseURL =
request.getContextPath(); %>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <title>CRUD con herencia</title>
    <link rel="stylesheet" href="<%= baseURL %>/css/styles.css" />
  </head>
  <body>
    <div class="form-container">
      <h1>Bienvenidos al CRUD de alumnos</h1>

      <a class="btn" href="<%= baseURL %>/alumno?action=agregar"
        >Agregar Alumnos</a
      >
      <a class="btn" href="<%= baseURL %>/alumno?action=listar"
        >Listar Alumno</a
      >
    </div>
  </body>
</html>
