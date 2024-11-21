package ec.edu.uce.Util;

public class ValidacionItem {
    // Validar que el nombre solo contenga letras y espacios
    public static boolean validarNombre(String nombre) {
        return nombre != null && nombre.matches("[a-zA-Z\\s]+");
    }

    // Validar que el ID sea un número entero positivo
    public static boolean validarId(int id) {
        return id > 0; // Aseguramos que sea positivo
    }

    // Validar que el precio sea un número positivo, con o sin decimales
    public static boolean validarPrecio(double precio) {
        return precio > 0;
    }

    // Validar que la cantidad sea un número entero positivo
    public static boolean validarCantidad(int cantidad) {
        return cantidad > 0;
    }

    // Validar que el estado sea una de las opciones permitidas
    public static boolean validarEstado(String estado) {
        return estado != null && (estado.equalsIgnoreCase("Disponible") || estado.equalsIgnoreCase("No Disponible"));
    }

    // Validar que la ubicación no esté vacía
    public static boolean validarUbicacion(String ubicacion) {
        return ubicacion != null && !ubicacion.isEmpty();
    }
}
