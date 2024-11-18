package ec.edu.uce.Dominio;

import java.util.Date;

public class Empleado {
    private String nombre;
    private Date fechaIngreso;
    private Date fechaSalida;
    private String estado;

    //constructor
    public Empleado (String newnombre, Date newfechaIngreso, Date newfechaSalida, String newestado){
        nombre = newnombre;
        fechaIngreso = newfechaIngreso;
        fechaSalida = newfechaSalida;
        estado = newestado;
    }
    //SET y GET

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void DatosEmpleado(){
        System.out.println(nombre);
    }

}
