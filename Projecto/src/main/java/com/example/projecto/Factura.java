package com.example.projecto;

public class Factura {
    private int id;
    private String numeroFactura;
    private String fecha;
    private double monto;
    private int proveedorId;
    private String estado;

    // Constructor
    public Factura(int id, String numeroFactura, String fecha, double monto, int proveedorId, String estado) {
        this.id = id;
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.monto = monto;
        this.proveedorId = proveedorId;
        this.estado = estado;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getProveedorId() {
        return proveedorId;
    }

    public void setProveedorId(int proveedorId) {
        this.proveedorId = proveedorId;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
