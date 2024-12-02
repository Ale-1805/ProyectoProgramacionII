package ec.edu.uce.Test;

import ec.edu.uce.Dominio.Producto;

public class TestProducto {
    public static void main(String[] args) {

        // Constructor sin parámetros
        Producto producto1 = new Producto();
        System.out.println(producto1.toString());  // Usamos el metodo toString para mostrar el producto

        // Constructor con parámetros
        Producto producto2 = new Producto(1, "Laptop", 5, 1200.50);
        System.out.println(producto2.toString());  // Usamos el metodo toString para mostrar el producto

        // Usando setters para modificar los atributos
        producto1.setId(2);
        producto1.setNombre("Smartphone");
        producto1.setCantidad(10);
        producto1.setPrecio(500.99);

        // Mostrando el producto después de los cambios
        System.out.println(producto1.toString());  // Usamos el metodo toString para mostrar el producto actualizado
    }
}