package ec.edu.uce.Consola;

import java.util.Scanner;

public class SubMenuEmpleado {
    public void mostrarSubmenuEmpleado() {
        Scanner scanner = new Scanner(System.in);
        boolean regresar = false;

        while (!regresar) {
            System.out.println("\n===== Submenú: Gestionar Productos =====");
            System.out.println("1. Añadir Producto");
            System.out.println("2. Eliminar Producto");
            System.out.println("3. Buscar Producto");
            System.out.println("4. Verificar Estado del Producto");
            System.out.println("5. Regresar al Menú Principal");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("Opción: Añadir Producto");
                    // Implementar la lógica para añadir producto
                    break;

                case 2:
                    System.out.println("Opción: Eliminar Producto");
                    // Implementar la lógica para eliminar producto
                    break;

                case 3:
                    System.out.println("Opción: Buscar Producto");
                    // Implementar la lógica para buscar producto
                    break;

                case 4:
                    System.out.println("Opción: Verificar Estado del Producto");
                    // Implementar la lógica para verificar estado
                    break;

                case 5:
                    System.out.println("Regresando al Menú Principal...");
                    regresar = true;
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }
}
