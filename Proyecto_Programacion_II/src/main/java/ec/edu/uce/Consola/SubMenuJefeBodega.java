package ec.edu.uce.Consola;
import ec.edu.uce.Dominio.ItemDevolucion;
import ec.edu.uce.Dominio.ItemPedido;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SubMenuJefeBodega {

    public static void mostrarSubMenuJefeBodega() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n====== SUBMENU JEFE DE BODEGA ======");
            System.out.println("1. Gestion de Pedidos ");
            System.out.println("2. Gestión de Devoluciones");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.println("\n====== Gestión de Pedidos ======");
                    System.out.println("1. Crear Pedido");
                    System.out.println("2. Consultar Pedido");
                    System.out.println("3. Modificar Pedido");
                    System.out.println("4. Eliminar Pedido");
                    System.out.println("5. Salir");
                    System.out.print("Selecciona una opción: ");
                    int opcionPedido = scanner.nextInt();
                    scanner.nextLine(); // Consumir salto de línea

                    switch (opcionPedido) {
                        case 1:
                            ItemPedido[] pedidos = new ItemPedido[100]; // Hasta 100 pedidos
                            int indicePedido = 0;
                            // Crear un nuevo objeto de ItemPedido
                            ItemPedido nuevoPedido = new ItemPedido();

                            // Usar los setters para asignar los valores con validaciones
                                // ID del pedido con validación
                                int id = -1;
                                while (id == -1) {
                                    try {
                                        System.out.print("ID del pedido: ");
                                        id = scanner.nextInt();
                                        scanner.nextLine(); // Consumir el salto de línea
                                        nuevoPedido.setIdItem(id); // Setter con validación
                                    } catch (InputMismatchException e) {
                                        System.out.println("El ID debe ser un número entero. Inténtalo de nuevo.");
                                        scanner.nextLine(); // Limpiar el buffer
                                    }
                                }

                                scanner.nextLine(); // Consumir el salto de línea
                                System.out.print("Producto: ");
                                String producto = scanner.nextLine();
                                nuevoPedido.setProducto(producto); // Setter con validación

                            int cantidad = -1;
                            while (cantidad == -1) {
                                try {
                                    System.out.print("Cantidad: ");
                                    cantidad = scanner.nextInt();
                                    nuevoPedido.setCantidad(cantidad); // Setter con validación
                                } catch (InputMismatchException e) {
                                    System.out.println("La cantidad debe ser un número entero. Inténtalo de nuevo.");
                                    scanner.nextLine(); // Limpiar el buffer
                                }
                            }

                            double precioUnitario = -1;
                            while (precioUnitario == -1) {
                                try {
                                    System.out.print("Precio Unitario: ");
                                    precioUnitario = scanner.nextDouble();
                                    nuevoPedido.setPrecioUnitario(precioUnitario); // Setter con validación
                                } catch (InputMismatchException e) {
                                    System.out.println("El precio unitario debe ser un número decimal. Inténtalo de nuevo.");
                                    scanner.nextLine(); // Limpiar el buffer
                                }
                            }
                                System.out.print("Ubicación: ");
                                String ubicacion = scanner.nextLine();
                                nuevoPedido.setUbicacion(ubicacion); // Setter con validación
                            break;
                        case 2:
                            System.out.println("Consultar pedido");
                            break;
                        case 3:
                            System.out.println("Modificar pedido");
                            break;
                        case 4:
                            System.out.println("Eliminar pedido");
                            break;
                        case 5:
                            System.out.println("Saliendo del menú...");
                            break;
                    }
                    break;
                case 2:
                    int opcionDevoluciones;

                    do {
                        System.out.println("\n====== Gestión de Devoluciones ======");
                        System.out.println("1. Crear Devolución");
                        System.out.println("2. Consultar Devoluciones");
                        System.out.println("3. Modificar Devolución");
                        System.out.println("4. Eliminar Devolución");
                        System.out.println("5. Salir");
                        System.out.print("Selecciona una opción: ");
                        opcionDevoluciones = scanner.nextInt();
                        scanner.nextLine(); // Consumir salto de línea

                        switch (opcionDevoluciones) {
                            case 1:

                                System.out.println("Ingrese los datos de la devolución:");
                                System.out.print("ID: ");
                                int id = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Producto: ");
                                String producto = scanner.nextLine();
                                System.out.print("Cantidad: ");
                                int cantidad = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Razón de devolución: ");
                                String razon = scanner.nextLine();
                                System.out.print("Estado (pendiente, aprobado, rechazado): ");
                                String estado = scanner.nextLine();
                                System.out.print("Fecha (yyyy-MM-dd): ");
                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                                sdf.setLenient(false); // Para hacer que el formato de la fecha sea estricto
                                Date fecha = null;
                                try {
                                    String fechaInput = scanner.nextLine();
                                    fecha = sdf.parse(fechaInput); // Parsear la fecha ingresada por el usuario
                                } catch (Exception e) {
                                    System.out.println("Formato de fecha inválido. Usando la fecha actual.");
                                    fecha = new Date(); // Si el formato es incorrecto, asignamos la fecha actual
                                }
                                System.out.print("Observaciones: ");
                                String observaciones = scanner.nextLine();

                                break;
                            case 2:
                                System.out.println("Consultar Devoluciones");
                                break;
                            case 3:
                                System.out.print("ID de la devolución a modificar: ");
                                int idMod = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Nuevo estado: ");
                                String nuevoEstado = scanner.nextLine();

                                break;
                            case 4:
                                System.out.print("ID de la devolución a eliminar: ");
                                int idElim = scanner.nextInt();

                                break;
                            case 5:
                                System.out.println("Saliendo del menú...");
                                break;
                            default:
                                System.out.println("Opción inválida.");
                        }
                    } while (opcionDevoluciones != 5);
            case 3:
                    System.out.println("Saliendo del programa. ¡Gracias!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        } while (opcion != 3);
    }
}

