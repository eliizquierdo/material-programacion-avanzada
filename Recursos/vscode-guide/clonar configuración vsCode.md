# 📝 Guía Completa: Migración de Configuración en Visual Studio Code

Esta guía detalla paso a paso cómo clonar tu entorno de desarrollo personalizado (configuraciones, extensiones, atajos de teclado y fragmentos de código) desde una máquina de origen a una máquina de destino sin perder ningún detalle.

---

## 🚀 Método 1: Sincronización Nativa (Settings Sync)
Es la solución oficial basada en la nube. Sincroniza automáticamente los ajustes, atajos, extensiones, snippets y el estado de la interfaz de usuario.

### Pasos en la Máquina de Origen:
1. Abre VS Code.
2. Haz clic en el icono del **engranaje** ⚙️ en la esquina inferior izquierda o abre la paleta de comandos (`Ctrl+Shift+P` / `Cmd+Shift+P`) y escribe `Ajustes de sincronización: activar`.
3. Haz clic en **"Turn on Settings Sync..."** (Activar sincronización de ajustes).
4. Selecciona las casillas de verificación de los elementos que deseas incluir (Ajustes, Atajos, Fragmentos de código, Extensiones, Estado).
5. Haz clic en **Sign in & Turn on** (Iniciar sesión y activar).
6. Selecciona si prefieres autenticarte con tu cuenta de **GitHub** o de **Microsoft**. Sigue las instrucciones del navegador.

### Pasos en la Máquina de Destino:
1. Descarga e instala la última versión de VS Code.
2. Haz clic en el icono de **Cuenta** (silueta de usuario en la esquina inferior izquierda).
3. Selecciona **"Sign in to Sync Settings"** (Iniciar sesión para sincronizar ajustes).
4. Elige el mismo proveedor (GitHub o Microsoft) e inicia sesión con la misma cuenta.
5. VS Code detectará tu copia de seguridad e instalará silenciosamente tus extensiones y preferencias en segundo plano.

---

## 📂 Método 2: Copia Manual Local (Modo Offline o Redes Privadas)
Ideal si trabajas sin conexión a internet, en entornos corporativos restrictivos o si prefieres resguardar tus datos en un almacenamiento físico (pendrive, disco externo).

La configuración se divide en dos componentes independientes: **Ajustes de Usuario** y **Extensiones**.

### 1. Directorio de Ajustes del Usuario (`User`)
Esta carpeta contiene el archivo `settings.json`, `keybindings.json` (atajos de teclado), las tareas personalizadas (`tasks.json`) y la subcarpeta `snippets/`. 

Debes copiar los contenidos de la carpeta **`User`** de la máquina antigua y pegarlos exactamente en la misma ruta de la máquina nueva dependiendo de tu sistema operativo:

* **Windows:** `%APPDATA%\Code\User\` 
* **macOS:** `$HOME/Library/Application Support/Code/User/`
* **Linux:** `$HOME/.config/Code/User/`

### 2. Directorio de Extensiones (`.vscode/extensions`)
Las extensiones instaladas se almacenan fuera de la carpeta de configuración principal de la aplicación. Para moverlas de forma física, copia el contenido íntegro de la carpeta **`extensions`** según tu sistema:

* **Windows:** `%USERPROFILE%\.vscode\extensions` 
* **macOS:** `~/.vscode/extensions` 
* **Linux:** `~/.vscode/extensions` 

> **Nota:** Al migrar carpetas de extensiones entre sistemas operativos diferentes (ej. de Windows a macOS), algunas extensiones que dependen de binarios compilados nativos podrían requerir una reinstalación automática o actualización dentro del entorno nuevo.

---

## 💻 Método 3: Automatización por Consola (CLI)
Para desarrolladores que gestionan dotfiles, scripts de automatización o prefieren resolver instalaciones de forma masiva mediante la terminal.

### 1. Exportar el listado de extensiones (Máquina de Origen)
El comando nativo `code --list-extensions` lista los identificadores únicos de cada extensión activa. Redirige este output a un archivo de texto plano ejecutando esto en tu terminal:

`code --list-extensions > extensions.txt`

### 2. Instalar desde el listado (Máquina de Destino)
Copia el archivo `extensions.txt` a tu nueva máquina y ejecuta el siguiente comando en la terminal para instalarlas en lote.

**En Linux / macOS:**
`cat extensions.txt | xargs -L 1 code --install-extension`

**En Windows (PowerShell):**
`Get-Content extensions.txt | ForEach-Object { code --install-extension $_ }`

---

<p align="center">
  <a rel="license" href="http://creativecommons.org/licenses/by-sa/4.0/">
    <img alt="Licencia Creative Commons" style="border-width:0" src="https://i.creativecommons.org/l/by-sa/4.0/88x31.png" />
  </a>
  <br>
  <strong>Prof. Elizabeth Izquierdo</strong>
</p>

