package ec.edu.uce.Dominio;

import ec.edu.uce.Util.ValidacionProducto;

public class Producto {
    //Atributos
    private int Id;
    private String nombre;
    private int cantidad;
    private double precio;
    //Constructor
    public Producto (){
        this.Id = 0;
        this.nombre = "";
        this.cantidad = 0;
        this.precio = 0.0;
    }
    public Producto (int NewId, String nNombre, int nC, double nPrecio){
        if (ValidacionProducto.validarId(NewId)) {
            this.Id = NewId;
        } else {
            System.out.println("El ID ingresado no es válido.");
            this.Id = 0;
        }

        if (ValidacionProducto.validarNombre(nNombre)) {
            this.nombre = nNombre;
        } else {
            System.out.println("El nombre ingresado no es válido.");
            this.nombre = "";
        }

        if (ValidacionProducto.validarCantidad(nC)) {
            this.cantidad = nC;
        } else {
            System.out.println("La cantidad ingresada no es válida.");
            this.cantidad = 0;
        }

        if (ValidacionProducto.validarPrecio(nPrecio)) {
            this.precio = nPrecio;
        } else {
            System.out.println("El precio ingresado no es válido.");
            this.precio = 0.0;
        }
    }


    //Getters y Setters
    public void setId(int NewId){
        if (Id>=0 && ValidacionProducto.validarId(NewId)) {
            Id = NewId;
        } else {
            System.out.println("Id no válida");
        }
    }
    public int getId(){
        return Id;
    }

    public void setNombre(String nNombre) {
        if(ValidacionProducto.validarNombre(nNombre)) {
            nombre = nNombre;
        }
    }
    public String getNombre(){
        return nombre;
    }

    public void setCantidad(int nC){
        if (cantidad >=0 && ValidacionProducto.validarCantidad(nC)) {
            cantidad = nC;
        } else{
            System.out.println("La cantidad mal ingresada");
        }
    }
    public int getCantidad(){
        return cantidad;
    }

    public void setPrecio(double nPrecio){
        if (precio>=0 && ValidacionProducto.validarPrecio(nPrecio)) {
            precio = nPrecio;
        } else {
            System.out.println("El precio no puede ser negativo");
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
    public String mostrarProducto() {
        return "Producto{" +
                "Id=" + getId() +
                ", Nombre= '" + getNombre() + '\'' +
                ", Cantidad= " + getCantidad() +
                ", Precio= " + getPrecio() +
                ", Estado= "+ getEstado() +
                '}';
    }
}
