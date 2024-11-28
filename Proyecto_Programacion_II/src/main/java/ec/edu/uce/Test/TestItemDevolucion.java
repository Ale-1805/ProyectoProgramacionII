package ec.edu.uce.Test;

import ec.edu.uce.Dominio.ItemDevolucion;
import ec.edu.uce.Util.Validaciones;

import java.util.Date;

public class TestItemDevolucion {
    public static void main(String[] args) {
        try {
            crearItemDevolucion();
            System.out.println("Prueba crearItemDevolucion: PASSED");

            validarCantidadNegativa();
            System.out.println("Prueba validarCantidadNegativa: PASSED");

            // Agregar más métodos de prueba aquí...
        } catch (AssertionError e) {
            System.err.println("Prueba fallida: " + e.getMessage());
        }
    }

    static void crearItemDevolucion() {
        ItemDevolucion item = new ItemDevolucion(1, "Monitor", 10, "Defecto de fábrica", "Pendiente", new Date(), "Sin observaciones");
        assert item != null : "El objeto no debe ser nulo";
        assert "Monitor".equals(item.getProducto()) : "Producto inválido";
        assert "Pendiente".equals(item.getEstado()) : "Estado de devolución inválido";
    }

    static void validarCantidadNegativa() {
        try {
            if (!Validaciones.validarCantidad(-5)) {
                throw new IllegalArgumentException("Cantidad inválida");
            }
        } catch (IllegalArgumentException e) {
            assert "Cantidad inválida".equals(e.getMessage()) : "Mensaje de excepción incorrecto";
        }
    }
}
