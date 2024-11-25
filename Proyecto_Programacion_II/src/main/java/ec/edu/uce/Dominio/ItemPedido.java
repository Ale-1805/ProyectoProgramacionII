package ec.edu.uce.Dominio;

import ec.edu.uce.Util.Validaciones;

public class ItemPedido {
    private int idItem;
    private String producto;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;
    private String estado;
    private String ubicacion;

    // Constructor vacío
    public ItemPedido() {
    }

    // Constructor con parámetros
    public ItemPedido(int idItem, String producto, int cantidad, double precioUnitario, String estado, String ubicacion) {
        if (Validaciones.validarId(idItem)) {
            this.idItem = idItem;
        } else {
            throw new IllegalArgumentException("ID inválido");
        }
        if (Validaciones.validarNombre(producto)) {
            this.producto = producto;
        } else {
            throw new IllegalArgumentException("Nombre del producto inválido");
        }
        if (Validaciones.validarCantidad(cantidad)) {
            this.cantidad = cantidad;
        } else {
            throw new IllegalArgumentException("Cantidad inválida");
        }
        if (Validaciones.validarPrecio(precioUnitario)) {
            this.precioUnitario = precioUnitario;
        } else {
            throw new IllegalArgumentException("Precio inválido");
        }
        if (Validaciones.validarEstadoPedido(estado)) {
            this.estado = estado;
        } else {
            throw new IllegalArgumentException("Estado inválido");
        }
        if (Validaciones.validarUbicacion(ubicacion)) {
            this.ubicacion = ubicacion;
        } else {
            throw new IllegalArgumentException("Ubicación inválida");
        }
        calcularSubtotal(); // Calcula el subtotal
    }

    // Getters y Setters con validaciones
    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        if (Validaciones.validarId(idItem)) {
            this.idItem = idItem;
        } else {
            System.out.println("ID inválido. No se realizó el cambio.");
        }
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        if (Validaciones.validarNombre(producto)) {
            this.producto = producto;
        } else {
            System.out.println("Nombre del producto inválido. No se realizó el cambio.");
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (Validaciones.validarCantidad(cantidad)) {
            this.cantidad = cantidad;
            calcularSubtotal(); // Recalcula subtotal al cambiar cantidad
        } else {
            System.out.println("Cantidad inválida. No se realizó el cambio.");
        }
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (Validaciones.validarPrecio(precioUnitario)) {
            this.precioUnitario = precioUnitario;
            calcularSubtotal(); // Recalcula subtotal al cambiar precio
        } else {
            System.out.println("Precio inválido. No se realizó el cambio.");
        }
    }

    public double getSubtotal() {
        return subtotal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (Validaciones.validarEstadoPedido(estado)) {
            this.estado = estado;
        } else {
            System.out.println("Estado inválido. No se realizó el cambio.");
        }
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        if (Validaciones.validarUbicacion(ubicacion)) {
            this.ubicacion = ubicacion;
        } else {
            System.out.println("Ubicación inválida. No se realizó el cambio.");
        }
    }

    // Métodos adicionales
    private void calcularSubtotal() {
        this.subtotal = this.cantidad * this.precioUnitario;
    }
}
