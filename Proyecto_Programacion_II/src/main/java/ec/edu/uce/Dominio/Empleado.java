package ec.edu.uce.Dominio;
import ec.edu.uce.Util.Validaciones;
import java.util.Date;

public class Empleado {
    private String nombre;
    private Date fechaIngreso;
    private Date fechaSalida;
    private String estado;

    //constructor
    public Empleado (String nombre, Date fechaIngreso, Date fechaSalida, String estado){
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.estado = estado;
    }
    public Empleado (){
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.estado = estado;
    }
    //SET y GET

    public void setNombre(String nombre) {
        if (Validaciones.validarNombre(nombre) && !nombre.trim().isEmpty() && nombre.length() >= 3 && nombre.length() <= 50) {
            this.nombre = nombre;
        } else
            System.out.println("El nombre debe tener entre 3 y 50 caracteres y no puede estar vacío.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        if (Validaciones.validarFechaIngreso(fechaIngreso)) {
            this.fechaIngreso = fechaIngreso;
        } else
            System.out.println("La fecha de ingreso debe ser anterior o igual a la fecha actual.");
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaSalida(Date fechaSalida) {
        if (Validaciones.validarFechaSalida(fechaSalida, fechaIngreso)) {
            this.fechaSalida = fechaSalida;
        } else
            System.out.println("La fecha de salida debe ser posterior a la fecha de ingreso.");
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setEstado(String estado) {
        if (Validaciones.validarEstadoEmpleado(estado)) {
            this.estado = estado;
        } else
            System.out.println("El estado debe ser 'Activo' o 'Inactivo'");
    }

    public String getEstado() {
        return estado;
    }

    public void DatosEmpleado(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Fecha de Ingreso: " + (getFechaIngreso() != null ? getFechaIngreso() : "No registrada"));
        System.out.println("Fecha de Salida: " + (getFechaSalida() != null ? getFechaSalida() : "No registrada"));
        System.out.println("Estado: " + getEstado());
    }
}
