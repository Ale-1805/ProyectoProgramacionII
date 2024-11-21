package ec.edu.uce.Dominio;

import ec.edu.uce.Util.ValidacionItem;

public class Item {
    private int idItem;
    private String producto;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;
    private String estado;
    private String ubicacion;

    // Constructor vacío
    public Item() {
    }

    // Constructor con parámetros
    public Item(int idItem, String producto, int cantidad, double precioUnitario, String estado, String ubicacion) {
        if (ValidacionItem.validarId(idItem)) {
            this.idItem = idItem;
        } else {
            throw new IllegalArgumentException("ID inválido");
        }
        if (ValidacionItem.validarNombre(producto)) {
            this.producto = producto;
        } else {
            throw new IllegalArgumentException("Nombre del producto inválido");
        }
        if (ValidacionItem.validarCantidad(cantidad)) {
            this.cantidad = cantidad;
        } else {
            throw new IllegalArgumentException("Cantidad inválida");
        }
        if (ValidacionItem.validarPrecio(precioUnitario)) {
            this.precioUnitario = precioUnitario;
        } else {
            throw new IllegalArgumentException("Precio inválido");
        }
        if (ValidacionItem.validarEstado(estado)) {
            this.estado = estado;
        } else {
            throw new IllegalArgumentException("Estado inválido");
        }
        if (ValidacionItem.validarUbicacion(ubicacion)) {
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
        if (ValidacionItem.validarId(idItem)) {
            this.idItem = idItem;
        } else {
            System.out.println("ID inválido. No se realizó el cambio.");
        }
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        if (ValidacionItem.validarNombre(producto)) {
            this.producto = producto;
        } else {
            System.out.println("Nombre del producto inválido. No se realizó el cambio.");
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (ValidacionItem.validarCantidad(cantidad)) {
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
        if (ValidacionItem.validarPrecio(precioUnitario)) {
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
        if (ValidacionItem.validarEstado(estado)) {
            this.estado = estado;
        } else {
            System.out.println("Estado inválido. No se realizó el cambio.");
        }
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        if (ValidacionItem.validarUbicacion(ubicacion)) {
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
