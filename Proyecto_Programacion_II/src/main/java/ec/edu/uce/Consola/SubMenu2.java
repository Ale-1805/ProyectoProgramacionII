package ec.edu.uce.Consola;

import ec.edu.uce.Util.Validaciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SubMenu2 {
    public static void mostrarSubMenu2() {
        Scanner scanner = new Scanner(System.in);
        boolean regresar = false;

        while (!regresar) {
            System.out.println("-------------------");
            System.out.println("Gestionar Productos");
            System.out.println("-------------------");
            System.out.println("");
            System.out.println("1. Añadir Producto");
            System.out.println("2. Consultar Producto");
            System.out.println("3. Eliminar Producto");
            System.out.println("4. Suministrar Producto");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("Opción: Añadir Producto");
                    int id = -1;
                    while (id == -1) {
                        try {
                            System.out.print("ID del producto: ");
                            id = scanner.nextInt();
                            scanner.nextLine(); // Consumir el salto de línea

                            if (!Validaciones.validarId(id)) {
                                System.out.println("El ID debe ser un número entero positivo. Inténtalo de nuevo.");
                                id = -1; // Reintentar si no pasa la validación
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El ID debe ser un número entero. Inténtalo de nuevo.");
                            scanner.nextLine(); // Limpiar el buffer
                        }
                    }

                    String nombre;
                    do {
                        System.out.print("Nombre del producto: ");
                        nombre = scanner.nextLine();
                        if (!Validaciones.validarNombre(nombre)) {
                            System.out.println("El nombre debe contener solo letras y espacios. Inténtalo de nuevo.");
                        }
                    } while (!Validaciones.validarNombre(nombre));

                    int cantidad = -1;
                    while (cantidad == -1) {
                        try {
                            System.out.print("Cantidad del producto: ");
                            cantidad = scanner.nextInt();
                            scanner.nextLine(); // Consumir el salto de línea

                            if (!Validaciones.validarCantidad(cantidad)) {
                                System.out.println("La cantidad debe ser un número entero positivo. Inténtalo de nuevo.");
                                cantidad = -1; // Reintentar si no pasa la validación
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("La cantidad debe ser un número entero. Inténtalo de nuevo.");
                            scanner.nextLine(); // Limpiar el buffer
                        }
                    }

                    double precio = -1;
                    while (precio == -1) {
                        try {
                            System.out.print("Precio del producto: ");
                            precio = scanner.nextDouble();
                            scanner.nextLine(); // Consumir el salto de línea

                            if (!Validaciones.validarPrecio(precio)) {
                                System.out.println("El precio debe ser un número positivo con o sin decimales. Inténtalo de nuevo.");
                                precio = -1; // Reintentar si no pasa la validación
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El precio debe ser un número decimal. Inténtalo de nuevo.");
                            scanner.nextLine(); // Limpiar el buffer
                        }
                    }

                    // Confirmar datos
                    System.out.println("Producto añadido exitosamente:");
                    System.out.println("ID: " + id);
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Cantidad: " + cantidad);
                    System.out.println("Precio: $" + precio);
                    break;

                case 2:
                    System.out.println("Opción: Consultar Producto");
                    // Implementar la lógica para eliminar producto
                    break;

                case 3:
                    System.out.println("Opción: Eliminar Producto");
                    // Implementar la lógica para buscar producto
                    break;

                case 4:
                    System.out.println("Opción: Suministrar Producto");
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
