package ec.edu.uce.Dominio;

public class ItemPedido {
    // Atributos privados
    private int idItem;
    private Producto[] productos; // Arreglo de productos
    private int cantidad;
    private double precioUnitario;
    private double subtotal;
    private String estado;
    private Pedido pedido; // Relación con Pedido
    private int numeroDeProductos; // Contador de productos

    // Constructor sin parámetros
    public ItemPedido() {
        this.productos = inicializarProductos(); // Inicializa el arreglo vacío de productos
        this.numeroDeProductos = 0;
    }

    // Constructor para inicializar los productos (arreglo)
    private Producto[] inicializarProductos() {
        return new Producto[0]; // Inicializa un arreglo vacío
    }

    // Constructor con parámetros para inicializar el objeto ItemPedido
    public ItemPedido(int idItem, Producto[] productos, int cantidad, double precioUnitario, String estado, Pedido pedido) {
        this.idItem = idItem;
        this.productos = productos != null ? productos : inicializarProductos(); // Si no se pasa un arreglo, inicializa vacío
        this.numeroDeProductos = productos != null ? productos.length : 0;
        this.setCantidad(cantidad);
        this.setPrecioUnitario(precioUnitario);
        this.subtotal = calcularSubtotal();
        this.estado = estado;
        this.pedido = pedido;
    }

    // Getters y Setters
    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public int getNumeroDeProductos() {
        return numeroDeProductos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos != null ? productos : inicializarProductos(); // Si no se pasa un arreglo, inicializa vacío
        this.numeroDeProductos = productos.length;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
            this.subtotal = calcularSubtotal();
        } else {
            System.out.println("Error: La cantidad debe ser mayor a 0.");
        }
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario > 0) {
            this.precioUnitario = precioUnitario;
            this.subtotal = calcularSubtotal();
        } else {
            System.out.println("Error: El precio unitario debe ser mayor a 0.");
        }
    }

    public double getSubtotal() {
        return subtotal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estado != null && !estado.isEmpty()) {
            this.estado = estado;
        } else {
            System.out.println("Error: El estado no puede estar vacío.");
        }
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    // Métodos adicionales
    private double calcularSubtotal() {
        return this.cantidad * this.precioUnitario;
    }

    // Agregar un producto
    public void agregarProducto(Producto producto) {
        Producto[] nuevosProductos = new Producto[numeroDeProductos + 1];
        System.arraycopy(productos, 0, nuevosProductos, 0, numeroDeProductos);
        nuevosProductos[numeroDeProductos] = producto;
        productos = nuevosProductos;
        numeroDeProductos++;
        System.out.println("Producto agregado exitosamente.");
    }

    // Editar un producto por posición
    public boolean editarProducto(int pos, Producto nuevoProducto) {
        if (pos >= 0 && pos < productos.length) {
            productos[pos] = nuevoProducto;
            System.out.println("Producto editado exitosamente.");
            return true;
        } else {
            System.out.println("Error: Posición inválida.");
            return false;
        }
    }

    // Consultar todos los productos
    public String consultarProductos() {
        StringBuilder sb = new StringBuilder();
        for (Producto producto : productos) {
            if (producto != null) {
                sb.append(producto.toString()).append("\n");
            }
        }
        return sb.toString().isEmpty() ? "No hay productos disponibles." : sb.toString();
    }

    // Buscar un producto por posición
    public Producto buscarProducto(int pos) {
        if (pos >= 0 && pos < productos.length) {
            return productos[pos];
        } else {
            System.out.println("Error: Posición inválida.");
            return null;
        }
    }

    // Metodo toString
    @Override
    public String toString() {
        StringBuilder productosStr = new StringBuilder();
        for (Producto producto : productos) {
            if (producto != null) {
                productosStr.append(producto.toString()).append("\n");
            }
        }
        return "ItemPedido{" +
                "idItem=" + idItem +
                ", productos=\n" + productosStr +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                ", subtotal=" + subtotal +
                ", estado='" + estado + '\'' +
                ", pedido=" + (pedido != null ? pedido.getId() : "No asignado") +
                '}';
    }
}