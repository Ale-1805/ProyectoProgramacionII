package ec.edu.uce.Consola;

import ec.edu.uce.Dominio.Devolucion;
import ec.edu.uce.Util.Validaciones;

import java.util.Scanner;

public class SubMenu3 {
    private static Devolucion[] devoluciones = new Devolucion[0];

    public static void mostrarSubMenu3() {
        Scanner scanner = new Scanner(System.in);
        boolean salirDevoluciones = false;

        while (!salirDevoluciones) {
            System.out.println("----------------------");
            System.out.println("Gestionar Devoluciones");
            System.out.println("----------------------");
            System.out.println("");
            System.out.println("1. Crear devolución");
            System.out.println("2. Reponer Producto");
            System.out.println("3. Eliminar devolución");
            System.out.println("4. Modificar devolución");
            System.out.println("5. Consultar devolución");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                int opcionDevoluciones = Integer.parseInt(scanner.nextLine());

                switch (opcionDevoluciones) {
                    case 1:
                        crearDevolucion(scanner);
                        break;

                    case 2:
                        reponerProducto(scanner);
                        break;

                    case 3:
                        eliminarDevolucion(scanner);
                        break;

                    case 4:
                        modificarDevolucion(scanner);
                        break;

                    case 5:
                        listarDevoluciones();
                        break;

                    case 6:
                        System.out.println("Saliendo del sistema.");
                        salirDevoluciones = true;
                        break;

                    default:
                        System.out.println("Opción inválida. Por favor, ingrese un número entre 1 y 6.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Entrada no válida. Ingrese un número.");
            }
        }
    }

    private static void crearDevolucion(Scanner scanner) {
        try {
            System.out.println("----- Crear Devolución -----");
            System.out.print("Ingrese la sucursal: ");
            String sucursal = scanner.nextLine();
            if (!Validaciones.validarUbicacion(sucursal)) {
                System.out.println("Sucursal inválida. Debe contener letras, números o espacios.");
                return;
            }

            System.out.print("Ingrese el estado (Pendiente / Aprobado): ");
            String estado = scanner.nextLine();
            if (!Validaciones.validarEstadoDevolucion(estado)) {
                System.out.println("Estado inválido. Debe ser 'Pendiente' o 'Aprobado'.");
                return;
            }

            String codigoDevolucion = "DEV-" + (int) (Math.random() * 10000);
            String fecha = new java.text.SimpleDateFormat("dd/MM/yyyy").format(new java.util.Date());
            Devolucion nuevaDevolucion = new Devolucion(sucursal, estado, fecha, codigoDevolucion);

            agregarDevolucion(nuevaDevolucion);
            System.out.println("Devolución creada exitosamente: " + nuevaDevolucion);

        } catch (Exception e) {
            System.out.println("Error al crear la devolución: " + e.getMessage());
        }
    }

    private static void reponerProducto(Scanner scanner) {
        try {
            System.out.println("----- Reponer Producto -----");
            listarDevoluciones();
            System.out.print("Seleccione el índice de la devolución: ");
            int indice = Integer.parseInt(scanner.nextLine());
            if (indice < 0 || indice >= devoluciones.length) {
                System.out.println("Índice inválido.");
                return;
            }

            System.out.print("Ingrese el nombre del producto: ");
            String producto = scanner.nextLine();
            if (!Validaciones.validarProducto(producto)) {
                System.out.println("Nombre del producto inválido.");
                return;
            }

            System.out.print("Ingrese la cantidad: ");
            int cantidad = Integer.parseInt(scanner.nextLine());
            if (!Validaciones.validarCantidad(cantidad)) {
                System.out.println("Cantidad inválida. Debe ser un número entero positivo.");
                return;
            }

            System.out.println("Producto '" + producto + "' con cantidad '" + cantidad + "' repuesto exitosamente.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida. Verifique los datos ingresados.");
        }
    }

    private static void eliminarDevolucion(Scanner scanner) {
        try {
            System.out.println("----- Eliminar Devolución -----");
            listarDevoluciones();
            System.out.print("Seleccione el índice de la devolución a eliminar: ");
            int indice = Integer.parseInt(scanner.nextLine());
            if (eliminarDevolucionPorIndice(indice)) {
                System.out.println("Devolución eliminada exitosamente.");
            } else {
                System.out.println("No se pudo eliminar la devolución. Índice inválido.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida.");
        }
    }

    private static void modificarDevolucion(Scanner scanner) {
        try {
            System.out.println("----- Modificar Devolución -----");
            listarDevoluciones();
            System.out.print("Seleccione el índice de la devolución: ");
            int indice = Integer.parseInt(scanner.nextLine());
            if (indice < 0 || indice >= devoluciones.length) {
                System.out.println("Índice inválido.");
                return;
            }

            System.out.print("Ingrese el nuevo estado (Pendiente / Aprobado): ");
            String nuevoEstado = scanner.nextLine();
            if (!Validaciones.validarEstadoDevolucion(nuevoEstado)) {
                System.out.println("Estado inválido.");
                return;
            }

            devoluciones[indice].setEstado(nuevoEstado);
            System.out.println("Devolución actualizada exitosamente: " + devoluciones[indice]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida.");
        }
    }

    private static void listarDevoluciones() {
        if (devoluciones.length == 0) {
            System.out.println("No hay devoluciones registradas.");
        } else {
            for (int i = 0; i < devoluciones.length; i++) {
                System.out.println(i + ". " + devoluciones[i]);
            }
        }
    }

    private static void agregarDevolucion(Devolucion devolucion) {
        Devolucion[] nuevasDevoluciones = new Devolucion[devoluciones.length + 1];
        System.arraycopy(devoluciones, 0, nuevasDevoluciones, 0, devoluciones.length);
        nuevasDevoluciones[devoluciones.length] = devolucion;
        devoluciones = nuevasDevoluciones;
    }

    private static boolean eliminarDevolucionPorIndice(int indice) {
        if (indice >= 0 && indice < devoluciones.length) {
            Devolucion[] nuevasDevoluciones = new Devolucion[devoluciones.length - 1];
            for (int i = 0, j = 0; i < devoluciones.length; i++) {
                if (i != indice) {
                    nuevasDevoluciones[j++] = devoluciones[i];
                }
            }
            devoluciones = nuevasDevoluciones;
            return true;
        }
        return false;
    }
}