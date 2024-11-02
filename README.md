# Proyecto de Gestión de Eventos

Este proyecto es una aplicación completa para la gestión de eventos, que incluye una API RESTful desarrollada en Spring Boot, una base de datos MySQL y una interfaz gráfica de usuario en Java Swing para la administración de los eventos y personas asociadas a estos.

## Descripción General

La aplicación permite:
- Crear, listar, editar y eliminar eventos.
- Registrar personas a cada evento y gestionar sus datos.
- Proveer una API RESTful para interactuar con el sistema de forma remota.
- Usar una interfaz gráfica de Java Swing para administrar eventos y personas localmente.

## Tecnologías Utilizadas

- *Java*: Lenguaje principal del proyecto.
- *Spring Boot*: Framework para el desarrollo de la API.
- *MySQL*: Base de datos para almacenamiento de datos.
- *Java Swing*: Para la creación de la interfaz gráfica de usuario.
- *Maven*: Gestión de dependencias y construcción del proyecto.
- *RESTful API*: Arquitectura para la comunicación cliente-servidor.

---

## Estructura del Proyecto

1. *API de Spring Boot*: Proporciona una serie de endpoints para la administración de eventos y personas.
2. *Base de Datos MySQL*: Contiene las tablas y relaciones necesarias para almacenar eventos y personas.
3. *Interfaz en Java Swing*: Permite interactuar con el sistema desde una aplicación de escritorio.

---

## Configuración y Ejecución
# Configuración de conexión a la base de datos
spring.datasource.url=jdbc:mysql://0.0.0.0:3306/gestion_eventos
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Configuración del servidor para conexiones externas
server.address=0.0.0.0
server.port=8080
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

#Uso de la Interfaz Gráfica en Java Swing
#La interfaz en Java Swing permite al usuario:

Ver una lista de eventos y personas.
Crear, actualizar y eliminar eventos.
Registrar personas en eventos y ver la lista de participantes.
Editar la información de las personas

# Requisitos Previos
Java 11 o superior
Maven
MySQL
Acceso a la red para la API
