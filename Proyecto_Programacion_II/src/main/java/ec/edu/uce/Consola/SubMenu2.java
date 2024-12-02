package ec.edu.uce.Consola;

import ec.edu.uce.Util.Validaciones;
import ec.edu.uce.Dominio.Producto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SubMenu2 {

    private static Producto[] productos = new Producto[10]; // Arreglo estático con capacidad para 10 productos
    private static int contadorProductos = 0; // Contador para controlar el número de productos en el arreglo

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
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    añadirProducto(scanner);
                    break;
                case 2:
                    consultarProducto(scanner);
                    break;
                case 3:
                    eliminarProducto(scanner);
                    break;
                case 4:
                    suministrarProducto(scanner);
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

    private static void añadirProducto(Scanner scanner) {
        if (contadorProductos >= productos.length) {
            System.out.println("No se pueden añadir más productos. El inventario está lleno.");
            return;
        }

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

        productos[contadorProductos++] = new Producto(id, nombre, cantidad, precio);
        System.out.println("Producto añadido exitosamente.");
    }

    private static void consultarProducto(Scanner scanner) {
        System.out.println("Opción: Consultar Producto");
        System.out.print("Ingrese el ID del producto que desea consultar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        for (int i = 0; i < contadorProductos; i++) {
            if (productos[i] != null && productos[i].getId() == id) {
                System.out.println(productos[i]);
                return;
            }
        }
        System.out.println("Producto con ID " + id + " no encontrado.");
    }

    private static void eliminarProducto(Scanner scanner) {
        System.out.println("Opción: Eliminar Producto");
        System.out.print("Ingrese el ID del producto que desea eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        for (int i = 0; i < contadorProductos; i++) {
            if (productos[i] != null && productos[i].getId() == id) {
                System.out.println("Producto eliminado: " + productos[i]);
                productos[i] = productos[contadorProductos - 1]; // Reemplaza con el último producto
                productos[contadorProductos - 1] = null; // Borra el último producto
                contadorProductos--;
                return;
            }
        }
        System.out.println("Producto con ID " + id + " no encontrado.");
    }

    private static void suministrarProducto(Scanner scanner) {
        System.out.println("Opción: Suministrar Producto");
        System.out.print("Ingrese el ID del producto que desea suministrar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        for (int i = 0; i < contadorProductos; i++) {
            if (productos[i] != null && productos[i].getId() == id) {
                System.out.print("Ingrese la cantidad a añadir: ");
                int cantidad = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer

                if (cantidad > 0) {
                    productos[i].setCantidad(productos[i].getCantidad() + cantidad);
                    System.out.println("Producto actualizado: " + productos[i]);
                } else {
                    System.out.println("La cantidad debe ser mayor a 0.");
                }
                return;
            }
        }
        System.out.println("Producto con ID " + id + " no encontrado.");
    }
}
