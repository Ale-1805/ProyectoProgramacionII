package ec.edu.uce.Test;

import ec.edu.uce.Dominio.ItemPedido;
import ec.edu.uce.Dominio.Producto;
import ec.edu.uce.Dominio.Pedido;

public class TestItemPedido {
    private static ItemPedido itemPedido;

    public static void main(String[] args) {
        // Inicialización de la clase Pedido (por simplicidad, solo establecemos un ID)
        Pedido pedido = new Pedido();

        // Crear productos
        Producto producto1 = new Producto(1, "Producto A", 10, 100.0);
        Producto producto2 = new Producto(2, "Producto B", 5, 150.0);
        Producto productoEditado = new Producto(2, "Producto B Editado", 8, 170.0);

        // Inicializar el ItemPedido con los productos y parámetros relevantes
        itemPedido = new ItemPedido(1, new Producto[]{producto1, producto2}, 5, 120.0, "En proceso", pedido);

        // Consultar los productos iniciales
        System.out.println("Productos iniciales:");
        System.out.println(itemPedido.consultarProductos());

        // 1. Probar agregar un producto
        itemPedido.agregarProducto(new Producto(3, "Producto C", 15, 200.0));
        System.out.println("\nProductos después de agregar uno nuevo:");
        System.out.println(itemPedido.consultarProductos());

        // 2. Probar editar un producto
        boolean resp = itemPedido.editarProducto(1, productoEditado);
        if (!resp) {
            System.out.println("Error al modificar producto.");
        }
        System.out.println("\nProductos después de editar el segundo producto:");
        System.out.println(itemPedido.consultarProductos());

        // 3. Consultar el estado del ItemPedido
        System.out.println("\nEstado del ItemPedido:");
        System.out.println(itemPedido.getEstado());

        // 4. Probar el metodo toString del ItemPedido
        System.out.println("\nInformación del ItemPedido:");
        System.out.println(itemPedido.toString());
    }
}