package ec.edu.uce.Util;

import ec.edu.uce.Dominio.Producto;

public class ValidacionProducto {
    public static void main(String[] args) {
        // Crear un objeto Producto con datos válidos
        Producto producto = new Producto("P123", "Producto A", 10, 50.0);

        // Mostrar datos iniciales del producto
        System.out.println("Datos iniciales del producto:");
        mostrarDatosProducto(producto);

        // Intentar modificar los datos con validaciones
        modificarDatosProducto(producto, "", "Producto B", -5, -10.0); // Datos erróneos
        modificarDatosProducto(producto, "P124", "Producto C", 15, 75.0); // Datos válidos
    }

    // Metodo para mostrar los datos del producto
    private static void mostrarDatosProducto(Producto producto) {
        System.out.println("ID: " + producto.getId());
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Cantidad: " + producto.getCantidad());
        System.out.println("Precio: " + producto.getPrecio());
    }

    // Metodo para modificar los datos del producto con validaciones
    private static void modificarDatosProducto(Producto producto, String id, String nombre, int cantidad, double precio) {
        System.out.println("\nIntentando modificar datos...");
        producto.setId(id);
        producto.setNombre(nombre);
        producto.setCantidad(cantidad);
        producto.setPrecio(precio);
        mostrarDatosProducto(producto);
    }
}
