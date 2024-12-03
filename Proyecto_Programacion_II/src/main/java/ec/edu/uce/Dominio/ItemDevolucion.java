package ec.edu.uce.Dominio;

public class ItemDevolucion {
    private int idItemDevolucion;
    private Producto producto; // Relación con un solo Producto
    private int cantidadDevuelta;
    private String razonDevolucion;
    private Devolucion[] devoluciones; // Relación con múltiples devoluciones
    private int numeroDeDevoluciones;

    // Constructor vacío
    public ItemDevolucion() {
        this.idItemDevolucion = 0;
        this.producto = null;
        this.cantidadDevuelta = 0;
        this.razonDevolucion = "Sin razón";
        this.devoluciones = new Devolucion[0];
        this.numeroDeDevoluciones = 0;
    }

    // Constructor con parámetros
    public ItemDevolucion(int idItemDevolucion, Producto producto, int cantidadDevuelta, String razonDevolucion) {
        this.idItemDevolucion = idItemDevolucion;
        this.producto = producto;
        this.cantidadDevuelta = cantidadDevuelta;
        this.razonDevolucion = razonDevolucion;
        this.devoluciones = new Devolucion[0];
        this.numeroDeDevoluciones = 0;
    }

    // Getter y Setter para idItemDevolucion
    public int getIdItemDevolucion() {
        return idItemDevolucion;
    }

    public void setIdItemDevolucion(int idItemDevolucion) {
        this.idItemDevolucion = idItemDevolucion;
    }

    // Getter y Setter para producto
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    // Getter y Setter para cantidadDevuelta
    public int getCantidadDevuelta() {
        return cantidadDevuelta;
    }

    public void setCantidadDevuelta(int cantidadDevuelta) {
        this.cantidadDevuelta = cantidadDevuelta;
    }

    // Getter y Setter para razonDevolucion
    public String getRazonDevolucion() {
        return razonDevolucion;
    }

    public void setRazonDevolucion(String razonDevolucion) {
        this.razonDevolucion = razonDevolucion;
    }

    // Getter para devoluciones
    public Devolucion[] getDevoluciones() {
        return devoluciones;
    }

    // Agregar una devolución al arreglo
    public void agregarDevolucion(Devolucion devolucion) {
        Devolucion[] nuevasDevoluciones = new Devolucion[this.devoluciones.length + 1];
        System.arraycopy(this.devoluciones, 0, nuevasDevoluciones, 0, this.devoluciones.length);
        nuevasDevoluciones[this.devoluciones.length] = devolucion;
        this.devoluciones = nuevasDevoluciones;
        this.numeroDeDevoluciones++;
        System.out.println("Devolución agregada exitosamente.");
    }

    // Consultar todas las devoluciones asociadas
    public String consultarDevoluciones() {
        StringBuilder texto = new StringBuilder();
        for (Devolucion devolucion : devoluciones) {
            texto.append(devolucion).append("\n");
        }
        return texto.toString();
    }

    // Buscar una devolución por posición
    public Devolucion buscarDevolucion(int pos) {
        if (pos >= 0 && pos < devoluciones.length) {
            return devoluciones[pos];
        } else {
            System.out.println("Posición inválida.");
            return null;
        }
    }

    // Editar una devolución por posición
    public boolean editarDevolucion(int pos, Devolucion nuevaDevolucion) {
        if (pos >= 0 && pos < devoluciones.length) {
            devoluciones[pos] = nuevaDevolucion;
            System.out.println("Devolución editada exitosamente.");
            return true;
        } else {
            System.out.println("Posición inválida.");
            return false;
        }
    }

    // Eliminar una devolución por posición
    public boolean eliminarDevolucion(int pos) {
    if (pos >= 0 && pos < devoluciones.length) {
        Devolucion[] nuevasDevoluciones = new Devolucion[devoluciones.length - 1];
        
        // Copiar los elementos antes de la posición
        System.arraycopy(devoluciones, 0, nuevasDevoluciones, 0, pos);
        
        // Copiar los elementos después de la posición
        System.arraycopy(devoluciones, pos + 1, nuevasDevoluciones, pos, devoluciones.length - pos - 1);
        
        // Actualizar el arreglo de devoluciones
        devoluciones = nuevasDevoluciones;
        numeroDeDevoluciones--;
        System.out.println("Devolución eliminada exitosamente.");
        return true;
    } else {
        System.out.println("Posición inválida.");
        return false;
    }
}

    // Metodo toString para mostrar los datos del ItemDevolucion
    @Override
    public String toString() {
        return "ItemDevolucion{" +
                "ID: " + idItemDevolucion +
                ", Producto: " + (producto != null ? producto : "No asignado") +
                ", Cantidad Devuelta: " + cantidadDevuelta +
                ", Razón de Devolución: '" + razonDevolucion + '\'' +
                ", Número de Devoluciones: " + numeroDeDevoluciones +
                '}';
    }
}
