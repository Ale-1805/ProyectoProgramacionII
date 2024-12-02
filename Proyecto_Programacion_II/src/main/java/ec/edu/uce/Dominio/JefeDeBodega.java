package ec.edu.uce.Dominio;

public class JefeDeBodega {
    // Atributos
    private String nombre;
    private String fechaIngreso;
    private String turno;
    private String[] reportes; // Reportes disponibles
    private String[] estadosProductos; // Estados de productos disponibles

    // Constructor vacío
    public JefeDeBodega() {
        this.nombre = "";
        this.fechaIngreso = "";
        this.turno = "";
        this.reportes = new String[10]; // Espacio para 10 reportes como máximo
        this.estadosProductos = new String[10]; // Espacio para 10 estados como máximo
    }

    // Constructor con validaciones
    public JefeDeBodega(String nombre, String fechaIngreso, String turno) {
        if (nombre != null) {
            this.nombre = nombre;
        } else {
            this.nombre = "";
        }

        if (fechaIngreso != null) {
            this.fechaIngreso = fechaIngreso;
        } else {
            this.fechaIngreso = "";
        }

        if (turno != null) {
            this.turno = turno;
        } else {
            this.turno = "";
        }

        this.reportes = new String[10]; // Espacio para 10 reportes como máximo
        this.estadosProductos = new String[10]; // Espacio para 10 estados como máximo
    }

    // Getters y Setters con validaciones
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        if (fechaIngreso != null) {
            this.fechaIngreso = fechaIngreso;
        }
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        if (turno != null) {
            this.turno = turno;
        }
    }

    // Métodos para manejar reportes
    public String buscarReporte(int posicion) {
        if (posicion >= 0 && posicion < reportes.length) {
            if (reportes[posicion] != null) {
                return "Reporte en la posición " + posicion + ": " + reportes[posicion];
            } else {
                return "No hay reporte en la posición " + posicion + ".";
            }
        } else {
            return "Posición inválida. Por favor, ingrese un índice entre 0 y " + (reportes.length - 1) + ".";
        }
    }

    public String consultarReportes() {
        StringBuilder resultados = new StringBuilder("Reportes disponibles:\n");
        for (String reporte : reportes) {
            if (reporte != null) {
                resultados.append("- ").append(reporte).append("\n");
            }
        }
        return resultados.toString().trim().isEmpty() ? "No hay reportes disponibles." : resultados.toString();
    }

    // Métodos para manejar estados de productos
    public String buscarEstadoProducto(int posicion) {
        if (posicion >= 0 && posicion < estadosProductos.length) {
            if (estadosProductos[posicion] != null) {
                return "Estado del producto en la posición " + posicion + ": " + estadosProductos[posicion];
            } else {
                return "No hay estado de producto en la posición " + posicion + ".";
            }
        } else {
            return "Posición inválida. Por favor, ingrese un índice entre 0 y " + (estadosProductos.length - 1) + ".";
        }
    }

    public String consultarEstadoProductos() {
        StringBuilder resultados = new StringBuilder("Estados de productos disponibles:\n");
        for (String estado : estadosProductos) {
            if (estado != null) {
                resultados.append("- ").append(estado).append("\n");
            }
        }
        return resultados.toString().trim().isEmpty() ? "No hay estados de productos disponibles." : resultados.toString();
    }

    // Métodos para agregar reportes y estados de productos
    public boolean agregarReporte(String nuevoReporte) {
        for (int i = 0; i < reportes.length; i++) {
            if (reportes[i] == null) {
                reportes[i] = nuevoReporte;
                return true;
            }
        }
        return false; // No hay espacio para más reportes
    }

    public boolean agregarEstadoProducto(String nuevoEstado) {
        for (int i = 0; i < estadosProductos.length; i++) {
            if (estadosProductos[i] == null) {
                estadosProductos[i] = nuevoEstado;
                return true;
            }
        }
        return false; // No hay espacio para más estados de productos
    }

    // Metodo toString para mostrar los datos
    @Override
    public String toString() {
        return "JefeDeBodega{" +
                "Nombre='" + nombre + '\'' +
                ", Fecha de Ingreso='" + fechaIngreso + '\'' +
                ", Turno='" + turno + '\'' +
                '}';
    }
}