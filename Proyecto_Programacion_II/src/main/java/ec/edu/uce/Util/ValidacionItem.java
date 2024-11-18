package ec.edu.uce.Util;

import ec.edu.uce.Dominio.Item;

import java.util.Scanner;

public class ValidacionItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar y validar datos para el nuevo Item
        System.out.print("Ingrese el ID del item (entero): ");
        int idItem = solicitarEntero(scanner);

        String producto;
        do {
            System.out.print("Ingrese el nombre del producto (solo letras): ");
            producto = scanner.nextLine();
        } while (!producto.matches("[a-zA-Z ]+"));

        System.out.print("Ingrese la cantidad (entero): ");
        int cantidad = solicitarEntero(scanner);

        System.out.print("Ingrese el precio unitario (decimal): ");
        double precioUnitario = solicitarDecimal(scanner);

        String estado;
        do {
            System.out.print("Ingrese el estado del producto (Disponible/Agotado): ");
            estado = scanner.nextLine();
        } while (!estado.equalsIgnoreCase("Disponible") && !estado.equalsIgnoreCase("Agotado"));

        String ubicacion;
        do {
            System.out.print("Ingrese la ubicación (solo letras y números): ");
            ubicacion = scanner.nextLine();
        } while (!ubicacion.matches("[a-zA-Z0-9 ]+"));

        // Crear el objeto Item con los datos ingresados
        Item item = new Item(idItem, producto, cantidad, precioUnitario, estado, ubicacion);

        // Mostrar datos iniciales del item
        System.out.println("\nDatos iniciales del item:");
        mostrarDatosItem(item);

        // Modificar atributos del item
        System.out.println("\n--- Modificar datos del item ---");

        System.out.print("Ingrese el nuevo nombre del producto (solo letras): ");
        producto = scanner.nextLine();
        item.setProducto(producto);

        System.out.print("Ingrese la nueva cantidad (entero): ");
        cantidad = solicitarEntero(scanner);
        item.setCantidad(cantidad);

        System.out.print("Ingrese el nuevo precio unitario (decimal): ");
        precioUnitario = solicitarDecimal(scanner);
        item.setPrecioUnitario(precioUnitario);

        System.out.print("Ingrese el nuevo estado del producto (Disponible/Agotado): ");
        estado = scanner.nextLine();
        item.setEstado(estado);

        System.out.print("Ingrese la nueva ubicación (solo letras y números): ");
        ubicacion = scanner.nextLine();
        item.setUbicacion(ubicacion);

        // Mostrar datos actualizados del item
        System.out.println("\nDatos actualizados del item:");
        mostrarDatosItem(item);

        scanner.close();
    }

    // Metodo para mostrar los datos del item
    private static void mostrarDatosItem(Item item) {
        System.out.println("ID del Item: " + item.getIdItem());
        System.out.println("Producto: " + item.getProducto());
        System.out.println("Cantidad: " + item.getCantidad());
        System.out.println("Precio Unitario: " + item.getPrecioUnitario());
        System.out.println("Subtotal: " + item.getSubtotal());
        System.out.println("Estado: " + item.getEstado());
        System.out.println("Ubicación: " + item.getUbicacion());
    }

    // Metodo para solicitar un entero al usuario
    private static int solicitarEntero(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Por favor, ingrese un número entero: ");
            }
        }
    }

    // Metodo para solicitar un decimal al usuario
    private static double solicitarDecimal(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Por favor, ingrese un número decimal: ");
            }
        }
    }
}
