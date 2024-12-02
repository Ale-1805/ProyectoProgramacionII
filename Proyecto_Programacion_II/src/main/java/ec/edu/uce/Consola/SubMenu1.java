package ec.edu.uce.Consola;

import ec.edu.uce.Dominio.ItemPedido;
import ec.edu.uce.Dominio.Pedido;
import ec.edu.uce.Dominio.Producto;
import ec.edu.uce.Util.Validaciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SubMenu1 {
    public static void mostrarSubMenu1() {
        Scanner leer = new Scanner(System.in);
        boolean regresar = false;
        Pedido[] pedidos = new Pedido[100];  // Lista de pedidos
        int indicePedido = 0;

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
            int opcionPedido = 0;
            try {
                opcionPedido = leer.nextInt();
                if (opcionPedido < 1 ) {
                    throw new InputMismatchException("Opción fuera de rango");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no válida. Por favor, ingrese un número entre 1 y 6.");
                leer.nextLine(); // Limpiar el buffer del scanner
                continue;
            }

            switch (opcionPedido) {
                case 1:
                    // Crear un nuevo Pedido
                    Pedido nuevoPedido = new Pedido();
                    System.out.print("Ingrese ID del pedido: ");
                    nuevoPedido.setId(leer.nextInt());

                    // Fecha del pedido
                    String fecha;
                    boolean fechaValida = false;
                    while (!fechaValida) {
                        System.out.print("Ingrese la fecha del pedido (dd/MM/yyyy): ");
                        fecha = leer.next();
                        if (Validaciones.validarFecha(fecha)) {
                            nuevoPedido.setFecha(fecha); // Establecer la fecha como String
                            fechaValida = true;
                        } else {
                            System.out.println("Error: Formato de fecha incorrecto. Intente nuevamente.");
                        }
                    }

                    // Estado del pedido
                    String estadoPedido;
                    do {
                        System.out.print("Ingrese el estado del pedido (Entregado/En Camino): ");
                        estadoPedido = leer.next();
                    } while (!Validaciones.validarEstadoPedido(estadoPedido));
                    nuevoPedido.setEstado(estadoPedido);

                    // Agregar proveedores
                    int numProveedores = 0;
                    boolean proveedoresValido = false;
                    while (!proveedoresValido) {
                        try {
                            System.out.print("Ingrese el número de proveedores: ");
                            numProveedores = leer.nextInt();
                            if (numProveedores <= 0) {
                                throw new InputMismatchException("Número de proveedores debe ser mayor que 0.");
                            }
                            proveedoresValido = true; // Número de proveedores válido
                        } catch (InputMismatchException e) {
                            System.out.println("Error: " + e.getMessage());
                            leer.nextLine(); // Limpiar el buffer del scanner
                        }
                    }

                    for (int i = 0; i < numProveedores; i++) {
                        System.out.print("Proveedor " + (i + 1) + " - ID: ");
                        int idProveedor = leer.nextInt();
                        leer.nextLine();  // Consumir el salto de línea
                        System.out.print("Proveedor " + (i + 1) + " - Nombre: ");
                        String nombreProveedor = leer.nextLine();
                        System.out.print("Proveedor " + (i + 1) + " - Contacto: ");
                        String contactoProveedor = leer.nextLine();
                        nuevoPedido.agregarProveedor(idProveedor, nombreProveedor, contactoProveedor);
                    }

                    // Agregar ítems de pedido
                    int numItems = 0;
                    boolean itemsValido = false;
                    while (!itemsValido) {
                        try {
                            System.out.print("Ingrese el número de ítems de pedido: ");
                            numItems = leer.nextInt();
                            if (numItems <= 0) {
                                throw new InputMismatchException("Número de ítems debe ser mayor que 0.");
                            }
                            itemsValido = true; // Número de ítems válido
                        } catch (InputMismatchException e) {
                            System.out.println("Error: " + e.getMessage());
                            leer.nextLine(); // Limpiar el buffer del scanner
                        }
                    }

                    for (int i = 0; i < numItems; i++) {
                        System.out.print("Ítem de pedido " + (i + 1) + " - ID: ");
                        int idItem = leer.nextInt();
                        System.out.print("Ítem de pedido " + (i + 1) + " - Cantidad: ");
                        int cantidad = leer.nextInt();
                        System.out.print("Ítem de pedido " + (i + 1) + " - Precio unitario: ");
                        double precioUnitario = leer.nextDouble();
                        leer.nextLine();  // Consumir el salto de línea
                        ItemPedido nuevoItem = new ItemPedido(idItem, new Producto[0], cantidad, precioUnitario, "Pendiente", nuevoPedido);
                        nuevoPedido.setItemsPedidos(new ItemPedido[] { nuevoItem });
                    }

                    // Agregar el pedido a la lista
                    if (indicePedido < pedidos.length) {
                        pedidos[indicePedido++] = nuevoPedido;
                        System.out.println("Pedido registrado exitosamente.");
                    } else {
                        System.out.println("No se pueden registrar más pedidos. Límite alcanzado.");
                    }
                    break;

                case 2:
                    // Modificar un pedido
                    System.out.print("Ingrese el ID del pedido a modificar: ");
                    int idModificar = leer.nextInt();
                    Pedido pedidoModificar = null;
                    for (Pedido pedido : pedidos) {
                        if (pedido != null && pedido == pedidoModificar) {
                            pedidoModificar = pedido;
                            break;
                        }
                    }
                    if (pedidoModificar == null) {
                        System.out.println("Pedido no encontrado.");
                        break;
                    }

                    // Modificar estado del pedido
                    String nuevoEstado;
                    do {
                        System.out.print("Ingrese el nuevo estado del pedido (Entregado/En Camino): ");
                        nuevoEstado = leer.next();
                    } while (!Validaciones.validarEstadoPedido(nuevoEstado));
                    pedidoModificar.setEstado(nuevoEstado);
                    System.out.println("Estado modificado correctamente.");
                    break;

                case 3:
                    // Consultar pedidos
                    System.out.println("Consultando todos los pedidos:");
                    for (Pedido pedido : pedidos) {
                        if (pedido != null) {
                            System.out.println(pedido.datosPedido());
                        }
                    }
                    break;

                case 4:
                    // Eliminar un pedido
                    System.out.print("Ingrese el ID del pedido a eliminar: ");
                    int idEliminar = leer.nextInt();
                    Pedido pedidoEliminar = null;
                    for (int i = 0; i < pedidos.length; i++) {
                        if (pedidos[i] != null && pedidos[i]== pedidoEliminar) {
                            pedidoEliminar = pedidos[i];
                            pedidos[i] = null; // Eliminar el pedido
                            break;
                        }
                    }
                    if (pedidoEliminar != null) {
                        System.out.println("Pedido eliminado exitosamente.");
                    } else {
                        System.out.println("Pedido no encontrado.");
                    }
                    break;

                case 5:
                    // Recibir pedido (Cambio de estado a "Entregado")
                    System.out.print("Ingrese el ID del pedido recibido: ");
                    int idRecibido = leer.nextInt();
                    Pedido pedidoRecibido = null;
                    for (Pedido pedido : pedidos) {
                        if (pedido != null && pedido.getId()==idRecibido) {
                            pedidoRecibido = pedido;
                            break;
                        }
                    }
                    if (pedidoRecibido != null) {
                        pedidoRecibido.setEstado("Entregado");
                        System.out.println("Pedido recibido correctamente.");
                    } else {
                        System.out.println("Pedido no encontrado.");
                    }
                    break;

                case 6:
                    // Salir del menú
                    System.out.println("Saliendo del menú...");
                    regresar = true;
                    break;
            }
        }
    }
}