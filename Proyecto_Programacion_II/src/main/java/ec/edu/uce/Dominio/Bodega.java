package ec.edu.uce.Dominio;

public class Bodega {
    //Atributos
    private String nombre;
    private String ubicacion;
    private String productos;
    private String usuarios;
    //Constructor
    public Bodega (String nNombre, String nUbicacion, String  nProductos, String nUsuarios){
        nombre = nNombre;
        ubicacion = nUbicacion;
        productos = nProductos;
        usuarios = nUsuarios;
    }
    //Setters y getters
    public void setNombre(String nNombre) {
        nombre = nNombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setProductos(String nProductos) {
        productos = nProductos;
    }

    public String getProductos() {
        return productos;
    }

    public void setUbicacion(String nUbicacion) {
        ubicacion = nUbicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUsuarios(String nUsuarios) {
        usuarios = nUsuarios;
    }

    public String getUsuarios() {
        return usuarios;
    }
}
