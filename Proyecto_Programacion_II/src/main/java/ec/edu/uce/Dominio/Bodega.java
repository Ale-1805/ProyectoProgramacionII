package ec.edu.uce.Dominio;
import ec.edu.uce.Util.ValidacionBodega;
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

    public Bodega (){
        nombre = "";
        ubicacion = "";
        productos = "";
        usuarios = "";
    }
    //Setters y getters
    public void setNombre(String nNombre) {
        if(ValidacionBodega.validarNombre(nNombre)) {
            nombre = nNombre;
        }else{
            System.out.println("Error: Nombre mal ingresado");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setProductos(String nProductos) {
        if(ValidacionBodega.validarProductos(nProductos)) {
            productos = nProductos;
        }else{
            System.out.println("Error: Productos mal ingresados");
        }
    }

    public String getProductos() {
        return productos;
    }

    public void setUbicacion(String nUbicacion) {
        if(ValidacionBodega.validarUbicacion(nUbicacion)) {
            ubicacion = nUbicacion;
        }else {
            System.out.println("Error: Ubicacion mal ingresada");
        }
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUsuarios(String nUsuarios) {
        if(ValidacionBodega.validarUsuarios(nUsuarios)) {
            usuarios = nUsuarios;
        }else {
            System.out.println("Error: Usuarios mal ingresados");
        }
    }

    public String getUsuarios() {
        return usuarios;
    }
    public String mostrarBodega() {
        return "Producto{" +
                ", Nombre= '" + getNombre() + '\'' +
                ", Ubicacion= " + getUbicacion() +
                ", Productos= " + getProductos() +
                ", Usuarios= "+ getUsuarios() +
                '}';
    }
}
