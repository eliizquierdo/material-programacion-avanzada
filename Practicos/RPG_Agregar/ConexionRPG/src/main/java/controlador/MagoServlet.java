package controlador;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import modelo.dao.MagoDAO;
import modelo.vo.MagoVO;
import java.util.List;

@WebServlet(name = "MagoServlet", urlPatterns = {"/MagoServlet"})
public class MagoServlet extends HttpServlet {
    MagoDAO dao = new MagoDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("accion");

        if (accion == null) {
            response.sendRedirect("index.jsp");
        } else if (accion.equals("listar")) {
            List<MagoVO> lista = dao.listarMagos();
            request.setAttribute("magos", lista);
            RequestDispatcher rd = request.getRequestDispatcher("mostrarMago.jsp");
            rd.forward(request, response);
        } else if (accion.equals("nuevo")) {
            RequestDispatcher rd = request.getRequestDispatcher("agregarMago.jsp");
            rd.forward(request, response);
        }
    }
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        int poder = Integer.parseInt(request.getParameter("poder"));
        int nivel = Integer.parseInt(request.getParameter("nivel"));

        MagoVO m = new MagoVO(nombre, poder, nivel);
        dao.agregarMago(m);

        response.sendRedirect("MagoServlet?accion=listar");
    }
}
