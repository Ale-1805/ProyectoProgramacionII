package ec.edu.uce.Dominio;
import java.util.Date;

public class Devolucion {
    private String sucursal;
    private String pedido;
    private Date fecha;
    private String estado;

    // CONSTRUCTOR
    public Devolucion(String nombreSucursal, String pedido, Date fecha, String estado) {
        this.sucursal = nombreSucursal;
        this.pedido = pedido;
        this.fecha = fecha;
        this.estado = estado;
    }
    // SET Y GET
    public void setPedido(String pedido) {this.pedido = pedido;}
    public String getPedido() {return pedido;}

    public void setSucursal(String sucursal) {this.sucursal = sucursal;}
    public String getSucursal() {return sucursal;}

    public void setEstado(String estado) {this.estado = estado;}
    public String getEstado() {return estado;}

    public void setFecha(Date fecha) {this.fecha = fecha;}
    public Date getFecha() {return fecha;}

}
