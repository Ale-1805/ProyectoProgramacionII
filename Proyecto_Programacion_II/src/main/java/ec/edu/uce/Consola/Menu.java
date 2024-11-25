package ec.edu.uce.Consola;
import java.util.Scanner;

public class Menu {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    SubMenuEmpleado submenu = new SubMenuEmpleado();
    SubMenuProveedor subMenuProveedorenu = new SubMenuProveedor();
    SubMenuJefeBodega subMenuJefeBodega = new SubMenuJefeBodega();
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
                System.out.println("1. Empleado");
                System.out.println("2. Proveedor");
                System.out.println("3. Jefe de Bodega");
                System.out.println("4. Regresar al Menú Principal");
                System.out.print("Seleccione una opción: ");
                int opcionIngreso = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
            switch (opcionIngreso) {
                case 1:
                    System.out.println("\n--- Autenticación ---");
                    System.out.print("Ingrese ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Ingrese Contraseña: ");
                    String password = scanner.nextLine();

                    if (id.equals("Jhon Aucancela") && password.equals("gokussj2")) {
                        System.out.println("¡Autenticación exitosa! Bienvenido, Jhon Aucancela.");
                        submenu.mostrarSubmenuEmpleado(); // Llamada al submenú
                    } else {
                        System.out.println("Error: Credenciales incorrectas.");
                    }
                    break;
                case 2:
                        System.out.println("\n--- AUTENTICACION ---");
                        System.out.print("Ingrese ID: ");
                        id = scanner.nextLine();
                        System.out.print("Ingrese Contraseña: ");
                        password = scanner.nextLine();

                        // Credenciales correctas
                        if (id.equals("Proveedor ABC") && password.equals("1234")) {
                            System.out.println("¡Autenticación exitosa! Bienvenido, Proveedor ABC.");
                            SubMenuProveedor.mostrarSubMenuProveedor(); // Llamada al submenú
                        } else {
                            System.out.println("Error: Credenciales incorrectas.");
                        }
                    break;
                case 3:
                    System.out.println("\n--- AUTENTICACION ---");
                    System.out.print("Ingrese ID: ");
                    id = scanner.nextLine();
                    System.out.print("Ingrese Contraseña: ");
                    password = scanner.nextLine();

                    // Credenciales correctas
                    if (id.equals("JefeABC") && password.equals("1234")) {
                        System.out.println("¡Autenticación exitosa! Bienvenido, JefeABC.");
                        SubMenuJefeBodega.mostrarSubMenuJefeBodega(); // Llamada al submenú
                    } else {
                        System.out.println("Error: Credenciales incorrectas.");
                    }
                    break;
                case 4:
                    System.out.println("Regresando al Menú Principal...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
            case 2:
                System.out.println("¡Gracias por usar el sistema! Saliendo...");
                salir = true;
                break;

                 default:
                 System.out.println("Opción inválida. Intente nuevamente.");
                }
        }
    }
}


