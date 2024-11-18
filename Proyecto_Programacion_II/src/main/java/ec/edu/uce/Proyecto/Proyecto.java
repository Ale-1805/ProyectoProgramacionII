package ec.edu.uce.Proyecto;

import ec.edu.uce.Consola.Menu;

import java.util.Scanner;

public class Proyecto {
    public Proyecto() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();
        if (usuario.equals("admin") && contrasena.equals("12345")) {
            System.out.println("¡Bienvenido al sistema!");
            Menu menu = new Menu();
            menu.mostrarMenu();
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }

    }
}
