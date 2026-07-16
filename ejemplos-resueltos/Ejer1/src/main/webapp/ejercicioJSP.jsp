 <%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
//calcula el area o perimetro de un cuadrado
    int lado, resultado;
    String op, sLado;

    sLado = request.getParameter("lado"); // recibo lado
    lado = Integer.parseInt(sLado);       // convierte String en int
    op = request.getParameter("op");
    String sOp= "";

    if (op.equals("area")) {
        resultado = lado * lado;
        sOp= "área";
    } else {
        resultado = lado * 4;
        sOp= "perímetro";
    }
%>
   

        <html>

        <head>
            <title>Ejercicio JSP</title>
        </head>

        <body>
            <div>
                <h2>Ejercicio JSP </h2>
            </div>
            <h1>Resultado</h1>
            <h2>El <%=sOp %> del cuadrado es: <%= resultado %>
            </h2>

        </body>

        </html>