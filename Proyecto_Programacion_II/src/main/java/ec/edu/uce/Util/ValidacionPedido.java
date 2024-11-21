package ec.edu.uce.Util;

import ec.edu.uce.Dominio.Pedido;

import java.time.LocalDate;
import java.util.Scanner;

public class ValidacionPedido {
    public static boolean validarId(String id) {
        return id != null && !id.trim().isEmpty();
    }

    public static boolean validarFecha(LocalDate fecha) {
        return fecha != null;
    }

    public static boolean validarEstado(String estado) {
        return estado != null && (estado.equalsIgnoreCase("Entregado") || estado.equalsIgnoreCase("En Camino"));
    }

    public static boolean validarItemPedido(String itemPedido) {
        return itemPedido != null && !itemPedido.trim().isEmpty();
    }
}
