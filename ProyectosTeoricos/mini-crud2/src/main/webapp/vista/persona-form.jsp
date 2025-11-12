<%@ page contentType="text/html; charset=UTF-8" %> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <title>Agregar Persona</title>

    <link
      rel="stylesheet"
      href="${pageContext.request.contextPath}/css/styles.css"
    />
  </head>
  <body>
    <div class="form-container">
      <h1>Agregar Persona</h1>

      <%-- Muestra el mensaje de error si el atributo 'error' existe --%>
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

      <form action="${pageContext.request.contextPath}/persona" method="post">
        <input type="hidden" name="action" value="agregar" />

        <label>Código</label>
        <input
          type="number"
          name="codigo"
          required
          value="${requestScope.persona.codigo}"
        />

        <label>Nombre</label>
        <input
          type="text"
          name="nombre"
          required
          value="${requestScope.persona.nombre}"
        />

        <button class="btn" type="submit">Guardar</button>
        <a
          class="btn btn-secondary"
          href="${pageContext.request.contextPath}/persona"
          >Volver</a
        >
      </form>
    </div>
  </body>
</html>
