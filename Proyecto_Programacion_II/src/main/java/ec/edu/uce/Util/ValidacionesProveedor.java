package ec.edu.uce.Util;

import ec.edu.uce.Dominio.Proveedor;

public class ValidacionesProveedor {
    public static void main(String[] args) {
        // Crear un objeto Proveedor con datos válidos
        Proveedor proveedor = new Proveedor(1, "Proveedor A", "contacto@proveedor.com");

        // Mostrar datos iniciales del proveedor
        System.out.println("Datos iniciales del proveedor:");
        mostrarDatosProveedor(proveedor);

        // Intentar modificar los datos con validaciones
        modificarDatosProveedor(proveedor, -1, "", ""); // Datos erróneos
        modificarDatosProveedor(proveedor, 2, "Proveedor B", "contacto@proveedorB.com"); // Datos válidos
    }

    // Método para mostrar los datos del proveedor
    private static void mostrarDatosProveedor(Proveedor proveedor) {
        System.out.println("ID: " + proveedor.getId());
        System.out.println("Nombre: " + proveedor.getNombre());
        System.out.println("Contacto: " + proveedor.getContacto());
    }

    // Método para modificar los datos del proveedor con validaciones
    private static void modificarDatosProveedor(Proveedor proveedor, int id, String nombre, String contacto) {
        System.out.println("\nIntentando modificar datos...");
        proveedor.setId(id);
        proveedor.setNombre(nombre);
        proveedor.setContacto(contacto);
        mostrarDatosProveedor(proveedor);
    }

}
