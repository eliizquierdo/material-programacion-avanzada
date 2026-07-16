<%@ page contentType="text/html; charset=UTF-8" %> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <title>Agregar Alumno</title>

    <%-- Se utiliza el path absoluto de la aplicación para que el CSS cargue
    correctamente --%>
    <link
      rel="stylesheet"
      href="${pageContext.request.contextPath}/css/styles.css"
    />
  </head>
  <body>
    <div class="form-container">
      <h1>Agregar Alumno</h1>

      <%-- Muestra el mensaje de error si el atributo 'error' existe en el
      request --%>
      <c:if test="${requestScope.error != null}">
        <div
          style="
            color: red;
            border: 1px solid red;
            padding: 10px;
            margin-bottom: 15px;
            background-color: #ffe8e8;
          "
        >
          <strong>Error:</strong> ${requestScope.error}
        </div>
      </c:if>

      <form action="${pageContext.request.contextPath}/alumno" method="post">
        <input type="hidden" name="action" value="agregar" />

        <label>Código</label>
        <input type="number" name="codigo" required <%-- Precarga el valor del
        objeto 'alumno' si existe --%> value="${requestScope.alumno.codigo}" />

        <label>Nombre</label>
        <input type="text" name="nombre" required <%-- Precarga el valor del
        objeto 'alumno' si existe --%> value="${requestScope.alumno.nombre}" />

        <label>Teléfono</label>
        <input type="text" name="telefono" required <%-- Precarga el valor del
        objeto 'alumno' si existe --%> value="${requestScope.alumno.telefono}"
        />

        <button class="btn" type="submit">Guardar</button>
        <a
          class="btn btn-secondary"
          href="${pageContext.request.contextPath}/alumno"
          >Volver</a
        >
      </form>
    </div>
  </body>
</html>
