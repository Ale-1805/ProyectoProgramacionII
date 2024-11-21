package ec.edu.uce.Test;

import ec.edu.uce.Dominio.ItemDevolucion;

import java.util.Date;

public class TestItemDevolucion {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE CONSTRUCTOR ===");
        try {
            ItemDevolucion item = new ItemDevolucion(1, "Laptop", 2, "Defectuosa", "Pendiente", new Date(), "Requiere revisión");
            System.out.println("Objeto creado con éxito: " + item.getProducto());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n=== PRUEBA DE SETTERS ===");
        ItemDevolucion item2 = new ItemDevolucion();
        try {
            item2.setProducto("Tablet");
            item2.setCantidad(3);
            item2.setRazonDevolucion("Error en la entrega");
            item2.setEstado("Aprobado");
            item2.setFechaDevolucion(new Date());
            item2.setObservaciones("Ninguna");
            System.out.println("Producto configurado correctamente: " + item2.getProducto());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Prueba de valores inválidos
        try {
            item2.setProducto("123");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
