package ec.edu.uce.Util;

import ec.edu.uce.Dominio.Bodega;

public class ValidacionBodega {
    public static void main(String[] args) {
        // Crear un objeto Bodega con datos iniciales válidos
        Bodega bodega = new Bodega("Bodega Central", "Avenida Principal", "Productos A, B, C", "Usuario1, Usuario2");

        // Mostrar datos iniciales de la bodega
        System.out.println("Datos iniciales de la bodega:");
        mostrarDatosBodega(bodega);

        // Intentar modificar los datos con validaciones
        modificarDatosBodega(bodega, "", "Ubicación nueva", "Productos D, E, F", "Usuario3"); // Datos erróneos
        modificarDatosBodega(bodega, "Bodega Sur", "Calle 5", "Productos G, H", "Usuario4"); // Datos válidos
    }

    // Metodo para mostrar los datos de la bodega
    private static void mostrarDatosBodega(Bodega bodega) {
        System.out.println("Nombre: " + bodega.getNombre());
        System.out.println("Ubicación: " + bodega.getUbicacion());
        System.out.println("Productos: " + bodega.getProductos());
        System.out.println("Usuarios: " + bodega.getUsuarios());
    }

    // Metodo para modificar los datos de la bodega con validaciones
    private static void modificarDatosBodega(Bodega bodega, String nombre, String ubicacion, String productos, String usuarios) {
        System.out.println("\nIntentando modificar datos...");
        bodega.setNombre(nombre);
        bodega.setUbicacion(ubicacion);
        bodega.setProductos(productos);
        bodega.setUsuarios(usuarios);
        mostrarDatosBodega(bodega);
    }
}
