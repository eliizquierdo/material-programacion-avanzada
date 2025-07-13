package controlador;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class EjercicioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        int lado = Integer.parseInt(request.getParameter("lado"));
        String op = request.getParameter("op");
        int resultado;
        String sOp;

        if ("area".equals(op)) {
            resultado = lado * lado;
            sOp = "área";
        } else {
            resultado = lado * 4;
            sOp = "perímetro";
        }

        // Guardar datos para pasar al JSP
        request.setAttribute("resultado", resultado);
        request.setAttribute("operacion", sOp);

        // Redirigir a resultado.jsp
        RequestDispatcher rd = request.getRequestDispatcher("resultado.jsp");
        rd.forward(request, response);
    }
}
