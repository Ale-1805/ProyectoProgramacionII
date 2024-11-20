package ec.edu.uce.Test;
import ec.edu.uce.Dominio.Bodega;


public class TestBodega {
    public static void main(String[] args) {
        //Constructor sin parametros
        Bodega bodega1 = new Bodega();
        System.out.println(bodega1.mostrarBodega());
        //constructor con parametros
        Bodega bodega2 = new Bodega("Bodega verduras","Av la Gasca y Las casas","zanahoria, col, pepino","Jefe bodega, empleado" );
        System.out.println(bodega2.mostrarBodega());
        //Setters
        bodega1.setNombre("Bodega frutas");
        bodega1.setUbicacion("Av la Gasca y Las casas");
        bodega1.setProductos("manzana, pera, babaco, arandanos");
        bodega1.setUsuarios("Jefe bodega, empleado");
        //Resultados
        System.out.println(bodega1.mostrarBodega());
    }
}
