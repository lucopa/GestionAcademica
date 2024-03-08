# Guía de Proyecto con Spring Web

Este proyecto utiliza Spring Web como su framework principal para el desarrollo. A continuación, se detalla el proceso para configurar y ejecutar el proyecto.

## Configuración del Proyecto

Para iniciar un proyecto con Spring, es necesario tener instalada el extension pack de Spring en Visual Studio Code y seguir estos pasos:

1. Ctrl + Shift + P: Abre la paleta de comandos de Visual Studio Code.
2. Escribir: `create maven project`.
3. Seleccionar "Spring Initializr" en la pantalla que aparece.
4. Ir configurándolo conforme nuestras preferencias de lo que vayamos a necesitar.
5. En uno de los pasos te pedirá que dependencias quieres añadir y de primeras incluiremos las 4 principales dependencias Lombok, DevTools, Spring JPA y MYsql Driver.


## Estructura del Proyecto

El proyecto está organizado en las siguientes carpetas dentro de `src`:

- **`main`**: Contiene las carpetas `model`, `controller`, `repository`, y `conf`.
    - **`model`**: Define las clases Java utilizadas como modelos en el proyecto.
    - **`controller`**: Contiene los controladores del proyecto.
    - **`repository`**: Gestiona las interfaces necesarias en el proyecto.
    - **`conf`**: Se encarga de la configuración de seguridad de la aplicación, si es necesaria.

- `resources`: Contiene los archivos relacionados con HTML.
    - **`static`**: Aquí se pueden almacenar imágenes o logos representativos de la entidad.
    - **`templates`**: Contiene las plantillas utilizadas en el proyecto para cada uno de los modelos.
    - Otros archivos, como `application.properties`, además de un `index.html` y plantillas por defecto.

Fuera de `src`, se encuentra la carpeta `docs`, donde se pueden encontrar imágenes para el `readme` u otros archivos de documentación, como PDFs o diagramas de clases. También se encuentra la carpeta `stack-spring`, que contiene el contenedor Docker necesario para ejecutar el proyecto, junto con un archivo `.env` que incluye la contraseña del gestor de base de datos.

## Ejecución del Proyecto

Para ejecutar el proyecto, asegúrate de tener los contenedores en funcionamiento y correctamente montados:

```bash
docker-compose -f docker-compose.yml up -d
