package ec.edu.uce.Dominio;

import java.util.Date;

public class Empleado {
    private String nombre;
    private Date fechaIngreso;
    private Date fechaSalida;
    private String estado;
    private Empleado[] empleadosAsociados; // Asociación con otros empleados
    private int numeroDeEmpleadosAsociados;

    // Constructor con parámetros
    public Empleado(String nombre, Date fechaIngreso, Date fechaSalida, String estado) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.estado = estado;
        this.empleadosAsociados = new Empleado[5]; // Capacidad predeterminada de 5 empleados
        this.numeroDeEmpleadosAsociados = 0;
    }

    // Constructor por defecto
    public Empleado() {
        this.nombre = "null";
        this.fechaIngreso = null;
        this.fechaSalida = null;
        this.estado = "null";
        this.empleadosAsociados = new Empleado[5]; // Capacidad predeterminada
        this.numeroDeEmpleadosAsociados = 0;
    }

    // Métodos para manejar empleados asociados
    public boolean agregarEmpleadoAsociado(Empleado empleado) {
        if (numeroDeEmpleadosAsociados < empleadosAsociados.length) {
            empleadosAsociados[numeroDeEmpleadosAsociados] = empleado;
            numeroDeEmpleadosAsociados++;
            return true;
        }
        return false; // No se pudo agregar el empleado, arreglo lleno
    }

    public String consultarEmpleadosAsociados() {
        StringBuilder info = new StringBuilder("Empleados asociados:\n");
        for (int i = 0; i < numeroDeEmpleadosAsociados; i++) {
            info.append(empleadosAsociados[i].getNombre()).append("\n");
        }
        return info.toString();
    }

    public Empleado buscarEmpleadoAsociado(int posicion) {
        if (posicion >= 0 && posicion < numeroDeEmpleadosAsociados) {
            return empleadosAsociados[posicion];
        }
        return null; // Posición inválida
    }

    // Métodos GET y SET existentes
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Metodo para mostrar los datos del empleado
    public String datosEmpleado() {
        return "Empleado {" +
                "\nNombre='" + getNombre() + '\'' +
                "\nFecha de Ingreso=" + (getFechaIngreso() != null ? getFechaIngreso() : "No registrada") +
                "\nFecha de Salida=" + (getFechaSalida() != null ? getFechaSalida() : "No registrada") +
                "\nEstado='" + getEstado() + '\'' +
                "\nEmpleados Asociados=" + consultarEmpleadosAsociados() +
                "\n}";
    }
}