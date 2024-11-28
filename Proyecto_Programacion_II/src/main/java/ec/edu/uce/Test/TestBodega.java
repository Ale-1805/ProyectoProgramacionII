package ec.edu.uce.Test;

import ec.edu.uce.Dominio.Bodega;

public class TestBodega {
    public static void main(String[] args) {
        // Crear una bodega con datos válidos
        Bodega bodega = new Bodega("Central", "Calle 123-A", "User123");

        // Mostrar la información de la bodega usando toString()
        System.out.println(bodega);

        System.out.println(""); // Línea vacía para separar

        // Prueba de setters
        bodega.setNombre("CentralA");
        bodega.setUbicacion("Calle Brasil y Alcatraz");

        // Mostrar nuevamente la información de la bodega
        System.out.println(bodega);
    }
}

