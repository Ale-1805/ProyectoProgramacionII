package ec.edu.uce.Test;

import ec.edu.uce.Dominio.Item;

public class TestItem {
    public static void main(String[] args) {
        // Crear objeto Item
        Item item1 = new Item(1, "Producto A", 5,
                10.0, "Disponible", "Almacén 1");
        // Mostrar información inicial
        System.out.println("Información inicial del Item:");
        System.out.println("ID: " + item1.getIdItem());
        System.out.println("Producto: " + item1.getProducto());
        System.out.println("Cantidad: " + item1.getCantidad());
        System.out.println("Precio Unitario: " + item1.getPrecioUnitario());
        System.out.println("Subtotal: " + item1.getSubtotal());
        System.out.println("Estado: " + item1.getEstado());
        System.out.println("Ubicación: " + item1.getUbicacion());
        System.out.println();
        // Cambiar cantidad y precio
        item1.setCantidad(10);
        item1.setPrecioUnitario(12.5);
        // Verificar cambios
        System.out.println("Información actualizada del Item:");
        System.out.println("Cantidad: " + item1.getCantidad());
        System.out.println("Precio Unitario: " + item1.getPrecioUnitario());
        System.out.println("Subtotal: " + item1.getSubtotal());
        System.out.println();
        // Cambiar estado y ubicación
        item1.setEstado("No Disponible");
        item1.setUbicacion("Almacén 2");
        // Verificar cambios finales
        System.out.println("Estado: " + item1.getEstado());
        System.out.println("Ubicación: " + item1.getUbicacion());}
}
