<%@ page contentType="text/html; charset=UTF-8" %> <% String baseURL =
request.getContextPath(); %>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <title>Agregar Persona</title>
    <link rel="stylesheet" href="<%= baseURL %>/css/styles.css" />
  </head>
  <body>
    <div class="form-container">
      <h1>Agregar Persona</h1>

      <!-- POST al Servlet con action=agregar -->
      <form action="<%= baseURL %>/persona" method="post">
        <input type="hidden" name="action" value="agregar" />

        <label>Código</label>
        <input type="number" name="codigo" required />

        <label>Nombre</label>
        <input type="text" name="nombre" required />

        <button class="btn" type="submit">Guardar</button>
        <a class="btn btn-secondary" href="<%= baseURL %>/persona">Volver</a>
      </form>
    </div>
  </body>
</html>
