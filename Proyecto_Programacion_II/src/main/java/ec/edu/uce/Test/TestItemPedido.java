package ec.edu.uce.Test;

import ec.edu.uce.Dominio.ItemPedido;
import ec.edu.uce.Util.Validaciones;

public class TestItemPedido {
    public static void main(String[] args) {
        try {
            crearItemPedido();
            System.out.println("Prueba crearItemPedido: PASSED");

            validarCantidadNegativa();
            System.out.println("Prueba validarCantidadNegativa: PASSED");

            validarPrecioInvalido();
            System.out.println("Prueba validarPrecioInvalido: PASSED");

            actualizarCantidad();
            System.out.println("Prueba actualizarCantidad: PASSED");

            actualizarEstado();
            System.out.println("Prueba actualizarEstado: PASSED");

            validarProductoVacio();
            System.out.println("Prueba validarProductoVacio: PASSED");

            compararItems();
            System.out.println("Prueba compararItems: PASSED");

        } catch (AssertionError e) {
            System.err.println("Prueba fallida: " + e.getMessage());
        }
    }

    static void crearItemPedido() {
            ItemPedido item = new ItemPedido(1, 5, "Laptop", 1200.99, "Disponible");
            assert item != null : "El objeto no debe ser nulo";
            assert "Laptop".equals(item.getProducto()) : "El producto no coincide";
            assert 1200.99 == item.getPrecioUnitario() : "El precio no coincide";
        }

        static void validarCantidadNegativa(){
            try {
                if (!Validaciones.validarCantidad(-5)) {
                    throw new IllegalArgumentException("Cantidad inválida");
                }
            } catch (IllegalArgumentException e) {
                assert "Cantidad inválida".equals(e.getMessage()) : "Mensaje de excepción incorrecto";
            }
        }

        static void validarPrecioInvalido() {
            try {
                if (!Validaciones.validarPrecio(-1.0)) {
                    throw new IllegalArgumentException("Precio inválido");
                }
            } catch (IllegalArgumentException e) {
                assert "Precio inválido".equals(e.getMessage()) : "Mensaje de excepción incorrecto";
            }
        }

        static void actualizarCantidad() {
            ItemPedido item = new ItemPedido(1, 5, "Laptop", 1200.99, "Disponible");
            item.actualizarCantidad(10);
            assert 10 == item.getCantidad() : "La cantidad no se actualizó correctamente";
        }

        static void actualizarEstado() {
            ItemPedido item = new ItemPedido(1, 5, "Laptop", 1200.99, "Disponible");
            item.actualizarEstado("En tránsito");
            assert "En tránsito".equals(item.getEstado()) : "El estado no se actualizó correctamente";
        }

        static void validarProductoVacio() {
            try {
                if (!Validaciones.validarProducto("")) {
                    throw new IllegalArgumentException("Producto inválido");
                }
            } catch (IllegalArgumentException e) {
                assert "Producto inválido".equals(e.getMessage()) : "Mensaje de excepción incorrecto";
            }
        }

        static void compararItems() {
            ItemPedido item1 = new ItemPedido(1, 5, "Laptop", 1200.99, "Disponible");
            ItemPedido item2 = new ItemPedido(1, 10, "Laptop", 1200.99, "Disponible");
            assert item1.equals(item2) : "Los objetos deberían ser iguales";
        }

    }

