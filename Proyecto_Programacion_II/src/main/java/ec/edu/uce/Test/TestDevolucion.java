package ec.edu.uce.Test;

import ec.edu.uce.Dominio.Devolucion;

import java.util.Scanner;


public class TestDevolucion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar y validar la sucursal
        String sucursalInput = "";
        boolean sucursalValida = false;
        while (!sucursalValida) {
            System.out.print("Ingrese el nombre de la sucursal (Ejemplo: Sucursal 1): ");
            sucursalInput = scanner.nextLine();
            if (sucursalInput.matches("Sucursal \\d+")) {
                sucursalValida = true;
            } else {
                System.out.println("Sucursal no válida. Debe seguir el formato 'Sucursal X', donde X es un número.");
            }
        }

        // Solicitar y validar el estado del daño
        String estadoInput = "";
        boolean estadoValido = false;
        while (!estadoValido) {
            System.out.print("Ingrese el estado del daño (leve, medio, total): ");
            estadoInput = scanner.nextLine();
            if (estadoInput.equalsIgnoreCase("leve") ||
                    estadoInput.equalsIgnoreCase("medio") ||
                    estadoInput.equalsIgnoreCase("total")) {
                estadoValido = true;
            } else {
                System.out.println("Estado no válido. Debe ser 'leve', 'medio' o 'total'.");
            }
        }


        // Mostrar los datos de la devolución
        System.out.println("\nDatos de la devolución registrados:");
    }
}
