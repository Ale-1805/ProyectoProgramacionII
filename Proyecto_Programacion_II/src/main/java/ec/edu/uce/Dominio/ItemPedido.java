package ec.edu.uce.Dominio;
import java.time.LocalDate;

public class ItemPedido {
    private String estado;
    private int idItem;
    private int cantidad;
    private Producto producto;
    private double precioUnitario;

    // Constructor
    public ItemPedido(){
        idItem = 0;
        cantidad = 0;
        precioUnitario = 0.0;
        estado = "S/N";
    }
    public ItemPedido(int idItem, int cantidad, String producto, double precioUnitario, String estado) {
        this.idItem = idItem;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.estado = estado;
    }

    // Getters y Setters
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
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

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    // Métodos
    public double calcularSubTotal() {
        return cantidad * precioUnitario;
    }

    public void actualizarCantidad(int nuevaCantidad) {
        this.cantidad = nuevaCantidad;
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    // Metodo toString
    //@Override
    public String toString() {
        return String.format(
                "ItemPedido [ID: %d, Producto: %s, Cantidad: %d, Precio Unitario: %.2f, Estado: %s, Subtotal: %.2f]",
                idItem, producto, cantidad, precioUnitario, estado, calcularSubTotal()
        );
    }

}
