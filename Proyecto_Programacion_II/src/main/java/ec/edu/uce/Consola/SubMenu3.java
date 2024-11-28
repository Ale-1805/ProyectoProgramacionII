package ec.edu.uce.Consola;

import ec.edu.uce.Util.Validaciones;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SubMenu3 {
    public static void mostrarSubMenu3() {
        Scanner scanner = new Scanner(System.in);
        boolean salirDevoluciones = false;

        while (!salirDevoluciones) {
            System.out.println("----------------------");
            System.out.println("Gestionar Devoluciones");
            System.out.println("----------------------");
            System.out.println("");
            System.out.println("1. Crear devolucion");
            System.out.println("2. Reponer Producto");
            System.out.println("3. Eliminar devolucion");
            System.out.println("4. Modificar devolucion");
            System.out.println("5. Consultar devolucion");
            System.out.println("6. Salir");
            int opcionDevoluciones = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcionDevoluciones) {
                case 1:
                    System.out.println("Crear devolución");
                    System.out.println("Ingrese los datos de la devolución:");

                    System.out.print("ID: ");
                    int id;
                    while (true) {
                        id = scanner.nextInt();
                        scanner.nextLine();
                        if (Validaciones.validarId(id)) break;
                        System.out.print("ID inválido. Debe ser un número entero positivo. Inténtelo de nuevo: ");
                    }

                    System.out.print("Producto: ");
                    String producto;
                    while (true) {
                        producto = scanner.nextLine();
                        if (Validaciones.validarProducto(producto)) break;
                        System.out.print("Producto inválido. Solo se permiten letras y espacios. Inténtelo de nuevo: ");
                    }

                    System.out.print("Cantidad: ");
                    int cantidad;
                    while (true) {
                        cantidad = scanner.nextInt();
                        scanner.nextLine();
                        if (Validaciones.validarCantidad(cantidad)) break;
                        System.out.print("Cantidad inválida. Debe ser un número entero positivo. Inténtelo de nuevo: ");
                    }

                    System.out.print("Razón de devolución: ");
                    String razon;
                    while (true) {
                        razon = scanner.nextLine();
                        if (Validaciones.validarRazonDevolucion(razon)) break;
                        System.out.print("Razón de devolución inválida. Inténtelo de nuevo: ");
                    }

                    System.out.print("Estado (pendiente, aprobado, rechazado): ");
                    String estado;
                    while (true) {
                        estado = scanner.nextLine();
                        if (Validaciones.validarEstadoDevolucion(estado)) break;
                        System.out.print("Estado inválido. Debe ser 'pendiente', 'aprobado' o 'rechazado'. Inténtelo de nuevo: ");
                    }

                    System.out.print("Fecha (yyyy-MM-dd): ");
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    sdf.setLenient(false); // Para hacer que el formato de la fecha sea estricto
                    Date fecha = null;
                    while (true) {
                        try {
                            String fechaInput = scanner.nextLine();
                            fecha = sdf.parse(fechaInput);
                            break;
                        } catch (Exception e) {
                            System.out.print("Formato de fecha inválido. Inténtelo de nuevo (yyyy-MM-dd): ");
                        }
                    }

                    // Aquí puedes proceder con la lógica para guardar los datos de la devolución.
                    System.out.println("Devolución creada exitosamente:");
                    System.out.println("ID: " + id);
                    System.out.println("Producto: " + producto);
                    System.out.println("Cantidad: " + cantidad);
                    System.out.println("Razón: " + razon);
                    System.out.println("Estado: " + estado);
                    System.out.println("Fecha: " + sdf.format(fecha));
                    break;
                case 2:
                    System.out.println("Reponer producto");
                    break;
                case 3:
                    System.out.println("Eliminar devolucion");
                    break;
                case 4:
                    System.out.println("Modificar devolucion");
                    break;
                case 5:
                    System.out.println("Consultar devolucion");
                    break;
                case 6:
                    System.out.println("Saliendo del sistema");
                    salirDevoluciones = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }
}
