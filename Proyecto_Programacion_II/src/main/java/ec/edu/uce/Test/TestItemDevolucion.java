package ec.edu.uce.Test;

import ec.edu.uce.Dominio.ItemDevolucion;

import java.util.Date;

public class TestItemDevolucion {
    public static void main(String[] args) {
        // Crear objeto ItemDevolucion
        Date fechaDevolucion = new Date();
        ItemDevolucion itemDev = new ItemDevolucion(1, "Producto B", 3,
                "Defecto de fábrica", "pendiente", fechaDevolucion,
                "Empaque dañado");
        // Mostrar información inicial
        System.out.println("Información inicial del ItemDevolucion:");
        System.out.println("ID: " + itemDev.getIdItemDevolucion());
        System.out.println("Producto: " + itemDev.getProducto());
        System.out.println("Cantidad: " + itemDev.getCantidad());
        System.out.println("Razón Devolución: " + itemDev.getRazonDevolucion());
        System.out.println("Estado: " + itemDev.getEstado());
        System.out.println("Fecha Devolución: " + itemDev.getFechaDevolucion());
        System.out.println("Observaciones: " + itemDev.getObservaciones());
        System.out.println();

        // Actualizar observaciones
        itemDev.setObservaciones("Producto defectuoso confirmado.");
        System.out.println("Observaciones actualizadas: " + itemDev.getObservaciones());
    }

}
