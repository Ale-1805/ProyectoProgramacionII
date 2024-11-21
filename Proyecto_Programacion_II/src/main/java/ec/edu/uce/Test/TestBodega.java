package ec.edu.uce.Test;
import ec.edu.uce.Dominio.Bodega;
public class TestBodega {
    public static void main(String[] args) {
        // Crear una bodega con datos válidos
        Bodega bodega = new Bodega("Central", "Calle 123-A", "Laptops", "User123");

        // Mostrar la información de la bodega
        bodega.mostrar();
        System.out.println("");
        //Prueba de setters
        bodega.setNombre("CentralA");
        bodega.setUbicacion("Calle Brasil y Alcatraz");
        bodega.setProductos("Pan");
        bodega.setUsuarios("User454");
        //Mostrar
        bodega.mostrar();
    }
}
