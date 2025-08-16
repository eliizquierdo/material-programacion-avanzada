<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="modelo.vo.PersonaVO" %>
<%
  String baseURL = request.getContextPath();
  List<PersonaVO> listaPersonas = (List<PersonaVO>) request.getAttribute("personas");
%>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <title>Listado de Personas</title>
  <link rel="stylesheet" href="<%= baseURL %>/css/persona.css">
</head>
<body>
  <div class="form-container">
    <h1>Listado de Personas</h1>

    <table class="table">
      <thead>
        <tr><th>Código</th><th>Nombre</th></tr>
      </thead>
      <tbody>
        <%
          if (listaPersonas != null && !listaPersonas.isEmpty()) {
            for (PersonaVO p : listaPersonas) {
        %>
          <tr>
            <td><%= p.getCodigo() %></td>
            <td><%= p.getNombre() %></td>
          </tr>
        <%
            }
          } else {
        %>
          <tr><td colspan="2">No hay personas registradas</td></tr>
        <%
          }
        %>
      </tbody>
    </table>

    <!-- Abre el form por el servlet -->
    <a class="btn" href="<%= baseURL %>/persona?action=form">Agregar Persona</a>
  </div>
</body>
</html>