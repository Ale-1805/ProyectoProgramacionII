package ec.edu.uce.Test;

import ec.edu.uce.Dominio.JefeDeBodega;

import java.util.Date;

public class TestJefeDeBodega {
    public static void main(String[] args) {
        JefeDeBodega jefe = new JefeDeBodega("Jhon Aucancela", new Date(), new Date(), "Activo", 25, "Mañana");

        jefe.mostrarDatos();

        jefe.consultarReportes();
        jefe.consultarEstadoDeProductos();
        jefe.devolverProducto("Producto A");
    }

}
