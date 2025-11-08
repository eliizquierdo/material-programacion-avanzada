<%@ page contentType="text/html; charset=UTF-8" %> <%@ page import="java.util.*,
modelo.vo.AlumnoVO" %> <% String baseURL = request.getContextPath();
List<AlumnoVO>
  lista = (List<AlumnoVO
    >) request.getAttribute("alumnos"); %>
    <!DOCTYPE html>
    <html lang="es">
      <head>
        <meta charset="UTF-8" />
        <title>Listado de Alumnos</title>
        <link rel="stylesheet" href="<%= baseURL %>/css/styles.css" />
      </head>
      <body>
        <div class="page-container">
          <h1>Listado de Alumnos</h1>

          <div class="table-wrap">
            <table class="table">
              <thead>
                <tr>
                  <th>Código</th>
                  <th>Nombre</th>
                  <th>Teléfono</th>
                  <th>Acciones</th>
                </tr>
              </thead>
              <tbody>
                <% if (lista != null && !lista.isEmpty()) { for (AlumnoVO a :
                lista) { %>
                <tr>
                  <td><%= a.getCodigo() %></td>
                  <td><%= a.getNombre() %></td>
                  <td><%= a.getTelefono() %></td>
                  <td class="actions">
                    <a
                      class="btn btn-edit"
                      href="<%= baseURL %>/alumno?action=editar&id=<%= a.getCodigo() %>"
                      >Editar</a
                    >
                    <a
                      class="btn btn-danger"
                      href="<%= baseURL %>/alumno?action=eliminar&id=<%= a.getCodigo() %>"
                      onclick="return confirm('¿Eliminar alumno?');"
                      >Eliminar</a
                    >
                  </td>
                </tr>
                <% } } else { %>
                <tr>
                  <td colspan="4">No hay alumnos cargados.</td>
                </tr>
                <% } %>
              </tbody>
            </table>
          </div>

          <a class="btn" href="<%= baseURL %>/alumno?action=agregar"
            >Agregar Alumno</a
          >
        </div>
      </body>
    </html></AlumnoVO
  ></AlumnoVO
>
