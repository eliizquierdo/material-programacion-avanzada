# 📋 Proyecto Gestión de Personas

Un sistema completo para la gestión de personas con interfaz web intuitiva, desarrollado con fines educativos y compartido con estudiantes.

## 🚀 Características

- ✅ **Formulario de Agregar Personas**: Interfaz limpia para registrar nuevas personas
- 📝 **Listado de Personas**: Visualización organizada de todos los registros
- ✏️ **Editar Personas**: Modificación sencilla de datos existentes  
- 🗑️ **Eliminar Personas**: Gestión segura de eliminación de registros
- 🎯 **Controlador Modularizado**: Métodos separados para cada acción (CRUD completo)

## 📸 Capturas del Proyecto

### Formulario Agregar Persona
![Formulario Agregar](./imagenes/formulario-agregar.png)
*Interfaz intuitiva para el registro de nuevas personas*

### Lista de Personas
![Lista Personas](./imagenes/lista-personas.png)
*Vista completa con opciones de editar y eliminar*

### Formulario Editar
![Formulario Editar](./imagenes/formulario-editar.png)
*Modificación sencilla de datos existentes*

## 🛠️ Estructura del Proyecto

```
📁 proyecto-personas/
├── 📄 index.php
├── 📄 agregar.php
├── 📄 listar.php
├── 📄 editar.php
├── 📄 eliminar.php
├── 📂 controlador/
│   ├── 📄 PersonaControlador.php
│   └── 📄 conexion.php
├── 📂 modelo/
│   └── 📄 Persona.php
├── 📂 vista/
│   └── 📄 estilos.css
└── 📂 imagenes/
    ├── 🖼️ formulario-agregar.png
    ├── 🖼️ lista-personas.png
    └── 🖼️ formulario-editar.png
```

## ⚡ Instalación y Uso

### Prerrequisitos
- Servidor web (Apache/Nginx)
- PHP 7.4 o superior
- MySQL/MariaDB

### Instalación
1. **Descargar el proyecto**:
   ```bash
   git clone https://github.com/tu-usuario/proyecto-personas.git
   ```
   
   O descargar directamente: 📦 [**Descargar ZIP del Proyecto**](./proyecto-personas.zip)

2. **Configurar base de datos**:
   - Importar el archivo `database.sql`
   - Configurar credenciales en `controlador/conexion.php`

3. **Ejecutar**:
   - Colocar en la carpeta del servidor web
   - Acceder desde el navegador

## 🏗️ Arquitectura

### Controlador Modularizado
El proyecto implementa un controlador dividido en métodos específicos:

- `agregarPersona()` - Gestiona la inserción de nuevos registros
- `listarPersonas()` - Maneja la consulta y visualización
- `editarPersona()` - Procesa las actualizaciones
- `eliminarPersona()` - Gestiona la eliminación segura

## 🎓 Propósito Educativo

Este proyecto ha sido desarrollado y compartido específicamente para estudiantes como material de aprendizaje, demostrando:

- Implementación de CRUD básico
- Separación de responsabilidades
- Buenas prácticas de programación web
- Estructura de proyecto organizada

## 📋 Funcionalidades Detalladas

| Función | Descripción | Estado |
|---------|-------------|---------|
| ➕ Agregar | Formulario completo para nuevas personas | ✅ Completo |
| 📋 Listar | Tabla con todos los registros y acciones | ✅ Completo |
| ✏️ Editar | Formulario pre-cargado para modificaciones | ✅ Completo |
| 🗑️ Eliminar | Confirmación y eliminación segura | ✅ Completo |

## 📞 Contacto y Soporte

¿Preguntas sobre el proyecto? ¡Estamos aquí para ayudar a los estudiantes!

- 📧 Email: [tu-email@ejemplo.com]
- 📚 Documentación: Ver archivos del proyecto
- 🐛 Reportar problemas: Issues de GitHub

---

### 📝 Notas para Estudiantes

Este proyecto está diseñado como herramienta de aprendizaje. Te animamos a:
- 🔍 Explorar el código fuente
- 🧪 Experimentar con modificaciones
- 💡 Proponer mejoras
- 🤝 Colaborar con otros estudiantes

---

**¡Happy Coding! 🚀**
