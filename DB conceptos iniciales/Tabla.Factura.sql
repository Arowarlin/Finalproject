CREATE TABLE facturas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    numero_factura VARCHAR(50) NOT NULL,
    fecha DATE NOT NULL,
    monto DECIMAL(10, 2) NOT NULL,
    proveedor_id INT NOT NULL,
    estado ENUM('pendiente', 'pagada') NOT NULL DEFAULT 'pendiente',
    FOREIGN KEY (proveedor_id) REFERENCES proveedores(id)
);
