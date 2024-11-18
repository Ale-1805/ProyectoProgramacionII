package ec.edu.uce.Test;
import ec.edu.uce.Dominio.Empleado;

import java.util.Date;

public class TestEmpleado {
    public static void main(String[] args) {
        // Crear un objeto de la clase Empleado
        Empleado empleado = new Empleado("Juan Pérez", new Date(), null, "Activo");

        // Mostrar datos iniciales del empleado
        System.out.println("Datos iniciales del empleado:");
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Fecha de Ingreso: " + empleado.getFechaIngreso());
        System.out.println("Fecha de Salida: " + empleado.getFechaSalida());
        System.out.println("Estado: " + empleado.getEstado());

        // Modificar los datos del empleado
        empleado.setNombre("María López");
        empleado.setFechaIngreso(new Date());
        empleado.setFechaSalida(new Date());
        empleado.setEstado("Inactivo");

        // Mostrar datos actualizados del empleado
        System.out.println("\nDatos actualizados del empleado:");
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Fecha de Ingreso: " + empleado.getFechaIngreso());
        System.out.println("Fecha de Salida: " + empleado.getFechaSalida());
        System.out.println("Estado: " + empleado.getEstado());

        // Mostrar solo el nombre usando el método DatosEmpleado
        System.out.println("\nUsando el método DatosEmpleado:");
        empleado.DatosEmpleado();
    }
}


