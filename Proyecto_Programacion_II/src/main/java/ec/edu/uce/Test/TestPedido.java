package ec.edu.uce.Test;

import ec.edu.uce.Dominio.Pedido;
import ec.edu.uce.Dominio.Producto;

public class TestPedido {
    public static void main(String[] args) {
        pruebaconstructor();
        pruebaconstructor1(123, "01-01-2000", "Entregado", "Jabon");
        pruebaSetId(123);
        pruebaSetFecha("19-11-2024");
        pruebaSetEstado("En Camino");

        // Probar agregar, editar, consultar y buscar
        pruebaAgregarProveedor(1, "Proveedor A", "contactoA@example.com");
        pruebaAgregarItemPedido(1, new Producto(1, "Producto A", 10, 20.0), 2, 20.0, "En Camino");
        pruebaEditarPedido(0, 456, "20-11-2024", "Entregado");
        pruebaConsultarPedidos();
        pruebaBuscarPedido(0);
    }

    // Constructor por defecto
    public static void pruebaconstructor() {
        Pedido pedido = new Pedido();
        System.out.println("Constructor por defecto creado.");
    }

    // Constructor con parámetros
    public static void pruebaconstructor1(int id, String fecha, String estado, String itemPedido) {
        Pedido pedido = new Pedido(id, fecha, estado, 3, 2); // Asumí que número de items y proveedores es 3 y 2 respectivamente
        System.out.println("Constructor con parámetros creado.");
        System.out.println("ID: " + pedido.getId());
        System.out.println("Fecha: " + pedido.getFecha());
        System.out.println("Estado: " + pedido.getEstado());
    }

    // Set de ID
    public static void pruebaSetId(int id) {
        Pedido pedido = new Pedido();
        pedido.setId(id);
        System.out.println("ID Set: " + pedido.getId());
    }

    // Set de Fecha
    public static void pruebaSetFecha(String fecha) {
        Pedido pedido = new Pedido();
        pedido.setFecha(fecha);
        System.out.println("Fecha Set: " + pedido.getFecha());
    }

    // Set de Estado
    public static void pruebaSetEstado(String estado) {
        Pedido pedido = new Pedido();
        pedido.setEstado(estado);
        System.out.println("Estado Set: " + pedido.getEstado());
    }

    // Agregar proveedor
    public static void pruebaAgregarProveedor(int id, String nombre, String contacto) {
        Pedido pedido = new Pedido();
        pedido.agregarProveedor(id, nombre, contacto);
        System.out.println("Proveedor agregado.");
    }

    // Agregar item al pedido
    public static void pruebaAgregarItemPedido(int idItem, Producto producto, int cantidad, double precioUnitario, String estado) {
        Pedido pedido = new Pedido();
        pedido.agregarItemPedido(idItem, producto, cantidad, precioUnitario, estado);
        System.out.println("Item Pedido agregado.");
    }

    // Editar pedido
    public static void pruebaEditarPedido(int pos, int nuevoId, String nuevaFecha, String nuevoEstado) {
        Pedido pedido = new Pedido();
        if (pedido.editarPedido(pos, nuevoId, nuevaFecha, nuevoEstado)) {
            System.out.println("Pedido editado exitosamente.");
        } else {
            System.out.println("Error al editar el pedido.");
        }
    }

    // Consultar todos los pedidos
    public static void pruebaConsultarPedidos() {
        Pedido pedido = new Pedido();
        System.out.println(pedido.consultarPedidos());
    }

    // Buscar un pedido
    public static void pruebaBuscarPedido(int pos) {
        Pedido pedido = new Pedido();
        Pedido encontrado = pedido.buscarPedido(pos);
        if (encontrado != null) {
            System.out.println("Pedido encontrado: " + encontrado.getId());
        } else {
            System.out.println("Pedido no encontrado.");
        }
    }
}