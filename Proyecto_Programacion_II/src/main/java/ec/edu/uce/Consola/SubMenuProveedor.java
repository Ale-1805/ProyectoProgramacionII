package ec.edu.uce.Consola;

import java.util.Scanner;

public class SubMenuProveedor {
    public static void mostrarSubMenuProveedor() {
        Scanner scanner = new Scanner(System.in);
        boolean salirSubMenu = false;

        while (!salirSubMenu) {
            System.out.println("\n=== Opción: MENÚ PROVEEDOR ===");
            System.out.println("1. Suministrar Productos");
            System.out.println("2. Gestionar Devoluciones");
            System.out.println("3. Regresar al Menú Principal");
            System.out.print("Seleccione una opción: ");
            int opcionSubMenu = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcionSubMenu) {
                case 1:

                    boolean salirSuministrar = false;

                    while (!salirSuministrar) {
                        System.out.println("\n=== Submenú: SUMINISTRAR PRODUCTOS ===");
                        System.out.println("1. Recibir Pedidos");
                        System.out.println("2. Enviar Productos");
                        System.out.println("3. Regresar al Menú Proveedor");
                        System.out.print("Seleccione una opción: ");
                        int opcionSuministrar = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer

                        switch (opcionSuministrar) {
                            case 1:
                                System.out.println("---------------------");
                                System.out.println("Recibiendo pedidos...");
                                System.out.println("---------------------");
                                // Aquí puedes agregar la lógica para recibir pedidos
                                break;
                            case 2:
                                System.out.println("---------------------");
                                System.out.println("Enviando productos...");
                                System.out.println("---------------------");
                                // Aquí puedes agregar la lógica para enviar productos
                                break;
                            case 3:
                                System.out.println("Regresando al Menú Proveedor...");
                                salirSuministrar = true;
                                break;
                            default:
                                System.out.println("Opción inválida. Intente nuevamente.");
                        }
                    }


                break;
                case 2:
                    boolean salirDevoluciones = false;

                    while (!salirDevoluciones) {
                        System.out.println("\n=== Submenú: GESTIONAR DEVOLUCIONES ===");
                        System.out.println("1. Reponer Producto");
                        System.out.println("2. Regresar al Menú Proveedor");
                        System.out.print("Seleccione una opción: ");
                        int opcionDevoluciones = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer

                        switch (opcionDevoluciones) {
                            case 1:
                                System.out.println("Reponiendo producto...");
                                // Aquí puedes agregar la lógica para reponer productos
                                break;
                            case 2:
                                System.out.println("Regresando al Menú Proveedor...");
                                salirDevoluciones = true;
                                break;
                            default:
                                System.out.println("Opción inválida. Intente nuevamente.");
                        }
                    }
                case 3:
                    System.out.println("Regresando al Menú Principal...");
                    salirSubMenu = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }
}
