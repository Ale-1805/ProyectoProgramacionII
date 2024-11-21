package ec.edu.uce.Util;

public class ValidacionItemDevolucion {
    // Validar que el nombre del producto contenga solo letras y espacios
    public static boolean validarNombreProducto(String producto) {
        return producto != null && producto.matches("[a-zA-Z\\s]+");
    }

    // Validar que el ID sea un número entero positivo
    public static boolean validarId(int id) {
        return id > 0;
    }

    // Validar que la cantidad sea un número entero positivo
    public static boolean validarCantidad(int cantidad) {
        return cantidad > 0;
    }

    // Validar que la razón de devolución no esté vacía y tenga solo letras y espacios
    public static boolean validarRazonDevolucion(String razonDevolucion) {
        return razonDevolucion != null && !razonDevolucion.trim().isEmpty() && razonDevolucion.matches("[a-zA-Z\\s]+");
    }

    // Validar que el estado sea "Pendiente" o "Aprobado"
    public static boolean validarEstado(String estado) {
        return estado != null &&
                (estado.equalsIgnoreCase("Pendiente") || estado.equalsIgnoreCase("Aprobado"));
    }

    // Validar que la fecha no sea nula
    public static boolean validarFechaDevolucion(java.util.Date fecha) {
        return fecha != null;
    }

    // Validar que las observaciones no estén vacías
    public static boolean validarObservaciones(String observaciones) {
        return observaciones != null && !observaciones.trim().isEmpty();
    }
}
