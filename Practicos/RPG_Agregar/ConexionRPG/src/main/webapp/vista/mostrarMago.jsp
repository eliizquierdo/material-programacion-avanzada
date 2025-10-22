<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, modelo.vo.MagoVO"%>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Magos</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h2>Lista de Magos</h2>
    <table>
        <tr>
            <th>ID</th><th>Nombre</th><th>Poder</th><th>Nivel</th>
        </tr>
        <%
            List<MagoVO> lista = (List<MagoVO>) request.getAttribute("magos");
            if(lista != null){
                for(MagoVO m: lista){
        %>
        <tr>
            <td><%= m.getId() %></td>
            <td><%= m.getNombre() %></td>
            <td><%= m.getPoder() %></td>
            <td><%= m.getNivel() %></td>
        </tr>
        <%      }
            }
        %>
    </table>
    <a href="index.jsp">Volver</a>
</body>
</html>