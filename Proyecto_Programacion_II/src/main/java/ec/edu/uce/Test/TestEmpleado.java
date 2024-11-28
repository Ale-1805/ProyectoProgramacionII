package ec.edu.uce.Test;
import ec.edu.uce.Dominio.Empleado;

import java.util.Date;

public class TestEmpleado {
    public static void main(String[] args) {
        Object empleado = new Empleado();
        pruebaconstructor();
        pruebaconstructor1("Juan Perez", new Date(115, 5, 15), new Date(119, 5, 15), "Activo");
        pruebaSetNombre("Carlos Lopez");
        pruebaSetFechaIngreso(new Date(118, 5, 15));
        pruebaSetFechaSalida(new Date(120, 5, 15));
        pruebaSetEstado("Inactivo");
    }

    //constructor por defecto
    public static void pruebaconstructor(){
        Empleado empleado = new Empleado();
        System.out.println("Constructor por defecto creado.");
    }

    //constructor con parámetros
    public static void pruebaconstructor1(String nombre, Date fechaIngreso, Date fechaSalida, String estado){
        Empleado empleado = new Empleado(nombre, fechaIngreso, fechaSalida, estado);
        System.out.println("Constructor con parámetros creado.");
    }

    //setNombre
    public static void pruebaSetNombre(String nombre){
        Empleado empleado = new Empleado();
        empleado.setNombre(nombre);
        System.out.println("Nombre Set: " + empleado.getNombre());
    }

    //setFechaIngreso
    public static void pruebaSetFechaIngreso(Date fechaIngreso){
        Empleado empleado = new Empleado();
        empleado.setFechaIngreso(fechaIngreso);
        System.out.println("Fecha Ingreso Set: " + empleado.getFechaIngreso());
    }

    //setFechaSalida
    public static void pruebaSetFechaSalida(Date fechaSalida){
        Empleado empleado = new Empleado();
        empleado.setFechaSalida(fechaSalida);
        System.out.println("Fecha Salida Set: " + empleado.getFechaSalida());
    }

    //setEstado
    public static void pruebaSetEstado(String estado){
        Empleado empleado = new Empleado();
        empleado.setEstado(estado);
        System.out.println("Estado Set: " + empleado.getEstado());
    }

}


