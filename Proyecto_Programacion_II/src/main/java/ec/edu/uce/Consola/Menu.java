package ec.edu.uce.Consola;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n===== Menú Principal =====");
            System.out.println("1. Ingresar al Sistema");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            int opcionPrincipal = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcionPrincipal) {
                case 1:
                    System.out.println("\n=== Opción: Ingresar al Sistema ===");

                    // Credenciales quemadas
                    String usuarioValido = "admin";
                    String passwordValido = "admin123";

                    // Solicitar nombre de usuario y contraseña
                    System.out.print("Ingrese su nombre de usuario: ");
                    String usuario = scanner.nextLine();

                    System.out.print("Ingrese su contraseña: ");
                    String password = scanner.nextLine();

                    // Validar credenciales
                    if (usuario.equals(usuarioValido) && password.equals(passwordValido)) {
                        System.out.println("¡Autenticación exitosa! Bienvenido, " + usuario + ".");

                        // Mostrar opciones tras autenticación exitosa
                        boolean regresar = false;
                        while (!regresar) {
                            System.out.println("\n1. Gestionar Pedidos");
                            System.out.println("2. Gestionar Productos");
                            System.out.println("3. Gestionar Devoluciones");
                            System.out.println("4. Regresar al Menú Principal");
                            System.out.print("Seleccione una opción: ");
                            int opcionIngreso = scanner.nextInt();
                            scanner.nextLine(); // Limpiar buffer

                            switch (opcionIngreso) {
                                case 1:
                                    System.out.println("=== Submenú: Gestionar Pedidos ===");
                                    SubMenu1.mostrarSubMenu1();
                                    break;
                                case 2:
                                    System.out.println("=== Submenú: Gestionar Productos ===");
                                    SubMenu2.mostrarSubMenu2();
                                    break;
                                case 3:
                                    System.out.println("=== Submenú: Gestionar Devoluciones ===");
                                    SubMenu3.mostrarSubMenu3();
                                    break;
                                case 4:
                                    System.out.println("Regresando al Menú Principal...");
                                    regresar = true;
                                    break;
                                default:
                                    System.out.println("Opción inválida. Intente nuevamente.");
                            }
                        }
                    } else {
                        System.out.println("Nombre de usuario o contraseña incorrectos. Intente nuevamente.");
                    }
                    break;

                case 2:
                    System.out.println("¡Gracias por usar el sistema! Saliendo...");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }

        scanner.close();
    }
}