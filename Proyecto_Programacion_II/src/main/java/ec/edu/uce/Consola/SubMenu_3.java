package ec.edu.uce.Consola;

import java.util.Scanner;

public class SubMenu_3 {
    public void mostrarSubMenu_3() {
        System.out.println("");
        System.out.println("1. Añadir producto");
        System.out.println("2. Verificar estado de producto");
        System.out.println("3. Salir");
        System.out.print("Ingrese una opción: ");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Bienvenido a la opción de Añadir producto");
                break;
            case 2:
                System.out.println("Bienvenido a la opción de Verificar estado de producto");
                break;
            case 3:
                System.out.println("Saliendo del sistema...");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
}
