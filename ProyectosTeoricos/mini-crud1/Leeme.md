#  MINI-CRUD1 - Gestión de Personas

**📋Introducción**
Sistema web básico y completo para la gestión de personas desarrollado en **Java** con arquitectura MVC, creado con fines educativos y compartido con estudiantes.

Este proyecto implementa las operaciones **CRUD** (Crear, Leer, Actualizar, Eliminar) de forma sencilla y didáctica, utilizando **Java Servlets** y **JSP** para demostrar los conceptos fundamentales del desarrollo web con Java.

**📝 Detalles generales de esta versión:**
- Los datos se almacenan temporalmente en un **ArrayList** en memoria
- Perfecto para aprender los conceptos básicos de MVC sin la complejidad de una base de datos
- Código limpio y bien documentado para facilitar el aprendizaje

**🚀 Próxima versión:**
- Conexión a **base de datos MySQL** para persistencia real de datos
- Validaciones más robustas y manejo de errores avanzado
- Implementación de JPA/Hibernate para mapeo objeto-relacional (será un desafío para los estudiantes destacados)

---
## 🚀 Características

- ✅ **Formulario de Agregar Personas**: Interfaz JSP limpia para registrar nuevas personas
- 📝 **Listado de Personas**: Visualización organizada de todos los registros
- ✏️ **Editar Personas**: Modificación sencilla de datos existentes  
- 🗑️ **Eliminar Personas**: Gestión segura de eliminación de registros
- 🎯 **Servlet Controlador**: PersonaControladorServlet.java maneja todas las peticiones
- 💾 **Capa DAO**: PersonaDAO.java para acceso a datos
- 🎨 **Capa VO**: PersonaVO.java como objeto de valor
- 🌐 **Vistas JSP**: Interfaz web dinámica con estilos CSS

## 📸 Capturas del Proyecto

### Página Principal
<img src="https://github.com/eliizquierdo/material-programacion-avanzada/raw/main/ProyectosTeoricos/mini-crud1/index.png" alt="Página Principal" width="400">

*Página de inicio del sistema MINI-CRUD1*

### Formulario Agregar Persona
<img src="https://github.com/eliizquierdo/material-programacion-avanzada/raw/main/ProyectosTeoricos/mini-crud1/agregarPersona.png" alt="Formulario Agregar Personas" width="500">
 
*Interfaz JSP para el registro de nuevas personas*

### Lista de Personas  
<img src="https://github.com/eliizquierdo/material-programacion-avanzada/raw/main/ProyectosTeoricos/mini-crud1/listarPersonas.png" alt="Lista Personas" width="600">

*Vista completa con opciones de editar y eliminar*

### Formulario Editar
<img src="https://github.com/eliizquierdo/material-programacion-avanzada/raw/main/ProyectosTeoricos/mini-crud1/editarPersona.png" alt="Formulario Editar" width="500">

*Modificación sencilla de datos existentes*


### Confirmación de Eliminar
<img src="https://github.com/eliizquierdo/material-programacion-avanzada/raw/main/ProyectosTeoricos/mini-crud1/eliminar.png" alt="log Eliminar" width="500">

*Confirmación segura antes de eliminar registros*

## 🛠️ Estructura del Proyecto

```
📁 MINI-CRUD1/
├── 📁 src/main/java/
│   ├── 📁 controlador/
│   │   └── 📄 PersonaControladorServlet.java
│   ├── 📁 modelo/
│   │   ├── 📁 dao/
│   │   │   └── 📄 PersonaDAO.java
│   │   └── 📁 vo/
│   │       └── 📄 PersonaVO.java
├── 📁 webapp/
│   ├── 📁 css/
│   │   └── 📄 styles.css
│   ├── 📁 vista/
│   │   ├── 📄 persona-editar.jsp
│   │   ├── 📄 persona-form.jsp
│   │   └── 📄 persona-lista.jsp
│   ├── 📁 WEB-INF/
│   │   └── 📄 web.xml
│   └── 📄 index.jsp
├── 📁 target/ (archivos compilados)
└── 📄 pom.xml (configuración Maven)
```

## ⚡ Instalación y Uso

### Prerrequisitos
- ☕ **Java JDK 8** o superior
- 🚀 **Apache Tomcat 7** o superior  
- 🛠️ **Maven** para gestión de dependencias

### Instalación
1. **Descargar el proyecto**:
   
   📦 **Descargar**: [**MINI-CRUD1.zip**](https://github.com/eliizquierdo/material-programacion-avanzada/blob/main/ProyectosTeoricos/mini-crud1/mini-crud1.zip)
   
   *(El proyecto está contenido dentro del repositorio de Material de Programación Avanzada, por lo que la descarga directa del ZIP es la opción más práctica)*

2. **Extraer el archivo ZIP** descargado y abrir la carpeta del proyecto con VS Code

3. **Ejecutar en la terminal de Maven**:
   ```bash
   mvn package
   mvn tomcat7:run
   ```

4. **Acceder a la aplicación**:
   - La aplicación se ejecutará automáticamente
   - Acceder desde: `http://localhost:8080/mini-crud1`

## 🏗️ Arquitectura Java MVC

El proyecto implementa el patrón **Modelo-Vista-Controlador**:

### 🎯 Controlador (Controller)
- **PersonaControladorServlet.java**: Servlet principal que maneja todas las peticiones HTTP  [Ver código](https://github.com/eliizquierdo/material-programacion-avanzada/blob/main/ProyectosTeoricos/mini-crud1/mini-crud1/src/main/java/controlador/PersonaControladorServlet.java)
- Procesa las acciones: agregar, listar, editar, eliminar
- Coordina la comunicación entre modelo y vista

### 💾 Modelo (Model)  
- **PersonaDAO.java**: Data Access Object para operaciones de base de datos  [Ver código](https://github.com/eliizquierdo/material-programacion-avanzada/blob/main/ProyectosTeoricos/mini-crud1/mini-crud1/src/main/java/modelo/dao/PersonaDAO.java)
- **PersonaVO.java**: Value Object que encapsula los datos de persona  [Ver código](https://github.com/eliizquierdo/material-programacion-avanzada/blob/main/ProyectosTeoricos/mini-crud1/mini-crud1/src/main/java/modelo/vo/PersonaVO.java)
- Maneja la lógica de negocio y persistencia de datos

### 🌐 Vista (View)
- **persona-form.jsp**: Formulario para agregar personas  [Ver código](https://github.com/eliizquierdo/material-programacion-avanzada/blob/main/ProyectosTeoricos/mini-crud1/mini-crud1/src/main/webapp/vista/persona-form.jsp)
- **persona-lista.jsp**: Lista con botones editar/eliminar  [Ver código](https://github.com/eliizquierdo/material-programacion-avanzada/blob/main/ProyectosTeoricos/mini-crud1/mini-crud1/src/main/webapp/vista/persona-lista.jsp)
- **persona-editar.jsp**: Formulario de edición  [Ver código](https://github.com/eliizquierdo/material-programacion-avanzada/blob/main/ProyectosTeoricos/mini-crud1/mini-crud1/src/main/webapp/vista/persona-editar.jsp)
- **styles.css**: Estilos para interfaz atractiva  [Ver código](https://github.com/eliizquierdo/material-programacion-avanzada/blob/main/ProyectosTeoricos/mini-crud1/mini-crud1/src/main/webapp/css/styles.css)

### ⚙️ Configuración
- **pom.xml** - Configuración de Maven y dependencias  [Ver código](https://github.com/eliizquierdo/material-programacion-avanzada/blob/main/ProyectosTeoricos/mini-crud1/mini-crud1/pom.xml)


## 📋 Funcionalidades Detalladas

| Función | Descripción | Tecnología |
|---------|-------------|------------|
| 🏠 Inicio | Página principal del sistema | JSP + CSS |
| ➕ Agregar | Formulario JSP para nuevas personas | Servlet + JSP |
| 📋 Listar | Tabla con todos los registros y acciones | JSP + DAO |
| ✏️ Editar | Formulario pre-cargado para modificaciones | Servlet + JSP |
| 🗑️ Eliminar | Confirmación y eliminación segura | Servlet + DAO |

## 🎓 Propósito Educativo

Este proyecto **MINI-CRUD1** ha sido desarrollado y compartido específicamente para estudiantes como material de aprendizaje, demostrando:

- 🏗️ **Arquitectura MVC** en aplicaciones web Java
- 🌐 **Desarrollo con Servlets y JSP**
- 💾 **Patrón DAO** para acceso a datos
- 📦 **Gestión de proyectos** con Maven
- 🎯 **CRUD completo** con interfaz web
- 🔄 **Separación de responsabilidades** entre capas

## 🚀 Características Técnicas

- **Lenguaje**: Java
- **Frontend**: JSP + CSS
- **Backend**: Java Servlets  
- **Patrón**: MVC (Modelo-Vista-Controlador)
- **Persistencia**: DAO Pattern
- **Servidor**: Apache Tomcat
- **Build**: Maven
- **Arquitectura**: Web Application

## 📧 Contacto y Soporte

¿Preguntas sobre el proyecto? ¡Estamos aquí para ayudar a los estudiantes!

- 👨‍💻 **Autor**: Prof. Elizabeth Izquierdo
- 📧 **Email**: profe.eliza17@gmail.com
- 📚 **Wiki con teóricos y tutoriales paso a paso (en proceso)**: [AQUÍ](https://github.com/eliizquierdo/material-programacion-avanzada/wiki)
- 🐛 **Reportar problemas**: Issues de GitHub
- 💡 **Sugerencias**: Pull requests bienvenidos

---

### 📝 Notas para Estudiantes

Este proyecto **MINI-CRUD1** está diseñado como herramienta de aprendizaje. Te animamos a:

- 🔍 **Explorar el código fuente** de cada capa (MVC)
- 🧪 **Experimentar** con modificaciones en los JSP
- 💡 **Proponer mejoras** en la funcionalidad
- 🤝 **Colaborar** con otros estudiantes
- 📖 **Estudiar** la arquitectura de Servlets
- 🛠️ **Practicar** con Maven y Tomcat

---
## 📄 Licencia

<a rel="license" href="http://creativecommons.org/licenses/by-sa/4.0/"><img alt="Licencia Creative Commons" style="border-width:0" src="https://i.creativecommons.org/l/by-sa/4.0/88x31.png" /></a>

Este proyecto está bajo la **Licencia Creative Commons Attribution-ShareAlike 4.0 Internacional**.

Esto significa que puedes:
- ✅ **Compartir** — copiar y redistribuir el material en cualquier medio o formato
- ✅ **Adaptar** — remezclar, transformar y construir a partir del material para cualquier propósito, incluso comercialmente

Bajo los siguientes términos:
- 📝 **Attribution** — Debes dar crédito de manera adecuada, brindar un enlace a la licencia, e indicar si se han realizado cambios
- 🔄 **ShareAlike** — Si remezclas, transformas o creas a partir del material, debes distribuir tu contribución bajo la misma licencia del original

[Ver licencia completa](http://creativecommons.org/licenses/by-sa/4.0/)

**¡Happy Coding! ☕🚀**
