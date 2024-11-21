package ec.edu.uce.Test;

import ec.edu.uce.Dominio.Item;

public class TestItem {
    public static void main(String[] args) {
            System.out.println("=== PRUEBA DEL CONSTRUCTOR ===");
            // Crear un objeto con valores válidos
            try {
                Item item1 = new Item(1, "Laptop", 2, 1500.50, "Disponible", "Bodega-1");
                System.out.println("Producto creado exitosamente:");
                System.out.println("ID: " + item1.getIdItem());
                System.out.println("Producto: " + item1.getProducto());
                System.out.println("Cantidad: " + item1.getCantidad());
                System.out.println("Precio Unitario: " + item1.getPrecioUnitario());
                System.out.println("Subtotal: " + item1.getSubtotal());
                System.out.println("Estado: " + item1.getEstado());
                System.out.println("Ubicación: " + item1.getUbicacion());
            } catch (IllegalArgumentException e) {
                System.out.println("Error al crear el producto: " + e.getMessage());
            }

            System.out.println("\n=== PRUEBA DE LOS SETTERS ===");
            // Crear un objeto vacío
            Item item2 = new Item();

            // Probar el setter de ID
            item2.setIdItem(10);
            System.out.println("ID asignado: " + item2.getIdItem());
            item2.setIdItem(-5); // ID inválido

            // Probar el setter de Producto
            item2.setProducto("Escritorio");
            System.out.println("Producto asignado: " + item2.getProducto());
            item2.setProducto("1234"); // Nombre inválido

            // Probar el setter de Cantidad
            item2.setCantidad(3);
            System.out.println("Cantidad asignada: " + item2.getCantidad());
            item2.setCantidad(-10); // Cantidad inválida

            // Probar el setter de Precio Unitario
            item2.setPrecioUnitario(500.75);
            System.out.println("Precio Unitario asignado: " + item2.getPrecioUnitario());
            System.out.println("Subtotal calculado: " + item2.getSubtotal());
            item2.setPrecioUnitario(-100.0); // Precio inválido

            // Probar el setter de Estado
            item2.setEstado("No Disponible");
            System.out.println("Estado asignado: " + item2.getEstado());
            item2.setEstado("Indeterminado"); // Estado inválido

            // Probar el setter de Ubicación
            item2.setUbicacion("Almacén-C");
            System.out.println("Ubicación asignada: " + item2.getUbicacion());
            item2.setUbicacion(""); // Ubicación inválida
        }
}
