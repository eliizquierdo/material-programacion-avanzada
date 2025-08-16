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

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");
        if ("form".equalsIgnoreCase(action)) {
            // Mostrar formulario vacío
            request.getRequestDispatcher("/vista/persona-form.jsp").forward(request, response);
            return;
        }

        // Por defecto: LISTAR
        request.setAttribute("personas", dao.getLista());
        request.getRequestDispatcher("/vista/persona-lista.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String action = request.getParameter("action");
        if ("agregar".equalsIgnoreCase(action)) {
            try {
                String cod = request.getParameter("codigo");
                int codigo = Integer.parseInt(cod);
                String nombre = request.getParameter("nombre");
                if (nombre != null && !nombre.trim().isEmpty()) {
                    PersonaVO p = new PersonaVO(codigo, nombre.trim());
                    dao.agregar(p);
                }
            } catch (Exception ignored) {
            }
        }

        // PRG: volvemos al listado
        response.sendRedirect(request.getContextPath() + "/persona");
    }
}
