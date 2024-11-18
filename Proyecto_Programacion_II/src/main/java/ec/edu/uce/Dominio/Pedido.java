package ec.edu.uce.Dominio;

import java.time.LocalDate;

public class Pedido {
    private String id;
    private LocalDate fecha;
    private String estado;
    private String itemPedido;

    //Constructor
    public Pedido (String newide, LocalDate newfecha, String newestado, String newitemPedido){
        id = newide;
        fecha = newfecha;
        estado = newestado;
        itemPedido = newitemPedido;
    }
    //SET y GET

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setItemPedido(String itemPedido) {
        this.itemPedido = itemPedido;
    }

    public String getItemPedido() {
        return itemPedido;
    }

}
