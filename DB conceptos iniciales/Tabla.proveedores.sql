CREATE DATABASE gestion_proveedores;
USE gestion_proveedores;





CREATE TABLE proveedores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    contacto VARCHAR(100),
    direccion TEXT
);

