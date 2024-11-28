package ec.edu.uce.Dominio;

import ec.edu.uce.Util.Validaciones;

import java.util.Date;

public class ItemDevolucion {
    private int idItemDevolucion;
    private Producto producto;
    private int cantidad;
    private String razonDevolucion;
    private String estado;
    private Date fechaDevolucion;
    private String observaciones;

    // Constructor vacío
    public ItemDevolucion() {
        this.idItemDevolucion = 0;
        this.cantidad = 0;
        this.razonDevolucion = "S/N";
        this.estado = "S/N";
        this.fechaDevolucion = null;
        this.observaciones = "S/N";
    }

    // Constructor completo con validaciones
    public ItemDevolucion(int idItemDevolucion, String producto, int cantidad, String razonDevolucion,
                          String estado, Date fechaDevolucion, String observaciones) {
            this.idItemDevolucion = idItemDevolucion;
            this.cantidad = cantidad;
            this.razonDevolucion = razonDevolucion;
            this.estado = estado;
            this.fechaDevolucion = fechaDevolucion;
    }

    // Getters y Setters
    public int getIdItemDevolucion() {
        return idItemDevolucion;
    }

    public void setIdItemDevolucion(int idItemDevolucion) {
        this.idItemDevolucion = idItemDevolucion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getRazonDevolucion() {
        return razonDevolucion;
    }

    public void setRazonDevolucion(String razonDevolucion) {
        this.razonDevolucion = razonDevolucion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    // Métodos funcionales
    public void aprobarDevolucion() {
        this.estado = "Aprobada";
    }

    public void rechazarDevolucion(String motivoRechazo) {
        this.estado = "Rechazada";
        this.observaciones = motivoRechazo;
    }

    public boolean validarCantidad(int cantidadDisponible) {
        return this.cantidad <= cantidadDisponible;
    }

    // toString sobrescrito
    @Override
    public String toString() {
        return String.format("ItemDevolucion [ID: %d, Producto: %s, Cantidad: %d, Razón: %s, Estado: %s, Fecha: %s, Observaciones: %s]",
                idItemDevolucion, producto, cantidad, razonDevolucion, estado, fechaDevolucion, observaciones);
    }
}
