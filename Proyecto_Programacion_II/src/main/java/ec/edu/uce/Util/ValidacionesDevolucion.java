package ec.edu.uce.Util;

import ec.edu.uce.Dominio.Devolucion;

import java.util.Date;

public class ValidacionesDevolucion {
    public static void main(String[] args) {
        // Crear un objeto Devolucion con datos válidos
        Devolucion devolucion = new Devolucion("Sucursal A", "Pedido123", new Date(), "Pendiente");

        // Mostrar datos iniciales de la devolución
        System.out.println("Datos iniciales de la devolución:");
        mostrarDatosDevolucion(devolucion);

        // Intentar modificar los datos con validaciones
        modificarDatosDevolucion(devolucion, "", "", null, ""); // Datos erróneos
        modificarDatosDevolucion(devolucion, "Sucursal B", "Pedido456", new Date(), "Completado"); // Datos válidos
    }

    // Metodo para mostrar los datos de la devolución
    private static void mostrarDatosDevolucion(Devolucion devolucion) {
        System.out.println("Sucursal: " + devolucion.getSucursal());
        System.out.println("Pedido: " + devolucion.getPedido());
        System.out.println("Fecha: " + devolucion.getFecha());
        System.out.println("Estado: " + devolucion.getEstado());
    }

    // Metodo para modificar los datos de la devolución con validaciones
    private static void modificarDatosDevolucion(Devolucion devolucion, String sucursal, String pedido, Date fecha, String estado) {
        System.out.println("\nIntentando modificar datos...");
        devolucion.setSucursal(sucursal);
        devolucion.setPedido(pedido);
        devolucion.setFecha(fecha);
        devolucion.setEstado(estado);
        mostrarDatosDevolucion(devolucion);
    }
}
