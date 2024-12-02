package ec.edu.uce.Test;
import ec.edu.uce.Dominio.Empleado;

public class TestEmpleado {
    public static void main(String[] args) {
        // Pruebas del constructor
        pruebaconstructor();
        pruebaconstructor1("Juan Perez", "01-01-2020", "31-12-2020", "Activo");

        // Pruebas de los setters
        pruebaSetNombre("Carlos Lopez");
        pruebaSetFechaIngreso("15-03-2021");
        pruebaSetFechaSalida("15-03-2022");
        pruebaSetEstado("Inactivo");

        // Pruebas de los métodos de la clase Empleado
        pruebaConsultarEmpleado();
        pruebaEditarEmpleado("Ana Gomez", "25-06-2021", "Inactivo");
        pruebaBuscarEmpleado();
    }

    // Constructor por defecto
    public static void pruebaconstructor() {
        Empleado empleado = new Empleado();
        System.out.println("Constructor por defecto creado.");
    }

    // Constructor con parámetros
    public static void pruebaconstructor1(String nombre, String fechaIngreso, String fechaSalida, String estado) {
        Empleado empleado = new Empleado(nombre, fechaIngreso, fechaSalida, estado);
        System.out.println("Constructor con parámetros creado.");
        System.out.println("Empleado: " + empleado.datosEmpleado());
    }

    // Set Nombre
    public static void pruebaSetNombre(String nombre) {
        Empleado empleado = new Empleado();
        empleado.setNombre(nombre);
        System.out.println("Resultado Set Nombre: " + empleado.getNombre());
    }

    // Set Fecha de Ingreso
    public static void pruebaSetFechaIngreso(String fechaIngreso) {
        Empleado empleado = new Empleado();
        empleado.setFechaIngreso(fechaIngreso);
        System.out.println("Resultado Set Fecha Ingreso: " + empleado.getFechaIngreso());
    }

    // Set Fecha de Salida
    public static void pruebaSetFechaSalida(String fechaSalida) {
        Empleado empleado = new Empleado();
        empleado.setFechaSalida(fechaSalida);
        System.out.println("Resultado Set Fecha Salida: " + empleado.getFechaSalida());
    }

    // Set Estado
    public static void pruebaSetEstado(String estado) {
        Empleado empleado = new Empleado();
        empleado.setEstado(estado);
        System.out.println("Resultado Set Estado: " + empleado.getEstado());
    }

    // Consultar empleado
    public static void pruebaConsultarEmpleado() {
        Empleado empleado = new Empleado();
        System.out.println("Consultar Empleado: " + empleado.datosEmpleado());
    }

    // Editar empleado
    public static void pruebaEditarEmpleado(String nombre, String fechaIngreso, String estado) {
        Empleado empleado = new Empleado();
        boolean resultado = empleado.editarEmpleado(nombre, fechaIngreso, estado);
        if (resultado) {
            System.out.println("Empleado editado correctamente.");
        } else {
            System.out.println("Error al editar el empleado.");
        }
    }

    // Buscar empleado
    public static void pruebaBuscarEmpleado() {
        Empleado empleado = new Empleado();
        Empleado encontrado = empleado.buscarEmpleado();
        if (encontrado != null) {
            System.out.println("Empleado encontrado: " + encontrado.getNombre());
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }
}