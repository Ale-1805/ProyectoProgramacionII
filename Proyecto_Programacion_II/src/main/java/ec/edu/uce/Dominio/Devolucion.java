package ec.edu.uce.Dominio;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Devolucion {
    private String sucursal;
    private String codigoDevolucion;
    private String fecha;
    private String estado;
    private Producto[] productos; // Relación con Producto
    private Proveedor[] proveedores; // Relación con Proveedor
    private ItemDevolucion[] itemDevolver; // Relación con ItemDevolver
    private Pedido[] pedidos; // Relación con Pedido

    // Constructor vacío
    public Devolucion() {
        this.sucursal = "S/N";
        this.codigoDevolucion = "S/N";
        this.fecha = "S/N";
        this.estado = "S/N";
    }

    // Constructor para inicializar todos los atributos, exceptuando los arreglos
    public Devolucion(String sucursal, String estado, String fecha, String codigoDevolucion) {
        this.sucursal = sucursal;
        this.codigoDevolucion = codigoDevolucion; // Corregido: el estado debe ser el código de devolución
        this.fecha = fecha;
        this.estado = estado;
    }

    // Relación con Producto
    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    // Relación con Proveedor
    public Proveedor[] getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedor[] proveedores) {
        this.proveedores = proveedores;
    }

    // Relación con ItemDevolver
    public ItemDevolucion[] getItemDevolver() {
        return itemDevolver;
    }

    public void setItemDevolver(ItemDevolucion[] itemDevolver) {
        this.itemDevolver = itemDevolver;
    }

    // Relación con Pedido
    public Pedido[] getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedido[] pedidos) {
        this.pedidos = pedidos;
    }

    // Getter y Setter para Sucursal
    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    // Getter para el Código de Devolución
    public String getCodigoDevolucion() {
        return codigoDevolucion;
    }

    // Generar un código de devolución único
    public String generarCodigoDevolucion() {
        return "DEV-" + (int) (Math.random() * 10000); // Código aleatorio de 4 dígitos
    }

    // Getter para Fecha
    public String getFecha() {
        return fecha;
    }

    // Obtener la fecha actual
    private String obtenerFechaActual() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return formatoFecha.format(date);
    }

    // Getter y Setter para Estado
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Metodo toString para mostrar los datos de la devolución
    @Override
    public String toString() {
        return "Devolucion{" +
                "Sucursal='" + sucursal + '\'' +
                ", Código de Devolución='" + codigoDevolucion + '\'' +
                ", Fecha='" + fecha + '\'' +
                ", Estado='" + estado + '\'' +
                '}';
    }
}