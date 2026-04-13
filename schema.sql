CREATE DATABASE IF NOT EXISTS sacramentum_db;
USE sacramentum_db;

CREATE TABLE bautismos (
    id_bautismo INT AUTO_INCREMENT PRIMARY KEY,
    nombre_bautizado VARCHAR(100) NOT NULL,
    fecha_nacimiento DATE,
    fecha_bautismo DATE NOT NULL,
    nombre_padre VARCHAR(100),
    nombre_madre VARCHAR(100),
    ministro VARCHAR(100),
    tomo INT,
    folio INT
);
