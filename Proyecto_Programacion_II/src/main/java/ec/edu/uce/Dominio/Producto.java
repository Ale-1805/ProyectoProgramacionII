package ec.edu.uce.Dominio;

public class Producto {

    //Atributos
    private int Id;
    private String nombre;
    private int cantidad;
    private double precio;

    //Constructor
    public Producto (){
        this.Id = 0;
        this.nombre = "S/N";
        this.cantidad = 0;
        this.precio = 0.0;
    }
    //Constructor con parámetros
    public Producto (int NewId, String nNombre, int nC, double nPrecio){
            this.Id = NewId;
            this.nombre = nNombre;
            this.cantidad = nC;
            this.precio = nPrecio;
    }


    //Getters y Setters
    public void setId(int NewId){
        if (Id>=0) {
            Id = NewId;
        }
    }
    public int getId(){
        return Id;
    }

    public void setNombre(String nNombre) {
        if(nombre != null) {
            nombre = nNombre;
        }
    }

    public String getNombre(){
        return nombre;
    }

    public void setCantidad(int nC){
        if (cantidad >=0) {
            cantidad = nC;
        }
    }
    public int getCantidad(){
        return cantidad;
    }

    public void setPrecio(double nPrecio){
        if (precio>=0 ) {
            precio = nPrecio;
        }
    }
    public double getPrecio(){
        return precio;
    }
    //Demas metodos
    public String verificarEstado(){
        if(cantidad == 0){
            return "El producto esta agotado";
        }else{
            return "Hay productos disponibles";
        }
    }
    public String getEstado(){
        return verificarEstado();
    }
    // Metodo toString para mostrar los detalles del producto
    @Override
    public String toString() {
        return "Producto{" +
                "Id=" + Id +
                ", Nombre='" + nombre + '\'' +
                ", Cantidad=" + cantidad +
                ", Precio=" + precio +
                ", Estado=" + getEstado() +
                '}';
    }
}