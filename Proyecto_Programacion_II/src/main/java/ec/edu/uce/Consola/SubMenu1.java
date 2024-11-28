package ec.edu.uce.Consola;

import ec.edu.uce.Dominio.ItemPedido;
import ec.edu.uce.Util.Validaciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SubMenu1 {
    public static void mostrarSubMenu1() {
        Scanner scanner = new Scanner(System.in);
        boolean regresar = false;

        while (!regresar) {
            System.out.println("-----------------");
            System.out.println("Gestionar Pedidos");
            System.out.println("-----------------");
            System.out.println("");
            System.out.println("1. Crear pedidos");
            System.out.println("2. Modificar pedidos");
            System.out.println("3. Consultar pedidos");
            System.out.println("4. Eliminar pedidos");
            System.out.println("5. Recibir pedidos");
            System.out.println("6. Salir");
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

                            if (!Validaciones.validarId(id)) {
                                System.out.println("El ID debe ser un número entero positivo. Inténtalo de nuevo.");
                                id = -1; // Reintentar si no pasa la validación
                            } else {
                                nuevoPedido.setIdItem(id); // Setter con validación aprobada
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El ID debe ser un número entero. Inténtalo de nuevo.");
                            scanner.nextLine(); // Limpiar el buffer
                        }
                    }

                    // Cantidad con validación
                    int cantidad = -1;
                    while (cantidad == -1) {
                        try {
                            System.out.print("Cantidad: ");
                            cantidad = scanner.nextInt();

                            if (!Validaciones.validarCantidad(cantidad)) {
                                System.out.println("La cantidad debe ser un número entero positivo. Inténtalo de nuevo.");
                                cantidad = -1; // Reintentar si no pasa la validación
                            } else {
                                nuevoPedido.setCantidad(cantidad); // Setter con validación aprobada
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("La cantidad debe ser un número entero. Inténtalo de nuevo.");
                            scanner.nextLine(); // Limpiar el buffer
                        }
                    }

                    // Precio Unitario con validación
                    double precioUnitario = -1;
                    while (precioUnitario == -1) {
                        try {
                            System.out.print("Precio Unitario: ");
                            precioUnitario = scanner.nextDouble();

                            if (precioUnitario<0) {
                                System.out.println("El precio unitario debe ser un número decimal positivo. Inténtalo de nuevo.");
                                precioUnitario = -1; // Reintentar si no pasa la validación
                            } else {
                                nuevoPedido.setPrecioUnitario(precioUnitario); // Setter con validación aprobada
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El precio unitario debe ser un número decimal. Inténtalo de nuevo.");
                            scanner.nextLine(); // Limpiar el buffer
                        }
                    }

                    // Agregar el pedido al arreglo
                    if (indicePedido < pedidos.length) {
                        pedidos[indicePedido++] = nuevoPedido;
                        System.out.println("Pedido registrado exitosamente.");
                    } else {
                        System.out.println("No se pueden registrar más pedidos. Límite alcanzado.");
                    }
                    scanner.close();
                    break;

                case 2:
                    System.out.println("Modificar pedido");
                    break;
                case 3:
                    System.out.println("Consultar pedido");
                    break;
                case 4:
                    System.out.println("Eliminar pedido");
                    break;
                case 5:
                    System.out.println("Recibir pedidos");
                case 6:
                    System.out.println("Saliendo del menú...");
                    regresar = true;
                    break;
            }
        }
    }
}
