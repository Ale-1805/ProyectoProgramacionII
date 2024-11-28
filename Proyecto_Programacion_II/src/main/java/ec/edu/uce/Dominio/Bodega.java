package ec.edu.uce.Dominio;

import ec.edu.uce.Util.Validaciones;
public class Bodega {
    // Atributos
    private String nombre;
    private String ubicacion;
    private JefeDeBodega jefeDeBodega;
    private Devolucion devolucion;
    private int numeroDeProductos;
    private Producto[] productos; // Declaración del atributo productos como un arreglo de Producto
    private Usuario[] usuarios; // Ejemplo adicional de otro arreglo
    private int numeroDeUsuarios;
    private Proveedor[] proveedores; // Otro ejemplo de un arreglo
    private int numeroDeProveedores;
    //Constructor sin parametros
    public Bodega(){
        this.nombre="S/N";
        this.ubicacion="S/N";
    }

    // Constructor
    public Bodega(String nNombre, String nUbicacion, String nUsuarios) {
            this.nombre = nNombre;
            this.ubicacion = nUbicacion;
    }

    // Getters y Setters
    public void setNombre(String nNombre) {
        if (nombre != null) {
            this.nombre = nNombre;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setUbicacion(String nUbicacion) {
        if (Validaciones.validarUbicacion(nUbicacion)) {
            this.ubicacion = nUbicacion;
        } else {
            System.out.println("Ubicación inválida. Debe contener solo letras, números, guiones y espacios.");
        }
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    // Getter y Setter para usuarios
    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }

    // Getter y Setter para proveedores
    public Proveedor[] getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedor[] proveedores) {
        this.proveedores = proveedores;
    }

    public int getNumeroDeProductos() {
        return numeroDeProductos;
    }

    public void setNumeroDeProductos(int numeroDeProductos) {
        if (numeroDeProductos >= 0) {
            this.numeroDeProductos = numeroDeProductos;
        }
    }

    public int getNumeroDeUsuarios() {
        return numeroDeUsuarios;
    }

    public void setNumeroDeUsuarios(int numeroDeUsuarios) {
        if (numeroDeUsuarios >= 0) {
            this.numeroDeUsuarios = numeroDeUsuarios;
        }
    }

    public int getNumeroDeProveedores() {
        return numeroDeProveedores;
    }

    public void setNumeroDeProveedores(int numeroDeProveedores) {
        if (numeroDeProveedores >= 0) {
            this.numeroDeProveedores = numeroDeProveedores;
        }
    }

    public JefeDeBodega getJefeDeBodega() {
        return jefeDeBodega;
    }

    public void setJefeDeBodega(JefeDeBodega jefeDeBodega) {
        this.jefeDeBodega = jefeDeBodega;
    }

    public Devolucion getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Devolucion devolucion) {
        this.devolucion = devolucion;
    }

    // Metodo toString para mostrar los datos de la devolución
    @Override
    public String toString() {
            return "Información de la Bodega:"+
            "Nombre: " + nombre+
            "Ubicación: " + ubicacion+
            "Productos: " + productos+
            "Usuarios: " + usuarios;
    }
}