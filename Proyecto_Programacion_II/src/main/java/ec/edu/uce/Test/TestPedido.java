package ec.edu.uce.Test;

import ec.edu.uce.Dominio.Pedido;
import java.time.LocalDate;

public class TestPedido {
    public static void main(String[] args) {
        // Crear un objeto Pedido
        Pedido pedido = new Pedido("12345", LocalDate.now(), "Pendiente", "Producto A");

        // Mostrar datos iniciales del pedido
        System.out.println("Datos iniciales del pedido:");
        System.out.println("ID: " + pedido.getId());
        System.out.println("Fecha: " + pedido.getFecha());
        System.out.println("Estado: " + pedido.getEstado());
        System.out.println("Item Pedido: " + pedido.getItemPedido());

        // Modificar los datos del pedido
        pedido.setId("54321");
        pedido.setFecha(LocalDate.of(2024, 12, 25)); // Nueva fecha
        pedido.setEstado("Completado");
        pedido.setItemPedido("Producto B");

        // Mostrar datos actualizados del pedido
        System.out.println("\nDatos actualizados del pedido:");
        System.out.println("ID: " + pedido.getId());
        System.out.println("Fecha: " + pedido.getFecha());
        System.out.println("Estado: " + pedido.getEstado());
        System.out.println("Item Pedido: " + pedido.getItemPedido());
    }
}
