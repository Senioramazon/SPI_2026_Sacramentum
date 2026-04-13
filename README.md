# SPI_2026_Sacramentum

Sacramentum: Sistema de Gestión Parroquial
Seminario de Práctica de Informática
Institución: Universidad Siglo 21

Autor: Andres Ignacio Utz Cardenas

Tecnologías: Java + MySQL

# 1.- Descripción del Proyecto
* Sacramentum es un prototipo operacional diseñado para resolver la problemática de la gestión documental y administrativa en instituciones religiosas, específicamente en la Diócesis de Villa María.
* El sistema busca reemplazar los registros físicos (libros de actas) por una base de datos centralizada, permitiendo la agilidad en la búsqueda de información sacramental y la preservación digital de la historia parroquial.

# 2.- Objetivos del Prototipo
Este prototipo cumple con los requisitos del Módulo 1 del seminario, enfocándose en:
* Justificación del Negocio: Digitalización de procesos críticos de secretaría.
* PUD (Proceso Unificado de Desarrollo): Aplicación de un enfoque iterativo e incremental.
* Persistencia: Implementación de un modelo relacional en MySQL.
* Funcionalidad: Registro y búsqueda de actas de Bautismo (Casos de Uso prioritarios).

# 3.- Requisitos del Sistema
Para ejecutar este proyecto, necesitas contar con:
* Java JDK 8 o superior.
* MySQL Server (versión 5.7 o 8.0).
* MySQL Connector/J (archivo .jar del controlador JDBC).
* Un IDE como IntelliJ IDEA, Eclipse o NetBeans.

# 4.- Instalación y Configuración
## Paso 1: Base de Datos
Ejecuta el script incluido en el archivo schema.sql en tu terminal de MySQL o Workbench para crear la estructura necesaria:
<code>
SOURCE path/to/schema.sql;
</code>

## Paso 2: Configuración de Conexión
En el archivo src/ConexionBD.java, asegúrate de que las credenciales coincidan con tu configuración local:
<code>
private static final String USER = "tu_usuario"; 
private static final String PASSWORD = "tu_contraseña";
</code>
## Paso 3: Ejecución
* Agrega el conector de MySQL a las librerías de tu proyecto.
* Compila y ejecuta la clase Main.java.

# 5.- Casos de Uso Implementados (Prototipo Operacional)
Siguiendo la metodología de Kendall & Kendall (2011), este prototipo operacional incluye:
* CU01 - Registro de Bautismo: Permite persistir los datos del bautizado, padres y localización en libros físicos (tomo/folio).
* CU02 - Búsqueda de Actas: Filtra registros por nombre para agilizar la emisión de certificados.
