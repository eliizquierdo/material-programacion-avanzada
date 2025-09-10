# 📋 MINI-CRUD1 - Gestión de Personas

Sistema web completo para la gestión de personas desarrollado en **Java** con arquitectura MVC, creado con fines educativos y compartido con estudiantes.

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
**[Ver Página Principal](https://github.com/eliizquierdo/material-programacion-avanzada/blob/main/ProyectosTeoricos/mini-crud1/index.png)**  
*Página de inicio del sistema MINI-CRUD1*

### Formulario Agregar Persona
**[Ver Formulario Agregar](https://github.com/eliizquierdo/material-programacion-avanzada/blob/main/ProyectosTeoricos/mini-crud1/agregarPersona.png)**  
*Interfaz JSP para el registro de nuevas personas*

### Lista de Personas  
**[Ver Lista de Personas](https://github.com/eliizquierdo/material-programacion-avanzada/blob/main/ProyectosTeoricos/mini-crud1/listarPersonas.png)**  
*Vista completa con opciones de editar y eliminar*

### Formulario Editar
**[Ver Formulario Editar](https://github.com/eliizquierdo/material-programacion-avanzada/blob/main/ProyectosTeoricos/mini-crud1/editarPersona.png)**  
*Modificación sencilla de datos existentes*

### Confirmación de Eliminar
**[Ver Confirmación Eliminar](https://github.com/eliizquierdo/material-programacion-avanzada/blob/main/ProyectosTeoricos/mini-crud1/eliminar.png)**  
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

2. **Extraer el archivo ZIP** descargado

3. **Compilar con Maven**:
   ```bash
   cd mini-crud1
   mvn clean compile
   mvn package
   ```

4. **Desplegar en Tomcat**:
   - Copiar el archivo `.war` generado a la carpeta `webapps` de Tomcat
   - O importar en tu IDE favorito (Eclipse, IntelliJ, NetBeans)

5. **Ejecutar**:
   - Iniciar Tomcat
   - Acceder desde: `http://localhost:8080/mini-crud1`

## 🏗️ Arquitectura Java MVC

El proyecto implementa el patrón **Modelo-Vista-Controlador**:

### 🎯 Controlador (Controller)
- **PersonaControladorServlet.java**: Servlet principal que maneja todas las peticiones HTTP
- Procesa las acciones: agregar, listar, editar, eliminar
- Coordina la comunicación entre modelo y vista

### 💾 Modelo (Model)  
- **PersonaDAO.java**: Data Access Object para operaciones de base de datos
- **PersonaVO.java**: Value Object que encapsula los datos de persona
- Maneja la lógica de negocio y persistencia de datos

### 🌐 Vista (View)
- **persona-form.jsp**: Formulario para agregar personas
- **persona-lista.jsp**: Lista con botones editar/eliminar  
- **persona-editar.jsp**: Formulario de edición
- **styles.css**: Estilos para interfaz atractiva

## 📋 Funcionalidades Detalladas

| Función | Descripción | Tecnología | Estado |
|---------|-------------|------------|---------|
| 🏠 Inicio | Página principal del sistema | JSP + CSS | ✅ Completo |
| ➕ Agregar | Formulario JSP para nuevas personas | Servlet + JSP | ✅ Completo |
| 📋 Listar | Tabla con todos los registros y acciones | JSP + DAO | ✅ Completo |
| ✏️ Editar | Formulario pre-cargado para modificaciones | Servlet + JSP | ✅ Completo |
| 🗑️ Eliminar | Confirmación y eliminación segura | Servlet + DAO | ✅ Completo |

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

## 📞 Contacto y Soporte

¿Preguntas sobre el proyecto? ¡Estamos aquí para ayudar a los estudiantes!

- 👨‍💻 **Autor**: Eli Izquierdo
- 📚 **Repositorio**: [Material Programación Avanzada](https://github.com/eliizquierdo/material-programacion-avanzada)
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

**¡Happy Coding! ☕🚀**
