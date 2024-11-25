package ec.edu.uce.Dominio;

import ec.edu.uce.Util.Validaciones;

import java.util.Scanner;

public class Usuario {
    // Atributos
    private String usuario;
    private String password;

    // Constructor
    public Usuario() {
        // Solicitar y validar el ID y la contraseña dentro del constructor
        Scanner scanner = new Scanner(System.in);

        // Solicitar ID al usuario
        System.out.print("Ingrese el ID del usuario: ");
        String usuarioInput = scanner.nextLine();
        setUsuario(usuarioInput);  // Llamar al setter para validar y asignar el ID

        // Solicitar Contraseña al usuario
        System.out.print("Ingrese la contraseña: ");
        String passwordInput = scanner.nextLine();
        setPassword(passwordInput);  // Llamar al setter para validar y asignar la contraseña

        // Mostrar los resultados
        mostrarDatos();
    }

    // Getter y Setter para el ID
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        if (Validaciones.validarUsuario(usuario)) {
            this.usuario = usuario;
        } else {
            this.usuario = "";
            System.out.println("El ID ingresado no es válido.");
        }
    }

    // Getter y Setter para la Contraseña
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (Validaciones.validarPassword(password)) {
            this.password = password;
        } else {
            this.password = "";
            System.out.println("La contraseña ingresada no es válida.");
        }
    }

    // Metodo para mostrar los datos del usuario
    public void mostrarDatos() {
        if (!this.usuario.isEmpty() && !this.password.isEmpty()) {
            System.out.println("ID del usuario: " + getUsuario());
            System.out.println("Contraseña: " + getPassword());
        } else {
            System.out.println("No se pudo registrar el usuario debido a datos inválidos.");
        }
    }
}