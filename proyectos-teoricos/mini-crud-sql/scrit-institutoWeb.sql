/********************************/
CREATE database institutoWeb;

USE institutoWeb;

CREATE TABLE persona (
    codigo INT(8),
    nombre VARCHAR(10) NOT NULL,
    PRIMARY KEY (codigo)
);

-- Insertamos algunos datos de prueba
INSERT INTO
    persona (codigo, nombre)
VALUES (1, 'Juan'),
    (2, 'María'),
    (3, 'Carlos');
/********************************/