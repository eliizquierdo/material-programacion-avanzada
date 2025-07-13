<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <html>

    <head>
        <title>Ejercicio de área y perímetro</title>
    </head>

    <body>
        <div>
            <h2>Ejercicio de área y perímetro</h2>
        </div>
        <form action="ejercicioJSP.jsp" method="POST">
            Ingrese lado del cuadrado: <input type="text" name="lado" value="" /><br>
            Desea calcular <input type="radio" name="op" value="area" checked="checked" /> Área
            <input type="radio" name="op" value="perimetro" /> Perímetro
            <br>
            <input type="submit" name="op" value="Calcular" />
        </form>

    </body>

    </html>