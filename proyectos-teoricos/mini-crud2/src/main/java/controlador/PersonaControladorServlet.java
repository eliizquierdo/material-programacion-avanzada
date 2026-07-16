package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import modelo.dao.PersonaDAO;
import modelo.vo.PersonaVO;

@WebServlet("/persona")
public class PersonaControladorServlet extends HttpServlet {
    private final PersonaDAO dao = new PersonaDAO();

    // ======================== GET ========================
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null)
            action = "";

        switch (action) {
            case "agregar": // mostrar formulario de alta (GET)
                request.getRequestDispatcher("/vista/persona-form.jsp")
                        .forward(request, response);
                break;

            case "cargarEditar": // mostrar formulario de edición (GET)
                cargarEditar(request, response);
                break;

            case "listar": // listar explícito
                listar(request, response);
                break;

            default: // sin action o desconocida → listar
                listar(request, response);
                break;
        }
    }

    // ======================== POST ========================
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            response.sendRedirect(request.getContextPath() + "/persona");
            return;
        }

        switch (action) {
            case "agregar":
                agregar(request, response);
                break;
            case "editar":
                editar(request, response);
                break;
            case "eliminar":
                eliminar(request, response);
                break; // eliminar por POST
            default:
                response.sendRedirect(request.getContextPath() + "/persona");
        }
    }

    // ===================== Acciones privadas =====================
    private void agregar(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException { // Se necesita ServletException para usar forward

        PersonaVO personaParaFormulario = null;
        int codigo = 0;
        String nombre = request.getParameter("nombre");

        // 1. Obtener y validar el código
        codigo = Integer.parseInt(request.getParameter("codigo"));
        personaParaFormulario = new PersonaVO(codigo, nombre.trim());

        // 2. 🛑 VERIFICACIÓN DE UNICIDAD USANDO EL DAO 🛑
        PersonaVO personaExistente = dao.obtenerXCodigo(codigo);

        if (personaExistente != null) {
            // Error: Código duplicado
            request.setAttribute("error",
                    "Error: El código " + codigo + " ya está registrado. Ingrese uno diferente.");
            request.setAttribute("persona", personaParaFormulario); // Mantener datos

            // Usar FORWARD para volver al formulario y mostrar el error/datos
            request.getRequestDispatcher("/vista/persona-form.jsp").forward(request, response);
            return; // Detener la ejecución
        }

        // 3. Si es único (personaExistente == null), agregar
        dao.agregar(personaParaFormulario);

        // 4. PRG (Redirección al listado)
        response.sendRedirect(request.getContextPath() + "/persona");

    }

    private void editar(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        String nombre = request.getParameter("nombre");
        dao.actualizar(new PersonaVO(codigo, nombre));
        // PRG → volver a listar
        response.sendRedirect(request.getContextPath() + "/persona");
    }

    private void eliminar(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        int codigo = Integer.parseInt(request.getParameter("codigo"));

        dao.eliminar(codigo);

        // PRG → volver a listar
        response.sendRedirect(request.getContextPath() + "/persona");
    }

    private void cargarEditar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int codigo = Integer.parseInt(request.getParameter("codigo"));

        PersonaVO persona = dao.obtenerXCodigo(codigo);

        if (persona != null) {

            request.setAttribute("persona", persona);

            request.getRequestDispatcher("/vista/persona-editar.jsp")

                    .forward(request, response);
        } else {

            response.sendRedirect(request.getContextPath() + "/persona");
        }
    }

    private void listar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("personas", dao.getLista());
        request.getRequestDispatcher("/vista/persona-lista.jsp")
                .forward(request, response);
    }
}
