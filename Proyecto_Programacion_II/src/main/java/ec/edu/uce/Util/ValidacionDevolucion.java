package ec.edu.uce.Util;


public class ValidacionDevolucion {
    // Metodo de validación para el nombre de la Sucursal
    public static boolean validarSucursal(String sucursal) {
        return sucursal.matches("Sucursal \\d+");  // Debe ser algo como "Sucursal 1", "Sucursal 2", etc.
    }

    // Metodo de validación para el estado del daño
    public static boolean validarEstado(String estado) {
        return estado.equalsIgnoreCase("leve") ||
                estado.equalsIgnoreCase("medio") ||
                estado.equalsIgnoreCase("total");
    }
}
