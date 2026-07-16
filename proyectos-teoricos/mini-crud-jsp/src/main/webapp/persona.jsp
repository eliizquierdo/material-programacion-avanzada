<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="modelo.dao.PersonaDAO, modelo.vo.PersonaVO, java.util.*" %>
<%
    // 1) Codificación antes de leer parámetros
    request.setCharacterEncoding("UTF-8");

    // 2) DAO en application scope (BD para este proyecto)
    PersonaDAO dao = (PersonaDAO) application.getAttribute("personaDAO");
    if (dao == null) {
        dao = new PersonaDAO();
        application.setAttribute("personaDAO", dao);
    }

    // 3) Router por "action" (default: form)
    String action = request.getParameter("action");
    if (action == null) action = "form";

    // 4) Agregar (POST) -> PRG
    if ("agregar".equalsIgnoreCase(action) && "POST".equalsIgnoreCase(request.getMethod())) {
        String codStr = request.getParameter("codigo");
        String nombre = request.getParameter("nombre");
        try {
            int cod = Integer.parseInt(codStr);
            if (nombre != null && !nombre.trim().isEmpty()) {
                dao.agregar(new PersonaVO(cod, nombre.trim()));
            }
        } catch (Exception ignored) { /* aquí podríamos loguear */ }

        response.sendRedirect(request.getContextPath() + "/persona.jsp?action=listar");
        return;

    // 5) Listar -> set atributo y forward a la vista
    } else if ("listar".equalsIgnoreCase(action)) {
        List<PersonaVO> personas = dao.getLista();
        request.setAttribute("personas", personas);
        request.getRequestDispatcher("/vista/persona-lista.jsp").forward(request, response);
        return;

    // 6) Form (default) -> forward a la vista del formulario
    } else {
        request.getRequestDispatcher("/vista/persona-form.jsp").forward(request, response);
        return;
    }
%>