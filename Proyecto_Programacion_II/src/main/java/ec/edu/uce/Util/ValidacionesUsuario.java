package ec.edu.uce.Util;

import ec.edu.uce.Dominio.Usuario;

import java.util.Scanner;

public class ValidacionesUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String id = "";
        String password = "";

        // Validar el ID del usuario
        while (true) {
            try {
                System.out.print("Ingrese el ID del usuario: ");
                id = scanner.nextLine();
                if (id.trim().isEmpty()) {
                    throw new IllegalArgumentException("El ID no puede estar vacío.");
                }
                if (id.matches(".\\d.")) {
                    throw new IllegalArgumentException("El ID no debe contener números.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Validar la contraseña
        while (true) {
            try {
                System.out.print("Ingrese la contraseña del usuario: ");
                password = scanner.nextLine();
                if (password.length() < 6) {
                    throw new IllegalArgumentException("La contraseña debe tener al menos 6 caracteres.");
                }
                if (!password.matches(".[A-Za-z].") || !password.matches(".\\d.")) {
                    throw new IllegalArgumentException("La contraseña debe contener letras y números.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Crear el objeto Usuario
        Usuario usuario = new Usuario(id, password);
        System.out.println("Datos iniciales del usuario:");
        usuario.mostrarDatos();

        // Modificar datos con nuevas validaciones
        while (true) {
            try {
                System.out.print("Ingrese un nuevo ID para el usuario: ");
                id = scanner.nextLine();
                if (id.trim().isEmpty()) {
                    throw new IllegalArgumentException("El ID no puede estar vacío.");
                }
                if (id.matches(".\\d.")) {
                    throw new IllegalArgumentException("El ID no debe contener números.");
                }
                usuario.setId(id);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Ingrese una nueva contraseña para el usuario: ");
                password = scanner.nextLine();
                if (password.length() < 6) {
                    throw new IllegalArgumentException("La contraseña debe tener al menos 6 caracteres.");
                }
                if (!password.matches(".[A-Za-z].") || !password.matches(".\\d.")) {
                    throw new IllegalArgumentException("La contraseña debe contener letras y números.");
                }
                usuario.setPassword(password);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Mostrar los datos actualizados
        System.out.println("Datos actualizados del usuario:");
        usuario.mostrarDatos();
    }

}
