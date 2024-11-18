package ec.edu.uce.Util;

import java.util.Scanner;

public class ValidacionesProducto {
    public static boolean validarNombre(String nombre) {
        return nombre.matches("[a-zA-Z\\s]+");
    }

    public static boolean validarCantidad(int cantidad) {
        return cantidad >= 0;
    }

    public static boolean validarPrecio(double precio) {
        return precio >= 0;
    }

    public static void main(String[] args) {
        String nombreProducto = "Manzana";
        int cantidadProducto = 10;
        double precioProducto = 2.5;

        if (validarNombre(nombreProducto) && validarCantidad(cantidadProducto) && validarPrecio(precioProducto)) {
            System.out.println("Los datos del producto son válidos.");
        } else {
            System.out.println("Los datos del producto son inválidos.");
        }
    }
}
