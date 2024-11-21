package ec.edu.uce.Dominio;

import ec.edu.uce.Util.ValidacionItemDevolucion;

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

    // Constructor completo con validaciones
    public ItemDevolucion(int idItemDevolucion, String producto, int cantidad, String razonDevolucion,
                          String estado, Date fechaDevolucion, String observaciones) {
        if (ValidacionItemDevolucion.validarId(idItemDevolucion)) {
            this.idItemDevolucion = idItemDevolucion;
        } else {
            System.out.println("ID de devolución inválido");
        }
        if (ValidacionItemDevolucion.validarNombreProducto(producto)) {
            this.producto = producto;
        } else {
            System.out.println("Nombre del producto inválido");
        }
        if (ValidacionItemDevolucion.validarCantidad(cantidad)) {
            this.cantidad = cantidad;
        } else {
            System.out.println("Cantidad inválida");
        }
        if (ValidacionItemDevolucion.validarRazonDevolucion(razonDevolucion)) {
            this.razonDevolucion = razonDevolucion;
        } else {
            System.out.println("Razón de devolución inválida");
        }
        if (ValidacionItemDevolucion.validarEstado(estado)) {
            this.estado = estado;
        } else {
            System.out.println("Estado inválido: debe ser 'Pendiente' o 'Aprobado'");
        }
        if (ValidacionItemDevolucion.validarFechaDevolucion(fechaDevolucion)) {
            this.fechaDevolucion = fechaDevolucion;
        } else {
            System.out.println("Fecha de devolución inválida");
        }
        if (ValidacionItemDevolucion.validarObservaciones(observaciones)) {
            this.observaciones = observaciones;
        } else {
            System.out.println("Observaciones inválidas");
        }
    }

    // Getters y Setters con validaciones

    public int getIdItemDevolucion() {
        return idItemDevolucion;
    }

    public void setIdItemDevolucion(int idItemDevolucion) {
        if (ValidacionItemDevolucion.validarId(idItemDevolucion)) {
            this.idItemDevolucion = idItemDevolucion;
        } else {
            throw new IllegalArgumentException("ID inválido: debe ser un número entero positivo.");
        }
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        if (ValidacionItemDevolucion.validarNombreProducto(producto)) {
            this.producto = producto;
        } else {
            throw new IllegalArgumentException("Producto inválido: debe contener solo letras y espacios.");
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (ValidacionItemDevolucion.validarCantidad(cantidad)) {
            this.cantidad = cantidad;
        } else {
            throw new IllegalArgumentException("Cantidad inválida: debe ser un número entero positivo.");
        }
    }

    public String getRazonDevolucion() {
        return razonDevolucion;
    }

    public void setRazonDevolucion(String razonDevolucion) {
        if (ValidacionItemDevolucion.validarRazonDevolucion(razonDevolucion)) {
            this.razonDevolucion = razonDevolucion;
        } else {
            throw new IllegalArgumentException("Razón de devolución inválida: debe contener solo letras y espacios.");
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (ValidacionItemDevolucion.validarEstado(estado)) {
            this.estado = estado;
        } else {
            throw new IllegalArgumentException("Estado inválido: debe ser 'Pendiente' o 'Aprobado'.");
        }
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        if (ValidacionItemDevolucion.validarFechaDevolucion(fechaDevolucion)) {
            this.fechaDevolucion = fechaDevolucion;
        } else {
            throw new IllegalArgumentException("Fecha de devolución inválida: no puede ser nula.");
        }
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        if (ValidacionItemDevolucion.validarObservaciones(observaciones)) {
            this.observaciones = observaciones;
        } else {
            throw new IllegalArgumentException("Observaciones inválidas: no pueden estar vacías.");
        }
    }
}
