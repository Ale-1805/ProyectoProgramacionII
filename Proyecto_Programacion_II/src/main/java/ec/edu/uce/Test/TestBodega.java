package ec.edu.uce.Test;
import ec.edu.uce.Dominio.Bodega;
public class TestBodega {
    public static void main(String[] args) {
        Bodega bodega1 = new Bodega("Bodega1", "Quito", "Jabones, Mascarillas, Pan", "JefeBodega, Proveedor, Empleado");
        System.out.println("Nombre: "+bodega1 .getNombre());
        System.out.println("Id de Producto: "+bodega1 .getUbicacion());
        System.out.println("Cantidad: "+bodega1 .getProductos());
        System.out.println("Precio: "+bodega1 .getUsuarios());
        //Salto de linea
        System.out.println("");
        //Uso de metodo set
        bodega1.setNombre("Bodega2");
        bodega1.setUbicacion("Guayaquil");
        bodega1.setProductos("Pan, Focos, Cables");
        bodega1.setUsuarios("JefeBodega, Proveedor");
        //Comprobacion metodo set
        System.out.println("Nombre: "+bodega1 .getNombre());
        System.out.println("Id de Producto: "+bodega1 .getUbicacion());
        System.out.println("Cantidad: "+bodega1 .getProductos());
        System.out.println("Precio: "+bodega1 .getUsuarios());
    }
}
