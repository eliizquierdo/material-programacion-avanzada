<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, modelo.vo.GuerreroVO"%>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Guerreros</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h2>Lista de Guerreros</h2>
    <table>
        <tr>
            <th>ID</th><th>Nombre</th><th>Fuerza</th><th>Nivel</th>
        </tr>
        <%
            List<GuerreroVO> lista = (List<GuerreroVO>) request.getAttribute("guerreros");
            if(lista != null){
                for(GuerreroVO g: lista){
        %>
        <tr>
            <td><%= g.getId() %></td>
            <td><%= g.getNombre() %></td>
            <td><%= g.getFuerza() %></td>
            <td><%= g.getNivel() %></td>
        </tr>
        <%      }
            }
        %>
    </table>
    <a href="index.jsp">Volver</a>
</body>
</html>