package ec.edu.uce.Test;

import ec.edu.uce.Dominio.Devolucion;
import ec.edu.uce.Dominio.Producto;

public class TestDevolucion {
    private static Devolucion devolucion;

    public static void main(String[] args) {
        // Inicialización de la clase Devolucion
        devolucion = new Devolucion("Sucursal Central", "Pendiente", "01/12/2024", "DEV-1234");

        // Crear productos
        Producto producto1 = new Producto(1, "Producto A", 10, 100.0);
        Producto producto2 = new Producto(2, "Producto B", 5, 150.0);
        Producto productoEditado = new Producto(2, "Producto B Editado", 8, 170.0);

        // Inicializar los productos en la devolución
        devolucion.setProductos(new Producto[] {producto1, producto2});

        // Consultar los productos iniciales
        System.out.println("Productos iniciales:");
        System.out.println(devolucion.consultarProductos());

        // 1. Probar agregar un producto
        devolucion.agregarProducto(new Producto(3, "Producto C", 15, 200.0));
        System.out.println("\nProductos después de agregar uno nuevo:");
        System.out.println(devolucion.consultarProductos());

        // 2. Probar editar un producto
        boolean resp = devolucion.editarProducto(1, productoEditado);
        if (!resp) {
            System.out.println("Error al modificar producto.");
        }
        System.out.println("\nProductos después de editar el segundo producto:");
        System.out.println(devolucion.consultarProductos());

        // 3. Consultar el estado de un producto
        System.out.println("\nEstado del producto 1:");
        System.out.println(producto1.getEstado());

        // 4. Consultar el estado de un producto editado
        System.out.println("\nEstado del producto editado:");
        System.out.println(productoEditado.getEstado());

        // 5. Probar generar un código de devolución único
        String codigoGenerado = devolucion.generarCodigoDevolucion();
        System.out.println("\nCódigo de devolución generado: " + codigoGenerado);

        // 6. Probar el metodo toString de la devolución
        System.out.println("\nInformación de la devolución:");
        System.out.println(devolucion.toString());
    }
}
