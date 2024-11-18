package ec.edu.uce.Dominio;

public class Producto {
    //Atributos
    private String Id;
    private String nombre;
    private int cantidad;
    private double precio;
    //Constructor
    public Producto (String NewId, String nNombre, int nC, double nPrecio){
        Id = NewId;
        nombre = nNombre;
        cantidad = nC;
        precio = nPrecio;
    }

    //Getters y Setters
    public void setId(String NewId){
        Id = NewId;
    }
    public String getId(){
        return Id;
    }

    public void setNombre(String nNombre){
        nombre = nNombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setCantidad(int nC){
        cantidad = nC;
    }
    public int getCantidad(){
        return cantidad;
    }

    public void setPrecio(double nPrecio){
        precio = nPrecio;
    }
    public double getPrecio(){
        return precio;
    }
    //Demas metodos
    public boolean verificarEstado(){
        return cantidad > 0;
    }
}
