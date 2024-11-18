package ec.edu.uce.Dominio;

import java.util.Date;

public class JefeDeBodega {
    private String nombre;
    private Date fechaIngreso;
    private Date fechaSalida;
    private String estado;
    private int experiencia; // Años de trabajo
    private String turno;    // Turno (mañana o noche)
    public JefeDeBodega(String nombre, Date fechaIngreso, Date fechaSalida, String estado, int experiencia, String turno) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.estado = estado;
        this.experiencia = experiencia;
        this.turno = turno;
    }
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
    public int getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public void consultarReportes() {
        System.out.println("Consultando reportes de la bodega...");
    }
    public void consultarEstadoDeProductos() {
        System.out.println("Consultando el estado de los productos en la bodega...");
    }
    public void devolverProducto(String producto) {
        System.out.println("Devolviendo el producto en mal estado: " + producto);
    }
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Ingreso: " + fechaIngreso);
        System.out.println("Fecha de Salida: " + fechaSalida);
        System.out.println("Estado: " + estado);
        System.out.println("Experiencia: " + experiencia + " años");
        System.out.println("Turno: " +  turno);
    }

}
