/************* Base de datos para usar en la versión 1 de agregar *******************/
DROP DATABASE institutoWeb;
-- Opcional, para empezar de cero
CREATE DATABASE institutoWeb;

USE institutoWeb;

/********************************/
-- Crear tabla personas
CREATE TABLE personas (
    codigo INT PRIMARY KEY, -- AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL
);

-- Crear tabla alumno con FK a persona
CREATE TABLE alumnos (
    codigo INT PRIMARY KEY, -- Es la PK y también la FK
    telefono VARCHAR(10),
    FOREIGN KEY (codigo) REFERENCES personas (codigo) ON DELETE CASCADE
);

INSERT INTO
    personas (codigo, nombre)
VALUES (1, 'Juan'),
    (2, 'María'),
    (3, 'Carlos');

insert into
    alumnos (codigo, telefono)
values (1, "23644747"),
    (2, "23654539"),
    (3, "23659090");

-- probando escribir la sentencia para listar
select p.codigo, p.nombre, a.telefono
from personas as p
    inner join alumnos as a on p.codigo = a.codigo;