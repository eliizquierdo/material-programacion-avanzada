package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import modelo.dao.AlumnoDAO;
import modelo.vo.AlumnoVO;

@WebServlet("/alumno")
public class AlumnoControladorServlet extends HttpServlet {
    // DAO
    private final AlumnoDAO dao = new AlumnoDAO();

    // ======================== GET ========================
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = ""; // evita NPE en switch
        }

        switch (action) {
            case "agregar": // mostrar formulario de alta (GET)
                request.getRequestDispatcher("/vista/alumno-form.jsp").forward(request, response);
                break;

            case "editar": // cargar datos y mostrar formulario de edición (GET)
                mostrarEditar(request, response);
                break;

            case "eliminar": // eliminar por GET (Diseño particular)
                eliminar(request, response);
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
            response.sendRedirect(request.getContextPath() + "/alumno");
            return;
        }

        switch (action) {
            case "agregar":
                agregar(request, response);
                break;

            case "actualizar": // Corresponde a la acción de editar por POST
                actualizar(request, response);
                break;

            default:
                // Si la acción POST es desconocida, redirigir al listado principal
                response.sendRedirect(request.getContextPath() + "/alumno");
                break;
        }
    }

    // ===================== Acciones privadas =====================

    private void listar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            request.setAttribute("alumnos", dao.listarAlumnos());
        } catch (Exception e) {
            request.setAttribute("error", "Error al listar alumnos: " + e.getMessage());
            e.printStackTrace();
        }
        request.getRequestDispatcher("/vista/alumno-lista.jsp").forward(request, response);
    }

    private void agregar(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        try {
            // 1. Recuperar TODOS los parámetros, incluyendo el código
            int codigo = Integer.parseInt(request.getParameter("codigo"));
            String nombre = request.getParameter("nombre");
            String telefono = request.getParameter("telefono");

            // 2. VERIFICACIÓN DE UNICIDAD USANDO EL MÉTODO EXISTENTE
            // Si retorna un AlumnoVO, es porque ya existe.
            AlumnoVO alumnoExistente = dao.obtenerAlumnoPorCodigo(codigo); // <-- USAS TU MÉTODO

            if (alumnoExistente != null) { // <-- CHEQUEO CLAVE
                // Si el código existe, preparar mensaje de error y volver al formulario
                request.setAttribute("error", "Error: El código de alumno " + codigo + " ya existe.");

                // Opcional: Para mantener los datos ingresados
                request.setAttribute("alumno", new AlumnoVO(codigo, nombre, telefono));

                request.getRequestDispatcher("/vista/alumno-form.jsp").forward(request, response);
                return; // Detener la ejecución, no se inserta
            }

            // 3. Si es único (alumnoExistente == null), proceder con la inserción
            AlumnoVO nuevoAlumno = new AlumnoVO(codigo, nombre, telefono);
            dao.agregarAlumno(nuevoAlumno);

            response.sendRedirect(request.getContextPath() + "/alumno"); // PRG

        } catch (NumberFormatException e) {
            // Manejar error si el código no es un número válido
            request.setAttribute("error", "El código debe ser un número válido.");
            request.getRequestDispatcher("/vista/alumno-form.jsp").forward(request, response);

        } catch (Exception e) {
            // Manejar otros errores (DAO, conexión, etc.)
            System.err.println("ERROR al agregar alumno: " + e.getMessage());
            e.printStackTrace();
            request.setAttribute("error", "No se pudo guardar el alumno: " + e.getMessage());
            request.getRequestDispatcher("/vista/alumno-form.jsp").forward(request, response);
        }
    }

    private void mostrarEditar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int codigo = Integer.parseInt(request.getParameter("id"));
            AlumnoVO alumno = dao.obtenerAlumnoPorCodigo(codigo);
            request.setAttribute("alumno", alumno);
            request.getRequestDispatcher("/vista/alumno-editar.jsp").forward(request, response);
        } catch (Exception e) {
            System.err.println("ERROR al mostrar editar: " + e.getMessage());
            e.printStackTrace();
            request.setAttribute("error", "No se pudo cargar el alumno: " + e.getMessage());
            listar(request, response);
        }
    }

    private void actualizar(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        try {
            int codigo = Integer.parseInt(request.getParameter("codigo"));
            String nombre = request.getParameter("nombre");
            String telefono = request.getParameter("telefono");

            boolean exito = dao.actualizarAlumno(new AlumnoVO(codigo, nombre, telefono));

            response.sendRedirect(request.getContextPath() + "/alumno"); // PRG
        } catch (Exception e) {
            System.err.println("ERROR al actualizar alumno: " + e.getMessage());
            e.printStackTrace();
            request.setAttribute("error", "No se pudo actualizar el alumno: " + e.getMessage());
            // Intenta volver a la vista de edición si falla la actualización
            mostrarEditar(request, response);
        }
    }

    private void eliminar(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        try {
            int codigo = Integer.parseInt(request.getParameter("id"));
            dao.eliminarAlumno(codigo);
        } catch (Exception e) {
            System.err.println("ERROR al eliminar alumno: " + e.getMessage());
            e.printStackTrace();
            // (Opcional: podrías agregar un mensaje de error a la request
            // antes de redirigir si quisieras mostrarlo en la lista)
        }
        response.sendRedirect(request.getContextPath() + "/alumno"); // PRG
    }
}