package ec.edu.uce.Consola;

import java.util.Scanner;

public class SubMenu_5 {
    public void mostrarSubMenu_5() {
        System.out.println("");
        System.out.println("1. Consultar item de devolucion");
        System.out.println("2. Salir");
        System.out.print("Ingrese una opción: ");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Bienvenido a la opción de consulta de item de devolucion");
                break;
            case 2:
                System.out.println("Saliendo del sistema...");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
}
