package ec.edu.uce.Dominio;

import ec.edu.uce.Util.Validaciones;

import java.time.LocalDate;

public class Pedido {
    private int id;
    private LocalDate fecha;
    private String estado;
    private String itemPedido;

    //Constructor
    public Pedido (int id, LocalDate fecha, String estado, String itemPedido){
        this.id = id;
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

    public void setId(int id) {
        if (Validaciones.validarId(id)) {
            this.id = id;
        } else
            System.out.println("El ID no puede ser nulo o vacío.");
    }

    public int getId() {
        return id;
    }

    public void setFecha(LocalDate fecha) {
        if (Validaciones.validarFechaLocal(fecha)) {
            this.fecha = fecha;
        } else
            System.out.println("La fecha no puede ser nula.");
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setEstado(String estado) {
        if (Validaciones.validarEstadoPedido(estado)) {
            this.estado = estado;
        } else
            System.out.println("El estado debe ser 'Entregado' o 'En Camino'");
    }

    public String getEstado() {
        return estado;
    }

    public void setItemPedido(String itemPedido) {
        if (Validaciones.validarItemPedido(itemPedido)) {
            this.itemPedido = itemPedido;
        } else
            System.out.println("El item del pedido no puede ser nulo.");
    }

    public String getItemPedido() {
        return itemPedido;
    }

}
