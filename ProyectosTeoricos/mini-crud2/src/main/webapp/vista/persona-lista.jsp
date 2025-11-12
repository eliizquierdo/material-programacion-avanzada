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
  <link rel="stylesheet" href="<%= baseURL %>/css/styles.css">
</head>
<body>
<div class="page-container">
  <h1>Listado de Personas</h1>

  <div class="table-wrap">
    <table class="table">
      <thead>
        <tr>
          <th>Código</th>
          <th>Nombre</th>
          <th>Acciones</th>
        </tr>
      </thead>
      <tbody>
      <%
        if (listaPersonas != null && !listaPersonas.isEmpty()) {
          for (PersonaVO p : listaPersonas) {
      %>
        <tr>
          <td><%= p.getCodigo() %></td>
          <td><%= p.getNombre() %></td>
          <td class="actions">
            <!-- Botón Editar -->
            <a class="btn btn-edit" 
               href="<%= baseURL %>/persona?action=cargarEditar&codigo=<%= p.getCodigo() %>"
               >Editar
            </a>
            
            <!-- Botón Eliminar -->
            <form action="<%= baseURL %>/persona?action=eliminar" method="post" style="display: inline;">
              <input type="hidden" name="codigo" value="<%= p.getCodigo() %>">
              <button type="submit" class="btn btn-danger"
                      onclick="return confirm('¿Eliminar el registro <%= p.getNombre() %>?');">
                Eliminar
              </button>
            </form>
          </td>
        </tr>
      <%
          }
        } else {
      %>
        <tr>
          <td colspan="3" style="text-align: center; color: #6b7280;">
            No hay personas registradas
          </td>
        </tr>
      <%
        }
      %>
      </tbody>
    </table>
  </div>

  <div class="section-gap">
    <a class="btn" href="<%= baseURL %>/persona?action=agregar">Agregar Persona</a>
  </div>
</div>
</body>
</html>