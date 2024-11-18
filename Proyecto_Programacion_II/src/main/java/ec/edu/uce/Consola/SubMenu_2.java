package ec.edu.uce.Consola;

import java.util.Scanner;

public class SubMenu_2 {
    public void mostrarSubMenu_2() {
        System.out.println("");
        System.out.println("1. Crear pedidos");
        System.out.println("2. Crear item de devolucion");
        System.out.println("3. Consultar pedido");
        System.out.println("4. Salir");
        System.out.print("Ingrese una opción: ");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Bienvenido a la opción de Crear pedidos");
                break;
            case 2:
                System.out.println("Bienvenido a la opción de Crear item de devolucion");
                break;
            case 3:
                System.out.println("Bienvenido a la opción de Consultar pedido");
                break;
            case 4:
                System.out.println("Saliendo del sistema...");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
}
