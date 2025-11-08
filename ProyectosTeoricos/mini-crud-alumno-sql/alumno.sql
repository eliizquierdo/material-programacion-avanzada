/********************************/
drop database alumnos;

CREATE database alumnos;

USE alumnos;

/********************************/
-- Crear tabla persona
CREATE TABLE persona (
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL
);

-- Crear tabla alumno con FK a persona
CREATE TABLE alumno (
    codigo INT PRIMARY KEY,
    telefono VARCHAR(20),
    FOREIGN KEY (codigo) REFERENCES persona (codigo) ON DELETE CASCADE
);

-- Insertar datos de ejemplo
INSERT INTO persona (nombre) VALUES ('Juan'), ('María');

INSERT INTO
    alumno (codigo, telefono)
VALUES (1, '123456789'),
    (2, '987654321');

select * from persona;

select * from alumno;