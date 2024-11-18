package ec.edu.uce.Test;
import ec.edu.uce.Dominio.Producto;
public class TestProducto {
    public static void main(String[] args) {
        Producto producto1 = new Producto("0023", "Manzana", 5, 1.23);
        System.out.println("Nombre: "+producto1.getNombre());
        System.out.println("Id de Producto: "+producto1.getId());
        System.out.println("Cantidad: "+producto1.getCantidad());
        System.out.println("Precio: "+producto1.getPrecio());
        //Verificacion de estado
        if (producto1.verificarEstado()) {
            System.out.println("El producto " + producto1.getNombre() + " está disponible.");
        } else {
            System.out.println("El producto " + producto1.getNombre() + " está agotado.");
        }
        //Salto de linea
        System.out.println("");
        //Uso de metodo set
        producto1.setNombre("Pera");
        producto1.setId("0013");
        producto1.setCantidad(0);
        producto1.setPrecio(0.20);
        //Comprobacion metodo set
        System.out.println("Nombre: "+producto1.getNombre());
        System.out.println("Id de Producto: "+producto1.getId());
        System.out.println("Cantidad: "+producto1.getCantidad());
        System.out.println("Precio: "+producto1.getPrecio());
        //Verificacion de estado
        if (producto1.verificarEstado()) {
            System.out.println("El producto " + producto1.getNombre() + " está disponible.");
        } else {
            System.out.println("El producto " + producto1.getNombre() + " está agotado.");
        }
    }
}
