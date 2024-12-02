package ec.edu.uce.Dominio;

public class Pedido {
    private int id; // Ahora es int
    private String fecha; // Ahora es String con formato dd-MM-yyyy
    private String estado;
    private int numeroItemPedido;
    private int numeroDeProveedores;
    private Proveedor[] proveedores;
    private ItemPedido[] itemsPedidos;

    // Constructor con parámetros
    public Pedido(int id, String fecha, String estado, int numeroItems, int numeroProveedores) {
        this.id = id;
        this.fecha = fecha;
        this.estado = estado;
        this.numeroItemPedido = 0;
        this.numeroDeProveedores = 0;
        this.proveedores = new Proveedor[numeroProveedores];
        this.itemsPedidos = new ItemPedido[numeroItems];
    }

    // Constructor por defecto
    public Pedido() {
        this.id = 0;
        this.fecha = "S/F"; // Fecha por defecto
        this.estado = "S/E";
        this.numeroItemPedido = 0;
        this.numeroDeProveedores = 0;
        this.proveedores = new Proveedor[3];
        this.itemsPedidos = new ItemPedido[3];
    }

    // Métodos SET y GET
    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public int getId() {
        return id;
    }

    public void setFecha(String fecha) {
        if (fecha != null && !fecha.trim().isEmpty()) {
            this.fecha = fecha;
        }
    }

    public String getFecha() {
        return fecha;
    }

    public void setEstado(String estado) {
        if (estado != null && (estado.equalsIgnoreCase("Entregado") || estado.equalsIgnoreCase("En Camino"))) {
            this.estado = estado;
        }
    }

    public String getEstado() {
        return estado;
    }

    public Proveedor[] getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedor[] proveedores) {
        this.proveedores = proveedores;
        this.numeroDeProveedores = proveedores.length;
    }

    public ItemPedido[] getItemsPedidos() {
        return itemsPedidos;
    }

    public void setItemsPedidos(ItemPedido[] itemsPedidos) {
        this.itemsPedidos = itemsPedidos;
        this.numeroItemPedido = itemsPedidos.length;
    }

    //Otros metodos

    //toString
    public String datosPedido() {
        StringBuilder proveedorInfo = new StringBuilder();
        for (int i = 0; i < numeroDeProveedores; i++) {
            proveedorInfo.append(proveedores[i].mostrarProveedor()).append("\n");
        }
        return "Id: " + id +
                "\nFecha: " + fecha +
                "\nEstado: " + estado +
                "\nNumero de Items Pedidos: " + numeroItemPedido +
                "\nNumero de Proveedores: " + numeroDeProveedores +
                "\nProveedores:\n" + proveedorInfo;
    }

    //Agregar Proveedor
    public void agregarProveedor(int id, String nombre, String contacto) {
        if (numeroDeProveedores < proveedores.length) {
            proveedores[numeroDeProveedores] = new Proveedor(id, nombre, contacto);
            numeroDeProveedores++;
        } else {
            System.out.println("No se pueden agregar más proveedores.");
        }
    }

    //Agregar Item
    public void agregarItemPedido(int idItem, Producto producto, int cantidad, double precioUnitario, String estado) {
        if (numeroItemPedido >= itemsPedidos.length) {
            // Expandir el arreglo
            ItemPedido[] nuevoArreglo = new ItemPedido[itemsPedidos.length + 1];
            System.arraycopy(itemsPedidos, 0, nuevoArreglo, 0, itemsPedidos.length);
            itemsPedidos = nuevoArreglo;
        }
        itemsPedidos[numeroItemPedido] = new ItemPedido();
        numeroItemPedido++;
    }

    //Consultar pedido
    public String consultarPedidos() {
        StringBuilder texto = new StringBuilder("Pedidos registrados:\n");
        texto.append(datosPedido()).append("\n");
        return texto.toString();
    }

    //Buscar pedido
    public Pedido buscarPedido(int pos) {
        if (pos >= 0 && pos < itemsPedidos.length) {
            System.out.println("Item encontrado: " + itemsPedidos[pos]);
            return this;
        }
        System.out.println("Posición inválida.");
        return null;
    }

    //Editar pedido
    public boolean editarPedido(int pos, int nuevoId, String nuevaFecha, String nuevoEstado) {
        if (pos >= 0 && pos < itemsPedidos.length) {
            this.id = nuevoId;
            this.fecha = nuevaFecha;
            this.estado = nuevoEstado;
            return true;
        }
        return false; // Posición inválida
    }

    //Inicializa con datos de prueba
    public void inicializarPedidos() {
        //Crear productos
        Producto producto1 = new Producto(1, "Producto A", 10, 20.0); // id, nombre, cantidad, precio
        Producto producto2 = new Producto(2, "Producto B", 5, 15.0);  // id, nombre, cantidad, precio

        //Agregar itempedido
        this.agregarItemPedido(1, producto1, 2, 20.0, "En Camino");
        this.agregarItemPedido(2, producto2, 3, 15.0, "Entregado");

        //Agregar proveedores
        this.agregarProveedor(1, "Proveedor A", "contactoA@ejemplo.com");
        this.agregarProveedor(2, "Proveedor B", "contactoB@ejemplo.com");
    }
}