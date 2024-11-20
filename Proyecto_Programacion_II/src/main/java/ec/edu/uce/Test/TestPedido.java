package ec.edu.uce.Test;

import ec.edu.uce.Dominio.Pedido;
import java.time.LocalDate;

public class TestPedido {
    public static void main(String[] args) {

        Object pedido = new Pedido();
        pruebaconstructor();
        pruebaconstructor1("123",LocalDate.of(2000, 01, 01), "Entregado", "Jabon");
        pruebaSetId("123");
        pruebaSetFecha(LocalDate.of(2024, 11, 19));
        pruebaSetEstado("En Camino");
        pruebaSetItemPedido("Shampoo");
    }

    //contructor por defecto
    public static void pruebaconstructor(){
        Pedido pedido = new Pedido();
        System.out.println("Constructor por defecto creado.");
    }

    //constructor con parámetros
    public static void pruebaconstructor1(String ide, LocalDate fecha, String estado, String itemPedido){
        Pedido pedido = new Pedido();
        System.out.println("Constructor con parámetros creado.");
    }

    //setId
    public static void pruebaSetId(String id){
        Pedido pedido = new Pedido();
        pedido.setId(id);
        System.out.println("ID Set: " + pedido.getId());
    }

    //setFecha
    public static void pruebaSetFecha(LocalDate fecha) {
        Pedido pedido = new Pedido();
        pedido.setFecha(fecha);
        System.out.println("Fecha Set: " + pedido.getFecha());
    }

    //setEstado
    public static void pruebaSetEstado(String estado) {
        Pedido pedido = new Pedido();
        pedido.setEstado(estado);
        System.out.println("Estado Set: " + pedido.getEstado());
    }

    //setItemPedido
    public static void pruebaSetItemPedido(String itemPedido) {
        Pedido pedido = new Pedido();
        pedido.setItemPedido(itemPedido);
        System.out.println("Item Pedido Set: " + pedido.getItemPedido());
    }
}
