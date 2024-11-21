package ec.edu.uce.Dominio;

import ec.edu.uce.Util.ValidacionJefeBodega;

import java.util.Scanner;

public class JefeDeBodega {
    // Atributos
    private String nombre;
    private String fechaIngreso;
    private String turno;

    // Constructor
    public JefeDeBodega() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar Nombre con validación
        boolean nombreValido = false;
        while (!nombreValido) {
            System.out.print("Ingrese el nombre del jefe de bodega: ");
            String nombreInput = scanner.nextLine();
            if (setNombre(nombreInput)) {  // Llamar al setter para validar y asignar el nombre
                nombreValido = true;
            } else {
                System.out.println("El nombre ingresado no es válido. Solo se permiten letras y espacios.");
            }
        }

        // Solicitar Fecha de Ingreso con validación
        boolean fechaValida = false;
        while (!fechaValida) {
            System.out.print("Ingrese la fecha de ingreso (dd/MM/yyyy): ");
            String fechaIngresoInput = scanner.nextLine();
            if (setFechaIngreso(fechaIngresoInput)) {  // Llamar al setter para validar y asignar la fecha
                fechaValida = true;
            } else {
                System.out.println("La fecha de ingreso no es válida. Debe ser en el formato dd/MM/yyyy.");
            }
        }

        // Solicitar Turno con validación
        boolean turnoValido = false;
        while (!turnoValido) {
            System.out.print("Ingrese el turno (mañana o noche): ");
            String turnoInput = scanner.nextLine();
            if (setTurno(turnoInput)) {  // Llamar al setter para validar y asignar el turno
                turnoValido = true;
            } else {
                System.out.println("El turno ingresado no es válido. Debe ser 'mañana' o 'noche'.");
            }
        }

        // Mostrar los datos ingresados
        mostrarDatos();
    }

    // Getter y Setter para el Nombre
    public String getNombre() {
        return nombre;
    }

    public boolean setNombre(String nombre) {
        if (ValidacionJefeBodega.validarNombre(nombre)) {
            this.nombre = nombre;
            return true;
        }
        return false;
    }

    // Getter y Setter para la Fecha de Ingreso
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public boolean setFechaIngreso(String fechaIngreso) {
        if (ValidacionJefeBodega.validarFecha(fechaIngreso)) {
            this.fechaIngreso = fechaIngreso;
            return true;
        }
        return false;
    }

    // Getter y Setter para el Turno
    public String getTurno() {
        return turno;
    }

    public boolean setTurno(String turno) {
        if (ValidacionJefeBodega.validarTurno(turno)) {
            this.turno = turno;
            return true;
        }
        return false;
    }

    // Metodo para mostrar los datos del jefe de bodega
    public void mostrarDatos() {
        if (nombre != null && fechaIngreso != null && turno != null) {
            System.out.println("Nombre del Jefe de Bodega: " + getNombre());
            System.out.println("Fecha de Ingreso: " + getFechaIngreso());
            System.out.println("Turno: " + getTurno());
        } else {
            System.out.println("No se pudo registrar al jefe de bodega debido a datos inválidos.");
        }
    }
}
