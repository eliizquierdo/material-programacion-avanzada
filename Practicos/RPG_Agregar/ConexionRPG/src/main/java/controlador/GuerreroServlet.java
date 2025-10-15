package controlador;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import modelo.dao.GuerreroDAO;
import modelo.vo.GuerreroVO;
import java.util.List;

@WebServlet(name = "GuerreroServlet", urlPatterns = {"/GuerreroServlet"})
public class GuerreroServlet extends HttpServlet {

    GuerreroDAO dao = new GuerreroDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("accion");

        if (accion == null) {
            response.sendRedirect("index.jsp");
        } else if (accion.equals("listar")) {
            List<GuerreroVO> lista = dao.listarGuerreros();
            request.setAttribute("guerreros", lista);
            RequestDispatcher rd = request.getRequestDispatcher("mostrarGuerrero.jsp");
            rd.forward(request, response);
        } else if (accion.equals("nuevo")) {
            RequestDispatcher rd = request.getRequestDispatcher("agregarGuerrero.jsp");
            rd.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        int fuerza = Integer.parseInt(request.getParameter("fuerza"));
        int nivel = Integer.parseInt(request.getParameter("nivel"));

        GuerreroVO g = new GuerreroVO(nombre, fuerza, nivel);
        dao.agregarGuerrero(g);

        response.sendRedirect("GuerreroServlet?accion=listar");
    }
}