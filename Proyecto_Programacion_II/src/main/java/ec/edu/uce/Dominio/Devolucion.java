package ec.edu.uce.Dominio;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Devolucion {
    private String sucursal;
    private String codigoDevolucion;
    private String fecha;  // Se mantiene como String
    private String estado;
    private Producto[] productos; // Relación con Producto
    private int numeroDeProductos;
    private Proveedor[] proveedores; // Relación con Proveedor
    private int numeroDeProveedores;
    private ItemDevolucion[] itemDevolucion; // Relación con ItemDevolver
    private int numeroDeItemsDevolucion;
    private Pedido[] pedidos; // Relación con Pedido
    private int numeroDePedidos;

    // Constructor vacío
    public Devolucion() {
        this.sucursal = "S/S";
        this.codigoDevolucion = "S/C";
        this.fecha = "S/F";  // Valor por defecto para fecha
        this.estado = "S/E";
        this.numeroDeProductos = 0;
        this.numeroDeProveedores = 0;
        this.numeroDeItemsDevolucion = 0;
        this.numeroDePedidos = 0;
    }

    // Constructor para inicializar todos los atributos
    public Devolucion(String sucursal, String estado, String fecha, String codigoDevolucion) {
        this.sucursal = sucursal;
        this.codigoDevolucion = codigoDevolucion;
        this.fecha = fecha;
        this.estado = estado;
        this.numeroDeProductos = numeroDeProductos;
        this.numeroDeProveedores = 0;
        this.numeroDeItemsDevolucion = 0;
        this.numeroDePedidos = 0;
    }

    // Relación con Producto
    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
        this.numeroDeProductos = productos.length;  // Actualiza el número de productos
    }

    // Relación con Proveedor
    public Proveedor[] getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedor[] proveedores) {
        this.proveedores = proveedores;
        this.numeroDeProveedores = proveedores.length;  // Actualiza el número de proveedores
    }

    // Relación con ItemDevolver
    public ItemDevolucion[] getItemDevolver() {
        return itemDevolucion;
    }

    public void setItemDevolver(ItemDevolucion[] itemDevolver) {
        this.itemDevolucion = itemDevolucion;
        this.numeroDeItemsDevolucion = itemDevolver.length;  // Actualiza el número de items a devolver
    }

    // Relación con Pedido
    public Pedido[] getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedido[] pedidos) {
        this.pedidos = pedidos;
        this.numeroDePedidos = pedidos.length;  // Actualiza el número de pedidos
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

    // Obtener la fecha actual como String
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
    public int getNumeroDeProductos() {
        return numeroDeProductos;
    }

    public int getNumeroDeProveedores() {
        return numeroDeProveedores;
    }

    public int getNumeroDeItemsDevolver() {
        return numeroDeItemsDevolucion;
    }

    public int getNumeroDePedidos() {
        return numeroDePedidos;
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

    // Métodos adicionales para manejar los arreglos y actualizar los contadores

    // Consultar todos los productos
    public String consultarProductos() {
        StringBuilder texto = new StringBuilder();
        for (Producto producto : productos) {
            texto.append(producto).append("\r\n");
        }
        return texto.toString();
    }

    // Buscar un producto por posición
    public Producto buscarProducto(int pos) {
        if (pos >= 0 && pos < productos.length) {
            return productos[pos];
        } else {
            return null; // Si la posición es inválida, devolver null
        }
    }

    // Agregar un producto
    public void agregarProducto(Producto producto) {
        Producto[] nuevosProductos = new Producto[productos.length + 1];
        System.arraycopy(productos, 0, nuevosProductos, 0, productos.length);
        nuevosProductos[productos.length] = producto;
        productos = nuevosProductos;
        numeroDeProductos++;  // Incrementa el número de productos
        System.out.println("Producto agregado exitosamente.");
    }

    // Editar un producto por posición
    public boolean editarProducto(int pos, Producto nuevoProducto) {
        if (pos >= 0 && pos < productos.length) {
            productos[pos] = nuevoProducto;
            System.out.println("Producto editado exitosamente.");
            return true;
        } else {
            System.out.println("Posición inválida.");
            return false;
        }
    }

    // Consultar todos los proveedores
    public String consultarProveedores() {
        StringBuilder texto = new StringBuilder();
        for (Proveedor proveedor : proveedores) {
            texto.append(proveedor).append("\r\n");
        }
        return texto.toString();
    }

    // Buscar un proveedor por posición
    public Proveedor buscarProveedor(int pos) {
        if (pos >= 0 && pos < proveedores.length) {
            return proveedores[pos];
        } else {
            return null;
        }
    }

    // Agregar un proveedor
    public void agregarProveedor(Proveedor proveedor) {
        Proveedor[] nuevosProveedores = new Proveedor[proveedores.length + 1];
        System.arraycopy(proveedores, 0, nuevosProveedores, 0, proveedores.length);
        nuevosProveedores[proveedores.length] = proveedor;
        proveedores = nuevosProveedores;
        numeroDeProveedores++;  // Incrementa el número de proveedores
        System.out.println("Proveedor agregado exitosamente.");
    }

    // Editar un proveedor por posición
    public boolean editarProveedor(int pos, Proveedor nuevoProveedor) {
        if (pos >= 0 && pos < proveedores.length) {
            proveedores[pos] = nuevoProveedor;
            System.out.println("Proveedor editado exitosamente.");
            return true;
        } else {
            System.out.println("Posición inválida.");
            return false;
        }
    }

    // Consultar todos los items a devolver
    public String consultarItemsDevolver() {
        StringBuilder texto = new StringBuilder();
        for (ItemDevolucion item : itemDevolucion) {
            texto.append(item).append("\r\n");
        }
        return texto.toString();
    }

    // Buscar un item a devolver por posición
    public ItemDevolucion buscarItemDevolver(int pos) {
        if (pos >= 0 && pos < itemDevolucion.length) {
            return itemDevolucion[pos];
        } else {
            return null;
        }
    }

    // Agregar un item a devolver
    public void agregarItemDevolver(ItemDevolucion itemDevolver) {
        ItemDevolucion[] nuevosItems = new ItemDevolucion[this.itemDevolucion.length + 1];
        System.arraycopy(this.itemDevolucion, 0, nuevosItems, 0, this.itemDevolucion.length);
        nuevosItems[this.itemDevolucion.length] = itemDevolver;
        this.itemDevolucion = nuevosItems;
        numeroDeItemsDevolucion++;  // Incrementa el número de items a devolver
        System.out.println("Item a devolver agregado exitosamente.");
    }

    // Editar un item a devolver por posición
    public boolean editarItemDevolver(int pos, ItemDevolucion nuevoItem) {
        if (pos >= 0 && pos < itemDevolucion.length) {
            itemDevolucion[pos] = nuevoItem;
            System.out.println("Item a devolver editado exitosamente.");
            return true;
        } else {
            System.out.println("Posición inválida.");
            return false;
        }
    }

    // Consultar todos los pedidos
    public String consultarPedidos() {
        StringBuilder texto = new StringBuilder();
        for (Pedido pedido : pedidos) {
            texto.append(pedido).append("\r\n");
        }
        return texto.toString();
    }

    // Buscar un pedido por posición
    public Pedido buscarPedido(int pos) {
        if (pos >= 0 && pos < pedidos.length) {
            return pedidos[pos];
        } else {
            return null;
        }
    }

    // Agregar un pedido
    public void agregarPedido(Pedido pedido) {
        Pedido[] nuevosPedidos = new Pedido[pedidos.length + 1];
        System.arraycopy(pedidos, 0, nuevosPedidos, 0, pedidos.length);
        nuevosPedidos[pedidos.length] = pedido;
        pedidos = nuevosPedidos;
        numeroDePedidos++;  // Incrementa el número de pedidos
        System.out.println("Pedido agregado exitosamente.");
    }

    // Editar un pedido por posición
    public boolean editarPedido(int pos, Pedido nuevoPedido) {
        if (pos >= 0 && pos < pedidos.length) {
            pedidos[pos] = nuevoPedido;
            System.out.println("Pedido editado exitosamente.");
            return true;
        } else {
            System.out.println("Posición inválida.");
            return false;
        }
    }
}