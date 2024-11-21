package ec.edu.uce.Dominio;

import ec.edu.uce.Util.ValidacionPedido;

import java.time.LocalDate;

public class Pedido {
    private String id;
    private LocalDate fecha;
    private String estado;
    private String itemPedido;

    //Constructor
    public Pedido (String ide, LocalDate fecha, String estado, String itemPedido){
        this.id = ide;
        this.fecha = fecha;
        this.estado = estado;
        this.itemPedido = itemPedido;
    }
    public Pedido (){
        this.id = id;
        this.fecha = fecha;
        this.estado = estado;
        this.itemPedido = itemPedido;
    }
    //SET y GET

    public void setId(String id) {
        if (ValidacionPedido.validarId(id)) {
            this.id = id;
        } else
            System.out.println("El ID no puede ser nulo o vacío.");
    }

    public String getId() {
        return id;
    }

    public void setFecha(LocalDate fecha) {
        if (ValidacionPedido.validarFecha(fecha)) {
            this.fecha = fecha;
        } else
            System.out.println("La fecha no puede ser nula.");
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setEstado(String estado) {
        if (ValidacionPedido.validarEstado(estado)) {
            this.estado = estado;
        } else
            System.out.println("El estado debe ser 'Entregado' o 'En Camino'");
    }

    public String getEstado() {
        return estado;
    }

    public void setItemPedido(String itemPedido) {
        if (ValidacionPedido.validarItemPedido(itemPedido)) {
            this.itemPedido = itemPedido;
        } else
            System.out.println("El item del pedido no puede ser nulo.");
    }

    public String getItemPedido() {
        return itemPedido;
    }

}
