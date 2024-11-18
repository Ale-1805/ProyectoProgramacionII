package ec.edu.uce.Dominio;

import java.util.Date;

public class ItemDevolucion {
    private int idItemDevolucion;
    private String producto;
    private int cantidad;
    private String razonDevolucion;
    private String estado;
    private Date fechaDevolucion;
    private String observaciones;
    // Constructor vacío
    public ItemDevolucion() {
    }
    // Constructor completo
    public ItemDevolucion(int idItemDevolucion, String producto, int cantidad, String razonDevolucion, String estado, Date fechaDevolucion, String observaciones) {
        this.idItemDevolucion = idItemDevolucion;
        this.producto = producto;
        this.cantidad = cantidad;
        this.razonDevolucion = razonDevolucion;
        this.estado = estado;
        this.fechaDevolucion = fechaDevolucion;
        this.observaciones = observaciones;
    }
    // Getters y Setters
    public int getIdItemDevolucion() {
        return idItemDevolucion;
    }
    public void setIdItemDevolucion(int idItemDevolucion) {
        this.idItemDevolucion = idItemDevolucion;
    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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

}
