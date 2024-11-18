package ec.edu.uce.Util;

import ec.edu.uce.Dominio.JefeDeBodega;

import java.util.Date;
import java.util.Scanner;

public class ValidacionesJefeBodega {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre = "";
        String estado = "";
        int experiencia = 0;
        String turno = "";
        Date fechaIngreso = new Date();
        Date fechaSalida = new Date();

        // Validar nombre
        while (true) {
            try {
                System.out.print("Ingrese el nombre del jefe de bodega: ");
                nombre = scanner.nextLine();
                if (nombre.matches(".\\d.")) {
                    throw new IllegalArgumentException("El nombre no debe contener números.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Validar estado
        while (true) {
            try {
                System.out.print("Ingrese el estado del jefe (Activo/Inactivo): ");
                estado = scanner.nextLine();
                if (!estado.equalsIgnoreCase("Activo") && !estado.equalsIgnoreCase("Inactivo")) {
                    throw new IllegalArgumentException("Estado inválido. Solo se permite 'Activo' o 'Inactivo'.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Validar experiencia
        while (true) {
            try {
                System.out.print("Ingrese los años de experiencia del jefe: ");
                experiencia = Integer.parseInt(scanner.nextLine());
                if (experiencia < 0) {
                    throw new IllegalArgumentException("La experiencia no puede ser un valor negativo.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Validar turno
        while (true) {
            try {
                System.out.print("Ingrese el turno del jefe (Mañana/Noche): ");
                turno = scanner.nextLine();
                if (!turno.equalsIgnoreCase("Mañana") && !turno.equalsIgnoreCase("Noche")) {
                    throw new IllegalArgumentException("Turno inválido. Solo se permite 'Mañana' o 'Noche'.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Crear objeto JefeDeBodega
        JefeDeBodega jefe = new JefeDeBodega(nombre, fechaIngreso, fechaSalida, estado, experiencia, turno);

        // Mostrar datos y ejecutar métodos
        jefe.mostrarDatos();
        jefe.consultarReportes();
        jefe.consultarEstadoDeProductos();
        jefe.devolverProducto("Producto A");
    }
}
