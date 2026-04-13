# SPI_2026_Sacramentum
Sacramentum: Sistema de Gestión de Registros Sacramentales y Catequesis para la Diócesis de Villa María. Proyecto de Seminario de Práctica de Informática

Introducción

Las parroquias desempeñan un rol fundamental en la comunidad, administrando no solo la vida pastoral sino también un extenso volumen de registros documentales con valor legal y canónico. Tradicionalmente, la información sobre sacramentos (bautismos, comuniones, confirmaciones y matrimonios) y la gestión de la catequesis se ha llevado en libros físicos. Este proyecto propone el desarrollo de un sistema informático que digitalice y optimice estos procesos administrativos, asegurando la integridad de los datos.

Justificación

Actualmente, la búsqueda de un acta de bautismo (requisito indispensable para otros sacramentos como el matrimonio) implica una revisión manual de libros antiguos, lo cual consume mucho tiempo de la secretaría y expone documentos históricos frágiles a un deterioro irreversible. Además, la gestión de inscripciones para catequesis suele carecer de una base de datos centralizada, dificultando el seguimiento de los grupos. La implementación de este sistema reducirá los tiempos de búsqueda, protegerá el patrimonio documental mediante copias de seguridad y mejorará la atención a los feligreses.

Definiciones del proyecto y del sistema

El proyecto consiste en el desarrollo de un sistema de gestión que permita el registro, modificación, búsqueda rápida y emisión de certificados de sacramentos, así como la administración de los inscriptos en los distintos niveles de catequesis. El alcance del prototipo operacional se limitará inicialmente al módulo de Bautismos y la generación de sus respectivos certificados, sentando la base arquitectónica (base de datos y lógica de negocio) para los futuros módulos.

Elicitación

Para el levantamiento de requerimientos funcionales y no funcionales se utilizarán las siguientes técnicas:

Entrevistas semiestructuradas: Dirigidas a los secretarios parroquiales y al sacerdote encargado, para entender sus necesidades diarias.

Observación directa: Del proceso actual de búsqueda de información y llenado de actas físicas cuando un feligrés se acerca a la oficina.

Análisis de la documentación: Revisión de los formatos actuales de certificados, libros de registro y planillas de inscripción de catequesis para modelar la base de datos correctamente.

Conocimiento del negocio
El modelo de negocio parroquial gira en torno a la atención pastoral y administrativa. El flujo crítico comienza cuando un feligrés solicita un servicio (por ejemplo, una fe de bautismo). El secretario debe solicitar datos aproximados (año y mes estimados), dirigirse al archivo físico, buscar el tomo correspondiente, ubicar el folio exacto y transcribir los datos a un nuevo documento impreso que luego debe ser firmado por el párroco y sellado. Este proceso es netamente secuencial, dependiente de la memoria institucional y vulnerable a errores de transcripción o pérdida de datos.

Propuesta de solución

Se propone desarrollar un software utilizando el Proceso Unificado de Desarrollo (PUD), asegurando un enfoque iterativo e incremental enfocado en mitigar los riesgos desde las primeras fases.

Persistencia de datos: Se utilizará un motor de base de datos MySQL, ideal para manejar de forma relacional y segura las entidades interconectadas (Feligrés, Sacramento, Parroquia, Sacerdote, Libro, Folio).

Desarrollo del Sistema: Se empleará Java como lenguaje de programación mediante un entorno de desarrollo integrado (IDE).

Prototipo Operacional: Siguiendo los conceptos de Kendall & Kendall (2011), se construirá un prototipo operacional. No será un modelo desechable, sino la primera iteración funcional (enfocada en el ABM de Bautismos) a la que se irán integrando los demás módulos de sacramentos en el futuro. El código fuente y los scripts de inicialización de la base de datos estarán versionados y disponibles en un repositorio de GitHub [Nota: Aquí deberás insertar tu enlace al momento de la entrega].

Inicio del análisis: casos de uso

Actor Principal: Secretario Parroquial.

CU01 - Registrar Nuevo Bautismo: El actor ingresa los datos del bautizado, padres, padrinos y ministro que ofició el sacramento. El sistema valida la información y la persiste en la base de datos MySQL, asignando un número de tomo y folio virtual.

CU02 - Buscar Registro Sacramental: El actor ingresa parámetros de búsqueda (DNI, nombre, apellido, o rango de fechas). El sistema consulta la base de datos y devuelve las coincidencias exactas y parciales.

CU03 - Emitir Certificado de Bautismo: A partir de un registro existente buscado mediante el CU02, el sistema genera un documento en formato PDF con el formato oficial de la diócesis, listo para ser impreso y firmado.

CU04 - Inscribir en Catequesis: El actor registra a un niño en un nivel específico (ej. 1° año de Comunión) y lo vincula a la base de datos general de feligreses.
