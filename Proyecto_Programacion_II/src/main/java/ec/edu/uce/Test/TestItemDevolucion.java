package ec.edu.uce.Test;

import ec.edu.uce.Dominio.Devolucion;
import ec.edu.uce.Dominio.ItemDevolucion;
import ec.edu.uce.Dominio.Producto;

public class TestItemDevolucion {
    private static ItemDevolucion itemDevolucion;

    public static void main(String[] args) {
        // Crear un Producto
        Producto producto1 = new Producto(1, "Producto A", 10, 100.0);

        // Crear el ItemDevolucion con un producto, cantidad y razón de devolución
        itemDevolucion = new ItemDevolucion(1, producto1, 3, "Producto defectuoso");

        // Crear devoluciones
        Devolucion devolucion1 = new Devolucion("Sucursal Central", "Pendiente", "01/12/2024", "DEV-1234");
        Devolucion devolucion2 = new Devolucion("Sucursal Norte", "Completada", "02/12/2024", "DEV-5678");

        // Inicializar las devoluciones en el ItemDevolucion
        itemDevolucion.agregarDevolucion(devolucion1);
        itemDevolucion.agregarDevolucion(devolucion2);

        // Consultar las devoluciones iniciales
        System.out.println("Devoluciones iniciales:");
        System.out.println(itemDevolucion.consultarDevoluciones());

        // 1. Probar agregar una nueva devolución
        Devolucion devolucion3 = new Devolucion("Sucursal Sur", "Pendiente", "03/12/2024", "DEV-9876");
        itemDevolucion.agregarDevolucion(devolucion3);
        System.out.println("\nDevoluciones después de agregar una nueva:");
        System.out.println(itemDevolucion.consultarDevoluciones());

        // 2. Probar editar una devolución
        Devolucion devolucionEditada = new Devolucion("Sucursal Este", "Completada", "04/12/2024", "DEV-2222");
        boolean resp = itemDevolucion.editarDevolucion(1, devolucionEditada);
        if (!resp) {
            System.out.println("Error al modificar la devolución.");
        }
        System.out.println("\nDevoluciones después de editar la segunda devolución:");
        System.out.println(itemDevolucion.consultarDevoluciones());

        // 3. Consultar un producto asociado al ItemDevolucion
        System.out.println("\nProducto asociado al ItemDevolucion:");
        System.out.println(itemDevolucion.getProducto().toString());

        // 4. Consultar la cantidad devuelta
        System.out.println("\nCantidad devuelta en el ItemDevolucion:");
        System.out.println(itemDevolucion.getCantidadDevuelta());

        // 5. Probar el metodo toString del ItemDevolucion
        System.out.println("\nInformación del ItemDevolucion:");
        System.out.println(itemDevolucion.toString());
    }
}