<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="modelo.vo.PersonaVO" %>
<%
  String baseURL = request.getContextPath();
  List<PersonaVO> personas = (List<PersonaVO>) request.getAttribute("personas");
%>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <title>Personas</title>
  <link rel="stylesheet" href="<%= baseURL %>/css/persona.css">
</head>
<body>
  <div class="form-container">
    <h1>Listado</h1>

    <table class="table">
      <thead>
        <tr><th>Código</th><th>Nombre</th></tr>
      </thead>
      <tbody>
      <%
        if (personas != null && !personas.isEmpty()) {
          for (PersonaVO p : personas) {
      %>
        <tr>
          <td><%= p.getCodigo() %></td>
          <td><%= p.getNombre() %></td>
        </tr>
      <%
          }
        } else {
      %>
        <tr><td colspan="2">Sin datos</td></tr>
      <%
        }
      %>
      </tbody>
    </table>

    <a class="btn" href="<%= baseURL %>/persona.jsp">Agregar Persona</a>
  </div>
</body>
</html>

