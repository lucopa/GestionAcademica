# Guía de Configuración para Proyectos con Spring Web

## Introducción

Este documento proporciona una guía paso a paso para configurar y ejecutar un proyecto con Spring Web.

## Requisitos Previos

Antes de comenzar, asegúrate de tener instalada la extensión de Spring en Visual Studio.

## Creación del Proyecto

Creamos el proyecto tal y como viene en los apuntes del profesor siguiente sus mismos pasos y añadiendo las dependencias.

## Estructura del Proyecto

El proyecto debe organizarse de la siguiente manera:

- `src`: Directorio principal del código fuente.
    - `main`: Contiene las fuentes principales del proyecto.
        - `java`: Directorio de código fuente Java.
            - `com`: Paquete raíz del proyecto.
                - `example`: Nombre del proyecto.
                    - `controller`: Controladores del proyecto.
                    - `model`: Modelos de datos.
                    - `repository`: Repositorios de datos.
                    - `config`: Configuraciones adicionales.
        - `resources`: Recursos del proyecto.
            - `static`: Archivos estáticos (imágenes, CSS, JS).
            - `templates`: Plantillas HTML.

## Configuración Adicional

- `docs`: Documentación del proyecto.
    - `images`: Imágenes para la documentación.
    - `diagrams`: Diagramas relevantes.

- `docker`: Configuraciones para Docker.
    - `stack`: Contenedor Docker para el proyecto.
        - `Dockerfile`: Archivo de configuración Docker.
        - `.env`: Variables de entorno.

## Ejecución del Proyecto

Para ejecutar el proyecto, sigue estos pasos:

1. Asegúrate de que los contenedores estén en funcionamiento utilizando Docker Compose:

    ```bash
    docker-compose up -d
    ```

2. Inicia la aplicación Spring con este comando o dandole al boton PLAY en la extensión de Spring:

    ```bash
    mvn spring-boot:run
    ```

## Usuarios para entrar
Puedes acceder con el usuario luis y la contraseña Secreto_123 (es gestor)
El segundo usuario es nieves y contraseña Secreto_123 (alumna)
El tercer usuario es maria y contraseña Secreto_123 (profesora)





