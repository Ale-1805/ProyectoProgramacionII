package ec.edu.uce.Dominio;

public class Empleado {
    private String nombre;
    private String fechaIngreso; // Cambié de Date a String
    private String fechaSalida;  // Cambié de Date a String
    private String estado;

    // Constructor con parámetros
    public Empleado(String nombre, String fechaIngreso, String fechaSalida, String estado) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.estado = estado;
    }

    // Constructor por defecto
    public Empleado() {
        this.nombre = "Sin Nombre";
        this.fechaIngreso = "S/F"; // Fecha por defecto
        this.fechaSalida = "S/F";  // Fecha por defecto
        this.estado = "Sin Estado";
    }

    // Métodos SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Métodos GET
    public String getNombre() {
        return nombre;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public String getEstado() {
        return estado;
    }

    // Metodo para mostrar los datos del empleado
    public String datosEmpleado() {
        return "Empleado { " +
                "Nombre='" + nombre + '\'' +
                ", Fecha de Ingreso='" + fechaIngreso + '\'' +
                ", Fecha de Salida='" + fechaSalida + '\'' +
                ", Estado='" + estado + '\'' +
                '}';
    }

    // Consultar empleado
    public String consultarEmpleado() {
        return datosEmpleado();
    }

    // Editar empleado
    public boolean editarEmpleado(String nombre, String fechaIngreso, String estado) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
            this.fechaIngreso = fechaIngreso;
            this.estado = estado;
            return true;
        }
        return false; // Si no es válido, no se edita
    }

    // Buscar empleado
    public Empleado buscarEmpleado() {
        return this; // En este caso, simplemente retorna el empleado actual
    }
}