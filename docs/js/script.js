// Mostrar / ocultar contenido (ej: soluciones)
function toggle(id) {
    let elemento = document.getElementById(id);

    if (elemento.style.display === "none") {
        elemento.style.display = "block";
    } else {
        elemento.style.display = "none";
    }
}


// Corrección simple de respuestas tipo test
function corregir() {
    let puntaje = 0;

    if (document.getElementById("p1").value.toLowerCase() === "molde") {
        puntaje++;
    }

    if (document.getElementById("p2").value.toLowerCase() === "instancia") {
        puntaje++;
    }

    document.getElementById("resultado").innerText =
        "Puntaje: " + puntaje + "/2";
}
