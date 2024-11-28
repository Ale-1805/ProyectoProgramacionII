package ec.edu.uce.Test;

import ec.edu.uce.Dominio.Usuario;
import ec.edu.uce.Util.Validaciones;
import java.util.Scanner;

public class TestUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre = "";
        String contrasena = "";

        boolean credencialesValidas = false;

        // Ciclo para validar las credenciales
        while (!credencialesValidas) {
            System.out.print("Ingrese el nombre de usuario: ");
            nombre = scanner.nextLine();

            System.out.print("Ingrese la contraseña: ");
            contrasena = scanner.nextLine();

            if (Validaciones.validarUsuario(nombre)) {
                if (Validaciones.validarPassword(contrasena)) {
                    System.out.println("¡Credenciales correctas! Acceso concedido.");
                    credencialesValidas = true;
                } else {
                    System.out.println("Contraseña incorrecta.");
                    }
                }else {
                System.out.println("Usuario incorrecto");
                }
            }

        // Crear el objeto Usuario con los datos validados
        Usuario usuario = new Usuario(nombre, contrasena);

        // Mostrar los datos del usuario
        System.out.println("\nDatos del Usuario:");
        System.out.println(usuario);
    }
}