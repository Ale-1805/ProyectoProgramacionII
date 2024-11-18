package ec.edu.uce.Test;

import ec.edu.uce.Dominio.Proveedor;

public class TestProveedor {
    // MÉTODOS DE PRUEBA
    public static void main(String[] args) {
        Proveedor proveedor = new Proveedor(1, "Proveedor ABC", "contacto@abc.com");

        // Pruebas del constructor y get
        assert proveedor.getId() == 1 : "Error en getId()";
        assert proveedor.getNombre().equals("Proveedor ABC") : "Error en getNombre()";
        assert proveedor.getContacto().equals("contacto@abc.com") : "Error en getContacto()";
        // Imprimir
        System.out.println("Datos iniciales del proveedor:");
        System.out.println("ID: " + proveedor.getId());
        System.out.println("Nombre: " + proveedor.getNombre());
        System.out.println("Contacto: " + proveedor.getContacto());

        // Prueba de los set
        proveedor.setId(2);
        proveedor.setNombre("Proveedor XYZ");
        proveedor.setContacto("contacto@xyz.com");
        //VERIFICACIÓN
        assert proveedor.getId() == 2 : "Error en setId()";
        assert proveedor.getNombre().equals("Proveedor XYZ") : "Error en setNombre()";
        assert proveedor.getContacto().equals("contacto@xyz.com") : "Error en setContacto()";

        // Imprimir
        System.out.println("\nDatos actualizados del proveedor:");
        System.out.println("ID: " + proveedor.getId());
        System.out.println("Nombre: " + proveedor.getNombre());
        System.out.println("Contacto: " + proveedor.getContacto());

        System.out.println("\nTodas las pruebas pasaron correctamente.");
}

}
