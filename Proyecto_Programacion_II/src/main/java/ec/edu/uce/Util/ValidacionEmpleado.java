package ec.edu.uce.Util;

import ec.edu.uce.Dominio.Empleado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ValidacionEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Solicitar y validar el nombre del empleado
        String nombre;
        do {
            System.out.print("Ingrese el nombre del empleado (solo letras): ");
            nombre = scanner.nextLine();
        } while (!nombre.matches("[a-zA-Z ]+")); // Validar que solo contiene letras y espacios

        // Solicitar y validar la fecha de ingreso
        Date fechaIngreso;
        while (true) {
            System.out.print("Ingrese la fecha de ingreso (YYYY-MM-DD): ");
            String fechaIngresoStr = scanner.nextLine();
            try {
                fechaIngreso = dateFormat.parse(fechaIngresoStr);
                break;
            } catch (ParseException e) {
                System.out.println("Fecha inválida. Intente nuevamente.");
            }
        }

        // Solicitar y validar el estado del empleado
        String estado;
        do {
            System.out.print("Ingrese el estado del empleado (Activo/Inactivo): ");
            estado = scanner.nextLine();
        } while (!estado.equalsIgnoreCase("Activo") && !estado.equalsIgnoreCase("Inactivo"));

        // Crear un objeto de la clase Empleado
        Empleado empleado = new Empleado(nombre, fechaIngreso, null, estado);

        // Mostrar datos iniciales del empleado
        System.out.println("\nDatos iniciales del empleado:");
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Fecha de Ingreso: " + empleado.getFechaIngreso());
        System.out.println("Fecha de Salida: " + empleado.getFechaSalida());
        System.out.println("Estado: " + empleado.getEstado());

        // Modificar los datos del empleado
        System.out.println("\n--- Modificar los datos del empleado ---");

        // Solicitar y validar el nuevo nombre
        String nuevoNombre;
        do {
            System.out.print("Ingrese el nuevo nombre del empleado (solo letras): ");
            nuevoNombre = scanner.nextLine();
        } while (!nuevoNombre.matches("[a-zA-Z ]+")); // Validar que solo contiene letras y espacios
        empleado.setNombre(nuevoNombre);

        // Solicitar y validar la nueva fecha de ingreso
        Date nuevaFechaIngreso;
        while (true) {
            System.out.print("Ingrese la nueva fecha de ingreso (YYYY-MM-DD): ");
            String nuevaFechaIngresoStr = scanner.nextLine();
            try {
                nuevaFechaIngreso = dateFormat.parse(nuevaFechaIngresoStr);
                break;
            } catch (ParseException e) {
                System.out.println("Fecha inválida. Intente nuevamente.");
            }
        }
        empleado.setFechaIngreso(nuevaFechaIngreso);

        // Solicitar y validar la nueva fecha de salida
        Date nuevaFechaSalida;
        while (true) {
            System.out.print("Ingrese la nueva fecha de salida (YYYY-MM-DD): ");
            String nuevaFechaSalidaStr = scanner.nextLine();
            try {
                nuevaFechaSalida = dateFormat.parse(nuevaFechaSalidaStr);
                break;
            } catch (ParseException e) {
                System.out.println("Fecha inválida. Intente nuevamente.");
            }
        }
        empleado.setFechaSalida(nuevaFechaSalida);

        // Solicitar y validar el nuevo estado
        String nuevoEstado;
        do {
            System.out.print("Ingrese el nuevo estado del empleado (Activo/Inactivo): ");
            nuevoEstado = scanner.nextLine();
        } while (!nuevoEstado.equalsIgnoreCase("Activo") && !nuevoEstado.equalsIgnoreCase("Inactivo"));
        empleado.setEstado(nuevoEstado);

        // Mostrar datos actualizados del empleado
        System.out.println("\nDatos actualizados del empleado:");
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Fecha de Ingreso: " + empleado.getFechaIngreso());
        System.out.println("Fecha de Salida: " + empleado.getFechaSalida());
        System.out.println("Estado: " + empleado.getEstado());

        // Mostrar solo el nombre usando el metodo DatosEmpleado
        System.out.println("\nUsando el método DatosEmpleado:");
        empleado.DatosEmpleado();

        scanner.close();
    }

}
