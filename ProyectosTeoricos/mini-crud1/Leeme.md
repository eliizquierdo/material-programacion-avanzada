# MINI-CRUD1 - Gestión de Personas

## Introducción

Sistema web básico para la gestión de personas desarrollado en Java con arquitectura MVC, creado con fines educativos. Este proyecto implementa las operaciones CRUD (Crear, Leer, Actualizar, Eliminar) utilizando Java Servlets y JSP para demostrar los conceptos fundamentales del desarrollo web con Java.

**Características de esta versión:**
- Los datos se almacenan temporalmente en un ArrayList en memoria
- Código limpio y documentado para facilitar el aprendizaje
- Implementación completa del patrón MVC

**Próxima versión:**
- Conexión a base de datos MySQL para persistencia real de datos
- Validaciones robustas y manejo de errores avanzado

## Funcionalidades

- **Agregar Personas**: Formulario JSP para registrar nuevas personas
- **Listar Personas**: Visualización organizada de todos los registros
- **Editar Personas**: Modificación de datos existentes
- **Eliminar Personas**: Eliminación segura de registros con confirmación
- **Servlet Controlador**: PersonaControladorServlet.java maneja todas las peticiones
- **Capa DAO**: PersonaDAO.java para acceso a datos
- **Capa VO**: PersonaVO.java como objeto de valor
- **Vistas JSP**: Interfaz web dinámica con estilos CSS

## Capturas del Proyecto

### Página Principal
<img src="https://github.com/eliizquierdo/material-programacion-avanzada/raw/main/ProyectosTeoricos/mini-crud1/index.png" alt="Página Principal" width="400">

### Formulario Agregar Persona
<img src="https://github.com/eliizquierdo/material-programacion-avanzada/raw/main/ProyectosTeoricos/mini-crud1/agregarPersona.png" alt="Formulario Agregar Personas" width="500">

### Lista de Personas  
<img src="https://github.com/eliizquierdo/material-programacion-avanzada/raw/main/ProyectosTeoricos/mini-crud1/listarPersonas.png" alt="Lista Personas" width="600">

### Formulario Editar
<img src="https://github.com/eliizquierdo/material-programacion-avanzada/raw/main/ProyectosTeoricos/mini-crud1/editarPersona.png" alt="Formulario Editar" width="500">

### Confirmación de Eliminar
<img src="https://github.com/eliizquierdo/material-programacion-avanzada/raw/main/ProyectosTeoricos/mini-crud1/eliminar.png" alt="Confirmar Eliminar" width="500">

## Estructura del Proyecto

```
MINI-CRUD1/
├── src/main/java/
│   ├── controlador/
│   │   └── PersonaControladorServlet.java
│   ├── modelo/
│   │   ├── dao/
│   │   │   └── PersonaDAO.java
│   │   └── vo/
│   │       └── PersonaVO.java
├── webapp/
│   ├── css/
│   │   └── styles.css
│   ├── vista/
│   │   ├── persona-editar.jsp
│   │   ├── persona-form.jsp
│   │   └── persona-lista.jsp
│   ├── WEB-INF/
│   │   └── web.xml
│   └── index.jsp
├── target/ (archivos compilados)
└── pom.xml (configuración Maven)
```

## Instalación y Uso

### Prerrequisitos
- Java JDK 8 o superior
- Apache Tomcat 7 o superior  
- Maven para gestión de dependencias

### Instalación
1. **Descargar el proyecto**: [MINI-CRUD1.zip](https://github.com/eliizquierdo/material-programacion-avanzada/blob/main/ProyectosTeoricos/mini-crud1/mini-crud1.zip)

2. **Extraer el archivo** y abrir la carpeta del proyecto con VS Code

3. **Ejecutar en la terminal**:
   ```bash
   mvn package
   mvn tomcat7:run
   ```

4. **Acceder a la aplicación**: `http://localhost:8080/mini-crud1`

## Arquitectura MVC

El proyecto implementa el patrón Modelo-Vista-Controlador:

### Controlador
- **PersonaControladorServlet.java**: Servlet principal que maneja todas las peticiones HTTP
- Procesa las acciones: agregar, listar, editar, eliminar
- Coordina la comunicación entre modelo y vista

### Modelo
- **PersonaDAO.java**: Data Access Object para operaciones de datos
- **PersonaVO.java**: Value Object que encapsula los datos de persona
- Maneja la lógica de negocio y persistencia de datos

### Vista
- **persona-form.jsp**: Formulario para agregar personas
- **persona-lista.jsp**: Lista con botones editar/eliminar
- **persona-editar.jsp**: Formulario de edición
- **styles.css**: Estilos para interfaz web

### Configuración
- **pom.xml**: Configuración de Maven y dependencias

## Operaciones CRUD

| Función | Descripción | Implementación |
|---------|-------------|----------------|
| Create | Agregar nuevas personas | Servlet + JSP + DAO |
| Read | Mostrar lista de personas | JSP + DAO |
| Update | Editar datos existentes | Servlet + JSP + DAO |
| Delete | Eliminar con confirmación | Servlet + DAO + JavaScript |

## Propósito Educativo

Este proyecto demuestra conceptos fundamentales del desarrollo web Java:

- Arquitectura MVC en aplicaciones web Java
- Desarrollo con Servlets y JSP
- Patrón DAO para acceso a datos
- Gestión de proyectos con Maven
- CRUD completo con interfaz web
- Separación de responsabilidades entre capas
- Patrón Post-Redirect-Get (PRG)

## Características Técnicas

- **Lenguaje**: Java
- **Frontend**: JSP + CSS + JavaScript
- **Backend**: Java Servlets  
- **Patrón**: MVC (Modelo-Vista-Controlador)
- **Persistencia**: DAO Pattern con ArrayList
- **Servidor**: Apache Tomcat
- **Build**: Maven
- **Arquitectura**: Aplicación Web

## Contacto y Soporte

- **Autor**: Prof. Elizabeth Izquierdo
- **Email**: profe.eliza17@gmail.com
- **Wiki**: [Material de Programación Avanzada](https://github.com/eliizquierdo/material-programacion-avanzada/wiki)
- **Reportar problemas**: Issues de GitHub
- **Sugerencias**: Pull requests bienvenidos

## Notas para Estudiantes

Este proyecto está diseñado como herramienta de aprendizaje. Se recomienda:

- Explorar el código fuente de cada capa MVC
- Experimentar con modificaciones en los JSP
- Estudiar la arquitectura de Servlets
- Practicar con Maven y Tomcat
- Analizar el flujo de datos entre las capas
- Comprender el patrón PRG implementado

## Licencia

Este proyecto está bajo la **Licencia Creative Commons Attribution-ShareAlike 4.0 Internacional**.

Puedes:
- Compartir y redistribuir el material
- Adaptar y transformar el contenido

Bajo los términos de:
- **Attribution**: Dar crédito adecuado
- **ShareAlike**: Distribuir contribuciones bajo la misma licencia

[Ver licencia completa](http://creativecommons.org/licenses/by-sa/4.0/)
