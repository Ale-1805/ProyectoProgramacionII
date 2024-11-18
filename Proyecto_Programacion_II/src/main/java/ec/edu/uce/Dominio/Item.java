package ec.edu.uce.Dominio;

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

    // Constructor completo
    public Item(int idItem, String producto, int cantidad, double precioUnitario, String estado, String ubicacion) {
        this.idItem = idItem;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = cantidad * precioUnitario; // Calcula subtotal automáticamente
        this.estado = estado;
        this.ubicacion = ubicacion;
    }

    // Getters y Setters
    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
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
        calcularSubtotal(); // Recalcula subtotal al cambiar cantidad
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
        calcularSubtotal(); // Recalcula subtotal al cambiar precio
    }

    public double getSubtotal() {
        return subtotal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // Métodos adicionales
    private void calcularSubtotal() {
        this.subtotal = this.cantidad * this.precioUnitario;
    }
}
