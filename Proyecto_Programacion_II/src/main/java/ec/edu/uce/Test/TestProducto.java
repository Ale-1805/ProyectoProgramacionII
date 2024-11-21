package ec.edu.uce.Test;
import ec.edu.uce.Dominio.Producto;
public class TestProducto {
    public static void main(String[] args) {

            //Constructor sin parametros
            Producto producto1 = new Producto();
            System.out.println(producto1.mostrarProducto());
            //constructor con parametros
            Producto producto2 = new Producto(1, "Laptop", 5, 1200.50);
            System.out.println(producto2.mostrarProducto());
            //Setters
            producto1.setId(2);
            producto1.setNombre("Smartphone");
            producto1.setCantidad(10);
            producto1.setPrecio(500.99);
            //Resultados
            System.out.println(producto1.mostrarProducto());
        }
    }

