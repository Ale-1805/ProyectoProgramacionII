package ec.edu.uce.Util;

import ec.edu.uce.Dominio.Pedido;

import java.time.LocalDate;
import java.util.Scanner;

public class ValidacionPedido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar y validar el ID del pedido
        String id;
        do {
            System.out.print("Ingrese el ID del pedido (solo números): ");
            id = scanner.nextLine();
        } while (!id.matches("\\d+")); // Validar que solo contiene dígitos

        // Solicitar y validar el estado del pedido
        String estado;
        do {
            System.out.print("Ingrese el estado del pedido (Pendiente, Completado, etc.): ");
            estado = scanner.nextLine();
        } while (!estado.matches("[a-zA-Z ]+")); // Validar que solo contiene letras y espacios

        // Solicitar y validar el item del pedido
        String itemPedido;
        do {
            System.out.print("Ingrese el nombre del item pedido: ");
            itemPedido = scanner.nextLine();
        } while (!itemPedido.matches("[a-zA-Z ]+")); // Validar que solo contiene letras y espacios

        // Crear el objeto Pedido con los datos válidos
        Pedido pedido = new Pedido(id, LocalDate.now(), estado, itemPedido);

        // Mostrar datos iniciales del pedido
        System.out.println("\nDatos iniciales del pedido:");
        System.out.println("ID: " + pedido.getId());
        System.out.println("Fecha: " + pedido.getFecha());
        System.out.println("Estado: " + pedido.getEstado());
        System.out.println("Item Pedido: " + pedido.getItemPedido());

        // Modificar los datos del pedido
        System.out.println("\n--- Modificar los datos del pedido ---");

        // Solicitar y validar el nuevo ID del pedido
        String nuevoId;
        do {
            System.out.print("Ingrese el nuevo ID del pedido (solo números): ");
            nuevoId = scanner.nextLine();
        } while (!nuevoId.matches("\\d+")); // Validar que solo contiene dígitos
        pedido.setId(nuevoId);

        // Solicitar y validar la nueva fecha del pedido
        System.out.print("Ingrese la nueva fecha del pedido (AAAA-MM-DD): ");
        String fechaStr = scanner.nextLine();
        LocalDate nuevaFecha = LocalDate.parse(fechaStr); // Convertir a LocalDate
        pedido.setFecha(nuevaFecha);

        // Solicitar y validar el nuevo estado del pedido
        String nuevoEstado;
        do {
            System.out.print("Ingrese el nuevo estado del pedido: ");
            nuevoEstado = scanner.nextLine();
        } while (!nuevoEstado.matches("[a-zA-Z ]+")); // Validar que solo contiene letras y espacios
        pedido.setEstado(nuevoEstado);

        // Solicitar y validar el nuevo item del pedido
        String nuevoItemPedido;
        do {
            System.out.print("Ingrese el nuevo item pedido: ");
            nuevoItemPedido = scanner.nextLine();
        } while (!nuevoItemPedido.matches("[a-zA-Z ]+")); // Validar que solo contiene letras y espacios
        pedido.setItemPedido(nuevoItemPedido);

        // Mostrar datos actualizados del pedido
        System.out.println("\nDatos actualizados del pedido:");
        System.out.println("ID: " + pedido.getId());
        System.out.println("Fecha: " + pedido.getFecha());
        System.out.println("Estado: " + pedido.getEstado());
        System.out.println("Item Pedido: " + pedido.getItemPedido());

        scanner.close();
    }

}
