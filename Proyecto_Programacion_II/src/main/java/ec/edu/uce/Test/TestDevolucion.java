package ec.edu.uce.Test;

import ec.edu.uce.Dominio.Devolucion;

import java.util.Date;

public class TestDevolucion {
    // MÉTODOS DE PRUEBA
    public static void main(String[] args) {
        Date fechaPrueba = new Date();

        // Prueba del constructor y get
        Devolucion devolucion = new Devolucion("Sucursal 1", "Pedido123", fechaPrueba, "Pendiente");
        assert devolucion.getSucursal().equals("Sucursal 1") : "Error en getSucursal()";
        assert devolucion.getPedido().equals("Pedido123") : "Error en getPedido()";
        assert devolucion.getFecha().equals(fechaPrueba) : "Error en getFecha()";
        assert devolucion.getEstado().equals("Pendiente") : "Error en getEstado()";
        // Imprimir
        System.out.println("Datos iniciales de la devolución:");
        System.out.println("Sucursal: " + devolucion.getSucursal());
        System.out.println("Pedido: " + devolucion.getPedido());
        System.out.println("Fecha: " + devolucion.getFecha());
        System.out.println("Estado: " + devolucion.getEstado());

        // Prueba de los set
        Date nuevaFecha = new Date();
        devolucion.setSucursal("Sucursal 2");
        devolucion.setPedido("Pedido456");
        devolucion.setFecha(nuevaFecha);
        devolucion.setEstado("Completado");
        // VERIFICACIÓN
        assert devolucion.getSucursal().equals("Sucursal 2") : "Error en setSucursal()";
        assert devolucion.getPedido().equals("Pedido456") : "Error en setPedido()";
        assert devolucion.getFecha().equals(nuevaFecha) : "Error en setFecha()";
        assert devolucion.getEstado().equals("Completado") : "Error en setEstado()";
        // Imprimir
        System.out.println("\nDatos actualizados de la devolución:");
        System.out.println("Sucursal: " + devolucion.getSucursal());
        System.out.println("Pedido: " + devolucion.getPedido());
        System.out.println("Fecha: " + devolucion.getFecha());
        System.out.println("Estado: " + devolucion.getEstado());

        System.out.println("\nTodas las pruebas pasaron correctamente.");
    }

}
