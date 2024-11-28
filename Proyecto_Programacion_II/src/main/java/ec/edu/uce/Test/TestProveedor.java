package ec.edu.uce.Test;

import ec.edu.uce.Dominio.Proveedor;

import java.util.Scanner;

public class TestProveedor {
    // MÉTODOS DE PRUEBA
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar y validar el ID del proveedor
        int idInput = 0;
        boolean idValido = false;
        while (!idValido) {
            System.out.print("Ingrese el ID del proveedor (número mayor que 0): ");
            idInput = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer
            if (idInput > 0) {
                idValido = true;
            } else {
                System.out.println("ID no válido. Debe ser un número mayor que 0.");
            }
        }

        // Solicitar y validar el nombre del proveedor
        String nombreInput = "";
        boolean nombreValido = false;
        while (!nombreValido) {
            System.out.print("Ingrese el nombre del proveedor: ");
            nombreInput = scanner.nextLine();
            if (nombreInput.matches("[a-zA-Z\\s]+")) {
                nombreValido = true;
            } else {
                System.out.println("Nombre no válido. Solo debe contener letras y espacios.");
            }
        }

        // Solicitar y validar el contacto del proveedor (número de teléfono ecuatoriano)
        String contactoInput = "";
        boolean contactoValido = false;
        while (!contactoValido) {
            System.out.print("Ingrese el contacto del proveedor (formato ecuatoriano: 09XXXXXXX o 02XXXXXXX): ");
            contactoInput = scanner.nextLine();
            if (contactoInput.matches("(0[2-3])\\d{7}|09\\d{8}")) {
                contactoValido = true;
            } else {
                System.out.println("Contacto no válido. Debe seguir el formato ecuatoriano: 09XXXXXXX o 02XXXXXXX.");
            }
        }

        // Crear el proveedor con los datos validados
        Proveedor proveedor = new Proveedor();
        proveedor.setId(idInput);
        proveedor.setNombre(nombreInput);
        proveedor.setContacto(contactoInput);

        // Mostrar los datos del proveedor
        System.out.println("\nDatos del proveedor registrados:");
        System.out.println(proveedor.mostrarProveedor());

        scanner.close();
    }
}
