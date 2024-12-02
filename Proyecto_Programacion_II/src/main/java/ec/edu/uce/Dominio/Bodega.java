package ec.edu.uce.Dominio;

public class Bodega {

    // Atributos
    private String nombre;
    private String ubicacion;
    private JefeDeBodega jefeDeBodega;
    private Devolucion devolucion;
    private Producto[] productos;
    private int numeroDeProductos;
    private Usuario[] usuarios;
    private int numeroDeUsuarios;
    private Proveedor[] proveedores;
    private int numeroDeProveedores;

    // Constructor sin parámetros
    public Bodega() {
        this.nombre = "S/N";
        this.ubicacion = "S/N";
        this.numeroDeProductos = 0;
        this.numeroDeUsuarios = 0;
        this.numeroDeProveedores = 0;
    }

    // Constructor
    public Bodega(String nNombre, String nUbicacion, String nUsuarios) {
        this.nombre = nNombre;
        this.ubicacion = nUbicacion;
    }

    //Constructor de objetos
    public Bodega(int capacidadProductos, int capacidadUsuarios, int capacidadProveedores) {
        this.productos = new Producto[capacidadProductos];
        this.usuarios = new Usuario[capacidadUsuarios];
        this.proveedores = new Proveedor[capacidadProveedores];
    }

    // Métodos Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
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

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
        this.numeroDeProductos = productos.length;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
        this.numeroDeUsuarios = usuarios.length;
    }

    public Proveedor[] getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedor[] proveedores) {
        this.proveedores = proveedores;
        this.numeroDeProveedores = proveedores.length;
    }

    public int getNumeroDeProductos() {
        return numeroDeProductos;
    }

    public int getNumeroDeUsuarios() {
        return numeroDeUsuarios;
    }

    public int getNumeroDeProveedores() {
        return numeroDeProveedores;
    }
    // Métodos para manejar productos
    public String consultarProductos() {
        StringBuilder texto = new StringBuilder();
        for (Producto producto : productos) {
            texto.append(producto).append("\n");
        }
        return texto.toString();
    }

    public Producto buscarProducto(int pos) {
        if (pos >= 0 && pos < productos.length) {
            return productos[pos];
        } else {
            return null;
        }
    }

    public void agregarProducto(Producto producto) {
        Producto[] nuevosProductos = new Producto[productos.length + 1];
        System.arraycopy(productos, 0, nuevosProductos, 0, productos.length);
        nuevosProductos[productos.length] = producto;
        productos = nuevosProductos;
        numeroDeProductos++;
        System.out.println("Producto agregado exitosamente.");
    }

    public boolean editarProducto(int pos, Producto nuevoProducto) {
        if (pos >= 0 && pos < productos.length) {
            productos[pos] = nuevoProducto;
            System.out.println("Producto editado exitosamente.");
            return true;
        } else {
            System.out.println("Posición inválida.");
            return false;
        }
    }

    // Métodos para manejar usuarios
    public String consultarUsuarios() {
        StringBuilder texto = new StringBuilder();
        for (Usuario usuario : usuarios) {
            texto.append(usuario).append("\n");
        }
        return texto.toString();
    }

    public Usuario buscarUsuario(int pos) {
        if (pos >= 0 && pos < usuarios.length) {
            return usuarios[pos];
        } else {
            return null;
        }
    }

    public void agregarUsuario(Usuario usuario) {
        Usuario[] nuevosUsuarios = new Usuario[usuarios.length + 1];
        System.arraycopy(usuarios, 0, nuevosUsuarios, 0, usuarios.length);
        nuevosUsuarios[usuarios.length] = usuario;
        usuarios = nuevosUsuarios;
        numeroDeUsuarios++;
        System.out.println("Usuario agregado exitosamente.");
    }

    public boolean editarUsuario(int pos, Usuario nuevoUsuario) {
        if (pos >= 0 && pos < usuarios.length) {
            usuarios[pos] = nuevoUsuario;
            System.out.println("Usuario editado exitosamente.");
            return true;
        } else {
            System.out.println("Posición inválida.");
            return false;
        }
    }

    // Métodos para manejar proveedores
    public String consultarProveedores() {
        StringBuilder texto = new StringBuilder();
        for (Proveedor proveedor : proveedores) {
            texto.append(proveedor).append("\n");
        }
        return texto.toString();
    }

    public Proveedor buscarProveedor(int pos) {
        if (pos >= 0 && pos < proveedores.length) {
            return proveedores[pos];
        } else {
            return null;
        }
    }

    public void agregarProveedor(Proveedor proveedor) {
        Proveedor[] nuevosProveedores = new Proveedor[proveedores.length + 1];
        System.arraycopy(proveedores, 0, nuevosProveedores, 0, proveedores.length);
        nuevosProveedores[proveedores.length] = proveedor;
        proveedores = nuevosProveedores;
        numeroDeProveedores++;
        System.out.println("Proveedor agregado exitosamente.");
    }

    public boolean editarProveedor(int pos, Proveedor nuevoProveedor) {
        if (pos >= 0 && pos < proveedores.length) {
            proveedores[pos] = nuevoProveedor;
            System.out.println("Proveedor editado exitosamente.");
            return true;
        } else {
            System.out.println("Posición inválida.");
            return false;
        }
    }

    // Otros métodos y el toString
    @Override
    public String toString() {
        return "Bodega{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", numeroDeProductos=" + numeroDeProductos +
                ", numeroDeUsuarios=" + numeroDeUsuarios +
                ", numeroDeProveedores=" + numeroDeProveedores +
                '}';
    }
}