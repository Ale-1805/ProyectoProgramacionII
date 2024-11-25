package ec.edu.uce.Test;

import ec.edu.uce.Dominio.ItemPedido;

public class TestItem {
    public static void main(String[] args) {
            System.out.println("=== PRUEBA DEL CONSTRUCTOR ===");
            // Crear un objeto con valores válidos
            try {
                ItemPedido itemPedido1 = new ItemPedido(1, "Laptop", 2, 1500.50, "Disponible", "Bodega-1");
                System.out.println("Producto creado exitosamente:");
                System.out.println("ID: " + itemPedido1.getIdItem());
                System.out.println("Producto: " + itemPedido1.getProducto());
                System.out.println("Cantidad: " + itemPedido1.getCantidad());
                System.out.println("Precio Unitario: " + itemPedido1.getPrecioUnitario());
                System.out.println("Subtotal: " + itemPedido1.getSubtotal());
                System.out.println("Estado: " + itemPedido1.getEstado());
                System.out.println("Ubicación: " + itemPedido1.getUbicacion());
            } catch (IllegalArgumentException e) {
                System.out.println("Error al crear el producto: " + e.getMessage());
            }

            System.out.println("\n=== PRUEBA DE LOS SETTERS ===");
            // Crear un objeto vacío
            ItemPedido itemPedido2 = new ItemPedido();

            // Probar el setter de ID
            itemPedido2.setIdItem(10);
            System.out.println("ID asignado: " + itemPedido2.getIdItem());
            itemPedido2.setIdItem(-5); // ID inválido

            // Probar el setter de Producto
            itemPedido2.setProducto("Escritorio");
            System.out.println("Producto asignado: " + itemPedido2.getProducto());
            itemPedido2.setProducto("1234"); // Nombre inválido

            // Probar el setter de Cantidad
            itemPedido2.setCantidad(3);
            System.out.println("Cantidad asignada: " + itemPedido2.getCantidad());
            itemPedido2.setCantidad(-10); // Cantidad inválida

            // Probar el setter de Precio Unitario
            itemPedido2.setPrecioUnitario(500.75);
            System.out.println("Precio Unitario asignado: " + itemPedido2.getPrecioUnitario());
            System.out.println("Subtotal calculado: " + itemPedido2.getSubtotal());
            itemPedido2.setPrecioUnitario(-100.0); // Precio inválido

            // Probar el setter de Estado
            itemPedido2.setEstado("No Disponible");
            System.out.println("Estado asignado: " + itemPedido2.getEstado());
            itemPedido2.setEstado("Indeterminado"); // Estado inválido

            // Probar el setter de Ubicación
            itemPedido2.setUbicacion("Almacén-C");
            System.out.println("Ubicación asignada: " + itemPedido2.getUbicacion());
            itemPedido2.setUbicacion(""); // Ubicación inválida
        }
}
