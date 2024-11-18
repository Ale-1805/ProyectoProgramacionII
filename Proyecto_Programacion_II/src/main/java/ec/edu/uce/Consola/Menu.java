package ec.edu.uce.Consola;
import java.util.Scanner;
public class Menu {
    public void mostrarMenu() {
        boolean salir = false;
        do {
            System.out.println("Menú Principal");
            System.out.println("1. Recibir pedidos");
            System.out.println("2. Gestionar pedidos");
            System.out.println("3. Gestionar productos");
            System.out.println("4. Suministrar productos");
            System.out.println("5. Gestionar devoluciones");
            System.out.println("6. Salir");

            System.out.print("Ingrese una opción: ");
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();


            switch (opcion) {
                case 1:
                    System.out.println("Bienvenido a la opción de recibir pedidos");
                    SubMenu_1 menu = new SubMenu_1();
                    menu.mostrarSubMenu_1();
                    break;
                case 2:
                    System.out.println("Bienvenido a la opción de gestión de pedidos");
                    SubMenu_2 menu2 = new SubMenu_2();
                    menu2.mostrarSubMenu_2();
                    break;
                case 3:
                    System.out.println("Bienvenido a la opción de Suministrar productos");
                    SubMenu_3 menu3 = new SubMenu_3();
                    menu3.mostrarSubMenu_3();
                    break;
                case 4:
                    System.out.println("Bienvenido a la opción de gestion de devoluciones");
                    SubMenu_4 menu4 = new SubMenu_4();
                    menu4.mostrarSubMenu_4();
                    break;
                case 5:
                    System.out.println("Bienvenido a la opción de gestion de pedidos");
                    SubMenu_5 menu5 = new SubMenu_5();
                    menu5.mostrarSubMenu_5();
                    break;
                case 6:
                    System.out.println("¿Estás seguro que deseas salir? (s/n)");
                    String confirmacion = scanner.next();
                    if (confirmacion.equalsIgnoreCase("s")) {
                        salir = true;
                        System.out.println("Saliendo del sistema...");
                    }
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }while (!salir);
    }
}
