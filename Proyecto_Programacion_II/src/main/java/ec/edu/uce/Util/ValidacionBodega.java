package ec.edu.uce.Util;


public class ValidacionBodega {
    public static boolean validarNombre(String nombre) {
        return nombre.matches("[a-zA-Z\\s]+");
    }

    // Validación para la ubicación: letras, números, guiones, espacios y comas
    public static boolean validarUbicacion(String ubicacion) {
        return ubicacion.matches("[a-zA-Z0-9\\-,\\s]+");
    }

    // Validación para productos: solo letras
    public static boolean validarProductos(String productos) {
        return productos.matches("[a-zA-Z\\-,\\s]+");
    }

    // Validación para usuarios: letras y números
    public static boolean validarUsuarios(String usuarios) {
        return usuarios.matches("[a-zA-Z0-9\\-,\\s]+");
    }
}
