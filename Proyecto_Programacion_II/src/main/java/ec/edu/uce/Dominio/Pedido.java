package ec.edu.uce.Dominio;

import java.time.LocalDate;
import java.util.Date;

public class Pedido {
    private String id;
    private LocalDate fecha;
    private String estado;
    private int numeroItemPedido;
    private int numeroDeProveedores;
    private Proveedor[] proveedores;
    private ItemPedido[] itemsPedidos;

    // Constructor con parámetros
    public Pedido(String id, LocalDate fecha, String estado, int numeroItems, int numeroProveedores) {
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
        this.id = "000";
        this.fecha = LocalDate.now();  // Inicializamos con la fecha actual
        this.estado = "Sin Estado";
        this.numeroItemPedido = 0;
        this.numeroDeProveedores = 0;
        this.proveedores = new Proveedor[3];  // Capacidad predeterminada
        this.itemsPedidos = new ItemPedido[3];  // Capacidad predeterminada
    }

    // Métodos GET y SET

    public void setId(String id) {
        if (id != null && !id.trim().isEmpty()) {
            this.id = id;
        } else {
            System.out.println("El ID no puede ser nulo o vacío.");
        }
    }

    public String getId() {
        return id;
    }

    public void setFecha(LocalDate fecha) {
        if (fecha != null) {
            this.fecha = fecha;
        } else {
            System.out.println("La fecha no puede ser nula.");
        }
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setEstado(String estado) {
        if (estado != null && (estado.equalsIgnoreCase("Entregado") || estado.equalsIgnoreCase("En Camino"))) {
            this.estado = estado;
        } else {
            System.out.println("El estado debe ser 'Entregado' o 'En Camino'.");
        }
    }

    public String getEstado() {
        return estado;
    }

    // Metodo para agregar un proveedor
    public void agregarProveedor(int id, String nombre, String contacto) {
        if (numeroDeProveedores < proveedores.length) {
            proveedores[numeroDeProveedores] = new Proveedor(id, nombre, contacto);
            numeroDeProveedores++;
        } else {
            System.out.println("No se puede agregar más proveedores, el arreglo está lleno.");
        }
    }

    // Métodos para los proveedores
    public Proveedor[] getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedor[] proveedores) {
        this.proveedores = proveedores;
        this.numeroDeProveedores = proveedores.length;
    }

    // Metodos para los ítems de pedido
    public ItemPedido[] getItemsPedidos() {
        return itemsPedidos;
    }

    public void setItemsPedidos(ItemPedido[] itemsPedidos) {
        this.itemsPedidos = itemsPedidos;
        this.numeroItemPedido = itemsPedidos.length;
    }

    // Metodo para mostrar los datos del pedido
    public String datosPedido() {
        StringBuilder proveedorInfo = new StringBuilder();
        for (int i = 0; i < numeroDeProveedores; i++) {
            proveedorInfo.append(proveedores[i].toString()).append("\n");
        }

        StringBuilder itemInfo = new StringBuilder();
        for (int i = 0; i < numeroItemPedido; i++) {
            itemInfo.append(itemsPedidos[i].toString()).append("\n");
        }

        return "Id: " + id + "\nFecha: " + fecha + "\nEstado: " + estado + "\nNúmero de Ítems Pedidos: " + numeroItemPedido +
                "\nNúmero de Proveedores: " + numeroDeProveedores + "\nProveedores:\n" + proveedorInfo +
                "\nÍtems Pedidos:\n" + itemInfo;
    }
}